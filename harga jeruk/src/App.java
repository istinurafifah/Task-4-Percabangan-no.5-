import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        int totalBayar, totalBuah;
    
        System.out.println("Jumlah yang dibeli = ");
        int jumlahJeruk = input.nextInt();
         
        int harga5Jeruk = 10000, harga2Jeruk = 5000, harga1Jeruk = 3000;
        int totalHarga = 0;

        if (totalBuah >= 5) {
            int paket5Jeruk = jumlahJeruk / 5;
            totalBayar += paket5Jeruk * harga5Jeruk;
            jumlahJeruk = jumlahJeruk % 5;

        }

        if (totalBuah >= 2) {
            int paket2Jeruk = jumlahJeruk / 2;
            totalBayar += paket2Jeruk * harga2Jeruk;
            jumlahJeruk = jumlahJeruk % 2;

        }

        if (totalBuah = 1) {
            totalBayar += jumlahJeruk * harga1Jeruk;
        
        }

        System.out.println("Total harga = " +totalBayar);

        input.close();

    }
}


/*5) Berapa rupiah yang harus anda bayar, jika harga jeruk:

kalo beli 1 buah harganya 3000
kalo beli 2 buah harganya 5000
kalo beli 5 harganya 10000

Contoh Output:
beli 7 = 15.000
beli 8 = 18.000
beli 10 = 20.000 */