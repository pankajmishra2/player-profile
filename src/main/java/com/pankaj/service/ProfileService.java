package com.pankaj.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pankaj.model.Player;

@Service
public class ProfileService {
	
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
}
