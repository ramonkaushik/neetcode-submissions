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
        HashMap<Node, Node> copyGraph = new HashMap<>();
        return dfs(node, copyGraph);
    }

    private Node dfs(Node node, HashMap<Node, Node> copyGraph) {
        if(node == null) {
            return null;
        }

        if(copyGraph.containsKey(node)) {
            return copyGraph.get(node);
        }

        Node copy = new Node(node.val);
        copyGraph.put(node, copy);

        for(Node neighbor : node.neighbors) {
            copy.neighbors.add(dfs(neighbor, copyGraph));
        }

        return copy;       
    }
}