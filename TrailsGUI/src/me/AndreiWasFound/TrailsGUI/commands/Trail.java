package me.AndreiWasFound.TrailsGUI.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.AndreiWasFound.TrailsGUI.models.GUI;

public class Trail implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("trails")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("Console cannot use this command");
				return true;
			}
			Player player = (Player) sender;
			GUI menu = new GUI();
			menu.openInventory(player);
			return true;
		} 
		return false;
	}

}
