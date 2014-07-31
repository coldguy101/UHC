package net.UltraHardCore.Setup;

import net.UltraHardCore.Events.Join;
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
	     execute();
	}
	
	@Override
	public void onDisable() {
          //No Reason to put here a Disabling message since it'l already say that...
	}
	
	  
	private void register() {
	  getServer().getPluginManager().registerEvents(new Join(), this);
	}
	 
	 
	 private void execute() {
            //Register set team Command
            //Register Freeze All Command
            //Register start Command
            //Register Stop Command (Calls Freeze Event);
            //Register Health Command *Basicly /Health (Player) 
            //Response: Target's Health is 10 Hearts!  
	 } 
}
