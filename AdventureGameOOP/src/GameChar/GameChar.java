package GameChar;

public abstract class GameChar {
    private int     ID;
    private int     damage;
    private int     health;
    private int     money;
    private String  name;

    public GameChar(int ID, int damage, int health, int money, String name)
    {
        this.ID     =       ID;
        this.damage =       damage;
        this.health =       health;
        this.money  =       money;
        this.name   =       name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
