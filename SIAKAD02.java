import java.util.Scanner;
public class SIAKAD02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[4][3];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa/3);
        }
    }
}