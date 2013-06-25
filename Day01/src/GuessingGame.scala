import scala.util.Random
class GuessingGame {
	private var target:Int = new Random().nextInt(100) + 1
	var attempts:Int = 0
	var message:String = ""
	var gameOver:Boolean = false
	def play(guess:Int):Unit = {
	  this.attempts += 1
	  if(guess > target)
	    message = "Aim lower"
	  else if(guess < target)
	    message = "Aim Higher"
	  else{
	    message = "You have got it!!!"
	    gameOver = true  
	  }    
	}
}