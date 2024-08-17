import java.io.*;

public class ReverseFileContent {

    public static void FileReversing(String inputPath,String outputPath) {

        StringBuilder str = new StringBuilder();
        String ch;
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {


            while ((ch = reader.readLine()) != null) {
                str.append(ch);
            }
            str.reverse();
            writer.write(str.toString());


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (BufferedReader reader1 = new BufferedReader(new FileReader(outputPath))) {

            while ((ch = reader1.readLine()) != null) {
                System.out.println(ch);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        FileReversing("destination.txt","reverse.txt");
    }
}
