/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        //Step 1 -> creating new nodes and copying in between

        Node t1 = head;

        if(head ==null) return null;
        

        while(t1 != null){
            Node t2 = t1.next;

            Node nn = new Node(t1.val);

            nn.next = t2;
            t1.next = nn;
            t1 = t2;

        }

        //Step 2 -> Assigning randoms values

        Node n1 = head;
        

        while(n1 != null){
            Node n2 = n1.next;
            
           
            if(n1.random ==null){
                n2.random = null;
            }
            else{
                 n2.random = n1.random.next;
            }

            n1 = n2.next;
            
        }

        //Step 3 -> Segregating the list

        Node a = head;
        Node b = a.next;
        

        Node ans = b;

        while(a != null && b !=null){
            Node c = b.next;          
            Node d = null;
            if(c != null){
                d = c.next;
            }
            a.next = c;
            b.next = d;

            a = c;
            b = d;
        

        }

        return ans;
        
    }
}
