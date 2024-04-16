import java.util.Comparator;

public class Car extends Vehicle implements MediaPlayer, Comparable, Comparator {

    @Override
    public void start() {
        System.out.println("Car has started....");
    }

    public void play(){}
    public void stop(){}

    public int compareTo(Object o){
        return 0;
    }

    public int compare(Object o1, Object o2){
        return 0;
    }

}