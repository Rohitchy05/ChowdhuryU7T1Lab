import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot () {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car a) {
        inventory.add(a);
    }

    public boolean swap(int a, int b) {
        if (a < inventory.size() && b < inventory.size()) {
            Car car1 = inventory.get(a);
            Car car2 = inventory.get(b);
            inventory.set(a, car1);
            inventory.set(b, car2);
            return true;
        } else {
            return false;
        }

    }
}
