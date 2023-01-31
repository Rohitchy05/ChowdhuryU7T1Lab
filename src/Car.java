public class Car {
    private String model;
    private int miles;

    public Car(String a, int b) {
        model = a;
        miles = b;
    }

    public String toString() {
        return model + " " + miles + "mi";
    }
}
