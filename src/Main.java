// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Vehicle v1;
      MediaPlayer mp;

      Car car = new Car();
      car.start();
      //System.out.println();

      v1= car;
      mp = car;

      v1.start();
      //+mp.start();
    }
}