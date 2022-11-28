package Transport;

public interface Competing {

    void getPitStop(String pit_stop);

    int[] getBestLapTime();
    int[] getMaximumSpeed();

    void getMaximumSpeed(int competing);

    void getBestLapTime(int time);
}
