package com.creditcard.statement.model;
import jakarta.persistence.*;import lombok.*;import java.math.BigDecimal;import java.time.*;
@Entity @Table(name="statements") @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Statement {
    @Id @GeneratedValue(strategy=GenerationType.UUID) private String id;
    private String accountId; @Column(unique=true) private String statementNumber;
    private LocalDate statementDate; private LocalDate dueDate;
    @Column(precision=15,scale=2) private BigDecimal previousBalance;
    @Column(precision=15,scale=2) private BigDecimal paymentsReceived;
    @Column(precision=15,scale=2) private BigDecimal purchases;
    @Column(precision=15,scale=2) private BigDecimal fees;
    @Column(precision=15,scale=2) private BigDecimal interestCharged;
    @Column(precision=15,scale=2) private BigDecimal newBalance;
    @Column(precision=15,scale=2) private BigDecimal minimumPayment;
    @Enumerated(EnumType.STRING) private StatementStatus status;
    private LocalDateTime createdAt;
    @PrePersist void onCreate(){createdAt=LocalDateTime.now();if(status==null)status=StatementStatus.GENERATED;}
}
