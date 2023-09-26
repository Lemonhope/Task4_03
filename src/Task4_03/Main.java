// Створити клас Машина з полями рік(int), колір(String). Створити конструктор за замовчуванням, конструктор з одним і 2 параметрами.
// Створити клас Main в якому створити екземпляри, викликаючи різні конструктори.
package Task4_03;

public class Main {
    public static void main(String[] args) {
        Car firstCar=new Car();
        System.out.println(firstCar);

        Car secondCar=new Car(1994);
        System.out.println(secondCar);

        Car thirdCar=new Car("blue");
        System.out.println(thirdCar);

        Car fourthCar=new Car(2000, "yellow");
        System.out.println(fourthCar);
    }
}
