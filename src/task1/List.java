package task1;
import java.util.ArrayList ;
import java.util.Collection ;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        Collection <Integer > list = new ArrayList<>() ;
        list.add(10) ;
        list.add(20) ;
        list.add(30) ;
        list.add(40) ;
        list.add(50) ;
        list.add(60) ;
        list.add(70) ;
        list.add(80) ;
        list.add(90) ;
        list.add(100) ;
        System.out.println(list.size() );// Створили список та заповнити його  10 елементами, перевіряємо розмір.
        Iterator <Integer > iterator = list.iterator() ;
        while (iterator.hasNext()){
            Integer temp = iterator.next() ;
            System.out.print(temp + " ");
        }
    }

}
