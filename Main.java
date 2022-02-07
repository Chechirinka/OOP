public class Main {
    public static void main(String[] args){
        Car newcar = new Car(new MotorNew());
        Car gascar = new Car(new GasMotor());
        newcar.start();
        newcar.stop();
        gascar.start();
        gascar.stop();
    }
}
