package com.creditcard.statement.controller;
import com.creditcard.statement.dto.*;import com.creditcard.statement.service.StatementService;import jakarta.validation.Valid;import lombok.RequiredArgsConstructor;import org.springframework.http.*;import org.springframework.web.bind.annotation.*;import java.util.List;
@RestController @RequestMapping("/api") @RequiredArgsConstructor
public class StatementController {
    private final StatementService svc;
    @PostMapping("/statements/generate/{accountId}") public ResponseEntity<StatementDTO> generate(@PathVariable String accountId){return ResponseEntity.status(HttpStatus.CREATED).body(svc.generateStatement(accountId));}
    @GetMapping("/statements/{id}") public ResponseEntity<StatementDTO> getStatement(@PathVariable String id){return ResponseEntity.ok(svc.getStatementById(id));}
    @GetMapping("/statements/account/{accountId}") public ResponseEntity<List<StatementDTO>> getByAccount(@PathVariable String accountId){return ResponseEntity.ok(svc.getStatementsByAccountId(accountId));}
    @PostMapping("/transactions") public ResponseEntity<TransactionDTO> createTxn(@Valid @RequestBody CreateTransactionRequest req){return ResponseEntity.status(HttpStatus.CREATED).body(svc.createTransaction(req));}
    @GetMapping("/transactions/account/{accountId}") public ResponseEntity<List<TransactionDTO>> getTxns(@PathVariable String accountId){return ResponseEntity.ok(svc.getTransactionsByAccountId(accountId));}
    @GetMapping("/transactions/account/{accountId}/unbilled") public ResponseEntity<List<TransactionDTO>> getUnbilled(@PathVariable String accountId){return ResponseEntity.ok(svc.getUnbilledTransactions(accountId));}
}
