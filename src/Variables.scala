

object Variables {
  def main(args: Array[String]): Unit = {
    println("Hello World");
    /*
     * Immuatable Variables
     */
    val definedInteger : Int = 3;
    //definedInteger = 5 ;
    
    /*
     * Mutable Variables
     */
    var mutableInteger : Int = 3;
    mutableInteger = 5 // reassignement is allowed
  }
}