class Weapon {
    String name;
    int damage;

    Weapon(String name) {
        this.name = name;
        this.damage = 0;
    }

    Weapon() {
        this.name = "Sword";
        this.damage = 5;
    }

    Weapon(int damage) {
        this.name = "Blaster";
        this.damage = 15;
    }

    int getDamage() {
        return damage;
    }

    String getName() {
        return name;
    }

}