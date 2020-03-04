package com.example.restservice.common.exception;

import java.io.Serializable;

public class StandardError implements Serializable{
    private static final long serialVersionUID = 1L;

    private long timestamp;
    private Integer status;
    private String error;
    private String message;
    private String trace;
    private String path;

    public StandardError() {

    }

    public StandardError(long timestamp, Integer status, String error, String trace , String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.trace = trace;
        this.path = path;
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
