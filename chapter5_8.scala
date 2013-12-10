
class Car(val manufacturer: String, val modelName: String) {
  private var currentModelYear: Int = -1
  var licensePlate: String = ""

  def this(manufacturer: String, modelName: String, currentModelYear: Int) {
    this(manufacturer, modelName)
    this.currentModelYear = currentModelYear
  }

  def this(manufacturer: String, modelName: String, licensePlate: String) {
    this(manufacturer, modelName)
    this.licensePlate = licensePlate
  }

  def this(manufacturer: String, modelName: String, currentModelYear: Int, licensePlate: String) {
    this(manufacturer, modelName)
    this.currentModelYear = currentModelYear
    this.licensePlate = licensePlate
  }

  def modelYear = currentModelYear
}


val firstCar = new Car("Audi", "A8")
println(firstCar.manufacturer + firstCar.modelName + firstCar.modelYear + firstCar.licensePlate)
val secondCar = new Car("Audi", "A8", 2013)
println(secondCar.manufacturer + secondCar.modelName + secondCar.modelYear + secondCar.licensePlate)
val thirdCar = new Car("Audi", "A8", 2013, "M-AB-123")
println(thirdCar.manufacturer + thirdCar.modelName + thirdCar.modelYear + thirdCar.licensePlate)
thirdCar.licensePlate = "A-ABC-123"
println(thirdCar.manufacturer + thirdCar.modelName + thirdCar.modelYear + thirdCar.licensePlate)
// val testCar = new Car()   => Unspecified value parameters manufacturer, modelName.

