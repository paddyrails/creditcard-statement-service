package com.creditcard.statement.model;
import jakarta.persistence.*;import lombok.*;import java.math.BigDecimal;import java.time.LocalDateTime;
@Entity @Table(name="transactions") @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Transaction {
    @Id @GeneratedValue(strategy=GenerationType.UUID) private String id;
    private String accountId; private String cardId; private String statementId;
    private LocalDateTime transactionDate; private LocalDateTime postingDate;
    private String description; private String merchantName;
    @Column(precision=15,scale=2) private BigDecimal amount;
    @Enumerated(EnumType.STRING) private TransactionType transactionType;
    @Enumerated(EnumType.STRING) private TransactionStatus status;
    private String referenceNumber; private LocalDateTime createdAt;
    @PrePersist void onCreate(){createdAt=LocalDateTime.now();if(status==null)status=TransactionStatus.POSTED;if(postingDate==null)postingDate=LocalDateTime.now();}
}
