package L_03;

public class EnhancedPlayer {
    private String fullName;
    private int hitPoints = 100;  // Initialise at start
    private String weapon;

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;

        // Conditional re-initialisation
        if (health > 0 && health <= 100){
            this.hitPoints = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints -= damage;
        if (this.hitPoints <= 0){
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining(){
        return this.hitPoints;
    }

    public int getHealth() {
        return hitPoints;
    }
}
