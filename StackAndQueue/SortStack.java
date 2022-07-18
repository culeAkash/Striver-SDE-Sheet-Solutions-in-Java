import java.util.*;
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		if(stack.empty())
            return;
        
        int top = stack.pop();
        
        sortStack(stack);//stack is sorted
        
        insertElem(stack,top);
	}
    
    public static void insertElem(Stack<Integer> stack,int element){
        if(stack.empty() || ((!stack.empty()) && element>=stack.peek()))
        {
            stack.push(element);
            return;
        }    
        
        int top = stack.pop();
        insertElem(stack,element);
        stack.push(top);
    }

}