
import java.util.*;
public class stack {
	
	public static void main(String args[]) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(9);
		st.push(3);
		st.push(2);
		System.out.println(st);
		st.pop();
		System.out.println(st);
		if(st.isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Stack is not empty");
		}
	}

}
