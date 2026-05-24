package com.example.solidprinciples.domain.srp

/**
 * SOLID
 * S - Single Responsibility Principle (SRP)
 * Now FileManager follow SRP because this is only what intended.
 */
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
            notificationService.sendNotification(
                notification = notification,
                value = "Opening File $fileName"
            )
        } else {
            notificationService.sendNotification(
                notification = notification,
                value = "Can not open file $fileName"
            )
        }
    }

    fun saveFile(fileName: String) {
        println("Saving file $fileName")
        files.add(fileName)
        logger.logAction("Save $fileName")
        notificationService.sendNotification(
            notification = notification,
            value = "Saved File $fileName"
        )
    }
}