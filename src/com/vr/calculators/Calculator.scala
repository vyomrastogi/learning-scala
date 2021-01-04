package com.vr.calculators


/**
 * A calculator which prints calculation 
 * two constructors for creating basic calculator objects and respective calculation methods
 */
object Calculator {
  private def printResult(result: => Double)(operation: String) {
    println(s"calculated $operation result=$result");
  }
  private def printAdditionResult(result: => Double, operation: String = "addition") {
    printResult(result)(operation);
  }
  private def printMultiplicationResult(result: => Double, operation: String = "multiplication") {
    printResult(result)(operation);
  }
  private def printSubtractionResult(result: => Double, operation: String = "subtraction") {
    printResult(result)(operation);
  }
  private def printDivisionResult(result: => Double, operation: String = "division") {
    printResult(result)(operation);
  }
  def main(args: Array[String]): Unit = {   
    var basicCalculationsParameterized = new BasicCalculator(1.25,3.96);
    println("====== Result from Parameterized constructor ======")
    try {
      printResult(basicCalculationsParameterized.add())("addition");
      printResult(basicCalculationsParameterized.subtract())("subtraction");
      printResult(basicCalculationsParameterized.multiply())("multiplication");
      printResult(basicCalculationsParameterized.divide())("division");
    } catch {
      case ex: Exception => println(ex.getMessage);
    }
    
     println("====== Result from default constructor ======")
     var primaryBasicCalculations = new BasicCalculator();
     try {
      printResult(primaryBasicCalculations.add(1.25,3.96))("addition");
      printResult(primaryBasicCalculations.subtract(1.00,3.96))("subtraction");
      printResult(primaryBasicCalculations.multiply(1.25,3.96))("multiplication");
      printResult(primaryBasicCalculations.divide(1.25,3.96))("division");
    } catch {
      case ex: Exception => println(ex.getMessage);
    }
  }
  
  /*
   * 
   * Sample output of above 
   * ====== Result from Parameterized constructor ======
	 *calculated addition result=5.21
	 *calculated subtraction result=-2.71
   *calculated multiplication result=4.95
   *calculated division result=0.31565656565656564
   *====== Result from default constructor ======
   *calculated addition result=5.21
   *calculated subtraction result=-2.96
   *calculated multiplication result=4.95
   *calculated division result=0.31565656565656564
   */
}