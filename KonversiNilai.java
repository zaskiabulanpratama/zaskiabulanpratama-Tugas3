import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai: ");
        int nilai = scanner.nextInt();
        if (nilai>85) {
            System.out.println("A");
        } else if (nilai>75) {
            System.out.println("B");
        } else if (nilai>65) {
            System.out.println("C");
        } else if (nilai>55) {
            System.out.println("D");
        } else {
            System.out.println("E");
    
        }
    }
    
}
