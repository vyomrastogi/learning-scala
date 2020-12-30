

object PatternMatching {
  def main(args: Array[String]): Unit = {
    var sign = 0;
    for (char <- "+=!"){
      char match{
        case '+' => sign = 1;
        case '=' => sign = -1;
        case _ => sign = 0;
      }
      println(s"Sign is $sign");
    }
  }
}