package net.UltraHardCore.Commands.CommandManager;

import java.util.ArrayList;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
//Add more imports, i did it all off mind :P

public class CommandManager implements CommandExecutor {
  
  private ArrayList<String> cmds; //Might Have Made a mistake here, was on my phone doing this part
  
 
  
  protected CommandManager() {
    /*
    Join Command
    AddTeam Command
    LeaveTeam Command
    Help Command Command
    
    -Add more if needed
    */
  }
  
  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
    if (!(sender instanceof Player)) {
      sender.sendMessage("Only players can do this");
    }
    
    Player player = (Player) sender
    
    if (cmd.getName().equalsIgnorCase("uhc") {
      if (args.legnth == 0) {
        player.sendMessage(ChatColor.GRAY + "UHC Help: ");
        player.sendMessage(ChatColor.GREEN + "/uhc - Shows The help menu" )
        //TODO: Add More Messages
      }
      
      return true;
    }
    
  }
  
}
