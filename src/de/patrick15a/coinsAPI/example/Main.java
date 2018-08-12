package de.patrick15a.coinsAPI.example;

import org.bukkit.plugin.java.JavaPlugin;

import de.patrick15a.coinsAPI.CoinsAPI;

public class Main extends JavaPlugin {
	
	private static CoinsAPI coinsAPI;
	private static Main instance;
	
	@Override
	public void onEnable() {
		
		instance = this;
		coinsAPI = new CoinsAPI();
		
	}
	
	public static Main getInstance() {
		return instance;
	}
	
	public static CoinsAPI getCoinsAPI() {
		return coinsAPI;
	}
	
}
