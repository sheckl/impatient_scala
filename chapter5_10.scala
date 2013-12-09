
class Employee(val name: String = "John Q. Public", var salary: Double = 0.0) {}

// zählt das schon als explizite Felder?
// oder muss es so sein:

/*
class Employee(val employeeName: String = "John Q. Public", var employeeSalary: Double = 0.0) {
  val name: String = employeeName
  var salary: Double = employeeSalary
}
*/

val firstEmployee = new Employee
println(firstEmployee.name)
println(firstEmployee.salary)

val secondEmployee = new Employee("Max Mustermann", 100)
println(secondEmployee.name)
println(secondEmployee.salary)
