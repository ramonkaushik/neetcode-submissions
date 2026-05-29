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
        HashMap<Node, Node> copyMap = new HashMap<>();
        return dfs(copyMap, node);
    }

    private Node dfs(HashMap<Node, Node> copyMap, Node node) {
        if(node == null) {
            return null;
        }
        else if(copyMap.containsKey(node)) {
            return copyMap.get(node);
        }

        Node copy = new Node(node.val);
        copyMap.put(node, copy);

        for(Node neighbor : node.neighbors) {
            // make the copy's neighbors the node's neighbors
            copy.neighbors.add(dfs(copyMap, neighbor));
        }

        return copy;


    }
}