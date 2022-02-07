package com.prueba.spring.dto;

import java.io.Serializable;
import java.util.Date;

public class ResponseDTO implements Serializable {
    private static final long serialVersionUID = 951121954294315794L;
    private String message;
    private boolean success;
    private int status;
    private String date;


    public ResponseDTO() {
        this.message = "ERROR";
        this.success = false;
        this.status = 500;
        this.date = new Date().toString();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
