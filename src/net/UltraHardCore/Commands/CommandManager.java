package net.UltraHardCore.Commands.CommandManager;

import java.util.HashMap;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;

public class CommandManager implements CommandExecutor {
  
  private HashMap<String, SubCommand> cmds;
  
  public CommandManager() {
    this.cmds = new HashMap();
    loadCommands();
  }
  
  private void loadCommands() {
    /*
    Join
    AddTeam
    LeaveTeam
    -Add more if needed
    */
  }
  
}