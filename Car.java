class Car {
    public static void main(String[] args) {

        Control test = new Control(new GasMotor());
        test.start();
        test.stop();

    }
}



