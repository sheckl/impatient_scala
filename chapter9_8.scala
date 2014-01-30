
val html = io.Source.fromURL("http://www.helpster.de", "UTF-8").mkString

val regEx = """<img[^>]*src="([^"]*)"[^>]*>""".r

for(regEx(elem) <- regEx.findAllIn(html)) println(elem)
