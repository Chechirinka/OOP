class Car {

  Motor motornew;

  public Car(Motor m){
      motornew = m;
    }

    public void start() {
        System.out.println(motornew.start());
    }

    public void stop() {
        System.out.println(motornew.stop());
    }
}

