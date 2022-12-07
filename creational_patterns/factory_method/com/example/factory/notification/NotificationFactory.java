package com.example.factory.notification;

import com.example.notification.Notification;
import com.example.notification.impl.EmailNotification;
import com.example.notification.impl.SMSNotification;
import com.example.notification.impl.VoiceMessageNotification;

public class NotificationFactory {

    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty()) {
            throw new IllegalArgumentException("Select the notification channels below: sms, email or voice");
        }
        switch (channel.toLowerCase()) {
            case "sms":
                return new SMSNotification();
            case "email":
                return new EmailNotification();
            case "voice":
                return new VoiceMessageNotification();
            default:
                throw new IllegalArgumentException("Unknown channel " + channel + ". Allowed channels: sms, email and voice");
        }
    }
}
