def wordle(guess: String, secret: String): (Int, Int) = {
  val znakiGuess = guess.toList
  val znakiSecret = secret.toList

  println(znakiGuess)
  println(znakiSecret)

//  println(znakiGuess.intersect(znakiSecret))
  val czescWspolna = (znakiGuess intersect znakiSecret).length

  val znakiSecretZIndexami = znakiSecret.zipWithIndex
  val znakiGuessZIndexami = znakiGuess.zipWithIndex

//  println(znakiSecretZIndexami)
//  println(znakiGuessZIndexami)
//  println(znakiGuessZIndexami zip znakiSecretZIndexami)

  val znakiDoPorownania = znakiGuessZIndexami zip znakiSecretZIndexami

  val znakiNaDobrychMiejscach = znakiDoPorownania.filter(para => para._1 == para._2).length
  // to wyżej to to samo co to niżej :333
//  val znakiNaDobrychMiejscach = znakiDoPorownania.count(para => para._1 == para._2)

  val znakiNaNiedobrychMiejsach = czescWspolna - znakiNaDobrychMiejscach

  (znakiNaNiedobrychMiejsach, znakiNaDobrychMiejscach)
}

@main
def mainProg(): Unit = {
  val guess = "banał"
  val secret = "baran"

  println(wordle(guess, secret))
}
