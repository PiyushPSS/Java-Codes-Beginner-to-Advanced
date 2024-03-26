import java.util.ArrayList;
import java.util.Stack;

public class SpanCalculator {

    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
        ArrayList<Integer> spans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < price.size(); i++) {
            while (!stack.isEmpty() && price.get(i) >= price.get(stack.peek())) {
                stack.pop(); 
            }
            int span = stack.isEmpty() ? i + 1 : i - stack.peek();
            spans.add(span);
            stack.push(i);
        }

        return spans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> price = new ArrayList<>();
        price.add(4);
        price.add(2);
        price.add(3);
        price.add(3);
        price.add(7);
        
        ArrayList<Integer> spans = findSpans(price);
        System.out.println(spans); // Output: [1, 1, 1, 2, 1, 4, 6]
    }
}