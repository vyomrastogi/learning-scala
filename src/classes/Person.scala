package classes

/**
 *  A person class with firstName/lastName members and two parameterized constructors
 */
class Person(fName: String, lName: String) {
  private var firstName: String = fName;
  private var lastName: String = lName;

  def this(fName: String) {
    this(fName, "");
  }

  def display() {
    println(s"Person Object : FirstName=[$firstName] LastName=[$lastName]");
  }
}

object Person {
  def main(args: Array[String]): Unit = {
    var objectWith2Params = new Person("Bruce", "Banner");
    var objectWith1Param = new Person("Vision");
    objectWith2Params.display;
    objectWith1Param.display;
    println("=> validate getters");
    printf("firstName=%s",objectWith1Param.firstName);
  }
}
  
