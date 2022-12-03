public interface Weapon {
    Integer damage=20;

    default Integer damage() {
        return damage;
    };
}
