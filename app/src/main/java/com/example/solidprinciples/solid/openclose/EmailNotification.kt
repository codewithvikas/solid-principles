package com.example.solidprinciples.solid.openclose

class EmailNotification : Notification {
    override fun notify(value: String) {
        println("Sending Email $value")
    }
}