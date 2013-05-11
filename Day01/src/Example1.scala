object Example1 {

  //public void main(Array args) { }

   def function1(args:Array[String]):Unit = {
    args.foreach(a=>println(a))
   }
   
   def function2(args:Array[String]):Int = {
     args.length
   }
   
   
  def main(args: Array[String]): Unit = {
		  println("Hello World")
		  //Arrays are immutable
		  var arr1:Array[String] = new Array[String](3)
		  arr1(0) = "Siva"
		  arr1(1) = "Prabhu"
		  println(arr1(0))  
		  function1(arr1)
		  println(function2(arr1))
		  println("***************")
		  var arr2 = Array("A","B","C")
		  arr2.foreach(a=>println(a))
		  
		  var arr3 = Array(12,3,3,3)
		  var arr4 = Array[Int](3)
		  var arr5:Array[Int] = Array(454,54,54,545,4)

		  var i:Int = 100
		  var str:String = "Cool"
		  var b:Boolean = false  
  }

}