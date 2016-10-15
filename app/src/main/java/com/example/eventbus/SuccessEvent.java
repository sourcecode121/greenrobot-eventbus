package com.example.eventbus;

/**
 * Created by Anand on 15/10/2016.
 */

public class SuccessEvent {
    private String successMessage;

    public SuccessEvent(String successMessage) {
        this.setSuccessMessage(successMessage);
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(String successMessage) {
        this.successMessage = successMessage;
    }
}
