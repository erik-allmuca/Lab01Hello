import java.time.LocalDateTime;
import java.util.Scanner;

public class Greeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String emri = "";
        String qyteti = "";

        if (args.length >= 2) {
            emri = args[0];
            qyteti = args[1];
        }

        while (emri.trim().isEmpty()) {
            System.out.print("Shkruaj emrin: ");
            emri = sc.nextLine();
        }
        while (qyteti.trim().isEmpty()) {
            System.out.print("Shkruaj qytetin: ");
            qyteti = sc.nextLine();
        }

        LocalDateTime now = LocalDateTime.now();
        int ora = now.getHour();

        String pershendetja;
        if (ora >= 5 && ora < 12) {
            pershendetja = "Good morning / Mirëmëngjes / Buenos días";
        } else if (ora >= 12 && ora < 18) {
            pershendetja = "Good afternoon / Mirëdita / Buenas tardes";
        } else {
            pershendetja = "Good evening / Mirëmbrëma / Buenas noches";
        }

        System.out.println(pershendetja);
        System.out.println("Mirësevjen, " + emri + " nga " + qyteti + "!");
        
        sc.close();
    }
}
