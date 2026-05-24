package com.example.solidprinciples

import com.example.solidprinciples.solid.openclose.EmailNotification
import com.example.solidprinciples.solid.singleresponsblity.FileManager
import com.example.solidprinciples.solid.singleresponsblity.Logger
import com.example.solidprinciples.solid.openclose.NotificationService
import com.example.solidprinciples.solid.openclose.SmsNotification
import com.example.solidprinciples.solid.singleresponsblity.ThumbnailService
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test

class FileManagerTest {

    @Test
    fun `verify all message printed`() {
        val logger = Logger()
        val notificationService = NotificationService()
        val notification = EmailNotification()
        val thumbnailService = ThumbnailService(logger, notificationService, notification)
        val fileManager = FileManager(logger, notificationService, notification)
        val fileName = "ChatSheet.docx"
        fileManager.openFile(fileName)
        fileManager.saveFile(fileName)
        thumbnailService.generateThumbnail(fileName)
    }

    @Test
    fun `verify email notification`() {
        val logger = Logger()
        val notificationService: NotificationService = mockk(relaxed = true)
        val notification = EmailNotification()
        val thumbnailService = ThumbnailService(logger, notificationService, notification)
        val fileManager = FileManager(logger, notificationService, notification)
        val fileName = "ChatSheet.docx"
        val value = "Opening File $fileName"
        fileManager.saveFile(fileName)
        fileManager.openFile(fileName)
        thumbnailService.generateThumbnail(fileName)

        verify { notificationService.sendNotification(notification, value) }
    }

    @Test
    fun `verify sms notification`() {
        val logger = Logger()
        val notificationService: NotificationService = mockk(relaxed = true)
        val notification = SmsNotification()
        val thumbnailService = ThumbnailService(logger, notificationService, notification)
        val fileManager = FileManager(logger, notificationService, notification)
        val fileName = "ChatSheet.docx"
        val value = "Opening File $fileName"
        fileManager.saveFile(fileName)
        fileManager.openFile(fileName)
        thumbnailService.generateThumbnail(fileName)

        verify { notificationService.sendNotification(notification, value) }
    }
}