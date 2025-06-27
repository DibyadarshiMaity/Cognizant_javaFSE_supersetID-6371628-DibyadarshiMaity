package com.example;

public class AlertService {
    private NotificationService notifier;

    public AlertService(NotificationService notifier) {
        this.notifier = notifier;
    }

    public void alertUser() {
        notifier.sendEmail();
        notifier.sendSMS();
        notifier.sendPushNotification();
    }
}
