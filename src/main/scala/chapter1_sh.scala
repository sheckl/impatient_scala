
// Exercise 2

val squareroot = scala.math.sqrt(3)
println(squareroot)
val square = scala.math.pow(squareroot, 2)
println(square)
val difference = 3 - square
println(difference)

// Exercise 4

println("crazy" * 3)

// Exercise 6

// scala.math.pow(2, 1024) liefert Infinity zurück, also 2 erst als BigInt definieren:
val x: BigInt = 2
import scala.math
println(x.pow(1024))  //pow ist hier die Funktion aus der Klasse BigInt

// Exercise 7

import BigInt._ //alle Funktionen der Klasse BigInt werden davon importiert
import scala.util.Random //hier wird nur Random importiert; vor util muss Scala stehen, weil es das auch in Java gibt
probablePrime(100, Random)

// Exercise 8

val random_bigint = BigInt(100, Random) //Syntax aus: BigInt suchen -> O anklicken -> apply-Funktion
random_bigint.toString(36)

// Exercise 9 / 10

"Hello".takeRight(2)
"Hello".substring(0,3) //-> “Hel” -> von der 0. Stelle bis exklusive zur 3. Stelle

/*
Vor- und Nachteile:
oben ist die Länge des Strings egal
es muss nur ein Argument mitgegeben werden (oben)
bei substring darf man nicht über die Länge hinaus gehen (-> Fehler)
substring gut, wenn nur ein Teil in der Mitte gesucht ist
*/



