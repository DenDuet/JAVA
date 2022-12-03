public abstract class Warrior<T extends Weapon, S extends Shield> {
    private String name;
    private Integer healthPoint;
    private T weapon;
    private S shield;

    public Warrior(String name, Integer healthPoint, T weapon, S shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    public Integer getWeaponValue() {
        return this.weapon.damage();
    }    
    public Shield getShield() {
        return shield;
    }
    public Integer getShieldValue() {
        return this.shield.absorb();
    }    

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, жизнь: %d, оружие: %s, защита: %s", name, healthPoint, weapon, shield);
    }
}
