
class Person(var age: Int = 0) {
  if (age < 0) age = 0
}

val person = new Person(5)
println(person.age)

val secondPerson = new Person(-10)
println(secondPerson.age)
