import java.util.Random;

public class RandomDiceUniformDistribution {
    public static void main(String[] args) {
        Random ria = new Random();
        ria.setSeed(10);
        double ri;
        double a = 1;
        double b = 6;
        double result = 0;

        for (int i = 0; i < 10; i++){
            ri = ria.nextDouble();
            result = a + (b - a) * ri;
            result = Math.round(result);
            System.out.println("Result is :" + result);

        }
    }
}
