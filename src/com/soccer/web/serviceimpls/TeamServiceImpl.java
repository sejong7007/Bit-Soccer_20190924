package com.soccer.web.serviceimpls;

import com.soccer.web.services.TeamService;

public class TeamServiceImpl implements TeamService{
	
	private static TeamServiceImpl instance = new TeamServiceImpl();

	public static TeamServiceImpl getTeamservice() {
		return instance;
	}
	
	private TeamServiceImpl() {}

}
