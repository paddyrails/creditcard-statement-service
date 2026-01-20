package com.creditcard.statement.repository;
import com.creditcard.statement.model.Transaction;import org.springframework.data.jpa.repository.JpaRepository;import java.util.*;
public interface TransactionRepository extends JpaRepository<Transaction,String> { List<Transaction> findByAccountIdOrderByTransactionDateDesc(String accountId);List<Transaction> findByStatementId(String statementId);List<Transaction> findByAccountIdAndStatementIdIsNull(String accountId); }
