package com.mdd.model;

import java.util.Date;

/**
 * EnergyEntYearReport entity. @author MyEclipse Persistence Tools
 */

public class EnergyEntYearReport implements java.io.Serializable {

	// Fields

	private String eid;
	private String eyear;
	private String enterpriseId;
	private String electricityQuantity;
	private String equalValueEnergyUse;
	private String synthesizeEnergyUse;
	private String singleUse;
	private String equalValueRatio;
	private String industryTotalValue;
	private String industryIncreaseValue;
	private String industryIncreaseEnergyValue;
	private String increaseRatio;
	private String priceIndexNum;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;

	// Constructors

	/** default constructor */
	public EnergyEntYearReport() {
		eid="";
		eyear="";
		enterpriseId="";
		electricityQuantity="";
		equalValueEnergyUse="";
		synthesizeEnergyUse="";
		singleUse="";
		equalValueRatio="";
		industryTotalValue="";
		industryIncreaseValue="";
		industryIncreaseEnergyValue="";
		increaseRatio="";
		priceIndexNum="";
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
	}

	/** full constructor */
	public EnergyEntYearReport(String eyear, String enterpriseId,
			String electricityQuantity, String equalValueEnergyUse,
			String synthesizeEnergyUse, String singleUse,
			String equalValueRatio, String industryTotalValue,
			String industryIncreaseValue, String industryIncreaseEnergyValue,
			String increaseRatio, String priceIndexNum, String createBy,
			Date createTime, String updateBy, Date updateTime, String remove) {
		this.eyear = eyear;
		this.enterpriseId = enterpriseId;
		this.electricityQuantity = electricityQuantity;
		this.equalValueEnergyUse = equalValueEnergyUse;
		this.synthesizeEnergyUse = synthesizeEnergyUse;
		this.singleUse = singleUse;
		this.equalValueRatio = equalValueRatio;
		this.industryTotalValue = industryTotalValue;
		this.industryIncreaseValue = industryIncreaseValue;
		this.industryIncreaseEnergyValue = industryIncreaseEnergyValue;
		this.increaseRatio = increaseRatio;
		this.priceIndexNum = priceIndexNum;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.remove = remove;
	}

	// Property accessors

	public String getEid() {
		return this.eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEyear() {
		return this.eyear;
	}

	public void setEyear(String eyear) {
		this.eyear = eyear;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getElectricityQuantity() {
		return this.electricityQuantity;
	}

	public void setElectricityQuantity(String electricityQuantity) {
		this.electricityQuantity = electricityQuantity;
	}

	public String getEqualValueEnergyUse() {
		return this.equalValueEnergyUse;
	}

	public void setEqualValueEnergyUse(String equalValueEnergyUse) {
		this.equalValueEnergyUse = equalValueEnergyUse;
	}

	public String getSynthesizeEnergyUse() {
		return this.synthesizeEnergyUse;
	}

	public void setSynthesizeEnergyUse(String synthesizeEnergyUse) {
		this.synthesizeEnergyUse = synthesizeEnergyUse;
	}

	public String getSingleUse() {
		return this.singleUse;
	}

	public void setSingleUse(String singleUse) {
		this.singleUse = singleUse;
	}

	public String getEqualValueRatio() {
		return this.equalValueRatio;
	}

	public void setEqualValueRatio(String equalValueRatio) {
		this.equalValueRatio = equalValueRatio;
	}

	public String getIndustryTotalValue() {
		return this.industryTotalValue;
	}

	public void setIndustryTotalValue(String industryTotalValue) {
		this.industryTotalValue = industryTotalValue;
	}

	public String getIndustryIncreaseValue() {
		return this.industryIncreaseValue;
	}

	public void setIndustryIncreaseValue(String industryIncreaseValue) {
		this.industryIncreaseValue = industryIncreaseValue;
	}

	public String getIndustryIncreaseEnergyValue() {
		return this.industryIncreaseEnergyValue;
	}

	public void setIndustryIncreaseEnergyValue(
			String industryIncreaseEnergyValue) {
		this.industryIncreaseEnergyValue = industryIncreaseEnergyValue;
	}

	public String getIncreaseRatio() {
		return this.increaseRatio;
	}

	public void setIncreaseRatio(String increaseRatio) {
		this.increaseRatio = increaseRatio;
	}

	public String getPriceIndexNum() {
		return this.priceIndexNum;
	}

	public void setPriceIndexNum(String priceIndexNum) {
		this.priceIndexNum = priceIndexNum;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getRemove() {
		return this.remove;
	}

	public void setRemove(String remove) {
		this.remove = remove;
	}

}