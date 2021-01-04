package inheritance

/**
 *  A person class with firstName/lastName members and two parameterized constructors
 */
class Person(fName: String, lName: String) {
  private var firstName: String = fName;
  private var lastName: String = lName;

  def this(fName: String) {
    this(fName, "");
  }

  def this() {
    this("", "");
  }

  def nameInfo() {
    println(s"Person Object : FirstName=[$firstName] LastName=[$lastName]");
  }
}

object Person {
  def main(args: Array[String]): Unit = {
    var objectWith2Params = new Person("Bruce", "Banner");
    var objectWith1Param = new Person("Vision");
    objectWith2Params.nameInfo;
    objectWith1Param.nameInfo;
    var employeeObject = new Employee("Thor", "Point Break", 123)
    var employeeObjectWithDefault = new Employee();
    var employeeObjectWithEmpId = new Employee(999);
    employeeObject.nameInfo;
    employeeObjectWithDefault.nameInfo;
    employeeObjectWithEmpId.nameInfo;
  }
}
  
