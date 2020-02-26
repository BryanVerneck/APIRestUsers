package com.example.restservice.user.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import javax.servlet.http.HttpServletRequest;

@ControllerAdvice //Indica tratamento de requisições
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "Não Encontrado", "null", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
