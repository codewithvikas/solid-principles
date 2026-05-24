package com.example.solidprinciples.solid

abstract class ShippingMethod(private val destination: String, private val weight: Double) {
    abstract fun calculateCost(): Double

    abstract fun details(): String
}