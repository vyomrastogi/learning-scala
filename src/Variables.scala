

object Variables {
  
  /**
   * Variable Declaration Excercise
   * 
   * <b>o/p of main method</b> 
   * <blockquote>
   * Hello World </br>
   * width:8 </br>
   * height:12, type of height:int </br>
   * area:96 </br>
   * radius:10.0, type of radius:double </br>
   * pi:3.14 </br>
   * </blockquote>
   */
  def main(args: Array[String]): Unit = {
    println("Hello World");
    /*
     * Immuatable Variables
     */
    val definedInteger : Int = 3;
    //definedInteger = 5 ; Gives compilation error
    
    /*
     * Mutable Variables
     */
    var mutableInteger : Int = 3;
    mutableInteger = 5 // reassignement is allowed
    
    /*
     * Variable Declaration
     */
    
    //declare mutable width, height, area and radius, immutable value of pi
    var  width: Int = 8;
    var height = 12;
    var area: Int = width*height;
    var radius = 10.0; // When type is not defined, scala auto-infers type of variable based on assigned value
    val pi = 3.14;
    
    println("width:"+width);
    println("height:"+height+", type of height:"+height.getClass().getCanonicalName());
    println("area:"+area);
    println("radius:"+radius+", type of radius:"+radius.getClass().getCanonicalName());
    println("pi:"+pi);
  }
}