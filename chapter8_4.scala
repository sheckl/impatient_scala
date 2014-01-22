import scala.collection.mutable

abstract class Item {
  def price: Double
  def description: String
}

class SimpleItem(override val description: String, override val price: Double) extends Item

class Bundle extends Item {
  val items = new mutable.ListBuffer[Item]()

  def addItem(newItem: Item) = {
    items += newItem
    this
  }

  def price: Double = items.map(_.price).sum

  def description: String = items.map(_.description).mkString(", ")

  override def toString = "Enthaltene Artikel: " + description + "; Preis gesamt: " + price
}

val b = new Bundle
println(b.addItem(new SimpleItem("Buch",10.0)))

println(b.addItem(new SimpleItem("Laptop",1000.0)).addItem(new SimpleItem("Auto",10000.0)))


