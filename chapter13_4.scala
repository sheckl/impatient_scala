
def returnValues(names: Array[String], map: Map[String, Int]) = {
  names.flatMap(map.get(_)).toArray
}

val names = Array("Tom", "Fred", "Harry")
val map = Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)
println(returnValues(names, map).mkString(", "))