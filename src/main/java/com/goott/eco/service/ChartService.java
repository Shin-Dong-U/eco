package com.goott.eco.service;

import java.util.HashMap;
import java.util.List;

public interface ChartService {

	public List<HashMap<String, Object>> getMonthSale(int searchRange);
}
