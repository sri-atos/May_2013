object Closures {

  def f1(arg:String,code:String=>String) = {
    println(code(arg))
  }
  def sum(limit:Int,code:Int=>Int):Int = {
    var result:Int = 0
    for(i<-1 to limit){
      result += code(i)
    }
    result
  }
  
  def sumEven(limit:Int):Int = {
    var result:Int = 0
    for(i<-1 to limit){
      if(i%2 == 0)
        result += i
    }
  	result
  }
   def sumOdd(limit:Int):Int = {
    var result:Int = 0
    for(i<-1 to limit){
      if(i%2 != 0)
        result += i
    }
  	result
  }
  
  def main(args: Array[String]): Unit = {
	println(sum(100,i=>i))	  
    println(sum(100,i=>if(i%2 == 0) i else 0))
    println(sum(100,i=>if(i%2 != 0) i else 0))
    println(sum(100,i=>i*i))
    
    
    
    var arr = new Array[String](4)
	 arr(0) = "Java"
	 arr(1) = "C#"
	 arr(2) = "Ruby"
	 arr(3) = "Groovy"
	   
     arr.foreach(i=>println(i))
     
     var hw = {println("Hello World");println("Bye");}
	 hw
	 
	 var hello = {name:String=>println("Hello " + name)}
	 hello("Sriram")
	 
	 var add = {(i:Int,j:Int)=>i+j}
	 println(add(10,20))
	 
	 f1("Ram",name=>("Hello " + name))
  }

}