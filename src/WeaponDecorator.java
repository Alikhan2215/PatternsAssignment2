public class WeaponDecorator extends CharacterDecorator {
    public WeaponDecorator(Character decoratedCharacter) {
        super(decoratedCharacter);
    }

    public String getDescription() {
        return super.getDescription() + " + Weapon";
    }

    public int getStrength() {
        return super.getStrength() + 25;
    }
}