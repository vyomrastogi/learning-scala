package classes

/**
 * Create an employee class and access details() from MainProgram
 */
class Employee {
  private var empId: Int = 345;
  private var empSalary: Double = 100.0;
  private var empTax: Double = 9.5;
  private var empDaysOfWork: Int = 24;

  //private[classes] def details allows details to be accessible in MainProgram
  //private def details gives compilation error in MainProgram
  //protected def details gives compilation error in MainProgram
  //protected[classes] def details allows details to be accessible in MainProgram
  def details() {
    println(s"The Id of the Employee is $empId");
    println(s"The Salary of the Employee is $empSalary");
    println(s"The Percentage of tax the Employee needs to pay is $empTax");
    println(s"The Total number of working days is $empDaysOfWork");
  }
}