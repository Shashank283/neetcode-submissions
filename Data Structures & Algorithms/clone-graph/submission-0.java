/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

     // Map: original node -> its clone
    private Map<Node, Node> map = new HashMap<>();
    
    public Node cloneGraph(Node node) {

        // Edge case: empty graph
        if (node == null) return null;

        // If we've already cloned this node, return the clone
        if (map.containsKey(node)) {
            return map.get(node);
        }

         // Clone the current node (without neighbors for now)
        Node clone = new Node(node.val);

         // IMPORTANT: add to map BEFORE recursing to handle cycles
        map.put(node, clone);

        // Recursively clone each neighbor and add to clone's neighbor list
        for (Node neighbor : node.neighbors) {
            // This either creates a new clone (if unseen) or returns existing clone (if seen)
            clone.neighbors.add(cloneGraph(neighbor));
        }


        return clone;


        
    }
}