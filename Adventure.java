class Adventure {

    public static void main(String[] args) {

        Player frodo = new Player("Frodo");
        Player sauron = new Player("Sauron");

        // Create a magical elixir
        Potion elixir = new MagicElixir();

        // Create some weapons
        Weapon sting = new Sword();
        Weapon blaster = new Blaster();

        // Play the game! -- the players take turns attacking each other
        sauron.attack(frodo, blaster); // Sauron attacks Frodo with a blaster
        frodo.attack(sauron, sting); // Frodo attacks Sauron with his sword Sting
        sauron.attack(frodo, blaster); // Sauron blasts Frodo again

        // Frodo drinks a potion
        frodo.drink(elixir);

        // Let's examine who's healthier
        System.out.println("Frodo's health: " + frodo.getHealth());
        System.out.println("Sauron's health: " + sauron.getHealth());

    }

}