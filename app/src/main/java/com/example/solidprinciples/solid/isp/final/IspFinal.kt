package com.example.solidprinciples.solid.isp.final

/**
 * ISP Followed: Interfaces are small and specific.
 */

interface PaymentProcessor {
    fun processPayment(amount: Double)
    fun refundPayment(amount: Double)
}

interface Discountable {
    fun applyDiscount(amount: Double)
}

class CreditCard : PaymentProcessor {
    override fun processPayment(amount: Double) = println("CC Processed")
    override fun refundPayment(amount: Double) = println("CC Refunded")
}

class Gpay : PaymentProcessor, Discountable {
    override fun processPayment(amount: Double) = println("Gpay Processed")
    override fun refundPayment(amount: Double) = println("Gpay Refunded")
    override fun applyDiscount(amount: Double) = println("Discount applied")
}
