package com.example.solidprinciples.domain.srp

import kotlin.random.Random

/**
 * SOLID
 * S - Single Responsibility Principle (SRP)
 * This FileManager does not follow SRP because this is doing many different work
 */
class FileManager {
    private val files = mutableListOf<String>()

    public fun openFile(fileName: String) {
        if (files.contains(fileName)) {
            println("Opening file $fileName")
            logAction("Opening File $fileName")
            sendNotification("Opening File $fileName")
        } else {
            sendNotification("Can not open file $fileName")
        }
    }

    public fun saveFile(fileName: String) {
        println("Saving file $fileName")
        files.add(fileName)
        logAction("Save $fileName")
        sendNotification("Saved File $fileName")
    }

    public fun generateThumbnail(fileName: String) {
        println("Generating thumbnail $fileName")
        logAction("Time Take for Thumbnail: ${Random.nextInt(1,10)} second for $fileName")
        sendNotification("Generated Thumbnail for $fileName")
    }

    private fun sendNotification(value: String) {
        println("Sending Email $value")
    }

    private fun logAction(value: String) {
        println("Action logged $value")
    }
}