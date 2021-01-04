package inheritance

import scala.util.Random

class Employee(fName:String,lName:String, eId:Int) extends Person {
  private var empId: Int = eId;
  private var firstName: String = fName;
  private var lastName: String = lName;
  
  def this(eId: Int){
    this("no name","no last name",eId);
  }
  
  def this(){
    this("no name","no last name",Random.nextInt());
  }
  
  override def nameInfo() {
    super.nameInfo();
    println(s"Employee Object : FirstName=[$firstName] LastName=[$lastName] EmpId=[$empId]");
  }
}