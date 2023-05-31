public class Tree {

    Node root;

    public boolean exist(int value) {
        if (root != null) {
            Node node = find(root, value);
            if (node != null) {
                return true;
            }
        }
        return false;
    }


//    private Node find(Node node, int value) { //метод обхода дерева в глубину
//        if (node.value == value) {
//            return node;
//        } else {
//            for (Node child : node.children) {
//                Node result = find(child, value);
//                if (result != null) {
//                    return result;
//                }
//            }
//        }
//        return null;
//    }

    private Node find(int value){
        List <Node> currentLine
    }

    public class Node {
        int value;
        List<Node> children;
    }
}