package de.patrick15a.coinsAPI.example;

import org.bukkit.entity.Player;

public class Coins {

	public void get(Player p) {
		Main.getCoinsAPI().getCoins(p);
	}
	
	public void add(Player p, int coins) {
		Main.getCoinsAPI().addCoins(p, coins);
	}
	
	public void remove(Player p, int coins) {
		Main.getCoinsAPI().removeCoins(p, coins);
	}
	
	public void set(Player p, int coins) {
		Main.getCoinsAPI().setCoins(p, coins);
	}
	
}
