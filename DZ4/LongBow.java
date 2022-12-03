public class LongBow extends Bow {
    @Override
    public Integer damage() {
        return 40;
    }

    @Override
    public String toString() {
        return String.format("Лук: урон - %d", damage());
    }
}
