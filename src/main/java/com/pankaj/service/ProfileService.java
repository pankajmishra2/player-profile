package com.pankaj.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pankaj.model.Career;
import com.pankaj.model.Player;
import com.pankaj.model.Profile;

@Service
public class ProfileService {
	
	@Autowired
	TestCareerService testCareerService;

	@Autowired
	OneDayCareerService oneDayCareerService;
	
	List<Player> players = new ArrayList<Player>(Arrays.asList(
			new Player(1, "Sachin Tendulker"),
			new Player(2, "Sourav Ganguly"),
			new Player(3, "Virat Kohli"),
			new Player(4, "Ricky Ponting"),
			new Player(5, "Wasim Akram")
			));

	public List<Player> getAllPlayers() {
		return players;
	}
	
	public Profile getProfileById(int id) {
		Player player = getPlayer(id);
		Career testCareer = testCareerService.getTestCareer(id);
		Career oneDayCareer = oneDayCareerService.getOneDayCareer(id);
		return new Profile(player, testCareer, oneDayCareer);
	}

	private Player getPlayer(int id) {
		for(int i=0;i<players.size();i++) {
			if(players.get(i).getId() == id) {
				return players.get(i);
			}
		}
		return null;
	}
	
	
}
