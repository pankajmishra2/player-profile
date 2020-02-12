package com.pankaj.model;

public class Career {
	
	private int id;
	
	private int matches;
	
	private int runs;
	
	private int wickets;

	public Career() {
		super();
	}

	public Career(int id, int matches, int runs, int wickets) {
		super();
		this.id = id;
		this.matches = matches;
		this.runs = runs;
		this.wickets = wickets;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
}
