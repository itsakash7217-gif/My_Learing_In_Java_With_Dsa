package oopsClass.Interface;

public class Carss implements Engine,Media{
    @Override
    public void start() {
        System.out.println("Carss start");
    }
    @Override
    public void stop() {
        System.out.println("Carss stop");
    }
    @Override
    public void acc() {
        System.out.println("Carss accelerating");
    }

}
