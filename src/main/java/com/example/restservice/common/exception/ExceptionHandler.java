package com.example.restservice.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import javax.servlet.http.HttpServletRequest;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice //Indica tratamento de requisições
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "Não Encontrado", "null", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {ApiRequestException.class})
    public ResponseEntity<Object> handleRequestException(ApiRequestException e){
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        ApiException apiException = new ApiException(
                e.getMessage(),
                e,
                badRequest,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(apiException, badRequest);
    }

//    @org.springframework.web.bind.annotation.ExceptionHandler()
//    public ResponseEntity<StandardError> ServerError(){
//        return ResponseEntity<>;
//    }
}
