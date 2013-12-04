
class BankAccount {
  private var money = 0

  def deposit(value: Int) = { money += value }

  def withdraw(value: Int) = {
    if (value <= money) {
      money -= value
    } else {
      throw new IllegalStateException("You don't have enough money!")
    }
  }

  def balance = money
}

val myBankAccount = new BankAccount
println(myBankAccount.balance)
myBankAccount.deposit(100)
println(myBankAccount.balance)
myBankAccount.withdraw(50)
println(myBankAccount.balance)
myBankAccount.withdraw(60)
println(myBankAccount.balance)

