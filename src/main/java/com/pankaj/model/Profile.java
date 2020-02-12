package com.pankaj.model;

public class Profile {

	private Player player;
	
	private Career testCareer;
	
	private Career oneDayCareer;

	public Profile() {
		super();
	}

	public Profile(Player player, Career testCareer, Career oneDayCareer) {
		super();
		this.player = player;
		this.testCareer = testCareer;
		this.oneDayCareer = oneDayCareer;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Career getTestCareer() {
		return testCareer;
	}

	public void setTestCareer(Career testCareer) {
		this.testCareer = testCareer;
	}

	public Career getOneDayCareer() {
		return oneDayCareer;
	}

	public void setOneDayCareer(Career oneDayCareer) {
		this.oneDayCareer = oneDayCareer;
	}
}
