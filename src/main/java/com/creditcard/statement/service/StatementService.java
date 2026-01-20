package com.creditcard.statement.service;
import com.creditcard.statement.dto.*;import java.util.List;
public interface StatementService { StatementDTO generateStatement(String accountId);StatementDTO getStatementById(String id);List<StatementDTO> getStatementsByAccountId(String accountId);TransactionDTO createTransaction(CreateTransactionRequest req);List<TransactionDTO> getTransactionsByAccountId(String accountId);List<TransactionDTO> getUnbilledTransactions(String accountId); }
