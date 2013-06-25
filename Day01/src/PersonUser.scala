import scala.util.Random
object PersonUser {

  def main(args: Array[String]): Unit = {
    var rnd:Int = new Random().nextInt(100)
    
    var p:Person = new Person("Sam",12)
    /*p.name = "Ram"
    p.age = 37*/
    println(p)
  }

}