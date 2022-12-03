public class Heater implements Shield {
    static Integer absorb = 20;


    @Override

    public Integer absorb() {
        return absorb;
    };

    @Override
    public String toString() {
        return String.format("Щит: защита - %d", absorb());
    }
}
