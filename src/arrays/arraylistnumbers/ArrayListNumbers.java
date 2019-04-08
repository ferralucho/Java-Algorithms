package arrays.arraylistnumbers;

import java.util.ArrayList;
/*
Given two lists of numbers:
Create two new lists C and D.
C must contain elements present in A and B
D must contain elements present in B but not present in A.
Lists are ordered, can contained repeated elements, and may be of different sizes.

Implementation:
Implement the class Classifier and call the method classify(ArrayList<Integer> a, ArrayList<Integer> b) which receives two ArrayList<Integer> as parameter indicating the lists of numbers to evaluate.
This method sets to private ArrayList<Integer> in the Classifier class (list C and list D). In order to get them, you can call the methods getListC() and getListD().
 */

public class ArrayListNumbers {

    private static ArrayList<Integer> listA;
            private static ArrayList<Integer> listB;

            public static void main(String[] args){

                String[] arg1 = {};
                String[] arg2 = {};

                try{
                    arg1 = args[0].split(",");
                    arg2 = args[1].split(",");
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Invalid parameters!");
                    System.exit(1);
                }

                if(setLists(arg1, arg2)){
            Classifier c = new Classifier();
            c.classify(listA, listB);
            System.out.println("A: " + listA.toString());
            System.out.println("B: " + listB.toString());
            System.out.println("C: " + (c.getListC()).toString());
            System.out.println("D: " + (c.getListD()).toString());
        }else{
            System.out.println("Invalid parameters!");
            System.exit(1);
        }
    }

    private static boolean setLists(String[] l1, String[] l2){
        listA = new ArrayList<Integer>();
        listB = new ArrayList<Integer>();

        for(String n : l1){
            try{
                listA.add(Integer.parseInt(n));
            }catch(Exception e){
                return false;
            }
        }

        for(String n : l2){
            try{
                listB.add(Integer.parseInt(n));
            }catch(Exception e){
                return false;
            }
        }
        return true;
    }
}
