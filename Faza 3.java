import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WelcomeLine {
    public static void main(String[] args) {
        String emri = "Kristi";
        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String dataOra = now.format(formatter);
        
        int ora = now.getHour();
        String pershendetja;
        if (ora >= 5 && ora < 12) {
            pershendetja = "Mirëmëngjes";
        } else if (ora >= 12 && ora < 18) {
            pershendetja = "Mirëdita";
        } else {
            pershendetja = "Mirëmbrëma";
        }
        
        System.out.println("Përshëndetje, " + emri + "!");
        System.out.println("Sot është: " + dataOra);
        System.out.println(pershendetja + " dhe mirë se erdhe në Java!");
    }
}
