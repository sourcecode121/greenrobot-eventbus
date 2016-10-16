package com.example.eventbus;

/**
 * Created by Anand on 16/10/2016.
 */

public class StickyEvent {
    private String stickyMessage;

    public StickyEvent(String stickyMessage) {
        this.setStickyMessage(stickyMessage);
    }

    public String getStickyMessage() {
        return stickyMessage;
    }

    public void setStickyMessage(String stickyMessage) {
        this.stickyMessage = stickyMessage;
    }
}
