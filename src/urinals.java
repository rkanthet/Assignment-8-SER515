import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Auth: Rahul Nanda Kantheti
public class urinals {
    public static void main(String[] args) {
        System.out.println("Do you want to import inputs from a file or by console?");
        System.out.println("1. File");
        System.out.println("2. Console");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Enter the input file : ");
                String str = scanner.next();
                readFile(str);
            }
            case 2 -> {
                String str = outputFileName();
                String s = "";
                while (!s.equals("-1")) {
                    System.out.println("Enter String : ");
                    s = scanner.next();
                    if (!s.equals("-1")) {
                        String ans = countUrinals(s);
                        writeToFile(str, ans);
                    }
                }
            }
        }
    }

    public static String countUrinals(String input){
        if(input == null){
            return "Input String Null";
        }
        int n = input.length();
        int ans = 0;

        for(int i=0;i < n;i++) {
            if (input.charAt(i) == '1') {
                if (input.charAt(i + 1) == '1') {
                    ans = -1;
                    break;
                }
            } else if (input.charAt(i) == '0') {
                if ((i - 1 < 0 || input.charAt(i - 1) == '0') && (i + 1 >= n || input.charAt(i + 1) == '0')) {
                    ans++;
                    i++;
                }
            }
            else{
                return "Invalid input";
            }
        }
        return String.valueOf(ans);

    }

    public static String readFile(String fileName){
        try {
            File file = new File(fileName);
            Scanner scr = new Scanner(file);
            if(file.length()==0){
                return "File is empty, please enter a valid file";
            }
            String outname = outputFileName();
            while (scr.hasNextLine()) {
                String line = scr.nextLine();
                String a = countUrinals(line);
                writeToFile(outname,a);

            }
            return "File found and processed properly";
        } catch (IOException e) {
            return e.getMessage();
        }
    }
    public static String outputFileName() {
        String fileName = "rule.txt";
        int count=0;
        File file = new File(fileName);
        while(file.exists())
        {
            count++;
            fileName = fileName.substring(0,4) + count + ".txt";
            file = new File(fileName);
        }
        return fileName;
    }

    static String writeToFile(String fileName, String value)
    {
        try
        {
            if (!fileName.startsWith("rule")) {
                return "Invalid input file name to write";
            }
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter buffWriter = new BufferedWriter(fileWriter);
            try{
                Integer.parseInt(value);
            }
            catch (NumberFormatException e){
                return "Invalid input to write";
            }
            buffWriter.write(value);
            buffWriter.newLine();
            buffWriter.close();
            return "Write is successful";
        }
        catch(IOException e)
        {
            return e.getMessage();
        }
    }
}