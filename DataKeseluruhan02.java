import java.util.Scanner;

public class DataKeseluruhan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlRespon = 10;
        int jmlPertanyaan = 6;

        int[][] nilai = new int[jmlRespon][jmlPertanyaan];

        String[] pertanyaan = {
            "1. Seberapa puas Anda terhadap kecepatan pelayanan?",
            "2. Seberapa puas Anda terhadap keramahan dan sikap pegawai?",
            "3. Seberapa puas Anda terhadap kualitas layanan?",
            "4. Seberapa mudah Anda dalam mengakses layanan?",
            "5. Seberapa puas Anda terhadap penanganan keluhan oleh perusahaan?",
            "6. Seberapa besar kemungkinan Anda akan merekomendasikan perusahaan ini?"
        };

        System.out.println("=== Survei Kepuasan Pelanggan ===");
        System.out.println("(Nilai 1 = Sangat Tidak Puas ... 5 = Sangat Puas)");
        System.out.println();

        for (int i = 0; i < jmlRespon; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < jmlPertanyaan; j++) {
                System.out.println(pertanyaan[j]);
                System.out.print("Masukkan nilai (1-5): ");
                nilai[i][j] = sc.nextInt();

                while (nilai[i][j] < 1 || nilai[i][j] > 5) {
                    System.out.print("Nilai harus antara 1-5! Ulangi: ");
                    nilai[i][j] = sc.nextInt();
                }
            }
            System.out.println();
        }
        int totalSemua = 0;
        int jumlahData = jmlRespon * jmlPertanyaan;

        for (int i = 0; i < jmlRespon; i++) {
            for (int j = 0; j < jmlPertanyaan; j++) {
                totalSemua += nilai[i][j];
            }
        }

        double rataKeseluruhan = (double) totalSemua / jumlahData;
        String rataFormat = String.format("%.2f", rataKeseluruhan);

        System.out.println("\n=== Rata-Rata Nilai Keseluruhan Survei ===");
        System.out.println("Total seluruh nilai: " + totalSemua);
        System.out.println("Jumlah data: " + jumlahData);
        System.out.println("Rata-rata keseluruhan: " + rataFormat);
    }
}
