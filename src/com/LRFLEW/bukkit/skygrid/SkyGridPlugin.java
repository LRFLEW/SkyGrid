package com.LRFLEW.bukkit.skygrid;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public class SkyGridPlugin extends JavaPlugin {
	
	@Override
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
		if (id != null && !id.isEmpty()) try {
			int size = 256;
			size = Integer.parseInt(id);
			if (size <= 0) size = 256;
			return new SkyGridGenerator(size);
		} catch (NumberFormatException e) {}
		return new SkyGridGenerator();
	}
	
	public static int maxHeight(World world, int size) {
		if (world.getMaxHeight() < size)
			return world.getMaxHeight();
		else return size;
	}
	
}
