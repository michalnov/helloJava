import java.time.LocalDate;

public class MyDate {

    public static void main(String[] args) {
	// write your code here

        LocalDate datum1 = LocalDate.now();      // format rok-mesiac-den
        System.out.println("Dnes je: " + datum1 + " je " + datum1.getDayOfWeek());

        LocalDate datum2 = LocalDate.of(2014,3,12);
        System.out.println(datum2);

        System.out.println(datum2.getDayOfWeek());

        LocalDate datum3 = LocalDate.parse("2014-01-12");   // nevezme string v tvare "2014 01 12"
        System.out.println(datum3.getYear());

        LocalDate datum4 = LocalDate.parse("  2014-01-12  ".trim()); // trim() odstrani medzeru na zaciatku aj na konci stringu / retazca
        System.out.println(datum4.getYear());

    }
}
