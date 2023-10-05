package com.bilge.model;

// ERROR PRUNE (hataya açık)
public class Player {
    private String name;
    private int healthPercentage;

    private Colors colors;

    // VALIDATION CONSTRUCTOR; Tek ve dışarıdan erişime kapalı.
    private void checkHealth(int healthPercentage) {
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage <= 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
        // return this.healthPercentage;
    }

    // CONSTRUCTORS
    public Player(String name, int healthPercentage, Colors colors) {
        this.name = name;
        checkHealth(healthPercentage);
        this.colors = colors;
    }

    //GETTER
    public int healthRemaining() {
        return healthPercentage;
    }

    // LOGICAL PROCESSES
    // alınan hasardan sonra var olan can değeri güncellemesi
    // gencel değerin checkHealth kontrolü
    // yeni can değerinin ekrana yazdırılması
    public void loseHealth(int damage) {
        int healthRemain = healthPercentage - damage;
        if (healthRemain <= 0) {
            System.out.println(name + "player has been bye bye the game");
        }
        checkHealth(healthRemain);
        // System.out.println("kalan can:  " + checkHealth(healthRemain));
    }

    public void restoreHealth(int healthPotion) {
        // int newHealth = healthPercentage + healthPotion;
        int healthRemain = healthPercentage + healthPotion;
        checkHealth(healthRemain);
    }

    @Override
    public String toString() {
        return "Player" +
                "name: " + name +
                ", healthPercentage: " + healthPercentage +
                ", colors: " + (colors.getDamage() + "  -  " + colors.getAttackSpeed() + " Damage Deal:  " + (colors.getAttackSpeed() * colors.getDamage()));
    }
}
