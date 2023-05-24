package Location;

import Player.*;



public abstract class Location {
   private Player   player;

    public Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }

    private String   name;

   public   void  location(){}

    abstract  boolean onLocation();

}
