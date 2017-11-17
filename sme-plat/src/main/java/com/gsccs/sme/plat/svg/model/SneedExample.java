package com.gsccs.sme.plat.svg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.sme.plat.bass.BaseExample;

public class SneedExample extends BaseExample {
	
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public SneedExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_sneed
	 * 
	 * @mbggenerated Thu Feb 25 11:34:55 CST 2016
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_sneed
	 * 
	 * @mbggenerated Thu Feb 25 11:34:55 CST 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_sneed
	 * 
	 * @mbggenerated Thu Feb 25 11:34:55 CST 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_sneed
	 * 
	 * @mbggenerated Thu Feb 25 11:34:55 CST 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_sneed
	 * 
	 * @mbggenerated Thu Feb 25 11:34:55 CST 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_sneed
	 * 
	 * @mbggenerated Thu Feb 25 11:34:55 CST 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_sneed
	 * 
	 * @mbggenerated Thu Feb 25 11:34:55 CST 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_sneed
	 * 
	 * @mbggenerated Thu Feb 25 11:34:55 CST 2016
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_sneed
	 * 
	 * @mbggenerated Thu Feb 25 11:34:55 CST 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_sneed
	 * 
	 * @mbggenerated Thu Feb 25 11:34:55 CST 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sme_sneed
	 * 
	 * @mbggenerated Thu Feb 25 11:34:55 CST 2016
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		
		public Criteria andCorpidIsNull() {
			addCriterion("corpid is null");
			return (Criteria) this;
		}

		public Criteria andCorpidIsNotNull() {
			addCriterion("corpid is not null");
			return (Criteria) this;
		}

		public Criteria andCorpidEqualTo(Long value) {
			addCriterion("corpid =", value, "corpid");
			return (Criteria) this;
		}

		public Criteria andCodeIsNull() {
			addCriterion("scode is null");
			return (Criteria) this;
		}

		public Criteria andCodeIsNotNull() {
			addCriterion("scode is not null");
			return (Criteria) this;
		}

		public Criteria andCodeEqualTo(Long value) {
			addCriterion("scode =", value, "scode");
			return (Criteria) this;
		}

		public Criteria andCodeNotEqualTo(String value) {
			addCriterion("scode <>", value, "scode");
			return (Criteria) this;
		}

		public Criteria andCodeIn(List<String> values) {
			addCriterion("scode in", values, "scode");
			return (Criteria) this;
		}

		public Criteria andCodeNotIn(List<String> values) {
			addCriterion("scode not in", values, "scode");
			return (Criteria) this;
		}

		

		public Criteria andSubcodeIsNull() {
			addCriterion("subscode is null");
			return (Criteria) this;
		}

		public Criteria andSubcodeIsNotNull() {
			addCriterion("subscode is not null");
			return (Criteria) this;
		}

		public Criteria andSubcodeEqualTo(Long value) {
			addCriterion("subscode =", value, "subscode");
			return (Criteria) this;
		}

		public Criteria andSubcodeNotEqualTo(Long value) {
			addCriterion("subscode <>", value, "subscode");
			return (Criteria) this;
		}

		public Criteria andSubcodeIn(List<Long> values) {
			addCriterion("subscode in", values, "subscode");
			return (Criteria) this;
		}

		public Criteria andSubcodeNotIn(List<String> values) {
			addCriterion("subscode not in", values, "subscode");
			return (Criteria) this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (Criteria) this;
		}

		

		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return (Criteria) this;
		}

		
		public Criteria andImgIsNull() {
			addCriterion("img is null");
			return (Criteria) this;
		}

		public Criteria andImgIsNotNull() {
			addCriterion("img is not null");
			return (Criteria) this;
		}

		public Criteria andImgEqualTo(String value) {
			addCriterion("img =", value, "img");
			return (Criteria) this;
		}

		

		public Criteria andAddtimeIsNull() {
			addCriterion("addtime is null");
			return (Criteria) this;
		}

		public Criteria andAddtimeIsNotNull() {
			addCriterion("addtime is not null");
			return (Criteria) this;
		}

		public Criteria andAddtimeEqualTo(Date value) {
			addCriterion("addtime =", value, "addtime");
			return (Criteria) this;
		}

		public Criteria andAddtimeNotEqualTo(Date value) {
			addCriterion("addtime <>", value, "addtime");
			return (Criteria) this;
		}

		public Criteria andAddtimeGreaterThan(Date value) {
			addCriterion("addtime >", value, "addtime");
			return (Criteria) this;
		}

		public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
			addCriterion("addtime >=", value, "addtime");
			return (Criteria) this;
		}

		public Criteria andAddtimeLessThan(Date value) {
			addCriterion("addtime <", value, "addtime");
			return (Criteria) this;
		}

		public Criteria andAddtimeLessThanOrEqualTo(Date value) {
			addCriterion("addtime <=", value, "addtime");
			return (Criteria) this;
		}

		public Criteria andAddtimeIn(List<Date> values) {
			addCriterion("addtime in", values, "addtime");
			return (Criteria) this;
		}

		public Criteria andAddtimeNotIn(List<Date> values) {
			addCriterion("addtime not in", values, "addtime");
			return (Criteria) this;
		}

		public Criteria andAddtimeBetween(Date value1, Date value2) {
			addCriterion("addtime between", value1, value2, "addtime");
			return (Criteria) this;
		}

		public Criteria andAddtimeNotBetween(Date value1, Date value2) {
			addCriterion("addtime not between", value1, value2, "addtime");
			return (Criteria) this;
		}

		public Criteria andClicknumIsNull() {
			addCriterion("clickNum is null");
			return (Criteria) this;
		}

		public Criteria andClicknumIsNotNull() {
			addCriterion("clickNum is not null");
			return (Criteria) this;
		}

		public Criteria andClicknumEqualTo(Integer value) {
			addCriterion("clickNum =", value, "clicknum");
			return (Criteria) this;
		}

		public Criteria andClicknumNotEqualTo(Integer value) {
			addCriterion("clickNum <>", value, "clicknum");
			return (Criteria) this;
		}

		public Criteria andClicknumGreaterThan(Integer value) {
			addCriterion("clickNum >", value, "clicknum");
			return (Criteria) this;
		}

		public Criteria andClicknumGreaterThanOrEqualTo(Integer value) {
			addCriterion("clickNum >=", value, "clicknum");
			return (Criteria) this;
		}

		public Criteria andClicknumLessThan(Integer value) {
			addCriterion("clickNum <", value, "clicknum");
			return (Criteria) this;
		}

		public Criteria andClicknumLessThanOrEqualTo(Integer value) {
			addCriterion("clickNum <=", value, "clicknum");
			return (Criteria) this;
		}

		public Criteria andClicknumIn(List<Integer> values) {
			addCriterion("clickNum in", values, "clicknum");
			return (Criteria) this;
		}

		public Criteria andClicknumNotIn(List<Integer> values) {
			addCriterion("clickNum not in", values, "clicknum");
			return (Criteria) this;
		}

		public Criteria andClicknumBetween(Integer value1, Integer value2) {
			addCriterion("clickNum between", value1, value2, "clicknum");
			return (Criteria) this;
		}

		public Criteria andClicknumNotBetween(Integer value1, Integer value2) {
			addCriterion("clickNum not between", value1, value2, "clicknum");
			return (Criteria) this;
		}

		public Criteria andTagsIsNull() {
			addCriterion("linktel is null");
			return (Criteria) this;
		}

		public Criteria andTagsIsNotNull() {
			addCriterion("linktel is not null");
			return (Criteria) this;
		}

		public Criteria andTagsEqualTo(String value) {
			addCriterion("linktel =", value, "linktel");
			return (Criteria) this;
		}

		public Criteria andBarcodeIsNull() {
			addCriterion("barcode is null");
			return (Criteria) this;
		}

		public Criteria andBarcodeIsNotNull() {
			addCriterion("barcode is not null");
			return (Criteria) this;
		}

		public Criteria andBarcodeEqualTo(String value) {
			addCriterion("barcode =", value, "barcode");
			return (Criteria) this;
		}

		public Criteria andBarcodeNotEqualTo(String value) {
			addCriterion("barcode <>", value, "barcode");
			return (Criteria) this;
		}

		public Criteria andBarcodeGreaterThan(String value) {
			addCriterion("barcode >", value, "barcode");
			return (Criteria) this;
		}

		public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
			addCriterion("barcode >=", value, "barcode");
			return (Criteria) this;
		}

		
		public Criteria andBarcodeNotBetween(String value1, String value2) {
			addCriterion("barcode not between", value1, value2, "barcode");
			return (Criteria) this;
		}

		public Criteria andBriefIsNull() {
			addCriterion("brief is null");
			return (Criteria) this;
		}

		public Criteria andBriefIsNotNull() {
			addCriterion("brief is not null");
			return (Criteria) this;
		}

		public Criteria andBriefEqualTo(String value) {
			addCriterion("brief =", value, "brief");
			return (Criteria) this;
		}

		public Criteria andBriefNotEqualTo(String value) {
			addCriterion("brief <>", value, "brief");
			return (Criteria) this;
		}

		public Criteria andBriefGreaterThan(String value) {
			addCriterion("brief >", value, "brief");
			return (Criteria) this;
		}

		public Criteria andBriefGreaterThanOrEqualTo(String value) {
			addCriterion("brief >=", value, "brief");
			return (Criteria) this;
		}

		public Criteria andBriefLessThan(String value) {
			addCriterion("brief <", value, "brief");
			return (Criteria) this;
		}

		public Criteria andBriefLessThanOrEqualTo(String value) {
			addCriterion("brief <=", value, "brief");
			return (Criteria) this;
		}

		public Criteria andBriefLike(String value) {
			addCriterion("brief like", value, "brief");
			return (Criteria) this;
		}

		public Criteria andBriefNotLike(String value) {
			addCriterion("brief not like", value, "brief");
			return (Criteria) this;
		}

		public Criteria andBriefIn(List<String> values) {
			addCriterion("brief in", values, "brief");
			return (Criteria) this;
		}

		public Criteria andBriefNotIn(List<String> values) {
			addCriterion("brief not in", values, "brief");
			return (Criteria) this;
		}

		public Criteria andBriefBetween(String value1, String value2) {
			addCriterion("brief between", value1, value2, "brief");
			return (Criteria) this;
		}

		public Criteria andBriefNotBetween(String value1, String value2) {
			addCriterion("brief not between", value1, value2, "brief");
			return (Criteria) this;
		}

		public Criteria andPriceIsNull() {
			addCriterion("price is null");
			return (Criteria) this;
		}

		public Criteria andPriceIsNotNull() {
			addCriterion("price is not null");
			return (Criteria) this;
		}

		public Criteria andPriceEqualTo(BigDecimal value) {
			addCriterion("price =", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotEqualTo(BigDecimal value) {
			addCriterion("price <>", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceGreaterThan(BigDecimal value) {
			addCriterion("price >", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("price >=", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceLessThan(BigDecimal value) {
			addCriterion("price <", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
			addCriterion("price <=", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceIn(List<BigDecimal> values) {
			addCriterion("price in", values, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotIn(List<BigDecimal> values) {
			addCriterion("price not in", values, "price");
			return (Criteria) this;
		}

		public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("price between", value1, value2, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("price not between", value1, value2, "price");
			return (Criteria) this;
		}

		public Criteria andSalenumIsNull() {
			addCriterion("salenum is null");
			return (Criteria) this;
		}

		public Criteria andSalenumIsNotNull() {
			addCriterion("salenum is not null");
			return (Criteria) this;
		}

		public Criteria andSalenumEqualTo(Integer value) {
			addCriterion("salenum =", value, "salenum");
			return (Criteria) this;
		}

		public Criteria andSalenumNotEqualTo(Integer value) {
			addCriterion("salenum <>", value, "salenum");
			return (Criteria) this;
		}

		public Criteria andSalenumGreaterThan(Integer value) {
			addCriterion("salenum >", value, "salenum");
			return (Criteria) this;
		}

		public Criteria andSalenumGreaterThanOrEqualTo(Integer value) {
			addCriterion("salenum >=", value, "salenum");
			return (Criteria) this;
		}

		public Criteria andSalenumLessThan(Integer value) {
			addCriterion("salenum <", value, "salenum");
			return (Criteria) this;
		}

		public Criteria andSalenumLessThanOrEqualTo(Integer value) {
			addCriterion("salenum <=", value, "salenum");
			return (Criteria) this;
		}

		public Criteria andSalenumIn(List<Integer> values) {
			addCriterion("salenum in", values, "salenum");
			return (Criteria) this;
		}

		

		public Criteria andSalenumBetween(Integer value1, Integer value2) {
			addCriterion("salenum between", value1, value2, "salenum");
			return (Criteria) this;
		}

		public Criteria andSalenumNotBetween(Integer value1, Integer value2) {
			addCriterion("salenum not between", value1, value2, "salenum");
			return (Criteria) this;
		}

		public Criteria andEvalnumIsNull() {
			addCriterion("evalnum is null");
			return (Criteria) this;
		}

		public Criteria andEvalnumIsNotNull() {
			addCriterion("evalnum is not null");
			return (Criteria) this;
		}

		public Criteria andEvalnumEqualTo(Integer value) {
			addCriterion("evalnum =", value, "evalnum");
			return (Criteria) this;
		}

		public Criteria andEvalnumNotEqualTo(Integer value) {
			addCriterion("evalnum <>", value, "evalnum");
			return (Criteria) this;
		}

		public Criteria andEvalnumGreaterThan(Integer value) {
			addCriterion("evalnum >", value, "evalnum");
			return (Criteria) this;
		}

		public Criteria andEvalnumGreaterThanOrEqualTo(Integer value) {
			addCriterion("evalnum >=", value, "evalnum");
			return (Criteria) this;
		}

		public Criteria andEvalnumLessThan(Integer value) {
			addCriterion("evalnum <", value, "evalnum");
			return (Criteria) this;
		}

		public Criteria andEvalnumLessThanOrEqualTo(Integer value) {
			addCriterion("evalnum <=", value, "evalnum");
			return (Criteria) this;
		}

		public Criteria andEvalnumIn(List<Integer> values) {
			addCriterion("evalnum in", values, "evalnum");
			return (Criteria) this;
		}

		public Criteria andEvalnumNotIn(List<Integer> values) {
			addCriterion("evalnum not in", values, "evalnum");
			return (Criteria) this;
		}

		public Criteria andEvalnumBetween(Integer value1, Integer value2) {
			addCriterion("evalnum between", value1, value2, "evalnum");
			return (Criteria) this;
		}

		public Criteria andEvalnumNotBetween(Integer value1, Integer value2) {
			addCriterion("evalnum not between", value1, value2, "evalnum");
			return (Criteria) this;
		}

		public Criteria andLasttimeIsNull() {
			addCriterion("lasttime is null");
			return (Criteria) this;
		}

		public Criteria andLasttimeIsNotNull() {
			addCriterion("lasttime is not null");
			return (Criteria) this;
		}

		public Criteria andLasttimeEqualTo(Date value) {
			addCriterion("lasttime =", value, "lasttime");
			return (Criteria) this;
		}

		public Criteria andLasttimeNotEqualTo(Date value) {
			addCriterion("lasttime <>", value, "lasttime");
			return (Criteria) this;
		}

		public Criteria andLasttimeGreaterThan(Date value) {
			addCriterion("lasttime >", value, "lasttime");
			return (Criteria) this;
		}

		public Criteria andLasttimeGreaterThanOrEqualTo(Date value) {
			addCriterion("lasttime >=", value, "lasttime");
			return (Criteria) this;
		}

		public Criteria andLasttimeLessThan(Date value) {
			addCriterion("lasttime <", value, "lasttime");
			return (Criteria) this;
		}

		public Criteria andLasttimeLessThanOrEqualTo(Date value) {
			addCriterion("lasttime <=", value, "lasttime");
			return (Criteria) this;
		}

		public Criteria andLasttimeIn(List<Date> values) {
			addCriterion("lasttime in", values, "lasttime");
			return (Criteria) this;
		}

		public Criteria andLasttimeNotIn(List<Date> values) {
			addCriterion("lasttime not in", values, "lasttime");
			return (Criteria) this;
		}

		public Criteria andLasttimeBetween(Date value1, Date value2) {
			addCriterion("lasttime between", value1, value2, "lasttime");
			return (Criteria) this;
		}

		public Criteria andLasttimeNotBetween(Date value1, Date value2) {
			addCriterion("lasttime not between", value1, value2, "lasttime");
			return (Criteria) this;
		}

		public Criteria andReleaseIsNull() {
			addCriterion("isrelease is null");
			return (Criteria) this;
		}

		public Criteria andReleaseIsNotNull() {
			addCriterion("isrelease is not null");
			return (Criteria) this;
		}

		public Criteria andReleaseEqualTo(String value) {
			addCriterion("isrelease =", value, "isrelease");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}
		
	}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}