package net.UltraHardCore.Setup;

import org.bukkit.plugin.java.JavaPlugin;

public class Class_Startup extends JavaPlugin  {
	
	String author = "CrazymanJR, coldguy101 & darkzonex44";
 
	
	@Override
	public void onEnable() {
        //Same thing in the OnDisable.
	   getLogger().info("Developed By: " + author);
	    /*
	     * Config & More Stuff here!
	     */
	     register();
	     executecmd();
	}
	
	@Override
	public void onDisable() {
          //No Reason to put here a Disabling message since it'l already say that...
	}
	
	  
	private void register() {
	  getServer().getPluginManager().registerEvents(new Events(), this);
	}
	 
	 
	 private void executecmd() {
	   /*
	    Register Commands
	    */
	 }
}
