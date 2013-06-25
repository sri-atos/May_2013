object Refresher1 {

  def calculateSquareAndTwiceTheNumber(num:Int):(Int,Int) = {
    var sq = num * num
    var tw = num + num
    (sq,tw)
  }
  def sum(a:Int,b:Int,c:Int):Int = {
    a+b+c
  }
  def printList(lst:List[Any]) = {
    lst foreach(item=>println(item))
  }
  def main(args: Array[String]): Unit = {
    //Tuple
    var result = calculateSquareAndTwiceTheNumber(11)
    println(result._1 + ", " + result._2)
    var str:String = "123"
    var n:Int =  str.asInstanceOf[Int]
    
    var tuple1 = (12,34,55,"Hello")
    println(tuple1._1 + ", " + tuple1._2 + ", " + tuple1._3 + ", " + tuple1._4)
    var langs = Map(1->"Java",2->"C#",3->"Scala",4->"Groovy")
    langs.foreach(item=>println(item._1 + ": " + item._2))
    
    var mylst = List[String]()//Immutable
    mylst = "Java" :: mylst
    mylst = "C#" :: mylst
    //mylst = mylst.::("Scala")
    
    println(mylst)
    
    println(sum(1,2,3))
    var sum1 = sum(_:Int,2,3)
    println(sum1(10))
    println(sum1(13))
    
    println("Refresher")
    var arr1 = new Array[String](3)
    arr1(0) = "Java"
    arr1(1) = "Scala"
    arr1(2) = "Groovy"
    for(i<-0 to 2){
      println(arr1(i))
    }
    println("****foreach")
    for(item<-arr1)
      println(item)
    
    arr1 foreach(item=>println(item))   
    var lst = List[Int](1,2,3,4)
    lst foreach(item=>println(item))
    
    printList(lst)
    printList(List[String]("A","B","C"))
  }

}