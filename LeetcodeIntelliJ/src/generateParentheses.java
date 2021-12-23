import java.util.*;

public class generateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<String>();
        if (n > 0) generateParenthesisCore("", n, n, result);
        return result;
    }

    private void generateParenthesisCore(String prefix, int left, int right, List<String> result)
    {
        if (left == 0 && right == 0) result.add(prefix);
        // Has left Parenthesis
        if (left > 0) generateParenthesisCore(prefix+'(', left-1, right, result);
        // has more right Parenthesis
        if (left < right) generateParenthesisCore(prefix+')', left, right-1, result);
    }

    /* Process
    if (n > 0), n: 3							 result: []
if (left > 0), 		 left: 3	 right: 3	 prefix: 	 result: []
if (left > 0), 		 left: 2	 right: 3	 prefix: (	 result: []
if (left > 0), 		 left: 1	 right: 3	 prefix: ((	 result: []
if (left < right), 	 left: 0	 right: 3	 prefix: (((	 result: []
if (left < right), 	 left: 0	 right: 2	 prefix: ((()	 result: []
if (left < right), 	 left: 0	 right: 1	 prefix: ((())	 result: []
if (left == 0 && right == 0), 				 prefix: ((()))	 result: []
if (left < right), 	 left: 1	 right: 3	 prefix: ((	 result: [((()))]
if (left > 0), 		 left: 1	 right: 2	 prefix: (()	 result: [((()))]
if (left < right), 	 left: 0	 right: 2	 prefix: (()(	 result: [((()))]
if (left < right), 	 left: 0	 right: 1	 prefix: (()()	 result: [((()))]
if (left == 0 && right == 0), 				 prefix: (()())	 result: [((()))]
if (left < right), 	 left: 1	 right: 2	 prefix: (()	 result: [((())), (()())]
if (left > 0), 		 left: 1	 right: 1	 prefix: (())	 result: [((())), (()())]
if (left < right), 	 left: 0	 right: 1	 prefix: (())(	 result: [((())), (()())]
if (left == 0 && right == 0), 				 prefix: (())()	 result: [((())), (()())]
if (left < right), 	 left: 2	 right: 3	 prefix: (	 result: [((())), (()()), (())()]
if (left > 0), 		 left: 2	 right: 2	 prefix: ()	 result: [((())), (()()), (())()]
if (left > 0), 		 left: 1	 right: 2	 prefix: ()(	 result: [((())), (()()), (())()]
if (left < right), 	 left: 0	 right: 2	 prefix: ()((	 result: [((())), (()()), (())()]
if (left < right), 	 left: 0	 right: 1	 prefix: ()(()	 result: [((())), (()()), (())()]
if (left == 0 && right == 0), 				 prefix: ()(())	 result: [((())), (()()), (())()]
if (left < right), 	 left: 1	 right: 2	 prefix: ()(	 result: [((())), (()()), (())(), ()(())]
if (left > 0), 		 left: 1	 right: 1	 prefix: ()()	 result: [((())), (()()), (())(), ()(())]
if (left < right), 	 left: 0	 right: 1	 prefix: ()()(	 result: [((())), (()()), (())(), ()(())]
if (left == 0 && right == 0), 				 prefix: ()()()	 result: [((())), (()()), (())(), ()(())]

     */

}
