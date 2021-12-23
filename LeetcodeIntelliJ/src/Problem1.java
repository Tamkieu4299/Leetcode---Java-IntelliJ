import java.util.Scanner;
import java.util.regex.Pattern;


public class Problem1 {
    // Draw diamond
    static void diamondDraw() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int rows = sc.nextInt();

            // Condition for rows input
            if(rows<3) {
                System.out.println("That's too few rows for me to make a diamond");
                continue;
            }
            if(rows>23) {
                System.out.println("That's too many rows for me to make a diamond");
                continue;
            }

            // Draw diamond blocks
            else{
                if(rows%2==0) rows+=1;
                // If line i<= middle
                for(int i=0; i<=rows/2; i++){
                    for(int j= 0; j<=rows; j++) {
                        if(j<rows/2-i || j >rows/2+i) System.out.print(' ');
                        else System.out.print('*');
                    }
                    System.out.println();
                }

                // If line i> middle
                for(int i=rows/2-1; i>=0; i--){
                    for(int j=0; j<=rows; j++) {
                        if(j<rows/2-i || j >rows/2+i) System.out.print(' ');
                        else System.out.print('*');
                    }
                    System.out.println();
                }
                break;
            }
        }
    }

    // Calculate workday
    static void workDay(){
        Scanner sc = new Scanner(System.in);
        float totalPayment =0;
        while (true) {
            System.out.println("How many days?");
            int days = sc.nextInt();
            if(days<0) {
                System.out.println("The number of working days cannot be negative");
                continue;
            }
            for(int i=0; i<=days-1; i++ ) {
                totalPayment += Math.pow(2, i);
                System.out.println("Pay for day " + (i+1) + '=' + (int) (Math.pow(2, i)));
            }
            float decimalPayment = totalPayment/100;
            System.out.println("Total pay is " + decimalPayment);
            break;
        }
    }

    // Display digit
    static void digitPhone(){

        // Create an array of digit
        String digitletter[] = {"","","ABC","DEF","GHI","JKL","MNO","PRS","TUV","WXY"};
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        // Condition for input
        if(ch >= 'a' && ch <= 'z') {
            System.out.println("that's not a capital letter");
        }
        if(ch=='Q') {
            System.out.println("It corresponds to nothing the telephone keypad:");
        }
        if(ch=='Z') {
            System.out.println("It corresponds to nothing the telephone keypad:");
        }

        // Run digit block
        if(ch >= 'A' && ch <= 'Z' && ch != 'Q' && ch != 'Z') {
            for(int i=0; i<digitletter.length; i++) {
                for(int j=0; j<digitletter[i].length(); j++) {
                    if(ch == digitletter[i].charAt(j)){
                        System.out.println("The character " + ch +  " corresponds to the digit " + i  + " on the keypad");
                        break;
                    }
                }
            }
        }

        // If the input is not alphabet
        else{
            System.out.println("that's not an alphabet");
        }
    }

    public static void main(String[] args) {
        //diamondDraw();
        //workDay();
        digitPhone();
    }
}


