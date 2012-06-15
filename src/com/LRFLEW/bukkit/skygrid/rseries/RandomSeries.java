package com.LRFLEW.bukkit.skygrid.rseries;

import java.util.Random;

public class RandomSeries {
	private int[] series;
	private int pos;
	
	public RandomSeries(int size) {
		series = new int[size];
		for (int i = 0; i < size; i++) {
			series[i] = i;
		}
	}
	
	public void reset() {
		pos = 0;
	}
	
	public int next(Random random) {
		int slot = pos + random.nextInt(series.length - pos);
		int temp = series[pos];
		series[pos] = series[slot];
		series[slot] = temp;
		return series[pos++];
	}
	
}
