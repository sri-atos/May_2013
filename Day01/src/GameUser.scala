object GameUser {

  def main(args: Array[String]): Unit = {
    var game = new GuessingGame
    var guess:Int = -1
    while(!game.gameOver){
      guess = readLine().toInt
      game.play(guess)
      println(game.message)
    }
    println("Attempts: " + game.attempts)
  }

}