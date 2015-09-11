package com.evolutionnext.model;

import java.util.Collections;
import java.util.List;

public class CalcStats {

	private List<Integer> list;
	
	public CalcStats(List<Integer> integers) {
		this.list = integers;
	}

	public Integer getMinimum() {
		if (list == null || list.size() == 0) return null;
//		int min = list.get(0);
//		for (Integer elem: list) {
//			if (min > elem) min = elem;
//		}
//		return min;
		return Collections.min(list);
	}
}