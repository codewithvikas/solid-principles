package com.example.solidprinciples.domain.srp

class EmailNotification : Notification {
    override fun notify(value: String) {
        println("Sending Email $value")
    }
}