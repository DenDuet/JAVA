public class Bow implements Weapon {
    static Integer damage=25;

    @Override
    public Integer damage() {
        return damage;
    }

    @Override
    public String toString() {
        return String.format("Лук: урон - %d", damage());
    }
}
