package Location;

import Player.Player;

public class SafeHouse extends  NormalLocation{

    public SafeHouse(Player player, String name) {
        super(player, "Güvenli Ev");
    }

    @Override
    boolean onLocation() {
      System.out.println("Güvenli Evdesiniz!!!");
        System.out.println("Canınız Yenilendi!!");
        return true;
    }
}


