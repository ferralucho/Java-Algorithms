package huffman;

public class BinaryNode implements Comparable<BinaryNode> {
    private NodeData data;
    private BinaryNode left, right;

    public BinaryNode(NodeData data) {
        this.data = data;
        left = right = null;
    }

    public BinaryNode(NodeData data, BinaryNode left, BinaryNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public NodeData getData() {
        return data;
    }

    public void setData(NodeData data) {
        this.data = data;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    @Override
    public int compareTo(BinaryNode o) {
        return this.data.getFrecuency() - o.getData().getFrecuency();
    }
}
