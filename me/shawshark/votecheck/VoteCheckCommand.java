package me.shawshark.votecheck;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class VoteCheckCommand implements CommandExecutor {
	
	public main m;
	
	public VoteCheckCommand(main m) {
		this.m = m;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
		if(sender.isOp()) {
			if(args.length < 1) {
				sender.sendMessage(ChatColor.GOLD + "Error: /votecheck [player name]");
			} else {
				int amount = 100;
				String player = args[0];
				if(m.config.getInt("server.players.player." + player) == amount) {
					m.pc.perform(player);
				} else {
					System.out.println("---------------------------------------------------");
					System.out.println("[Players] Someones tried to vote,");
					System.out.println("[Players] And they haven't joined the server yet :/");
					System.out.println("[Players] Following was the name: " + player);
					System.out.println("---------------------------------------------------");
				}
			}
		}
		return false;
	}

}
