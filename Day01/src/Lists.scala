object Lists {

	//create a function that will give you a list of even numbers 
    //The function will accept a list of numbers as argument
  def evenList2(list: List[Int]):List[Int] = {
    var listtemp:List[Int] = List()
    list foreach(i=>if(i%2 == 0) listtemp = listtemp :+ i )
   listtemp
 }
  
  //create a function that will give you a list of even numbers starting from 1 to n where n is the 
  //input parameter to the function
  
  def evenList(n: Int):List[Int] = {
	  var list:List[Int] = List()
	  1 to n foreach(i=>if(i%2 == 0) list = list :+ i )
	  list
  } 
  
  def main(args: Array[String]): Unit = {
    println(evenList2(List(1,2,3,54,5,566,7,78,8,89,909,0,12)))
    println("********************************")
    println(evenList(15))
    println("********************************")
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