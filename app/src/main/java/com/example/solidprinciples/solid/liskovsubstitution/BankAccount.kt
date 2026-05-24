package com.example.solidprinciples.solid.liskovsubstitution

/**
 * SOLID
 * L- Liskov substitution principle
 * This Implementation Liskov substitution principle.
 *Solved problem by separate what differ. Here withdraw were behaving differently so separated out withdraw behavior.
 */

interface Withdrawable {
    fun withdraw(amount: Double)
}

open class BankAccount(open val amount: Double) {

    fun balance() {
        println("Current Balance: Rs $amount")
    }
}

class SavingsAccount(override val amount: Double) : BankAccount(amount), Withdrawable {

    override fun withdraw(amount: Double) {
        println("Saving account withdrawn : Rs $amount")
    }
}

class FixedDepositAccount(override val amount: Double) : BankAccount(amount) {

}