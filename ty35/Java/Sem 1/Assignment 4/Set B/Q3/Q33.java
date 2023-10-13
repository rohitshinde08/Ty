class InvalidDateException extends Exception {
public InvalidDateException(String message) {
super(message);
}
}
class MyDate {
int day, month, year;
public MyDate(int day, int month, int year) throws InvalidDateException {
if (isValidDate(day, month, year)) {
this.day = day;
this.month = month;
this.year = year;
} else {
throw new InvalidDateException("Invalid date: " + day + " " + month + " " + year);
}
}
public void displayDate() {
System.out.println("Date: " + day + "/" + month + "/" + year);
}
public boolean isValidDate(int day, int month, int year) {
int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
if (month >= 1 && month <= 12 && day >= 1 && day <= daysInMonth[month]) {
if (month == 2 && isLeapYear(year)) {
return day <= 29;
}
return true;
}
return false;
}

public boolean isLeapYear(int year) {
return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}
}
public class Q33{
public static void main(String[] args) {
try {
int day = Integer.parseInt(args[0]);
int month = Integer.parseInt(args[1]);
int year = Integer.parseInt(args[2]);
MyDate date = new MyDate(day, month, year);
date.displayDate();
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Please provide day, month, and year as command line arguments.");
} catch (NumberFormatException e) {
System.out.println("Invalid input. Please provide valid integers for day, month, and year.");
} catch (InvalidDateException e) {
System.out.println("Error: " + e.getMessage());
}
}
}
