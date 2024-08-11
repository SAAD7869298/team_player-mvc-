package com.spring.dao;

import java.util.List;

import com.spring.models.player;

public interface PlayerDAO {

	public List<player> getplayers();
	
	public void addplayer(player player);
	
	public player getonePlayer(int id);
	
	public void removeplayer(int id);
}
