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
    public Node cloneGraph(Node node) {
        // dfs the graph and copy each of its neighborsealed
        if(node == null) {
            return null;
        }

        // 1. create a map and output
        HashMap<Node, Node> cloneMap = new HashMap<>();

        // 2. send cloneMap to dfs 
        return dfs(node, cloneMap);
    }

    private Node dfs(Node node, HashMap<Node, Node> map) {
        if(map.containsKey(node)) {
             return map.get(node);
        }

        Node copy = new Node(node.val);
        map.put(node, copy);

        // copy each OG neighbor to copy
        for(Node neighbor : node.neighbors) {
            // for each neighbor, dfs 
            copy.neighbors.add(dfs(neighbor, map));
        }

        return copy; 
    }
}