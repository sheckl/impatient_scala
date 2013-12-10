
object Conversions {
  private var centimeters: Double = 0
  private var liters: Double = 0
  private var kilometers: Double = 0
  def inchesToCentimeters(inches: Double) = {centimeters = inches * 2.54; centimeters}
  def gallonsToLiters(gallons: Int) = {liters = gallons * 4.404; liters}
  def milesToKilometers(miles: Double) = {kilometers = miles * 1.609; kilometers}
}

println(Conversions.inchesToCentimeters(10))
println(Conversions.gallonsToLiters(10))
println(Conversions.milesToKilometers(10))

