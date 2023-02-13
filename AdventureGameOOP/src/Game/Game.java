package Game;

import GameChar.GameChar;
import Player.Player;

import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);
    public  void start()
    {
        System.out.println("Macera Oyununa Hoş Geldin !");
        System.out.print("Lütfen bir isim giriniz !:");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName()+" Cehenneme Hoş geldin!!!!!");
        player.selectChar();


    }
}
