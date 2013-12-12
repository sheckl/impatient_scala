
abstract class UnitConversion {
  def convert(unitToConvert: Double): Double
}

object InchesToCentimeters extends UnitConversion {
  def convert(unitToConvert: Double) = unitToConvert * 2.54
}

object GallonsToLiters extends UnitConversion {
  def convert(unitToConvert: Double) = unitToConvert * 4.404
}

object MilesToKilometers extends UnitConversion {
  def convert(unitToConvert: Double) = unitToConvert * 1.609
}

println(InchesToCentimeters.convert(10))
println(GallonsToLiters.convert(10))
println(MilesToKilometers.convert(10))

// override nicht notwendig, weil Methode nicht implementiert ist
// abstract -> Methode nicht implementieren