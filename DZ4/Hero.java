public class Hero extends Warrior<Weapon, Shield>  {

    public Hero(String name, Integer healthPoint, Weapon weapon, Shield shield) {
        super(name, healthPoint, weapon, shield);
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
        return String.format("Герой - %s", super.toString());
    }

    @Override
    public Integer getHealthPoint() {
        return super.getHealthPoint();
    }

}
