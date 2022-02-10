class GfG
{
    Node flatten(Node root)
    {
	    if(root==null || root.next==null)
	    return root;
	    
	    Node nextHead= flatten(root.next);
	    
	    Node newHead=null,newTail=null;
	    root.next=null;
	    
	    while(root!=null && nextHead!=null){
	        if(newHead==null){
	            newHead= root.data<=nextHead.data?root:nextHead;
	            newTail=newHead;
	        }
	        else{
	            newTail.bottom= root.data<=nextHead.data?root:nextHead;
	            newTail=newTail.bottom;
	        }
	        if(root.data<=nextHead.data){
	            root=root.bottom;
	        }
	        else{
	            nextHead=nextHead.bottom;
	        }
	    }
	    
	    while(root!=null){
	        newTail.bottom= root;
	        newTail=newTail.bottom;
	        root=root.bottom;
	    }
	    
	    while(nextHead!=null){
	         newTail.bottom= nextHead;
	        newTail=newTail.bottom;
	        nextHead=nextHead.bottom;
	    }
	    
	    return newHead;
    }
}