package oopsClass.Interface;

public class Carss implements Engine,Media{
    @Override
    public void startcar() {
        System.out.println("Carss start");
    }
    @Override
    public void stopcar() {
        System.out.println("Carss stop");
    }
    @Override
    public void acc() {
        System.out.println("Carss accelerating");
    }
    @Override
    public void startmusic() {
        System.out.println("music start");
    }
    @Override
    public void stopmusic() {
        System.out.println("music stop");
    }

}
