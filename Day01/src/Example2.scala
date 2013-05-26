object Example2 {

  def printFn1(arr:Array[Int]):Unit = {
    arr.foreach(i=>println(i))//Closure-based approach
  }
  def main(args: Array[String]): Unit = {
    
		  1 to 10 foreach(i=>println(i))
		  var n:Int = 10
		  (1 to n).foreach(i=>println(i)) //Range operator
		  
		  
		  println("Day 02")
		  var arr1:Array[Int] = Array(1,2,3,4,41)
		  printFn1(arr1)
		  
		  var arr2 = Array(12,23,345,456)
		  println(arr2(0))
		  printFn1(arr2)
		  
		  var arr3 = Array("A","B","C")
		  for(i<-arr3)
		    println(i)
		  
		  //arr2(2) = "1000" // compile time error
  }

}