// Auth: Rahul Nanda Kantheti
public class urinals {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String a = countUrinals("0100");
        System.out.println(a);
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

}