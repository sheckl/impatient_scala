
import java.lang.System

val userName = System.getProperty("user.name")
val password = Console.readLine()

if (password == "secret") {
  System.out.println("Welcome " + userName)
} else {
  //println("Wrong password!")
  System.err.println("Wrong password!")
}


// println Kurzschreibweise für System.out.println(...)
// Fehlerstream: System.err.println(...)
//

