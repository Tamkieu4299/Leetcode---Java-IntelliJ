import java.util.*;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        String res ="";
        ArrayList<String> sb = new ArrayList<String>();
        Hashtable<Integer, String> numTab = new Hashtable<>();
        numTab.put(1, "I");
        numTab.put(5, "V");
        numTab.put(10, "X");
        numTab.put(50, "L");
        numTab.put(100, "C");
        numTab.put(500, "D");
        numTab.put(1000, "M");

        Set<Integer> keySet = numTab.keySet();
        int n;
        int i=0;
        while (num!=0) {
            n = (int) ((num%10) * Math.pow(10,i));
            int t = n / (int) (Math.pow(10, i));
            if(t<=3) for (int k = 0; k < t; k++) sb.add(numTab.get((int)(Math.pow(10, i))));
            if(t==4) {
                sb.add(numTab.get((int)(Math.pow(10, i))) + numTab.get((int)(Math.pow(10, i+1)/2)));
            }
            if(t==5) sb.add(numTab.get((int)(Math.pow(10, i+1)/2)));
            if(5<t && t<=8) {
                String add = numTab.get((int)(Math.pow(10, i+1)/2));
                for(int k=0; k<t-5; k++) add += numTab.get((int)(Math.pow(10, i)));
                sb.add(add);
            }
            if(t==9) sb.add(numTab.get((int)(Math.pow(10, i))) + numTab.get((int)(Math.pow(10, i+1))));
            num=num/10;
            i++;
        }
        Collections.reverse(sb);
        for(String els : sb) res+= els;
        return res;

        /*
        if (num < 1 || num > 3999) return "";

	StringBuilder result = new StringBuilder();

	String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

	int i = 0;
            //iterate until the number becomes zero, NO NEED to go until the last element in roman array
	while (num >0) {
		while ( num >= values[i]) {
			num -= values[i];
			result.append(roman[i]);
		}
		i++;
	}
	return result.toString();
         */
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(intToRoman(num));
    }
}
