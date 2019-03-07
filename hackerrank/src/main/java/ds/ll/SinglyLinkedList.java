package ds.ll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SinglyLinkedList {

    public SinglyLinkedListNode head;

    SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if(head == null)
            head = node;
        else{
            SinglyLinkedListNode currentNode = head;
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
        return head;

    }

    SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if(llist == null)
            llist = node;
        else {
            node.next = llist;
            llist = node;
        }

        return llist;
    }

    SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);

        if(head == null)
            head = node;
        else{
            SinglyLinkedListNode currentNode = head;
            int count = 0;
            while (currentNode.next != null){
                count++;
                if(count == position){
                    node.next = currentNode.next;
                    currentNode.next = node;
                    break;
                }

                currentNode = currentNode.next;
            }
        }

        return head;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        SinglyLinkedList linkedList = new SinglyLinkedList();
    }
}

class SinglyLinkedListNode{
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}