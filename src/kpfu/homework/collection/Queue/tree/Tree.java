package kpfu.homework.collection.Queue.tree;

/**
 * Created by Tony on 7.04.2017.
 */
public class Tree {
    private Node root;

    public Tree(){
        this.root = null;
    }

    public void insert(int data) {
        root = insert(root, data, null);
    }

    private Node insert(Node current, int data, Node parent) {
        if (current == null) {
            current = new Node();
            current.setData(data);
            current.setLeft(null);
            current.setRight(null);
            current.setParent(parent);
        } else if (data < current.getData()) {
            current.setLeft(insert(current.getLeft(), data, current));
        } else {
            current.setRight(insert(current.getRight(), data, current));
        }
        return current;
    }


    private Node find(Node current, int data) {
        if (current == null)
            return null;
        if (current.getData() == data)
            return current;
        return find(
                data < current.getData() ? current.getLeft()
                        : current.getRight(), data);
    }

    public Node findMinimum(Node right) {
        Node min = root;
        if (min == null) return null;
        while (min.getLeft() != null) {
            min = min.getLeft();
        }
        return min;
    }

    public void delete(int data) {
        root = delete(root, data);
    }

    private Node delete(Node startNode, int data) {
        Node element = find(startNode, data);
        if (element == null) return startNode;
        boolean hasParent = element.getParent() != null;
        boolean isLeft = hasParent && element.getData() < element.getParent().getData();
        if (element.getLeft() == null && element.getRight() == null) {
            if (hasParent) {
                if (isLeft) {
                    element.getParent().setLeft(null);
                } else {
                    element.getParent().setRight(null);
                }
            } else {
                return null;
            }
        } else if (element.getLeft() != null && element.getRight() == null) {
            if (hasParent) {
                if (isLeft) {
                    element.getParent().setLeft(element.getLeft());
                } else {
                    element.getParent().setRight(element.getLeft());
                }
            } else {
                return element.getLeft();
            }
        } else if (element.getLeft() == null && element.getRight() != null) {
            if (hasParent) {
                if (isLeft) {
                    element.getParent().setLeft(element.getRight());
                } else {
                    element.getParent().setRight(element.getRight());
                }
            } else {
                return element.getRight();
            }
        } else {
            Node rightMin = findMinimum(element.getRight());
            element.setData(rightMin.getData());
            return delete(rightMin, rightMin.getData());
        }
        element = null;
        return startNode;
    }
}
