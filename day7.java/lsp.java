//liskov substitution principle-objects of superclass should be replaceable with objects of subclass without breaking the code.
//eg:-Class bird used fly method,class pigeon can also use the fly method of bird class

interface Car {

    void turnOnEngine();
    void accelerate();
}

class MotorCar implements Car {
    class Engine{
        public void on() {
            System.out.println("Engine is on");
        }

        public void powerOn(int i) {
            System.out.println("Power increased by " + i);
        }
    }
    private Engine engine;
    public MotorCar(Engine engine) {
        this.engine = engine;
    }
    public void turnOnEngine() {
        engine.on();
    }
    public void accelerate() {
        engine.powerOn(1000);
    }
}

class ElectricCar implements Car {

    public void turnOnEngine() {
        throw new AssertionError("I don't have an engine!");
    }

    public void accelerate() {
        
    }
}
public class lsp {
    public static void main(String[] args) {
        System.out.println("this is the main method");
    }    
}