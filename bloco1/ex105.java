import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ex105 {
    public static void main(String[] args) throws IOException {
        Path path=Paths.get("numbers.txt");
        long coun = Files.lines(path).count();
        int count=Long.valueOf(coun).intValue();
        List<String> lines = Files.readAllLines(path); 
        String[] numbers=new String[count];
        String[] str=new String[count];
        int i=0;
        int lastnumber=0;
        int result=0;


        for (String line: lines){
            String[] lineWords = line.split(" - ");
            numbers[i]=lineWords[0];
            str[i]=lineWords[1];
            i++;        
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a expression number: ");
        String input = sc.nextLine();
        sc.close();
        String[] inputArray = input.split("[- ]+"); 

        if (input.equals("")){
            System.err.println("No input");
        }else{
            for (i=0;i<inputArray.length;i++){
                for (int j=0;j<11;j++){
                    if (inputArray[i].equals(str[j])){
                        lastnumber=Integer.parseInt(numbers[j]);
                        break;
                    }
                }
                if (inputArray[i].equals(str[30])){
                    result+=lastnumber*1000000;
                }
                if (inputArray[i].equals(str[28])){
                    lastnumber=lastnumber*100;
                }
                if (inputArray[i].equals(str[29])){
                    lastnumber=lastnumber*1000;
                }
                for (int u=20;u<28;u++){
                    if (inputArray[i].equals(str[u])){
                        result+=lastnumber*Integer.parseInt(numbers[u]);
                    }
                }
            }
        }
        System.out.println(result);
    }
}
