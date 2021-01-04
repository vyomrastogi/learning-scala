package com.vr.calculators

class BasicCalculator() {
  var internalNum1: Double = 0;
  var internalNum2: Double = 0;

  def add(defNum1 : Double = this.internalNum1, defNum2 : Double = this.internalNum2): Double = {
    return defNum1 + defNum2;
  }

  def subtract(defNum1 : Double = this.internalNum1, defNum2 : Double = this.internalNum2): Double = {
    return defNum1 - defNum2;
  }

  def multiply(defNum1 : Double = this.internalNum1, defNum2 : Double = this.internalNum2): Double = {
    return defNum1 * defNum2;
  }

  def divide(defNum1 : Double = this.internalNum1, defNum2 : Double = this.internalNum2): Double = {
    return defNum1 / defNum2;
  }

  def this(num1: Double, num2: Double) {
    this();
    this.internalNum1 = num1;
    this.internalNum2 = num2;
  }

}