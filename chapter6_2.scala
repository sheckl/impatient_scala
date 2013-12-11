
abstract class UnitConversion(var conversionFactor: Double) {
  def convert(unitToConvert: Double) = { unitToConvert * conversionFactor }
}

object inchesToCentimeters extends UnitConversion(2.54)
object gallonsToLiters extends UnitConversion(4.404)
object milesToKilometers extends UnitConversion(1.609)

println(inchesToCentimeters.convert(10))
println(gallonsToLiters.convert(10))
println(milesToKilometers.convert(10))
