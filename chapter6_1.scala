
object Conversions {
  def inchesToCentimeters(inches: Double) =  inches * 2.54

  def gallonsToLiters(gallons: Double) = gallons * 4.404

  def milesToKilometers(miles: Double) = miles * 1.609
}

println(Conversions.inchesToCentimeters(10))
println(Conversions.gallonsToLiters(10))
println(Conversions.milesToKilometers(10))
