package com.ganggang.Stock.Service;

import java.util.List;

import com.ganggang.Stock.Dao.PlanDealDao;
import com.ganggang.Stock.Entity.PlanDeal;

public class PlanDealService {

	public static List<PlanDeal> GetPlanDealByPlantype(int plantype){
		String sql=String.format("SELECT * from plandeal where Plantype=%s",plantype);
		List<PlanDeal> result=PlanDealDao.Query(sql);
		return result;
	}

}
