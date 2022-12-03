public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Hiro", 150, new Staff(), new Balder());
        Hero hero2 = new Hero("Imir", 150, new Bow(), new Heater());
        Hero hero3 = new Hero("Sigizmund", 200, new Staff(), new Balder());
        Team<Archer> red = new Team<>(hero1);
        Archer arch = new Archer("Man", 100, new LongBow(), 20, new Balder());
        red.add(new Archer("Man", 100, new LongBow(), 20, new Balder()));
        red.add(new Archer("Man", 100, new Bow(), 20, new Balder()));
        red.add(new Archer("Alex", 100, new Bow(), 15, new Balder()));
        Team<Warrior> blue = new Team<>(hero2);
        blue.add(new Archer("Man2", 100, new Bow(), 20, new Balder()));
        blue.add(new Mage("Alex2", 100, new Staff(), 15, 30, new Heater()));
        blue.add(hero3);
        blue.add(arch);

        Team<Hero> hero = new Team<>(hero1);
        hero.add(hero2);
        hero.add(hero3);
        System.out.println("\nКоманда героев: \n"+hero);
        System.out.println("\nКоманда красных: \n"+red);
        System.out.println("\nКоманда синих: \n"+blue);
        System.out.println(blue.getTeamHelspoint());

        System.out.printf("Лучник: -> Защита: (%d) - Оружие (%d) = урон (%d)\n", arch.getShieldValue(), arch.getWeaponValue(), (arch.getShieldValue() - arch.getWeaponValue()+ arch.getHealthPoint()));
        System.out.printf("Герой1: -> Защита: (%d) - Оружие (%d) = урон (%d)\n", hero1.getShieldValue(), hero1.getWeaponValue(), (hero1.getShieldValue() - hero1.getWeaponValue()+ hero1.getHealthPoint()));
        System.out.printf("Герой2: -> Защита: (%d) - Оружие (%d) = урон (%d)\n", hero2.getShieldValue(), hero2.getWeaponValue(), (hero2.getShieldValue() - hero2.getWeaponValue()+ hero2.getHealthPoint()));
    }
}