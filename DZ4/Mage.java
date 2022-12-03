public class Mage extends Warrior<Staff, Heater> {
    private Integer range;
    private Integer mana;

    public Mage(String name, Integer healthPoint, Staff weapon, Integer range, Integer mana, Heater shield) {
        super(name, healthPoint, weapon, shield);
        this.range = range;
        this.mana = mana;
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
        return String.format("Маг - %s, магия - %d, дальность - %d", super.toString(), mana, range);
    }
    @Override
    public Integer getHealthPoint() {
        return super.getHealthPoint();
    }


}
