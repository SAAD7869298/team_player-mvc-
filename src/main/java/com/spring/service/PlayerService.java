package com.spring.service;

import java.util.List;

import com.spring.models.player;

public interface PlayerService {

	public List<player> allplayers();

	public void saveplayer(player player);

	public player oneplayer(int id);

	public void deletesplayer(int id);

}
