package com.infy.WeCare.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.WeCare.Entity.Coach;
import com.infy.WeCare.Service.WeCareServiceImpl;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/wecare")
public class WeCareController {

	@Autowired
	private WeCareServiceImpl weCareServiceImpl;
	
	@PostMapping("/coaches")
	public ResponseEntity< String> CreateCoaches(@RequestBody Coach coach){
		String str= weCareServiceImpl.CreateCoaches(coach);
		return new ResponseEntity<String>(str, HttpStatus.CREATED);	
	}
	@GetMapping("/get")
	public ResponseEntity<List<Coach>> GettheCoachProfileDetails(){
		List<Coach> coach = weCareServiceImpl.GettheCoachProfileDetails();
		return new ResponseEntity<List<Coach>>(coach, HttpStatus.OK);
		
	}
}
