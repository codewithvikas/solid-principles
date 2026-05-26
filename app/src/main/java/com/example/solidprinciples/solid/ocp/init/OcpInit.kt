package com.example.solidprinciples.solid.ocp.init

/**
 * OCP Violation: To add a new notification type (like Push), 
 * we have to MODIFY this class and add a new when branch.
 */
class NotificationService {
    fun sendNotification(type: String, message: String) {
        when (type) {
            "Email" -> println("Sending Email: $message")
            "SMS" -> println("Sending SMS: $message")
            "Whatsapp" -> println("Sending Whatsapp: $message")
            // If we want to add Push, we must change this code (Violation)
        }
    }
}
