package com.example.solidprinciples.solid.srp

import com.example.solidprinciples.solid.ocp.final.EmailNotification
import com.example.solidprinciples.solid.ocp.final.Notification
import com.example.solidprinciples.solid.ocp.final.NotificationService
import com.example.solidprinciples.solid.srp.final.FileManager
import com.example.solidprinciples.solid.srp.final.Logger
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test

class SrpTest {

    @Test
    fun `verify email notification with MockK`() {
        val logger = mockk<Logger>(relaxed = true)
        val notificationService = NotificationService() 
        val mockNotification = mockk<Notification>(relaxed = true)
        
        val fileManager = FileManager(logger, notificationService, mockNotification)
        val fileName = "ChatSheet.docx"

        fileManager.saveFile(fileName)

        // Verify specifically that notify was called
        verify { mockNotification.notify(any()) }
    }
}
