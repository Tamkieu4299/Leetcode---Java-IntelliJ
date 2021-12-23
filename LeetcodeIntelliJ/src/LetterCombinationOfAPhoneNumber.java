import java.util.*;

public class LetterCombinationOfAPhoneNumber {

    static List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<>();
            if(digits.isEmpty()) return ans;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            ans.add("");
            for(int i =0; i<digits.length();i++){
                int x = Character.getNumericValue(digits.charAt(i));
                while(ans.peek().length()==i) {
                    String t = ans.remove();
                    for(char s : mapping[x].toCharArray())
                        ans.add(t+s);
                }
            }
            return ans;
    }

    /*
    public List<String> letterCombinations(String digits) {
        List<String> list = new LinkedList<>();
        if(digits == null || digits.length() == 0) return list;
        char[][] map = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        backtrack(digits,list,map,new StringBuilder(),0);
        return list;
    }
    private void backtrack(String digits, List<String> list,char[][] map, StringBuilder sb, int start){
        if(start == digits.length()) {
            list.add(new String(sb));
            return;
        }
        int num = digits.charAt(start) - '0';
        for(int i = 0;i< map[num].length;i++){
            sb.append(map[num][i]);
            backtrack(digits,list,map,sb,start+1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
     */

    /*
    private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    	public List<String> letterCombinations(String digits) {
    		List<String> ret = new LinkedList<String>();
    		combination("", digits, 0, ret);
    		return ret;
    	}

    	private void combination(String prefix, String digits, int offset, List<String> ret) {
    		if (offset >= digits.length()) {
    			ret.add(prefix);
    			return;
    		}
    		String letters = KEYS[(digits.charAt(offset) - '0')];
    		for (int i = 0; i < letters.length(); i++) {
    			combination(prefix + letters.charAt(i), digits, offset + 1, ret);
    		}
    	}
     */

    /*
    public static List<String> letterCombinations(String digits) {
            String digitletter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            List<String> result = new ArrayList<String>();

            if (digits.length()==0) return result;

            result.add("");
            for (int i=0; i<digits.length(); i++)
                result = combine(digitletter[digits.charAt(i)-'0'],result);

            return result;
        }

        public static List<String> combine(String digit, List<String> l) {
            List<String> result = new ArrayList<String>();

            for (int i=0; i<digit.length(); i++)
                for (String x : l)
                    result.add(x+digit.charAt(i));

            return result;
        }
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digits = sc.nextLine();
        for(String str: letterCombinations(digits)) System.out.println(str+ " ");
    }
}
