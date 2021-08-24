package com.chaguinhasv28.aniversario;

import com.chaguinhasv28.aniversario.commands.Bruno;
import org.bukkit.Color;
import org.bukkit.plugin.java.JavaPlugin;

public class Aniversario extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(Color.GREEN + "abriu, agr vê se funciona");
        getCommand("bruno").setExecutor(new Bruno());
        getServer().getPluginManager().registerEvents(new QuebraBlocos(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
        getServer().getConsoleSender().sendMessage(Color.GREEN + "fechou, deu certo? é claro que deu");
    }

    @Override
    public void onLoad() {
        getServer().getConsoleSender().sendMessage(Color.GREEN + "o monstro ta saindo da jaula");
    }
}
