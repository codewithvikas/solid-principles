package com.example.solidprinciples.solid.lsp.init

/**
 * LSP Violation: FixedDepositAccount is a BankAccount, but it cannot 
 * support the withdraw operation. Substituting BankAccount with 
 * FixedDepositAccount will break the program (UnsupportedOperationException).
 */

open class BankAccount(var balance: Double) {
    open fun withdraw(amount: Double) {
        balance -= amount
        println("Withdrawn $amount. New balance: $balance")
    }
}

class SavingsAccount(balance: Double) : BankAccount(balance)

class FixedDepositAccount(balance: Double) : BankAccount(balance) {
    override fun withdraw(amount: Double) {
        // Violation: Breaking the contract of the base class
        throw UnsupportedOperationException("Withdrawals not allowed from Fixed Deposit")
    }
}
