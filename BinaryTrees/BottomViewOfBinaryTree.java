class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer> ans= new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<Pair> q= new LinkedList<>();
        Map<Integer,Integer> map= new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            int size= q.size();
            for(int i=1;i<=size;i++){
                Pair temp=q.poll();
                if(!map.containsKey(temp.lineVal)){
                    map.put(temp.lineVal,temp.node.data);
                }
                else if(map.containsKey(temp.lineVal)){
                    map.replace(temp.lineVal,temp.node.data);
                }
                
                if(temp.node.left!=null){
                    q.add(new Pair(temp.node.left,temp.lineVal-1));
                }
                if(temp.node.right!=null){
                    q.add(new Pair(temp.node.right,temp.lineVal+1));
                }
            }
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            ans.add(e.getValue());
        }
        return ans;
    }
}


class Pair{
    Node node;
    int lineVal;
    
    Pair(Node n,int i){
        node=n;
        lineVal=i;
    }
}