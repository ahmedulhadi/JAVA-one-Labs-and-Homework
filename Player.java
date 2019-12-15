public class Player {
    String name;
    int health;

    Player(String name) {
        this.name = name;
        this.health = 100;
    }

    String getName() {
        return name;
    }

    int getHealth() {
        return health;
    }

    public void sufferDamage(int damage) {

        this.health = this.health - damage;
    }

    public void attack(Player opponent, Weapon weapon) {

        opponent.sufferDamage(weapon.getDamage());

    }

    public void drink(Potion potion) {

        if (this.health + potion.getBenefit() >= 100) {

            this.health = 100;
            potion.drink();
        } else {
            this.health = this.health + potion.getBenefit();
            potion.drink();
        }
    }

}