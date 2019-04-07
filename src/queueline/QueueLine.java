package queueline;

/*
* Implement a class that represents people waiting in line to talk to a line operator. Use the best data structure for implementation, specifying which one you picked.
Implementation:

A Queue was used to represent this case. Implement the class Queue and call the method enqueue(int amount) which receives an int as parameter that indicates the number of people that will wait in the queue. People are named "Person**".

In order to get the name of the person in the i position, the method getPersonName(int index) can be called.
* */

import java.util.ArrayDeque;
import java.util.LinkedList;

public class QueueLine {
    public static void main(String[] args){
        int amount;

        try{
            amount = Integer.parseInt(args[0]);
        }catch(Exception e){
            amount = 1;
        }

        Queue q = new Queue();
        q.enqueue(amount);
        q.dequeue();
    }
}
