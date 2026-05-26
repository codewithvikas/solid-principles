package com.example.solidprinciples.solid.srp.final

import com.example.solidprinciples.solid.ocp.final.Notification
import com.example.solidprinciples.solid.ocp.final.NotificationService
import kotlin.random.Random

/**
 * SRP Followed: Each class has a single responsibility.
 */

class Logger {
    fun logAction(action: String) {
        println("Log: $action")
    }
}

class FileManager(
    val logger: Logger,
    val notificationService: NotificationService,
    val notification: Notification
) {
    private val files = mutableListOf<String>()

    fun openFile(fileName: String) {
        if (files.contains(fileName)) {
            println("Opening file $fileName")
            logger.logAction("Opening File $fileName")
            notificationService.sendNotification(notification, "Opening File $fileName")
        } else {
            notificationService.sendNotification(notification, "Can not open file $fileName")
        }
    }

    fun saveFile(fileName: String) {
        println("Saving file $fileName")
        files.add(fileName)
        logger.logAction("Save $fileName")
        notificationService.sendNotification(notification, "Saved File $fileName")
    }
}

class ThumbnailService(
    val logger: Logger,
    val notificationService: NotificationService,
    val notification: Notification
) {
    fun generateThumbnail(fileName: String) {
        println("Generating thumbnail $fileName")
        logger.logAction("Time Take for Thumbnail: ${Random.nextInt(1, 10)} second for $fileName")
        notificationService.sendNotification(notification, "Generated Thumbnail for $fileName")
    }
}
