class Calculator(num1:Int,num2:Int) {

  def operate(block:(Int,Int)=>Int):Int = {
	  block(num1,num2)
  }
  def operate2()(block:(Int,Int)=>Int):Int = {
	  block(num1,num2)
  }
}