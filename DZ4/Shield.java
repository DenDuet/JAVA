public interface Shield {
    Integer absorb = 20;

    public default Integer absorb() {
        return absorb;
    };
}
