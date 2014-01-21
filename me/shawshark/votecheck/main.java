package me.shawshark.votecheck;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{
	
	public FileConfiguration config = null;
	public PerformCommands pc = new PerformCommands(this);
	
	public void onEnable() {
		saveDefaultConfig();
		RegisterCommands();
		RegisterEvents();
		config = getConfig();
	}
	
	public void RegisterCommands() {
		getCommand("votecheck").setExecutor(new VoteCheckCommand(this));
		System.out.println("[VoteCheck] Registered commands!");
	}
	
	public void RegisterEvents() {
		Bukkit.getPluginManager().registerEvents(new EventListener(this), this);
		System.out.println("[VoteCheck] Registered events!");
	}
}
