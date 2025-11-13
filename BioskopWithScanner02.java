import java.util.Scanner;

public class BioskopWithScanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n==== MENU BIOSKOP ====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris (1-4): ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom (1-2): ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println("Nomor baris atau kolom tidak tersedia! (Pilih: Baris 1-4, Kolom 1-2)");
                } else if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Kursi sudah terisi, pilih opsi lain");
                } else {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil dimasukkan!");
                }

            } else if (menu == 2) {
                System.out.println("\n==== DAFTAR PENONTON ====");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        // Ganti null dengan "***"
                        String tampilNama = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.println("Baris " + (i + 1) + 
                                           " Kolom " + (j + 1) + 
                                           " : " + tampilNama);
                    }
                }

            } else if (menu == 3) {
                System.out.println("Terima kasih.");
                break;

            } else {
                System.out.println("Pilihan tidak valid, coba lagi!");
            }
        }
    }
}