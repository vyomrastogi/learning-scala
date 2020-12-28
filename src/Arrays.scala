
/**
 * Defining Arrays
 * Define two arrays of daysInMonths and monthNames.
 * Print months and days
 */
object Arrays {
  def main(args: Array[String]): Unit = {
    println("By Array");
    printDaysInAMonth("Array");
    println("By Map");
    printDaysInAMonth("Map");
    println("By Tuple");
    printDaysInAMonth("Tuple");
  }

  def printDaysInAMonth(method: String) {
    if (method.equalsIgnoreCase("Array")) {
      printDaysInAMonthByArray();
    } else if (method.equalsIgnoreCase("Map")) {
      printDaysInAMonthByArray();
    }else if (method.equalsIgnoreCase("Tuple")) {
      printDaysInAMonthByTuple();
    }
  }

  def printDaysInAMonthByArray() {
    var daysInMonths = new Array[Int](12);
    var monthNames = Array("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");

    daysInMonths.update(0, 31);
    daysInMonths.update(1, 28);
    daysInMonths.update(2, 31);
    daysInMonths.update(3, 30);
    daysInMonths.update(4, 31);
    daysInMonths.update(5, 30);
    daysInMonths.update(6, 31);
    daysInMonths.update(7, 31);
    daysInMonths.update(8, 30);
    daysInMonths.update(9, 31);
    daysInMonths.update(10, 30);
    daysInMonths.update(11, 31);

    for (i <- 0 until monthNames.length by 1) {
      printLine(monthNames(i), daysInMonths(i));
    }
  }

  def printLine(monthName: String, days: Int) {
    println(s"$monthName has $days days.");
  }

  def printDaysInAMonthByMap() {
    var monthToDaysMap = Map("January" -> 31);
    monthToDaysMap += ("February" -> 28);
    monthToDaysMap += ("March" -> 31);
    monthToDaysMap += ("April" -> 30);
    monthToDaysMap += ("May" -> 31);
    monthToDaysMap += ("June" -> 30);
    monthToDaysMap += ("July" -> 31);
    monthToDaysMap += ("August" -> 31);
    monthToDaysMap += ("September" -> 30);
    monthToDaysMap += ("October" -> 31);
    monthToDaysMap += ("November" -> 30);
    monthToDaysMap += ("December" -> 31);
    monthToDaysMap.foreach(entry => printLine(entry._1, entry._2));
  }

  def printDaysInAMonthByTuple() {
    var monthToDaysMap = List((1, "January", 31),
      (2, "February", 28),
      (3, "March", 31),
      (4, "April", 30),
      (5, "May", 31),
      (6, "June", 30),
      (7, "July", 31),
      (8, "August", 31),
      (9, "September", 30),
      (10, "October", 31),
      (11, "November", 30),
      (12, "December", 31));
     monthToDaysMap.foreach(entry => printLine(entry._2,entry._3));
  }
}