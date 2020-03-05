package com.example.restservice.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StandardError implements Serializable{

    private static final long serialVersionUID = 1L;

    private long timestamp;
    private Integer status;
    private String error;
    private String message;
    private String trace;
    private String path;

}
