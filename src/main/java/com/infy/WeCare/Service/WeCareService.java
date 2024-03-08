package com.infy.WeCare.Service;

import java.util.List;

import com.infy.WeCare.Entity.Coach;

public interface WeCareService {
	public String CreateCoaches(Coach coach);
	
	public List<Coach> GettheCoachProfileDetails();
}
