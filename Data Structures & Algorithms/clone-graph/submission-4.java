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
        HashMap<Node, Node> cloneMap = new HashMap<>();
        return dfs(cloneMap, node);
    }

    private Node dfs(HashMap<Node, Node> cloneMap, Node node) {
        if(node == null) {
            return null;
        }
        else if(cloneMap.containsKey(node)) {
            return cloneMap.get(node);
        }

        Node copy = new Node(node.val);
        cloneMap.put(node, copy);

        for(Node neighbor : node.neighbors) {
            copy.neighbors.add(dfs(cloneMap, neighbor));
        }

        return copy;

    }
}