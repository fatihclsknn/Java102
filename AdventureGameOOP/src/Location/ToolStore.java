package Location;

import Player.Player;

public class ToolStore extends NormalLocation{
    public ToolStore(Player player, String name) {
        super(player, "Mağaza");
    }
    @Override
    boolean onLocation() {
        System.out.println("Mağazaya Hoş geldiniz");
        return true;
    }
    public void menu()  {}
    public void buy(){}
}
