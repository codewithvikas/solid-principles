package com.example.solidprinciples.domain

class StandardShipping(private val destination: String, private val weight: Double) :
    ShippingMethod(destination, weight) {

    override fun calculateCost(): Double {
        return weight * 15
    }

    override fun details(): String {
        return "Standard Shipping to $destination for weight $weight kg"
    }
}