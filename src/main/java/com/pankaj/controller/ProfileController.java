package com.pankaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pankaj.model.Player;
import com.pankaj.service.ProfileService;

@RestController
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;

	@RequestMapping(method=RequestMethod.GET , value="players")
	public List<Player> getAllPlayer() {
		return profileService.getAllPlayers();
	}
}
