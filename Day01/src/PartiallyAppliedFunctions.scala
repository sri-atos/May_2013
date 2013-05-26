object PartiallyAppliedFunctions {
	
  
   //create a function that prints the Arithmetic Progression series for n numbers starting from i with the difference being d
   //create a function that prints the Geometric Progression series for n numbers starting from i with the multiplication factor being m
  
   //Invoke arithmetic and geometric progression functions for a series of n numbers starting from i but with varying differences or multiplication factor
   //Implement it using partially applied function
  
  
    def calculateTax(taxPercent:Int,year:Int,country:String):Unit = {
      println("Tax for " + country + " in the year " + year + " with tax percentage " + taxPercent + " is _____")
    }
	def increment(value:Any):Unit = {
	  //value++ //ERROR
	  //println(value+1)
	}
	def main(args:Array[String]):Unit = {
/*    		calculateTax(30,2008,"UK")
	        calculateTax(30,2009,"UK")
    		calculateTax(30,2010,"UK")
    		calculateTax(30,2011,"UK")
    		calculateTax(30,2012,"UK")*/
	  
    		//2008 to 2012 foreach(i=>calculateTax(30,i,"UK"))	
			
    		
    		var tax = calculateTax(30,_:Int,"UK")
    		2008 to 2012 foreach(i=>tax(i))		
    		
    		var tax2 = calculateTax(_:Int,2013,_:String)
    		tax2(24,"USA");
    		tax2(12,"India")
    		
    		
    		var b:Boolean = true
			var d:Double = 324.34
			var i:Int = 200
			var f:Float = 45.45f
			
			increment(100)
			increment(12.23f)
			increment(120.26)
	}
}