package net.UltraHardCore.Setup;

import net.UltraHardCore.Events.Join;
import org.bukkit.plugin.java.JavaPlugin;

public class Class_Startup extends JavaPlugin  {
	
	String author = "CrazymanJR, coldguy101 & darkzonex44";
 
	
	@Override
	public void onEnable() {
        //Same thing in the OnDisable.
           getLogger().info("UHC Has Been Enabled!");
	   getLogger().info("Developed By: " + author);
	    /*
	     * Config & More Stuff here!
	     */
	     register();
	    
	}
	
	@Override
	public void onDisable() {
          getLogger().info("UHC Has Been Disabled");
	}
	
	  
	private void register() {
	  getServer().getPluginManager().registerEvents(new Join(), this);
	}
	 
	 
	 
}
