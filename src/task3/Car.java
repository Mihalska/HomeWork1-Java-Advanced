package task3;

public class Car implements Comparable {
    //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Object o) {    // public int compareTo(Car o) {
        int s = this .speed - ((Car)o).speed;
        int p = this.price - ((Car)o).price;
        int col = this.color.compareTo(((Car)o).color);
        int m = this.model.compareTo(((Car)o).model);
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
    }


