
class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
}

class SavingsAccount(initialBalance: Double, val interest: Double = 0.10) extends BankAccount(initialBalance) {
  var numberOfTransactions: Int = 0

  def isFreeTransaction = numberOfTransactions <= 3

  override def deposit(amount: Double) = { numberOfTransactions += 1; super.deposit(amount - (if (isFreeTransaction()) 0.0 else 1.0)) }

  override def withdraw(amount: Double) = { numberOfTransactions += 1; super.withdraw(amount + (if (isFreeTransaction()) 0.0 else 1.0)) }

  def earnMonthlyInterest = {
    numberOfTransactions = 0
    super.deposit(initialBalance * interest)
  }
}

val b = new BankAccount(1000.0)
println(b.currentBalance)
b.deposit(100)
println(b.currentBalance)
b.withdraw(100)
println(b.currentBalance)


val a = new SavingsAccount(1000.0)
println(a.currentBalance)

a.deposit(100)
println(a.currentBalance)

a.withdraw(100)
println(a.currentBalance)

a.deposit(100)
println(a.currentBalance)

a.deposit(100)
println(a.currentBalance)

a.deposit(100)
println(a.currentBalance)