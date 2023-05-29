package Location;

import Player.Player;

import java.util.Scanner;

public abstract class Location {
    String name ;


    public Location(String name ){
        this.name=name;
    }

    public abstract boolean onLocation();


}
