package me.shawshark.votecheck;

import org.bukkit.ChatColor;

public class PerformCommands {
	
	public main m;
	
	public PerformCommands(main m) {
		this.m = m;
	}
	
	public void perform(String pname) {
		String alertmessage = ChatColor.translateAlternateColorCodes('&', "alert " + pname + " "
				+ "&ahas just voted at &6www.craftshark.net &aand received prizes on &6Skyblock, Survival and Factions!");
			
		String fakevote = "dispatchserver pvp,survival,skyblock fakevote " + pname + " www.craftshark.net";
			
		String addtalkperms = "pex user " + pname + " add hub.talk";
			
		String addpermsmsg = ChatColor.translateAlternateColorCodes('&', "&7[&6Craftshark&7] &4"+ pname + 
				" &7Has just voted and gained access to talk in the &6HUB! &7For 24 Hours!");
			
		m.getServer().dispatchCommand(m.getServer().getConsoleSender(), alertmessage);
		m.getServer().dispatchCommand(m.getServer().getConsoleSender(), fakevote);
		m.getServer().dispatchCommand(m.getServer().getConsoleSender(), addtalkperms);
		m.getServer().broadcastMessage(addpermsmsg);
	}
}
