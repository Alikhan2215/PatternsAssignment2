public class ArmorDecorator extends CharacterDecorator {
    public ArmorDecorator(Character decoratedCharacter) {
        super(decoratedCharacter);
    }

    public String getDescription() {
        return super.getDescription() + " + Armor";
    }

    public int getHealth() {
        return super.getHealth() + 35;
    }
}