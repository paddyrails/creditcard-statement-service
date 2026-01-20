package com.creditcard.statement.dto;
import com.creditcard.statement.model.*;import lombok.*;import java.math.BigDecimal;import java.time.LocalDateTime;
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class TransactionDTO { private String id;private String accountId;private String cardId;private String statementId;private LocalDateTime transactionDate;private String description;private String merchantName;private BigDecimal amount;private TransactionType transactionType;private TransactionStatus status;private String referenceNumber; }
