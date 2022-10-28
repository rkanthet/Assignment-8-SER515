import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// Auth: Rahul Nanda Kantheti
public class urinals {
    public static void main(String[] args) {
        System.out.println("Do you want to import inputs from a file or by console?");
        System.out.println("1. File");
        System.out.println("2. Console");
        Scanner scanner = new Scanner(System.in);
       // int choice = scanner.nextInt();
        String b = countUrinals("0100");
        System.out.println(b);
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
            while (scr.hasNextLine()) {
                String line = scr.nextLine();
                String a = countUrinals(line);
                System.out.println(a);

            }
            return "File found and processed properly";
        } catch (IOException e) {
            return e.getMessage();
        }
    }



}