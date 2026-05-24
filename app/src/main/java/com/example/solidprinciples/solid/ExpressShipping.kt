package com.example.solidprinciples.solid

class ExpressShipping(private val destination: String, private val weight: Double) :
    ShippingMethod(destination, weight) {
    override fun calculateCost(): Double {
        return weight * 30
    }

    override fun details(): String {
        return "Store pickup to $destination"
    }
}