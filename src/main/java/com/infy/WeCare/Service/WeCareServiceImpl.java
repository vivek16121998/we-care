package com.infy.WeCare.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.WeCare.Entity.Coach;
import com.infy.WeCare.repository.CoachRepository;

@Service
public class WeCareServiceImpl implements WeCareService{
	
    @Autowired
	private CoachRepository coachRepository;
    
	public String CreateCoaches(Coach coach) {
		
	  Coach coach2 = coachRepository.save(coach);
	  
		return coach2.getCoachId().toString();
		
	}
	public List<Coach> GettheCoachProfileDetails(){
		List<Coach> coach = (List<Coach>) coachRepository.findAll();
		return coach;
	}
}
