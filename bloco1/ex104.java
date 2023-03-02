import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ex104 {
    public static void main(String[] args) throws IOException {
        Path path=Paths.get("numbers.txt");
        long coun = Files.lines(path).count();
        int count=Long.valueOf(coun).intValue();
        List<String> lines = Files.readAllLines(path); 
        String[] numbers=new String[count];
        String[] str=new String[count];
        int i=0;



        for (String line: lines){
            String[] lineWords = line.split(" - ");
            numbers[i]=lineWords[0];
            str[i]=lineWords[1];
            i++;        
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string number: ");
        String input = sc.nextLine();
        sc.close();

        if (input.equals("")){
            System.err.println("No input");
        }else{
            String[] inputArray = input.split("[- ]+"); 
            for (i=0;i<inputArray.length;i++){
                for (int j=0;j<str.length;j++){
                    if (inputArray[i].equals(str[j])){
                        System.out.print(numbers[j]+" ");
                    }
                }
            }
        }

        System.out.println();

    }
}
