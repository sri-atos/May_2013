
object ImmutableMap {

  
  def main(args: Array[String]): Unit = {
		  var langs:Map[Int,String] = Map()
		  langs += (1->"Java")
		  langs += (2->"C#")
		  println(langs)
		  println(langs(2))
		  
		  var set1 = Set("C#","Ruby")
		  set1 = set1 + "Scala"
		  println(set1)
  }

}