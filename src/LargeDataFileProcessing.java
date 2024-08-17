import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LargeDataFileProcessing {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        int threshold=2000;

        try(BufferedReader reader=new BufferedReader(new FileReader("src/transactions.txt"));
            BufferedWriter writer=new BufferedWriter(new FileWriter("filtered_transactions.txt."))) {

            String s;
            while ((s=reader.readLine())!=null){
                list.add(s);
            }
            System.out.println(list);

            for(String trans:list){
                String amount = trans.split(",")[2];
                System.out.println(amount);

                if(Integer.parseInt(amount)>threshold){
                    list2.add(trans);

                    }
                }

            for (String filtered_records : list2) {
                writer.write(filtered_records);
                writer.newLine();

            }

            System.out.println(list2);


        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
