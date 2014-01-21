
abstract class Item {
  def price: Double
  def description: String
}

class SimpleItem(override val description: String, override val price: Double) extends Item

class Bundle extends Item {
  val items = scala.collection.mutable.Map[String, Double]()
  def addItem(newItem: Item) = { items += (newItem.description -> newItem.price) }
  def price: Double = items.values.sum
  def description: String = items.keySet.mkString(", ")
}

val b = new Bundle
b.addItem(new SimpleItem("Buch",10.0))
println("Enthaltene Artikel: " + b.description + "; Preis gesamt: " + b.price)
b.addItem(new SimpleItem("Laptop",1000.0))
println("Enthaltene Artikel: " + b.description + "; Preis gesamt: " + b.price)
b.addItem(new SimpleItem("Auto",10000.0))
println("Enthaltene Artikel: " + b.description + "; Preis gesamt: " + b.price)


