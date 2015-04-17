package com.synisys.trainings.tempateMethod.interfaces;

import java.util.List;

import com.synisys.trainings.templateMethod.impl.Position;

public interface Chart {
	public void render(List<Integer> chartValues, List<Position> centroids);

}
