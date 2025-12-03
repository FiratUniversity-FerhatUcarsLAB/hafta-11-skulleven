public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        // TODO
        System.out.println("American way : " + month + ", " + date + ", " + day + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        // TODO
        System.out.println("American way : " + day + ", " + date + ", " + month + ", " + year);
    }

    public static void main(String[] args) {
        // TODO: test methods
        String day = "Monday";
        int date = 1;
        String month = "December";
        int year = 2025;

        printAmerican(day, date, month, year);
        printEuropean(day, date, month, year);
    }
}
