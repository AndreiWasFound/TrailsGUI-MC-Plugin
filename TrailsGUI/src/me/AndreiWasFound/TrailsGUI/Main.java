package me.AndreiWasFound.TrailsGUI;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.AndreiWasFound.TrailsGUI.commands.Trail;
import me.AndreiWasFound.TrailsGUI.events.ClickEvent;
import me.AndreiWasFound.TrailsGUI.events.Quit;
import me.AndreiWasFound.TrailsGUI.models.GUI;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		GUI menu = new GUI();
		menu.register();
		
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new ClickEvent(), this);
		pm.registerEvents(new Quit(), this);
		
		this.getCommand("trails").setExecutor(new Trail());
	}
	
	@Override
	public void onDisable() {
		
	}

}
