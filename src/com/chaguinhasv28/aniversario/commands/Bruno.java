package com.chaguinhasv28.aniversario.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Bruno implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (command.getName() == "bruno") {
            commandSender.sendMessage("Melão");
            if (commandSender instanceof Player && commandSender.getName() == "MrNaru300") {
                ((Player) commandSender).addPotionEffect(PotionEffectType.HEALTH_BOOST.createEffect(10, 2));

            }
            return true;
        }
        return false;
    }
}
