package cf.pepepper.gm;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandListener implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§cプレイヤーとして実行してください。");
            return false;
        } else {
            Player player = (Player) sender;
            if (args.length > 0) {
                if (sender.hasPermission("gm.gamemode")) {
                    if (args[0].equalsIgnoreCase("survival")) {
                        player.setGameMode(GameMode.SURVIVAL);
                    } else if (args[0].equalsIgnoreCase("creative")) {
                        player.setGameMode(GameMode.CREATIVE);
                    } else if (args[0].equalsIgnoreCase("adventure")) {
                        player.setGameMode(GameMode.ADVENTURE);
                    } else if (args[0].equalsIgnoreCase("spectator")) {
                        player.setGameMode(GameMode.SPECTATOR);
                    } else {
                        player.sendMessage("§c引数が正しくありません。\n§7survival, creative, adventure, spectator のいずれかを指定してください。");
                    }
                } else {
                    player.sendMessage("§cコマンドを実行する権限がありません。");
                }
            } else {
                player.sendMessage("§cゲームモードを指定してください。");
            }
        }
        return true;
    }
}
