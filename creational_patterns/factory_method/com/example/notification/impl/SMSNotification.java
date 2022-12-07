package com.example.notification.impl;

import com.example.notification.Notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending sms notification...");
    }
}
