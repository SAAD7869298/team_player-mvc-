package com.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.models.player;

@Repository
public class PlayerDaoImpl implements PlayerDAO {

	private SessionFactory factory;

	@Autowired
	public PlayerDaoImpl(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public List<player> getplayers() {
		Session session = factory.getCurrentSession();
		Query<player> query = session.createQuery("from player", player.class);

		return query.getResultList();
	}

	@Override
	public void addplayer(player player) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(player);
	}

	@Override
	public player getonePlayer(int id) {
		Session session = factory.getCurrentSession();
		return session.get(player.class, id);
	}

	@Override
	public void removeplayer(int id) {
		Session session = factory.getCurrentSession();

		Query q = session.createQuery("delete from player where id=?1");
		q.setInteger(1, id);
		q.executeUpdate();
	}

}
