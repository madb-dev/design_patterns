package com.example.notification.impl;

import com.example.notification.Notification;

public class VoiceMessageNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Recording voice message notification...");
    }
}
