package com.example.solidprinciples.domain.srp

class SmsNotification : Notification {
    override fun notify(value: String) {
        println("Sending SMS $value")
    }
}