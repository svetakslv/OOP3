package Transport;

public interface Competing {

    void getPitStop(String pit_stop);

    default int[] getBestLapTime() {
        return new int[3];
    }

    default int[] getMaximumSpeed() {
        return new int[3];
    }

}
