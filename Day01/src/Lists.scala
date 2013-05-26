object Lists {

  //create a function that will give you a list of even numbers starting from 1 to n where n is the 
  //input parameter to the function
  
  def main(args: Array[String]): Unit = {
    
    var lst1:List[Int] = List(1,2,3)//Immutable
    //println(lst1.getClass())
    
    
    //var lst2 = lst1.::(100)
    var lst2 = 100 :: lst1 //prepend
    println(lst2)

    var lst3 = lst1 :+ 100 //append
    println (lst3)
    lst3.foreach(i=>println(i))
    println(lst3(0))
    println(lst3.last)
    println(lst3.tail)
    println(lst3.head)
    println(lst3.length)
  }

}