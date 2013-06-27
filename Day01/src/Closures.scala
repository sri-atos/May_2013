import scala.collection.Map
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
  
  //Curried closure 
  def sumAnother(limit:Int)(code:Int=>Int):Unit = {
    var result:Int = 0
    for(i<-1 to limit){
      result += code(i)
    }
    println(result)
  } 
   
  def doSthg():(String,Boolean) = {
    ("Hello",true)
  }
  def main(args: Array[String]): Unit = {
    var langs = Map[Int,String](1->"Java",2->"Scala",3->"Ruby")
    langs.foreach {obj=>println(obj._1 + ", " + obj._2)}
    
    var tuple1 = (12,23,"String",true)
    var arg = doSthg()
    println(arg._1 + ". " + arg._2)
    
    sumAnother(100) {i=>i}
    sumAnother(100) {i=>if(i%2 == 0)i else 0}
    
    
    def calc = new Calculator(100,200)
    println(calc.operate((a,b)=>a+b))
    println(calc.operate((a,b)=>a*b))
    println(calc.operate((a,b)=>a-b))
    println(calc.operate((a,b)=>a/b))

    calc.operate2() {(a,b)=>a+b}
    
    println("******************************")
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
     //arr.foreach ({i=>println(i)})
     arr foreach {i=>println(i)}

    
    
    
     var hw = {println("Hello World");println("Bye");}
	 hw
	 
	 var hello = {name:String=>println("Hello " + name)}
	 hello("Sriram")
	 
	 var add = {(i:Int,j:Int)=>i+j}
	 println(add(10,20))
	 
	 f1("Ram",name=>("Hello " + name))
  }

}