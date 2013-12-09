
class Employee {
  var name: String = "John Q. Public"
  var salary: Double = 0.0
  def this(name: String, salary: Double) {
    this()
    this.name = name
    this.salary = salary
  }
}

val firstEmployee = new Employee
println(firstEmployee.name)
println(firstEmployee.salary)

val secondEmployee = new Employee("Max Mustermann", 100)
println(secondEmployee.name)
println(secondEmployee.salary)

// macht genau das gleiche wie der Code im Buch, ist nur viel länger
