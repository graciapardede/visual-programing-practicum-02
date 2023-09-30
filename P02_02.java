//12S23044-Gracia Pardede
import java.util.*;
import java.lang.Math;

public class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaGudang;
        int kapasitasGudang;
        int jumlahBuku;
        String aC;
        String lantai;
        String ketersediaanTeknologi;
        int stok;
        String penilaian;
        int skor;

        namaGudang = input.nextLine();
        kapasitasGudang = Integer.parseInt(input.nextLine());
        jumlahBuku = Integer.parseInt(input.nextLine());
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanTeknologi = input.nextLine();
        stok = Integer.parseInt(input.nextLine());
        skor = Integer.parseInt(input.nextLine());
        if (skor >= 40) {
            penilaian = "Gudang Elite";
        } else {
            if (skor >= 25 && skor <= 40) {
                penilaian = "Gudang Standar";
            } else {
                if (skor <= 25) {
                    penilaian = "Gudang Perlu Peningkatan";
                }
            }
        }
        System.out.println("Informasi Gudang: ");
        System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBuku + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi + "|" + penilaian);
    }
}
