package com.action.stock;

import java.util.ArrayList;
import java.util.List;

import com.ganggang.aaa;
import com.ganggang.Stock.StockLiangHua;
import com.ganggang.Stock.Entity.PlanDeal;
import com.ganggang.Stock.Entity.StockTransactionDetail;
import com.ganggang.Stock.Service.PlanDealService;
import com.opensymphony.xwork2.ActionSupport;

public class PlanDealAction extends ActionSupport {

	public int Plantype;
	public List<StockTransactionDetail> details;
	public List<PlanDeal> deals;
	public String Message;
	
	public String DealList(){
		deals=PlanDealService.GetPlanDealByPlantype(Plantype);
		Message="well";
		System.out.println("aaaaaaaaaaaaaaaaa");
		return "list";
	}
	
	public int getPlantype() {
		return Plantype;
	}
	public void setPlantype(int plantype) {
		Plantype = plantype;
	}
	public List<StockTransactionDetail> getDetails() {
		return details;
	}
	public void setDetails(List<StockTransactionDetail> details) {
		this.details = details;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}

	public List<PlanDeal> getDeals() {
		return deals;
	}

	public void setDeals(List<PlanDeal> deals) {
		this.deals = deals;
	}
	
}
