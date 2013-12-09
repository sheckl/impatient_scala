
class Car(val manufacturer: String, val modelName: String, val modelYear: Int = -1, var licensePlate: String = "") {
  println("manufacturer: " + manufacturer)
  println("modelName: " + modelName)
  println("modelYear: " + modelYear)
  println("licensePlate: " + licensePlate)
}
val firstCar = new Car("Audi", "A8")
val secondCar = new Car("Audi", "A8", 2013)
val thirdCar = new Car("Audi", "A8", 2013, "M-AB-123")
// val testCar = new Car()   => Unspecified value parameters manufacturer, modelName.
