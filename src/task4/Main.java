package task4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(165, 8000, "BMW", "Red");
        Car c2 = new Car(155, 8000, "BMW", "Black");
        Car c3 = new Car(185, 8000, "BMW", "White");
        Car[] c = {c1, c2, c3};

        Arrays.sort(c, new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                int s = o1.speed - o2.speed;
                int p = o1.price - o2.price;
                int col = o1.color.compareTo(o2.color);
                int m = o1.model.compareTo(o2.model);
               if (s == 0) {

               } else {
                   return s;
               }
                if (p == 0 ) {

                } else {
                    return p;
                }
                if ( m == 0){
                    return col ;
                }else {
                    return m;
                }
            }
        });
        for (Car temp : c) {
            System.out.println(temp);
        }
        System.out.println();
    }
}


