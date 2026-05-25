package com.example.solidprinciples.solid.dependencyinversion

class UserController {
    val sqlDatabase = SqlDatabase()
    fun saveUser(user: String) {
        sqlDatabase.saveUSer(user)
    }
}

class SqlDatabase {
    fun saveUSer(user: String) {
        println("User - $user saved in SQL database")
    }
}