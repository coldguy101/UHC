
public class Join ipackage net.UltraHardCore.Events;

import me.confuser.barapi.BarAPI;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
public class Join implements Listener {

	 //Change Prefix if you need to :P
	static String prefix = "§c[§eUHC§c]§f";
	 
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer(); 
		 BarAPI.setMessage(p, prefix + " Welcome to The UHC Event!", 50);
	}

}
