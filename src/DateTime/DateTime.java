import java.time.LocalDate;

public class DateTime {
    public static void main(String[] args) {

        //Using LocaleDate or another Date class calculate and print:
        //How many days are left till the end of the month
        //How many days are left till the end of the year, using the length() method from java.time.Year.of()

        LocalDate currentDate = LocalDate.now();

        //Calculating number of days in current month and how many days are left until the end of the month:
        int daysInOneMonth = currentDate.lengthOfMonth();
        int daysUntilEndOfTheMonth = daysInOneMonth - currentDate.getDayOfMonth();

        System.out.println("Days left until the end of the month: " + daysUntilEndOfTheMonth);

        //Calculating number of days in current year and number of days left until the end of the year:
        int daysInOneYear = currentDate.lengthOfYear();
        int daysUntilEndOfTheYear = daysInOneYear - currentDate.getDayOfYear();

        System.out.println("Days left until the end of the year: " + daysUntilEndOfTheYear);
        
    }
}
