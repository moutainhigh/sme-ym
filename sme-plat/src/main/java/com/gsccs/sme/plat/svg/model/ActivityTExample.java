package com.gsccs.sme.plat.svg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.sme.plat.bass.BaseExample;

public class ActivityTExample extends BaseExample {

	protected String orderByClause;
	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_activity
	 * 
	 * @mbggenerated Wed Mar 09 16:29:53 CST 2016
	 */
	public ActivityTExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_activity
	 * 
	 * @mbggenerated Wed Mar 09 16:29:53 CST 2016
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_activity
	 * 
	 * @mbggenerated Wed Mar 09 16:29:53 CST 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_activity
	 * 
	 * @mbggenerated Wed Mar 09 16:29:53 CST 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_activity
	 * 
	 * @mbggenerated Wed Mar 09 16:29:53 CST 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_activity
	 * 
	 * @mbggenerated Wed Mar 09 16:29:53 CST 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_activity
	 * 
	 * @mbggenerated Wed Mar 09 16:29:53 CST 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_activity
	 * 
	 * @mbggenerated Wed Mar 09 16:29:53 CST 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_activity
	 * 
	 * @mbggenerated Wed Mar 09 16:29:53 CST 2016
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
	 * to the database table sme_activity
	 * 
	 * @mbggenerated Wed Mar 09 16:29:53 CST 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_activity
	 * 
	 * @mbggenerated Wed Mar 09 16:29:53 CST 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sme_activity
	 * 
	 * @mbggenerated Wed Mar 09 16:29:53 CST 2016
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

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
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

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andSvgidIsNull() {
			addCriterion("svgid is null");
			return (Criteria) this;
		}

		public Criteria andSvgidIsNotNull() {
			addCriterion("svgid is not null");
			return (Criteria) this;
		}

		public Criteria andSvgidEqualTo(Long value) {
			addCriterion("svgid =", value, "svgid");
			return (Criteria) this;
		}

		public Criteria andSvgidNotEqualTo(Long value) {
			addCriterion("svgid <>", value, "svgid");
			return (Criteria) this;
		}

		public Criteria andSvgidGreaterThan(Long value) {
			addCriterion("svgid >", value, "svgid");
			return (Criteria) this;
		}

		public Criteria andSvgidGreaterThanOrEqualTo(Long value) {
			addCriterion("svgid >=", value, "svgid");
			return (Criteria) this;
		}

		public Criteria andSvgidLessThan(Long value) {
			addCriterion("svgid <", value, "svgid");
			return (Criteria) this;
		}

		public Criteria andSvgidLessThanOrEqualTo(Long value) {
			addCriterion("svgid <=", value, "svgid");
			return (Criteria) this;
		}

		public Criteria andSvgidIn(List<Long> values) {
			addCriterion("svgid in", values, "svgid");
			return (Criteria) this;
		}

		public Criteria andSvgidNotIn(List<Long> values) {
			addCriterion("svgid not in", values, "svgid");
			return (Criteria) this;
		}

		public Criteria andSvgidBetween(Long value1, Long value2) {
			addCriterion("svgid between", value1, value2, "svgid");
			return (Criteria) this;
		}

		public Criteria andSvgidNotBetween(Long value1, Long value2) {
			addCriterion("svgid not between", value1, value2, "svgid");
			return (Criteria) this;
		}

		public Criteria andCodeIsNull() {
			addCriterion("code is null");
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

		public Criteria andCodeNotEqualTo(Long value) {
			addCriterion("scode <>", value, "scode");
			return (Criteria) this;
		}

		
		public Criteria andCodeIn(List<Long> values) {
			addCriterion("scode in", values, "scode");
			return (Criteria) this;
		}

		public Criteria andCodeNotIn(List<Long> values) {
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

		public Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
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
			addCriterion("clicknum is null");
			return (Criteria) this;
		}

		public Criteria andClicknumIsNotNull() {
			addCriterion("clicknum is not null");
			return (Criteria) this;
		}

		public Criteria andClicknumEqualTo(Integer value) {
			addCriterion("clicknum =", value, "clicknum");
			return (Criteria) this;
		}

		public Criteria andClicknumNotEqualTo(Integer value) {
			addCriterion("clicknum <>", value, "clicknum");
			return (Criteria) this;
		}

		public Criteria andClicknumGreaterThan(Integer value) {
			addCriterion("clicknum >", value, "clicknum");
			return (Criteria) this;
		}

		public Criteria andClicknumGreaterThanOrEqualTo(Integer value) {
			addCriterion("clicknum >=", value, "clicknum");
			return (Criteria) this;
		}

		public Criteria andClicknumLessThan(Integer value) {
			addCriterion("clicknum <", value, "clicknum");
			return (Criteria) this;
		}

		public Criteria andClicknumLessThanOrEqualTo(Integer value) {
			addCriterion("clicknum <=", value, "clicknum");
			return (Criteria) this;
		}

		public Criteria andClicknumIn(List<Integer> values) {
			addCriterion("clicknum in", values, "clicknum");
			return (Criteria) this;
		}

		public Criteria andClicknumNotIn(List<Integer> values) {
			addCriterion("clicknum not in", values, "clicknum");
			return (Criteria) this;
		}

		public Criteria andClicknumBetween(Integer value1, Integer value2) {
			addCriterion("clicknum between", value1, value2, "clicknum");
			return (Criteria) this;
		}

		public Criteria andClicknumNotBetween(Integer value1, Integer value2) {
			addCriterion("clicknum not between", value1, value2, "clicknum");
			return (Criteria) this;
		}

		public Criteria andLinkerIsNull() {
			addCriterion("linker is null");
			return (Criteria) this;
		}

		public Criteria andLinkerIsNotNull() {
			addCriterion("linker is not null");
			return (Criteria) this;
		}

		public Criteria andLinkerEqualTo(String value) {
			addCriterion("linker =", value, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerNotEqualTo(String value) {
			addCriterion("linker <>", value, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerGreaterThan(String value) {
			addCriterion("linker >", value, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerGreaterThanOrEqualTo(String value) {
			addCriterion("linker >=", value, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerLessThan(String value) {
			addCriterion("linker <", value, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerLessThanOrEqualTo(String value) {
			addCriterion("linker <=", value, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerLike(String value) {
			addCriterion("linker like", value, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerNotLike(String value) {
			addCriterion("linker not like", value, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerIn(List<String> values) {
			addCriterion("linker in", values, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerNotIn(List<String> values) {
			addCriterion("linker not in", values, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerBetween(String value1, String value2) {
			addCriterion("linker between", value1, value2, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerNotBetween(String value1, String value2) {
			addCriterion("linker not between", value1, value2, "linker");
			return (Criteria) this;
		}

		public Criteria andLinktelIsNull() {
			addCriterion("linktel is null");
			return (Criteria) this;
		}

		public Criteria andLinktelIsNotNull() {
			addCriterion("linktel is not null");
			return (Criteria) this;
		}

		public Criteria andLinktelEqualTo(String value) {
			addCriterion("linktel =", value, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelNotEqualTo(String value) {
			addCriterion("linktel <>", value, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelGreaterThan(String value) {
			addCriterion("linktel >", value, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelGreaterThanOrEqualTo(String value) {
			addCriterion("linktel >=", value, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelLessThan(String value) {
			addCriterion("linktel <", value, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelLessThanOrEqualTo(String value) {
			addCriterion("linktel <=", value, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelLike(String value) {
			addCriterion("linktel like", value, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelNotLike(String value) {
			addCriterion("linktel not like", value, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelIn(List<String> values) {
			addCriterion("linktel in", values, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelNotIn(List<String> values) {
			addCriterion("linktel not in", values, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelBetween(String value1, String value2) {
			addCriterion("linktel between", value1, value2, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelNotBetween(String value1, String value2) {
			addCriterion("linktel not between", value1, value2, "linktel");
			return (Criteria) this;
		}

		public Criteria andStarttimeIsNull() {
			addCriterion("starttime is null");
			return (Criteria) this;
		}

		public Criteria andStarttimeIsNotNull() {
			addCriterion("starttime is not null");
			return (Criteria) this;
		}

		public Criteria andStarttimeEqualTo(Date value) {
			addCriterion("starttime =", value, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeNotEqualTo(Date value) {
			addCriterion("starttime <>", value, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeGreaterThan(Date value) {
			addCriterion("starttime >", value, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
			addCriterion("starttime >=", value, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeLessThan(Date value) {
			addCriterion("starttime <", value, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeLessThanOrEqualTo(Date value) {
			addCriterion("starttime <=", value, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeIn(List<Date> values) {
			addCriterion("starttime in", values, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeNotIn(List<Date> values) {
			addCriterion("starttime not in", values, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeBetween(Date value1, Date value2) {
			addCriterion("starttime between", value1, value2, "starttime");
			return (Criteria) this;
		}

		public Criteria andStarttimeNotBetween(Date value1, Date value2) {
			addCriterion("starttime not between", value1, value2, "starttime");
			return (Criteria) this;
		}

		public Criteria andEndtimeIsNull() {
			addCriterion("endtime is null");
			return (Criteria) this;
		}

		public Criteria andEndtimeIsNotNull() {
			addCriterion("endtime is not null");
			return (Criteria) this;
		}

		public Criteria andEndtimeEqualTo(Date value) {
			addCriterion("endtime =", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeNotEqualTo(Date value) {
			addCriterion("endtime <>", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeGreaterThan(Date value) {
			addCriterion("endtime >", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
			addCriterion("endtime >=", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeLessThan(Date value) {
			addCriterion("endtime <", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeLessThanOrEqualTo(Date value) {
			addCriterion("endtime <=", value, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeIn(List<Date> values) {
			addCriterion("endtime in", values, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeNotIn(List<Date> values) {
			addCriterion("endtime not in", values, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeBetween(Date value1, Date value2) {
			addCriterion("endtime between", value1, value2, "endtime");
			return (Criteria) this;
		}

		public Criteria andEndtimeNotBetween(Date value1, Date value2) {
			addCriterion("endtime not between", value1, value2, "endtime");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNull() {
			addCriterion("remark is null");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNotNull() {
			addCriterion("remark is not null");
			return (Criteria) this;
		}

		public Criteria andRemarkLike(String value) {
			addCriterion("remark like", value, "remark");
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
		
		public Criteria andReleaseEqualTo(String value) {
			addCriterion("isrelease =", value, "isrelease");
			return (Criteria) this;
		}

		
		public Criteria andUsernumIsNull() {
			addCriterion("usernum is null");
			return (Criteria) this;
		}

		public Criteria andUsernumIsNotNull() {
			addCriterion("usernum is not null");
			return (Criteria) this;
		}

		public Criteria andUsernumEqualTo(Integer value) {
			addCriterion("usernum =", value, "usernum");
			return (Criteria) this;
		}

		public Criteria andUsernumNotEqualTo(Integer value) {
			addCriterion("usernum <>", value, "usernum");
			return (Criteria) this;
		}

		
		public Criteria andUsernumIn(List<Integer> values) {
			addCriterion("usernum in", values, "usernum");
			return (Criteria) this;
		}

		public Criteria andUsernumNotIn(List<Integer> values) {
			addCriterion("usernum not in", values, "usernum");
			return (Criteria) this;
		}

		public Criteria andUsernumBetween(Integer value1, Integer value2) {
			addCriterion("usernum between", value1, value2, "usernum");
			return (Criteria) this;
		}

		public Criteria andUsernumNotBetween(Integer value1, Integer value2) {
			addCriterion("usernum not between", value1, value2, "usernum");
			return (Criteria) this;
		}

		public Criteria andOrgnumIsNull() {
			addCriterion("orgnum is null");
			return (Criteria) this;
		}

		public Criteria andOrgnumIsNotNull() {
			addCriterion("orgnum is not null");
			return (Criteria) this;
		}

		public Criteria andOrgnumEqualTo(String value) {
			addCriterion("orgnum =", value, "orgnum");
			return (Criteria) this;
		}

		public Criteria andOrgnumNotEqualTo(String value) {
			addCriterion("orgnum <>", value, "orgnum");
			return (Criteria) this;
		}

		public Criteria andOrgnumGreaterThan(String value) {
			addCriterion("orgnum >", value, "orgnum");
			return (Criteria) this;
		}

		public Criteria andOrgnumGreaterThanOrEqualTo(String value) {
			addCriterion("orgnum >=", value, "orgnum");
			return (Criteria) this;
		}

		public Criteria andOrgnumLessThan(String value) {
			addCriterion("orgnum <", value, "orgnum");
			return (Criteria) this;
		}

		public Criteria andOrgnumLessThanOrEqualTo(String value) {
			addCriterion("orgnum <=", value, "orgnum");
			return (Criteria) this;
		}

		public Criteria andOrgnumBetween(String value1, String value2) {
			addCriterion("orgnum between", value1, value2, "orgnum");
			return (Criteria) this;
		}

		public Criteria andOrgnumNotBetween(String value1, String value2) {
			addCriterion("orgnum not between", value1, value2, "orgnum");
			return (Criteria) this;
		}

		public Criteria andProvinceIsNull() {
			addCriterion("province is null");
			return (Criteria) this;
		}

		public Criteria andProvinceIsNotNull() {
			addCriterion("province is not null");
			return (Criteria) this;
		}

		public Criteria andProvinceEqualTo(String value) {
			addCriterion("province =", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceNotEqualTo(String value) {
			addCriterion("province <>", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceGreaterThan(String value) {
			addCriterion("province >", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceGreaterThanOrEqualTo(String value) {
			addCriterion("province >=", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceLessThan(String value) {
			addCriterion("province <", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceLessThanOrEqualTo(String value) {
			addCriterion("province <=", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceLike(String value) {
			addCriterion("province like", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceNotLike(String value) {
			addCriterion("province not like", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceIn(List<String> values) {
			addCriterion("province in", values, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceNotIn(List<String> values) {
			addCriterion("province not in", values, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceBetween(String value1, String value2) {
			addCriterion("province between", value1, value2, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceNotBetween(String value1, String value2) {
			addCriterion("province not between", value1, value2, "province");
			return (Criteria) this;
		}

		public Criteria andCityIsNull() {
			addCriterion("city is null");
			return (Criteria) this;
		}

		public Criteria andCityIsNotNull() {
			addCriterion("city is not null");
			return (Criteria) this;
		}

		public Criteria andCityEqualTo(String value) {
			addCriterion("city =", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotEqualTo(String value) {
			addCriterion("city <>", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityGreaterThan(String value) {
			addCriterion("city >", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityGreaterThanOrEqualTo(String value) {
			addCriterion("city >=", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityLessThan(String value) {
			addCriterion("city <", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityLessThanOrEqualTo(String value) {
			addCriterion("city <=", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityLike(String value) {
			addCriterion("city like", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotLike(String value) {
			addCriterion("city not like", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityIn(List<String> values) {
			addCriterion("city in", values, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotIn(List<String> values) {
			addCriterion("city not in", values, "city");
			return (Criteria) this;
		}

		public Criteria andCityBetween(String value1, String value2) {
			addCriterion("city between", value1, value2, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotBetween(String value1, String value2) {
			addCriterion("city not between", value1, value2, "city");
			return (Criteria) this;
		}

		public Criteria andAreaIsNull() {
			addCriterion("area is null");
			return (Criteria) this;
		}

		public Criteria andAreaIsNotNull() {
			addCriterion("area is not null");
			return (Criteria) this;
		}

		public Criteria andAreaEqualTo(String value) {
			addCriterion("area =", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotEqualTo(String value) {
			addCriterion("area <>", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaGreaterThan(String value) {
			addCriterion("area >", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaGreaterThanOrEqualTo(String value) {
			addCriterion("area >=", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaLessThan(String value) {
			addCriterion("area <", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaLessThanOrEqualTo(String value) {
			addCriterion("area <=", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaLike(String value) {
			addCriterion("area like", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotLike(String value) {
			addCriterion("area not like", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaIn(List<String> values) {
			addCriterion("area in", values, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotIn(List<String> values) {
			addCriterion("area not in", values, "area");
			return (Criteria) this;
		}

		public Criteria andAreaBetween(String value1, String value2) {
			addCriterion("area between", value1, value2, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotBetween(String value1, String value2) {
			addCriterion("area not between", value1, value2, "area");
			return (Criteria) this;
		}

		public Criteria andAddressIsNull() {
			addCriterion("address is null");
			return (Criteria) this;
		}

		public Criteria andAddressIsNotNull() {
			addCriterion("address is not null");
			return (Criteria) this;
		}

		public Criteria andAddressEqualTo(String value) {
			addCriterion("address =", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotEqualTo(String value) {
			addCriterion("address <>", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThan(String value) {
			addCriterion("address >", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThanOrEqualTo(String value) {
			addCriterion("address >=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThan(String value) {
			addCriterion("address <", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThanOrEqualTo(String value) {
			addCriterion("address <=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLike(String value) {
			addCriterion("address like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotLike(String value) {
			addCriterion("address not like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressIn(List<String> values) {
			addCriterion("address in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotIn(List<String> values) {
			addCriterion("address not in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressBetween(String value1, String value2) {
			addCriterion("address between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotBetween(String value1, String value2) {
			addCriterion("address not between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andUndertakeIsNull() {
			addCriterion("undertake is null");
			return (Criteria) this;
		}

		public Criteria andUndertakeIsNotNull() {
			addCriterion("undertake is not null");
			return (Criteria) this;
		}

		public Criteria andUndertakeEqualTo(Long value) {
			addCriterion("undertake =", value, "undertake");
			return (Criteria) this;
		}

		public Criteria andUndertakeNotEqualTo(Long value) {
			addCriterion("undertake <>", value, "undertake");
			return (Criteria) this;
		}

		public Criteria andUndertakeGreaterThan(Long value) {
			addCriterion("undertake >", value, "undertake");
			return (Criteria) this;
		}

		public Criteria andUndertakeGreaterThanOrEqualTo(Long value) {
			addCriterion("undertake >=", value, "undertake");
			return (Criteria) this;
		}

		public Criteria andUndertakeLessThan(Long value) {
			addCriterion("undertake <", value, "undertake");
			return (Criteria) this;
		}

		public Criteria andUndertakeLessThanOrEqualTo(Long value) {
			addCriterion("undertake <=", value, "undertake");
			return (Criteria) this;
		}

		public Criteria andUndertakeIn(List<Long> values) {
			addCriterion("undertake in", values, "undertake");
			return (Criteria) this;
		}

		public Criteria andUndertakeNotIn(List<Long> values) {
			addCriterion("undertake not in", values, "undertake");
			return (Criteria) this;
		}

		public Criteria andUndertakeBetween(Long value1, Long value2) {
			addCriterion("undertake between", value1, value2, "undertake");
			return (Criteria) this;
		}

		public Criteria andUndertakeNotBetween(Long value1, Long value2) {
			addCriterion("undertake not between", value1, value2, "undertake");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sme_activity
	 * 
	 * @mbggenerated do_not_delete_during_merge Wed Mar 09 16:29:53 CST 2016
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sme_activity
	 * 
	 * @mbggenerated Wed Mar 09 16:29:53 CST 2016
	 */
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