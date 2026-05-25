package com.example.solidprinciples.solid.dependencyinversion

class UserController(val database: Database) {
    fun saveUser(user: String) {
        database.saveUser(user)
    }
}

interface Database {
    fun saveUser(user: String)
}

class SqlDatabase : Database {
    override fun saveUser(user: String) {
        println("User - $user saved in SQL database")
    }

}