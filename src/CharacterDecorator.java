public abstract class CharacterDecorator implements Character {
    private Character decoratedCharacter;

    public CharacterDecorator(Character decoratedCharacter) {
        this.decoratedCharacter = decoratedCharacter;
    }

    public String getDescription() {
        return decoratedCharacter.getDescription();
    }

    public int getHealth() {
        return decoratedCharacter.getHealth();
    }

    public int getStrength() {
        return decoratedCharacter.getStrength();
    }

    public int getMagicPower() {
        return decoratedCharacter.getMagicPower();
    }
}