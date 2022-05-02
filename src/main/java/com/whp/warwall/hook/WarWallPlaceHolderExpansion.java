package com.whp.warwall.hook;

import com.whp.warwall.Warwall;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;

public class WarWallPlaceHolderExpansion extends PlaceholderExpansion {
    private int count = 600;
    private final Warwall WarWall;

    public WarWallPlaceHolderExpansion(Warwall plugin) {
        this.WarWall = plugin;
    }

    @Override
    public @NotNull String getIdentifier() {
        return WarWall.getDescription().getName();
    }

    @Override
    public @NotNull String getAuthor() {
        return WarWall.getDescription().getAuthors().get(0);
    }

    @Override
    public @NotNull String getVersion() {
        return WarWall.getDescription().getVersion();
    }

    @Override
    public String onRequest(final OfflinePlayer player, @NotNull final String params) {
        if (player == null) {
            return null;
        }
        String placeHolder = params.toLowerCase();
        switch (placeHolder) {
            case "timer":
                return String.valueOf(count == 0 ? count : count--);
        }
        return null;
    }
}
