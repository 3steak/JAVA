import java.time.LocalDate;
import java.time.LocalTime;

public class App {

    /*
     * EPOCH current time since the Unix Epoch ( 1 january 1970 00:00:00)
     * LocalDate
     * LocalTime
     * LocalDateTime
     */
    public static void main(String[] args) {

        LocalTime date = LocalTime.now();

        System.out.println(date);
    }
}
