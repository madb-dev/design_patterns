package com.example.notification.impl;

import com.example.notification.Notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending email notification...");
    }
}
