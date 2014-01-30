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

//hier bietet sich "refactor -> extract -> method" an (-> Mail von Oli)