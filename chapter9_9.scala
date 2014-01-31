import java.io.File

def foo(dir: File) {
  for(child <- dir.listFiles) {
    if (child.isFile) {
      if (child.getName.matches("""[a-z0-9_]+.scala""")) {
        println(child.getAbsolutePath)
      }
    }  else {
      foo(child)
    }
  }

}

foo(new File("."))

//hier bietet sich "refactor -> extract -> method" an

//Lösung Alex (nach refactor):
/*
import java.io.File

def isScalaSourceFile(child: File): Boolean = {
  child.getName.matches( """[a-z0-9_]+.scala""")
}

def foo(dir: File) {
  val contents = dir.listFiles

  contents.filter(f => f.isFile && isScalaSourceFile(f)).foreach(f => println(f.getAbsolutePath))

  contents.filter(_.isDirectory).foreach(foo)
}

foo(new File(".."))
*/