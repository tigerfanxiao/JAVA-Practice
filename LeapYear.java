// this is for test git
// add another line for test git
public class LeapYear {

    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        boolean isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);
        System.out.println(isLeapYear);
    }
}
