// remove all zeros from a linked list of integers

def removeZeros(lst: scala.collection.mutable.LinkedList[Int]) = {
  lst.filterNot(_ == 0)
}

val list = scala.collection.mutable.LinkedList(1, 2, 0, 7, 0, 4)
println(removeZeros(list))