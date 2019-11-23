package arrays;

public class JosephusCircleKill {

    public static void main(String[] args) {
        int peopleQuantity = 8;
        int jumpsNumber = 2;
        josephus(peopleQuantity, jumpsNumber);
    }

    public static int[] josephus(int peopleQuantity, int jumpsNumber) {
        int[] circle = new int[peopleQuantity];
        for (int i = 0; i < circle.length; i++) {
            circle[i] = 1;
        }
        int index = 0;

        while (peopleQuantity > 1) {
            for (int i = 0; i < jumpsNumber; i++) {
                if (index > circle.length - 1) {
                    index = 0;
                }

                while (circle[index] == 0) {
                    index++;
                    if (index > circle.length - 1) {
                        index = 0;
                    }
                }
                index++;
            }

            circle[index - 1] = 0;
            System.out.println("The array is:");
            System.out.print("[");
            for (int person : circle) {
                System.out.print(", " + person);
            }
            System.out.print("]");
            System.out.println("Index of the removed :" + (index - 1));
            peopleQuantity = peopleQuantity - 1;
        }
        return circle;
    }
}
