package com.whp.warwall.populate;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class MainPopulate extends BlockPopulator {
    @Override
    public void populate(@NotNull World world, @NotNull Random random, @NotNull Chunk chunk) {
//        for(int ly=0;ly<50;ly++){
//            for(int lx=0;lx<16;lx++){
//                for(int lz=0;lz<16;lz++)
//                    limitedRegion.setType(lx,ly,lz, Material.STONE);
//            }
//        }
        Location spawnLocation = world.getSpawnLocation();
        int x = spawnLocation.getBlockX();
        int y = spawnLocation.getBlockY();
        int z = spawnLocation.getBlockZ();
        for (; x < x + 10; x++) {
            for (; z < z + 10; z++) {
                chunk.getBlock(x, 0, z).setType(Material.STONE);
            }
        }
    }
}
