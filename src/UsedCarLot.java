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

    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }
    public Car sellCarShift(int indexOfCarToSell)
    {
        Car sold = inventory.remove(indexOfCarToSell);
        return sold;
    }

    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car sold = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return sold;
    }

    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car move = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, move);
    }

}
