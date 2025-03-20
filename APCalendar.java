public class APCalendar {
    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) return true;
        return false;
    }

    public static in numberOfLeapYears(int year1, int year2) {
        int count = 0;
        for (int i = year1; i <= year2; i++) {
            if (isLeapYear(i)) count++;
        }
        return count;
    }

    private static int firstDayOfYear(int year) {

    }

    private static int dayOfYear(int month, int day, int year) {

    }

    public static int dayOfWeek(int month, int day, int year) {
        
    }
}