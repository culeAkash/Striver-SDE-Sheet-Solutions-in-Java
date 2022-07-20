public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) { 
        if(A.size()==0)
            return A;
            
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<A.size();i++){
            int elem = A.get(i);
            
            while(!stack.empty() && stack.peek()>=elem)
                stack.pop();
            
            
            int t = 0;
            if(stack.empty())
                t = -1;
            else
                t = stack.peek();
            stack.push(elem);
            A.set(i,t);              
        }
        return A;
    }
}