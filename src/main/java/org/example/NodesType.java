package org.example;

import lombok.Data;

@Data
public class NodesType {
    private int data;
    private NodesType next;

    public NodesType(int data) {
        this.data = data;
        this.next = null;
    }

}


