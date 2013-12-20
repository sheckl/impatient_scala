
import java.util.{HashMap => JavaHashMap}
import collection.mutable.{HashMap => ScalaHashMap}

def javaToScalaMap(jmap: JavaHashMap[String,String]) = {

  val smap = new ScalaHashMap[String,String]()
  val it = jmap.entrySet().iterator()
  while(it.hasNext()) {
    val entry = it.next()
    smap(entry.getKey) = entry.getValue
  }
  smap
}

val jmap = new JavaHashMap[String, String]()
jmap.put("firstname", "Sabrina")
jmap.put("lastname", "Heckl")
println(javaToScalaMap(jmap))
