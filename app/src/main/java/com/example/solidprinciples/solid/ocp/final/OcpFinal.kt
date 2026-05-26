package com.example.solidprinciples.solid.ocp.final

/**
 * OCP Followed: Open for extension (new notification types), 
 * closed for modification (NotificationService stays the same).
 */

interface Notification {
    fun notify(message: String)
}

class EmailNotification : Notification {
    override fun notify(message: String) = println("Sending Email: $message")
}

class SmsNotification : Notification {
    override fun notify(message: String) = println("Sending SMS: $message")
}

class WhatsappNotification : Notification {
    override fun notify(message: String) = println("Sending Whatsapp: $message")
}

class NotificationService {
    fun sendNotification(notification: Notification, message: String) {
        notification.notify(message)
    }
}
