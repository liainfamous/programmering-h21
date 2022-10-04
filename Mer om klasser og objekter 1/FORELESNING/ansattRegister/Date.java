package FORELESNING.ansattRegister;

public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private static String monthName(int mntNmb) {
        String [] mntName = {"January", "February", "March", "April", "May",
    "June", "July", "August", "September", "November", "December" };

        if (mntNmb > 0 && mntNmb < 13) {
            return mntName[mntNmb - 1]; 
        } else {
            return "*Unknown Month*";
        }
    }

    public String toString() {
        return day + ". " + monthName(month) + " " + year;
    }
}