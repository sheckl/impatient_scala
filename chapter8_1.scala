
class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
}

class CheckedAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double) = super.deposit(amount - 1.0)
  override def withdraw(amount: Double) = super.withdraw(amount + 1.0)
}

val b = new BankAccount(1000.0)
b.deposit(100)
println(b.currentBalance)
b.withdraw(100)
println(b.currentBalance)

val a = new CheckedAccount(1000.0)
a.deposit(100)
println(a.currentBalance)
a.withdraw(100)
println(a.currentBalance)