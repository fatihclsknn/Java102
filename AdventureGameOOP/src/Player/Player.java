package Player;

import GameChar.*;

import java.util.Scanner;

public class Player {
    private Scanner input = new Scanner(System.in);
    private int ID;
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;

    public Player(String name) {
        this.name = name;
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

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public void selectChar() {
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("-----------------------------------");
        for (GameChar i : charList) {
            System.out.printf("Karakter ID:%d \t\t Karakter İsim: %s \t\t Hasar:%d \t\t" +
                    " Sağlık:%d \t\t Para:%d \n", i.getID(), i.getName(), i.getDamage(), i.getHealth(), i.getMoney());
        }
        System.out.println("-----------------------------------");
        System.out.println("Seçtiğiniz karakterin ID'sini giriniz");
        int selectChar = input.nextInt();
        switch (selectChar)
        {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());

        }

        System.out.printf("Seçilen Karakter İsim: %s \t\t Hasar:%d \t\t" +
                " Sağlık:%d \t\t Para:%d \n", this.getCharName(), this.getDamage(),this.getHealth(), this.getMoney());
    }
    public  void initPlayer(GameChar gameChar)
    {
        this.setCharName(gameChar.getName());
        this.setDamage(gameChar.getDamage());
        this.setMoney(gameChar.getMoney());
        this.setHealth(gameChar.getHealth());
    }
}

