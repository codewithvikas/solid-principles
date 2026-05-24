package com.example.solidprinciples.solid.openclose

class SmsNotification : Notification {
    override fun notify(value: String) {
        println("Sending SMS $value")
    }
}