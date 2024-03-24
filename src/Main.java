import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Diziyi manuel olarak tanımlama
        int[] dizi = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Kullanıcıdan indeks al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir indeks girin: ");
        int indeks = scanner.nextInt();

        // Metodu çağır ve sonucu yazdır
        try {
            int eleman = diziElemaniGetir(dizi, indeks);
            System.out.println("Belirtilen indeksteki eleman: " + eleman);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Belirtilen indeks dizi boyutunun dışında!");
        }
    }

    public static int diziElemaniGetir(int[] dizi, int indeks) throws ArrayIndexOutOfBoundsException {
        // Diziye erişmeye çalış
        return dizi[indeks];
    }
}
