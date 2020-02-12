package com.pankaj.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pankaj.model.Career;


/**
 * The Class OneDayCareerService.
 */
@Service
public class OneDayCareerService {
	
	/** The careers. */
	List<Career> careers = new ArrayList<Career>(Arrays.asList(
			new Career(1, 463, 18426, 154),
			new Career(2, 311, 11363, 100),
			new Career(3, 248, 11867, 4),
			new Career(4, 375, 13704, 3),
			new Career(5, 356, 3717, 502)
			));

	/**
	 * Gets the one day career.
	 *
	 * @param id the id
	 * @return the one day career
	 */
	public Career getOneDayCareer(int id) {
		return careers.stream().filter(career -> career.getId() == id).findFirst().get();
	}

}
