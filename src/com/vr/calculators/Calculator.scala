package com.vr.calculators

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
    try {
      printResult(basicCalculationsParameterized.add)("addition");
      printResult(basicCalculationsParameterized.subtract)("subtraction");
      printResult(basicCalculationsParameterized.multiply)("multiplication");
      printResult(basicCalculationsParameterized.divide)("division");
    } catch {
      case ex: Exception => println(ex.getMessage);
    }
  }
}