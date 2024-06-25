import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String file = "D:\\src\\Kubik.txt";
        List<Kubik1> kubik = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] hitung = line.split(",");
                Kubik1 a = new Kubik1();
                a.sisi1 = Double.parseDouble(hitung[0]);
                a.sisi2 = Double.parseDouble(hitung[1]);
                a.sisi3 = Double.parseDouble(hitung[2]);
                kubik.add(a);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        for (Kubik1 b : kubik) {
            double luas = b.luasPer();
            System.out.println("Luas Permukaan Kubus adalah: " + luas);

        }
        for (Kubik1 c : kubik) {
            double volume = c.volume();
            System.out.println("Volume Kubus adalah: " + volume);

        }
        Collections.sort(kubik, Comparator.comparingDouble(Kubik1::luasPer));
        System.out.println("\nLuas permukaan setelah sorting:");
        kubik.forEach(k -> System.out.println("Luas Permukaan Kubus adalah: " + k.luasPer()));

        String outputFile = "D:\\src\\SortedLuasPermukaan.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("Hasil pengurutan luas permukaan:\n");
            for (Kubik1 kubus : kubik) {
                double luas = kubus.luasPer();
                writer.write("Luas Permukaan Kubus adalah: " + luas + "\n");
            }
            System.out.println("Hasil pengurutan luas permukaan telah ditulis ke file: " + outputFile);
        } catch (IOException e) {
            System.err.println("Gagal menulis ke file: " + e.getMessage());
        }
    }
}


