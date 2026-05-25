package com.example.solidprinciples

import com.example.solidprinciples.solid.dependencyinversion.SqlDatabase
import com.example.solidprinciples.solid.dependencyinversion.UserController
import org.junit.Test

class UserControllerTest {

    @Test
    fun `test save user function`() {
        val database = SqlDatabase()
        val userController = UserController(database = database)
        userController.saveUser("Vikas")
    }
}