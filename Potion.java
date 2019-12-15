class Potion {
    String name;
    int benefit;

    Potion(String name) {
        this.name = name;
        this.benefit = 10;
    }

    Potion() {
        this.name = "MagicElixir";
        this.benefit = 20;
    }

    int getBenefit() {
        return benefit;
    }

    String getName() {
        return name;
    }

    int drink() {
        this.benefit = 0;
        return benefit;

    }
}