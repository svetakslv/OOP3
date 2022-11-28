package Transport;

public enum Capacity {
    especiallySmall(0, 10),
    small(10, 25),
    medium(40, 50),
    large(60, 80),
    especiallyLarge(100, 120);

    private int from;
    private  int to;

    Capacity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
}
