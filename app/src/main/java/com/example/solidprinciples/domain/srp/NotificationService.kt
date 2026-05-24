package com.example.solidprinciples.domain.srp

/**
 * SOLID.
 * O- Open-Close principles
 * Open for Extension and Closed for modification
 * This NotificationService does not follow this principle as of now
 */
class NotificationService {

    fun sendNotification(type: NotificationType, value: String) {
        when (type) {
            NotificationType.EMAIL -> println("Sending Email $value")
            NotificationType.SMS -> println("Sending SMS $value")
            NotificationType.WHATSAPP -> println("Sending Whatsapp message $value")
        }
    }
}

enum class NotificationType {
    EMAIL, SMS, WHATSAPP
}