class StockSpanner {

    Stack<Pair> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int stock) {
        int span = 1;
        while(!stack.empty() && stack.peek().stock<=stock){
            span+= stack.peek().span;
            stack.pop();
        }
        stack.push(new Pair(stock,span));
        return span;
    }
}

class Pair{
    int stock;
    int span;
    
    public Pair(int st,int s){
        stock = st;
        span = s;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */