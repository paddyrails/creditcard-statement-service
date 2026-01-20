package com.creditcard.statement.exception;
import org.springframework.http.*;import org.springframework.web.bind.annotation.*;import java.util.*;
@RestControllerAdvice
public class GlobalExceptionHandler { @ExceptionHandler(StatementNotFoundException.class) public ResponseEntity<Map<String,Object>> h(StatementNotFoundException e){Map<String,Object> r=new HashMap<>();r.put("message",e.getMessage());return ResponseEntity.status(HttpStatus.NOT_FOUND).body(r);} }
