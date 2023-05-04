// Interface segregation principle-dependency of 1 class to another should be on smallest possible interface
//eg:-Segregate the Vehicle interface into multiple role interfaces each for specific behavior
interface Banglore {
    void area();
}

interface Hyderabad {
    void place();
}

class Location implements Banglore, Hyderabad {

    @Override
    public void area() {
        System.out.println("Printing the area");
    }

    @Override
    public void place() {
        System.out.println("Printing the place");
    }
}

class City implements Banglore {

    @Override
    public void area() {
        System.out.println("printing thr city area");
    }
}

public class Isp {
    public static void main(String[] args) {
        Location location = new Location();
        location.area();
        location.place();

        City city = new City();
        city.area();
    }
}