// 12S23044 - Gracia Pardede
import java.util.*;
import java.lang.Math;

public class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String deskripsiTugas;
        String kodeMataKuliah;
        String namaMataKuliah;
        String pengampu;
        String deadline;
        String formatPenamaanTugas;
        String status;
        double tingkatKesulitan, hariHinggaDeadline, prioritas;

        deskripsiTugas = input.nextLine();
        kodeMataKuliah = input.nextLine();
        namaMataKuliah = input.nextLine();
        pengampu = input.nextLine();
        deadline = input.nextLine();
        formatPenamaanTugas = input.nextLine();
        tingkatKesulitan = Double.parseDouble(input.nextLine());
        hariHinggaDeadline = Double.parseDouble(input.nextLine());
        prioritas = Double.parseDouble(input.nextLine());
        status = input.nextLine();
        prioritas = tingkatKesulitan * (1.0 / hariHinggaDeadline);
        if (prioritas > 3) {
            status = "Penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3) {
                status = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    status = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println("Prioritas: " + toFixed(prioritas,2));
        System.out.println(deskripsiTugas + "|" + kodeMataKuliah + "|" + namaMataKuliah + "|" + pengampu + "|" + deadline + "|" + formatPenamaanTugas);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
