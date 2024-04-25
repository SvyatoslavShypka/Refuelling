import java.util.Random;

public class CreateNumbers {
    public static void main(String[] args) {
        int limitCities = 100;
        int fuel = 10;
        int step = 10;
        System.out.print("([");
        Random random = new Random();
        for (int i = 0; i < limitCities; i++) {
            int randomNumber = random.nextInt(fuel-1+1)+1;
            System.out.print(randomNumber);
            if (i < limitCities - 1) {
                System.out.print(",");
            }
        }
        System.out.print("], [");
        int previous = 1;
        for (int i = 0; i < limitCities; i++) {
            int randomNumber = random.nextInt(step-1+1)+1;
            previous += randomNumber;
            System.out.print(previous);
            if (i < limitCities - 1) {
                System.out.print(",");
            }
        }
        System.out.print("])");
    }
}
