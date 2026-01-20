package com.creditcard.statement.repository;
import com.creditcard.statement.model.Statement;import org.springframework.data.jpa.repository.JpaRepository;import java.util.*;
public interface StatementRepository extends JpaRepository<Statement,String> { List<Statement> findByAccountIdOrderByStatementDateDesc(String accountId);Optional<Statement> findTopByAccountIdOrderByStatementDateDesc(String accountId); }
