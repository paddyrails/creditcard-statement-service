package com.creditcard.statement.dto;
import com.creditcard.statement.model.TransactionType;import jakarta.validation.constraints.*;import lombok.*;import java.math.BigDecimal;
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class CreateTransactionRequest { @NotBlank private String accountId;private String cardId;@NotBlank private String description;private String merchantName;@NotNull @DecimalMin("0.01") private BigDecimal amount;@NotNull private TransactionType transactionType; }
