object ChangeCase extends App {

  try {
    val inputString = scala.io.StdIn.readLine("Enter a string : ")
    val newString = changeCase(inputString)
    println("New string with changed case:")
    println(newString)
  } catch {
    case e: Exception => println("An error occurred: " + e.getMessage)
  }

  // Method to change case of each character in String
  def changeCase(inputString: String): String = {
    inputString.map(char => {
      if (char.isLower) char.toUpper
      else if (char.isUpper) char.toLower
      else char
    })
  }
}
