package de.patrick15a.coinsAPI.example;

import org.bukkit.entity.Player;

public class Coins {
	
	// Gibt zurück wie viele Coins der Spieler hat.
	public int get(Player p) {
		return Main.getCoinsAPI().getCoins(p);
	}
	
	// Fügt dem Spieler Coins hinzu. Gibt zurück ob Funktion erfolgreich ausgeführt wurde.
	public boolean add(Player p, int coins) {
		return Main.getCoinsAPI().addCoins(p, coins);
	}
	
	// Entfernt dem Spieler Coins. Gibt zurück ob Funktion erfolgreich ausgeführt wurde.
	public boolean remove(Player p, int coins) {
		return Main.getCoinsAPI().removeCoins(p, coins);
	}
	
	// Setzt dem Spieler Coins. Gibt zurück ob Funktion erfolgreich ausgeführt wurde.
	public boolean set(Player p, int coins) {
		return Main.getCoinsAPI().setCoins(p, coins);
	}
	
	// Gibt zurück ob der Spieler "amount" Coins hat.
	public boolean has(Player p, int coins) {
		return Main.getCoinsAPI().hasCoins(p, coins);
	}
	
}
