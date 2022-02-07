public class Main {
    public static void main(String[] args){
        Car test = new Car(new GasMotor());
        test.start();
        test.stop();
    }
}
