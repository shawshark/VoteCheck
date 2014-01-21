package me.shawshark.votecheck;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventListener implements Listener {
	
	public main m;
	
	public EventListener(main m) {
		this.m = m;
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if(!p.hasPlayedBefore()) {
			m.config.set("server.players.player." + p.getName(), 100);
			System.out.println("[Players] " + p.getName() + " has been added to the config!");
			m.saveConfig();
		} else {
			// do nothing :)
		}
	}
}
