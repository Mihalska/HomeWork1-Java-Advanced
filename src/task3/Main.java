package task3;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(170, 8000, "BMW", "Red");
        Car c2 = new Car(170, 8000, "Opel", "Black");
        Car c3 = new Car(170, 8000, "BMW", "White");
        Car[] c = {c1, c2, c3};

        Arrays.sort(c  );

        for (Car temp : c) {
            System.out.println(temp);
        }
    }

}
