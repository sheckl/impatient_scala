
class Person(name: String) {
  val firstName = name.split(" ")(0)   // split gibt ein Array zurück
  val lastName = name.split(" ")(1)
}
val person = new Person("Fred Smith")
println("This person is called " + person.firstName + " " + person.lastName + ".")

// der zusammengesetzte Name (name) wird bei einem plain parameter als object-privat deklariert
// ist ok, weil er sonst nirgends erreichbar sein muss
