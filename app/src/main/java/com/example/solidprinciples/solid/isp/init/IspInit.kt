package com.example.solidprinciples.solid.isp.init

/**
 * ISP Violation: The interface is too fat. CreditCard is forced 
 * to implement applyDiscount() which it doesn't support.
 */
interface PaymentProcessor {
    fun processPayment(amount: Double)
    fun refundPayment(amount: Double)
    fun applyDiscount(amount: Double)
}

class CreditCard : PaymentProcessor {
    override fun processPayment(amount: Double) = println("CC Processed")
    override fun refundPayment(amount: Double) = println("CC Refunded")
    override fun applyDiscount(amount: Double) {
        throw UnsupportedOperationException("Discounts not supported")
    }
}

class Gpay : PaymentProcessor {
    override fun processPayment(amount: Double) = println("Gpay Processed")
    override fun refundPayment(amount: Double) = println("Gpay Refunded")
    override fun applyDiscount(amount: Double) = println("Discount applied")
}
