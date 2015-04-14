package com.ganggang.Stock.Dao;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.ganggang.Stock.Entity.*;
import com.ganggang.Util.HibernateUtil;

public class PlanDealDao {

	public static void AddStockInfo(PlanDeal deal){
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(deal);
		session.getTransaction().commit();
		session.close();
	}
	public static List<PlanDeal> Query(String sql){
		List l;
		List<PlanDeal> result=new LinkedList<PlanDeal>();
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		l=session.createSQLQuery(sql).addEntity(PlanDeal.class).list();
		for (Object o : l) {
			result.add((PlanDeal)o);
		}
		session.getTransaction().commit();
		session.close();
		return result;
	}
	public static PlanDeal QueryUnique(String sql){
		Object o;
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		o=session.createSQLQuery(sql).addEntity(PlanDeal.class).uniqueResult();
		session.getTransaction().commit();
		session.close();
		if(o==null){
			return null;
		}
		return (PlanDeal)o;
	}
	public static void Update(PlanDeal deal){
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.update(deal);
		session.getTransaction().commit();
		session.close();
	}
}
