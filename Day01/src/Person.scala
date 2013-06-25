class Person(theName:String,theAge:Int) {
	var name:String = theName
	var age:Int = theAge
	def work(hours:Int):String = {
	  "Person " + name + " works " + hours + " hours"
	}
	override def toString():String = {
	  "Person " + name + ", " + age
	}
}