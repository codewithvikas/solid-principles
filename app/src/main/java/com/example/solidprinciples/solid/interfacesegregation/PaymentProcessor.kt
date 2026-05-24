package com.example.solidprinciples.solid.interfacesegregation

/**
 * SOLID
 * I Interface Segregation.
 * It does not follow this principle.
 * As we can see method applyDiscount() is not applicable for Credit Card and Bank Transfer, but we force to implement it
 */
interface PaymentProcessor {
    fun processPayment(amount: Double)
    fun refundPayment(amount: Double)
    fun applyDiscount(amount: Double)
}

class CreditCard : PaymentProcessor {
    override fun processPayment(amount: Double) {
        println("Processing Credit Card payment of Rs $amount")
    }

    override fun refundPayment(amount: Double) {
        println("Refunding credit card payment of Rs $amount")
    }

    override fun applyDiscount(amount: Double) {
        throw UnsupportedOperationException("Credit card does not support discounts")
    }
}

class BankTransfer : PaymentProcessor {
    override fun processPayment(amount: Double) {
        println("Processing Bank transfer payment of Rs $amount")
    }

    override fun refundPayment(amount: Double) {
        println("Refunding Bank transfer payment of Rs $amount")
    }

    override fun applyDiscount(amount: Double) {
        throw UnsupportedOperationException("Bank transfer does not support discounts")
    }
}

class Gpay : PaymentProcessor {
    override fun processPayment(amount: Double) {
        println("Processing Gpay payment of Rs $amount")
    }

    override fun refundPayment(amount: Double) {
        println("Refunding Gpay payment of Rs $amount")
    }

    override fun applyDiscount(amount: Double) {
        println("Applying coupon for Gpay payment of Rs $amount")
    }
}