class MinStack {
    
    Stack<Long> s = new Stack<>();
    long minEle;
    
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(s.size() == 0){
	        s.push((long)val);
	        minEle = (long)val;
	        return;
	    }
	   if(val >= minEle){
	       s.push((long)val);
	   }
	   else // val < minEle 
	   {
	       s.push(2 * (long)val - minEle);
	       minEle = (long)val;
	   }
    }
    
    public void pop() {
        if(s.size() == 0) 
	        return;
        
	     if(s.peek() < minEle){
	             minEle = 2*minEle - s.peek();
	             s.pop();
                return;
	         }
        
	     s.pop(); // if s.peek() >= minEle
    }
    
    public int top() {
        if(s.size() == 0) return -1;
        
        if(s.peek() >= minEle){
            return (int)(long)(s.peek());
        }
        else{ //s.peek() < minEle;
            return (int)minEle;
        }
    }
    
    public int getMin() {
        if(s.size() == 0) return -1;

	   return (int)minEle;
    }
}