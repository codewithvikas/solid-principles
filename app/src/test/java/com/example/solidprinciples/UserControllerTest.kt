package com.example.solidprinciples

import com.example.solidprinciples.solid.dependencyinversion.UserController
import org.junit.Test

class UserControllerTest {

    // This is just to print message. This is not proper test.
    @Test
    fun `test save user function`() {
        val userController = UserController()
        userController.saveUser("Vikas")
    }
}