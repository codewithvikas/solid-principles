package com.example.solidprinciples.solid.openclose

import com.example.solidprinciples.solid.openclose.Notification

/**
 * SOLID.
 * O- Open-Close principles
 * Open for Extension and Closed for modification
 * This NotificationService follow the principle
 */
class NotificationService {

    fun sendNotification(notification: Notification, value: String) {
        notification.notify(value)
    }
}