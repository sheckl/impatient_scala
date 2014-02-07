
val lst = List(1,2,3,4,5)

println((lst :\ List[Int]())(_ :: _))
println((List[Int]() /: lst)(_ :+ _))

println((List[Int]() /: lst)((x,y) => y +: x))