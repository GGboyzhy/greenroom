package edu.swjtuhc.demo.model;

import java.util.List;

public class Result{
    private boolean result = false;
    private String message;
   
    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
