package com.creditcard.statement.dto;
import com.creditcard.statement.model.StatementStatus;import lombok.*;import java.math.BigDecimal;import java.time.LocalDate;import java.util.List;
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class StatementDTO { private String id;private String accountId;private String statementNumber;private LocalDate statementDate;private LocalDate dueDate;private BigDecimal previousBalance;private BigDecimal paymentsReceived;private BigDecimal purchases;private BigDecimal fees;private BigDecimal interestCharged;private BigDecimal newBalance;private BigDecimal minimumPayment;private StatementStatus status;private List<TransactionDTO> transactions; }
