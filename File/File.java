import java.io.*;
import java.util.Scanner;

public class File {
    public static void main(String[] args) throws IOException {

        // Open file, and use Scanner to scan & splite number.
        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);
        Scanner s = new Scanner(br);

        // Create "output.txt", use BufferedWriter to insert data.
        FileWriter fw = new FileWriter("output.txt");
        BufferedWriter bw = new BufferedWriter(fw);  

        int quantity = s.nextInt();
        int data[] = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            data[i] = s.nextInt();
        }

        // Two different way to insert data,
        // FileWriter.write() and BufferedWriter.write().
        fw.write("Original Data: ( FileWriter.write() )\n");
        for (int i = 0; i < quantity; i++) {
            fw.write(Integer.toString(data[i]) + " ");
        }
        fw.write("\n");

        int temp;
        for (int i = 0; i < quantity - 1; i++) {
            for (int j = 0; j < quantity - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }

        bw.write("Sorting Result: ( BufferedWriter.write() )");
        bw.newLine();
        for (int i = 0; i < quantity; i++) {
            bw.write(Integer.toString(data[i]) + " ");
        }

        bw.flush();
        bw.close();
        br.close();

        // BufferedWriter already flush data & close the file.
        // fw.flush();
        // fw.close();
    }
}