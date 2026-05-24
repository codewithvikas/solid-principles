package com.example.solidprinciples.solid.liskovsubstitution

/**
 * SOLID
 * L- Liskov substitution principle
 * This Implementation violates Liskov substitution principle
 */
open class BankAccount(open val amount: Double) {

    fun balance() {
        println("Current Balance: Rs $amount")
    }

    open fun withdraw() {
        println("Withdraw: Rs $amount")
    }
}

class SavingsAccount(override val amount: Double) : BankAccount(amount) {

    override fun withdraw() {
        println("Saving account withdrawn : Rs $amount")
    }
}

class FixedDepositAccount(override val amount: Double) : BankAccount(amount) {

    override fun withdraw() {
        throw UnsupportedOperationException("Fixed deposit accounts can not withdraw.")
    }
}