package queueline;

/*
* Implement a class that represents people waiting in line to talk to a line operator. Use the best data structure for implementation, specifying which one you picked.
Implementation:

A Queue was used to represent this case. Implement the class Queue and call the method enqueue(int amount) which receives an int as parameter that indicates the number of people that will wait in the queue. People are named "Person**".

In order to get the name of the person in the i position, the method getPersonName(int index) can be called.
* */

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLine {
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4} to queue
        for (int i=0; i<5; i++)
            q.add(i);

        // Display contents of the queue.
        System.out.println("Elements of queue-"+q);

        // To remove the head of queue.
        int removedele = q.remove();
        System.out.println("removed element-" + removedele);

        System.out.println(q);

        // To view the head of queue
        int head = q.peek();
        System.out.println("head of queue-" + head);

        // Rest all methods of collection interface,
        // Like size and contains can be used with this
        // implementation.
        int size = q.size();
        System.out.println("Size of queue-" + size);
    }
}
