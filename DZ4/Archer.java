public class Archer extends Warrior<Bow, Balder> {
    private Integer range;


    public Integer getRange() {
        return range;
    }


    public Archer(String name, Integer healthPoint, Bow weapon, Integer range, Balder shield) {
        super(name, healthPoint, weapon, shield);
        this.range = range;
        // System.out.println(Weapon.damage + " " + Shield.absorb);
    }
        
    @Override
    public Integer getShieldValue() {
        return super.getShieldValue();
    }
    @Override
    public Integer getWeaponValue() {
        return super.getWeaponValue();
    }

    @Override
    public String toString() {
        return String.format("Лучник - %s, урон - %d", super.toString(), range);
    }
    @Override
    public Integer getHealthPoint() {
        return super.getHealthPoint();
    }

}
