public class Main {
    public static void main(String[] args) {
        Character warrior = new Warrior();
        Character mage = new Mage();
        System.out.println("Warrior Character: " + warrior.getDescription() +
                ", Health: " + warrior.getHealth() +
                ", Strength: " + warrior.getStrength() +
                ", Magic Power: " + warrior.getMagicPower());

        Character armoredWarrior = new ArmorDecorator(warrior);
        System.out.println("Warrior with Armor: " + armoredWarrior.getDescription() +
                ", Health: " + armoredWarrior.getHealth() +
                ", Strength: " + armoredWarrior.getStrength() +
                ", Magic Power: " + armoredWarrior.getMagicPower());

        Character powerfulMage = new MagicWeaponDecorator(mage);
        System.out.println("Mage with Magic Weapon: " + powerfulMage.getDescription() +
                ", Health: " + powerfulMage.getHealth() +
                ", Strength: " + powerfulMage.getStrength() +
                ", Magic Power: " + powerfulMage.getMagicPower());
    }
}