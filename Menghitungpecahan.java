import java.util.Scanner;

public class Menghitungpecahan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan jumlah uang: ");
        int uang = scanner.nextInt();
        int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000,1000, 500, 100};
        String hasil ="";
        for (int p : pecahan) {
            int jumlah = uang / p;
            if (jumlah>0) {
                hasil += jumlah + " lembar " + p + "\n";
                uang -= jumlah*p;
                
            }
        }
        System.out.println(hasil);
        

    }
}
