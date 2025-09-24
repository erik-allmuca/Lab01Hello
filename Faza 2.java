import java.util.Scanner;

public class Greeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Shkruaj emrin: ");
        String emri = input.nextLine();
        
        System.out.print("Shkruaj qytetin: ");
        String qyteti = input.nextLine();
        
        System.out.println("Përshëndetje, " + emri + " nga " + qyteti + "!");
        
        input.close();
    }
}
