
def removeZeros(lst: scala.collection.mutable.LinkedList[Int]) = {
  var cur = lst

  while (cur != Nil) {
    if (cur.elem == 0) {
      cur.elem = cur.next
      cur = cur.elem
    } else {
      cur = cur.next
    }
  }

  lst
}

val lst = scala.collection.mutable.LinkedList(1, -2, 0, 7, 0, 4)

//println(list.filterNot(_ == 0))
println(removeZeros(lst))