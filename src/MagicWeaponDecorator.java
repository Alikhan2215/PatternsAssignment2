public class MagicWeaponDecorator extends CharacterDecorator {
    public MagicWeaponDecorator(Character decoratedCharacter) {
        super(decoratedCharacter);
    }

    public String getDescription() {
        return super.getDescription() + " + Magic Weapon";
    }

    public int getMagicPower() {
        return super.getMagicPower() + 35;
    }
}
