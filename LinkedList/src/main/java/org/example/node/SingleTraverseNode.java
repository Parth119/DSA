package org.example.node;

public class SingleTraverseNode<T> {
    public T data;
    public SingleTraverseNode<T> next;

    public SingleTraverseNode(T data) {
        this.data = data;
        this.next = null;
    }
}

