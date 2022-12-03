public class Balder implements Shield {
    static Integer absorb = 30;

    @Override
    public Integer absorb() {
        return absorb;
    }

    @Override
    public String toString() {
        return String.format("Щит: мощь - %d", absorb());
    }
    
}
