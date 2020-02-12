package com.pankaj.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pankaj.model.Career;

@Service
public class TestCareerService {
	
	List<Career> careers = new ArrayList<Career>(Arrays.asList(
			new Career(1, 200, 15921, 46),
			new Career(2, 113, 7212, 32),
			new Career(3, 84, 7202, 0),
			new Career(4, 168, 13378, 5),
			new Career(5, 104, 2898, 414)
			));

	public Career getTestCareer(int id) {
		return careers.stream().filter(career -> career.getId() == id).findFirst().get();
	}

}
