
val lst = List(1,2,3,4,5)

println((lst :\ List[Int]())(_ :: _))
println((List[Int]() /: lst)(_ :+ _))
// hier werden die einzelnen Elemente von lst aneinander gereiht (einmal mit :: und einmal mit :+)

println((List[Int]() /: lst)((x,y) => y +: x))
// hier wird die 'alte' Liste an das neue Element gehängt,
// wodurch sich die Liste 'umdreht'