import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date{
    public static void main(String[] args) {

        LocalDateTime ibk_wedding = LocalDateTime.of(2025,10,28,14,30);

        LocalDateTime reminder =ibk_wedding.minusDays(3);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm a");

    }
}