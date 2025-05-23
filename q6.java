
//q-6. Remove Nth Node From End of List
//Given a linked list, remove the nth node from the end and return its head.

public class Main
{
    public class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void deletenode(int lastnode){
        //checking
        if(head==null){
            System.out.println("empty");
            return;
        }
        
        node temp1=head;
        //calculating the length of the list
        int length=0;
        while(temp1.next!=null){
            length++;
            temp1=temp1.next;
        }
        if(lastnode>length){
            System.out.println("not exist");
            return;
        }
        
        //finding the targetnode
        int targetnode=length-lastnode;
        node temp2=head;
        int i=0;
        //traversing to targetnode-1
         while(i<targetnode){
             temp2=temp2.next;
         }
         //deleting the targetnode
         temp.next=temp.next.next;
        
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}


