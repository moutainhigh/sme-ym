package com.gsccs.sme.plat.svg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.sme.plat.bass.BaseExample;

public class SorderTExample extends BaseExample {

	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public SorderTExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_svg_order
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_svg_order
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_svg_order
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_svg_order
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_svg_order
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_svg_order
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_svg_order
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_svg_order
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
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
	 * to the database table sme_svg_order
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_svg_order
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sme_svg_order
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
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

		public Criteria andIdEqualTo(String value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(String value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(String value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(String value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(String value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(String value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLike(String value) {
			addCriterion("id like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotLike(String value) {
			addCriterion("id not like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<String> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<String> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(String value1, String value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(String value1, String value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andSitemidIsNull() {
			addCriterion("sitemid is null");
			return (Criteria) this;
		}

		public Criteria andSitemidIsNotNull() {
			addCriterion("sitemid is not null");
			return (Criteria) this;
		}

		public Criteria andSitemidEqualTo(Long value) {
			addCriterion("sitemid =", value, "sitemid");
			return (Criteria) this;
		}

		public Criteria andSitemidNotEqualTo(Long value) {
			addCriterion("sitemid <>", value, "sitemid");
			return (Criteria) this;
		}

		public Criteria andSitemidGreaterThan(Long value) {
			addCriterion("sitemid >", value, "sitemid");
			return (Criteria) this;
		}

		public Criteria andSitemidGreaterThanOrEqualTo(Long value) {
			addCriterion("sitemid >=", value, "sitemid");
			return (Criteria) this;
		}

		public Criteria andSitemidLessThan(Long value) {
			addCriterion("sitemid <", value, "sitemid");
			return (Criteria) this;
		}

		public Criteria andSitemidLessThanOrEqualTo(Long value) {
			addCriterion("sitemid <=", value, "sitemid");
			return (Criteria) this;
		}

		public Criteria andSitemidIn(List<Long> values) {
			addCriterion("sitemid in", values, "sitemid");
			return (Criteria) this;
		}

		public Criteria andSitemidNotIn(List<Long> values) {
			addCriterion("sitemid not in", values, "sitemid");
			return (Criteria) this;
		}

		public Criteria andSitemidBetween(Long value1, Long value2) {
			addCriterion("sitemid between", value1, value2, "sitemid");
			return (Criteria) this;
		}

		public Criteria andSitemidNotBetween(Long value1, Long value2) {
			addCriterion("sitemid not between", value1, value2, "sitemid");
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

		public Criteria andCorpidNotEqualTo(Long value) {
			addCriterion("corpid <>", value, "corpid");
			return (Criteria) this;
		}

		public Criteria andCorpidGreaterThan(Long value) {
			addCriterion("corpid >", value, "corpid");
			return (Criteria) this;
		}

		public Criteria andCorpidGreaterThanOrEqualTo(Long value) {
			addCriterion("corpid >=", value, "corpid");
			return (Criteria) this;
		}

		public Criteria andCorpidLessThan(Long value) {
			addCriterion("corpid <", value, "corpid");
			return (Criteria) this;
		}

		public Criteria andCorpidLessThanOrEqualTo(Long value) {
			addCriterion("corpid <=", value, "corpid");
			return (Criteria) this;
		}

		public Criteria andCorpidIn(List<Long> values) {
			addCriterion("corpid in", values, "corpid");
			return (Criteria) this;
		}

		public Criteria andCorpidNotIn(List<Long> values) {
			addCriterion("corpid not in", values, "corpid");
			return (Criteria) this;
		}

		public Criteria andCorpidBetween(Long value1, Long value2) {
			addCriterion("corpid between", value1, value2, "corpid");
			return (Criteria) this;
		}

		public Criteria andCorpidNotBetween(Long value1, Long value2) {
			addCriterion("corpid not between", value1, value2, "corpid");
			return (Criteria) this;
		}

		public Criteria andPaytypeIsNull() {
			addCriterion("paytype is null");
			return (Criteria) this;
		}

		public Criteria andPaytypeIsNotNull() {
			addCriterion("paytype is not null");
			return (Criteria) this;
		}

		public Criteria andPaytypeEqualTo(String value) {
			addCriterion("paytype =", value, "paytype");
			return (Criteria) this;
		}

		public Criteria andPaytypeNotEqualTo(String value) {
			addCriterion("paytype <>", value, "paytype");
			return (Criteria) this;
		}

		public Criteria andPaytypeGreaterThan(String value) {
			addCriterion("paytype >", value, "paytype");
			return (Criteria) this;
		}

		public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
			addCriterion("paytype >=", value, "paytype");
			return (Criteria) this;
		}

		public Criteria andPaytypeLessThan(String value) {
			addCriterion("paytype <", value, "paytype");
			return (Criteria) this;
		}

		public Criteria andPaytypeLessThanOrEqualTo(String value) {
			addCriterion("paytype <=", value, "paytype");
			return (Criteria) this;
		}

		public Criteria andPaytypeLike(String value) {
			addCriterion("paytype like", value, "paytype");
			return (Criteria) this;
		}

		public Criteria andPaytypeNotLike(String value) {
			addCriterion("paytype not like", value, "paytype");
			return (Criteria) this;
		}

		public Criteria andPaytypeIn(List<String> values) {
			addCriterion("paytype in", values, "paytype");
			return (Criteria) this;
		}

		public Criteria andPaytypeNotIn(List<String> values) {
			addCriterion("paytype not in", values, "paytype");
			return (Criteria) this;
		}

		public Criteria andPaytypeBetween(String value1, String value2) {
			addCriterion("paytype between", value1, value2, "paytype");
			return (Criteria) this;
		}

		public Criteria andPaytypeNotBetween(String value1, String value2) {
			addCriterion("paytype not between", value1, value2, "paytype");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNull() {
			addCriterion("phone is null");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNotNull() {
			addCriterion("phone is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneEqualTo(String value) {
			addCriterion("phone =", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotEqualTo(String value) {
			addCriterion("phone <>", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThan(String value) {
			addCriterion("phone >", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("phone >=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThan(String value) {
			addCriterion("phone <", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThanOrEqualTo(String value) {
			addCriterion("phone <=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLike(String value) {
			addCriterion("phone like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotLike(String value) {
			addCriterion("phone not like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneIn(List<String> values) {
			addCriterion("phone in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotIn(List<String> values) {
			addCriterion("phone not in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneBetween(String value1, String value2) {
			addCriterion("phone between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotBetween(String value1, String value2) {
			addCriterion("phone not between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andOrdertypeIsNull() {
			addCriterion("ordertype is null");
			return (Criteria) this;
		}

		public Criteria andOrdertypeIsNotNull() {
			addCriterion("ordertype is not null");
			return (Criteria) this;
		}

		public Criteria andOrdertypeEqualTo(String value) {
			addCriterion("ordertype =", value, "ordertype");
			return (Criteria) this;
		}

		public Criteria andOrdertypeNotEqualTo(String value) {
			addCriterion("ordertype <>", value, "ordertype");
			return (Criteria) this;
		}

		public Criteria andOrdertypeGreaterThan(String value) {
			addCriterion("ordertype >", value, "ordertype");
			return (Criteria) this;
		}

		public Criteria andOrdertypeGreaterThanOrEqualTo(String value) {
			addCriterion("ordertype >=", value, "ordertype");
			return (Criteria) this;
		}

		public Criteria andOrdertypeLessThan(String value) {
			addCriterion("ordertype <", value, "ordertype");
			return (Criteria) this;
		}

		public Criteria andOrdertypeLessThanOrEqualTo(String value) {
			addCriterion("ordertype <=", value, "ordertype");
			return (Criteria) this;
		}

		public Criteria andOrdertypeLike(String value) {
			addCriterion("ordertype like", value, "ordertype");
			return (Criteria) this;
		}

		public Criteria andOrdertypeNotLike(String value) {
			addCriterion("ordertype not like", value, "ordertype");
			return (Criteria) this;
		}

		public Criteria andOrdertypeIn(List<String> values) {
			addCriterion("ordertype in", values, "ordertype");
			return (Criteria) this;
		}

		public Criteria andOrdertypeNotIn(List<String> values) {
			addCriterion("ordertype not in", values, "ordertype");
			return (Criteria) this;
		}

		public Criteria andOrdertypeBetween(String value1, String value2) {
			addCriterion("ordertype between", value1, value2, "ordertype");
			return (Criteria) this;
		}

		public Criteria andOrdertypeNotBetween(String value1, String value2) {
			addCriterion("ordertype not between", value1, value2, "ordertype");
			return (Criteria) this;
		}

		public Criteria andTotalfeeIsNull() {
			addCriterion("totalfee is null");
			return (Criteria) this;
		}

		public Criteria andTotalfeeIsNotNull() {
			addCriterion("totalfee is not null");
			return (Criteria) this;
		}

		public Criteria andTotalfeeEqualTo(BigDecimal value) {
			addCriterion("totalfee =", value, "totalfee");
			return (Criteria) this;
		}

		public Criteria andTotalfeeNotEqualTo(BigDecimal value) {
			addCriterion("totalfee <>", value, "totalfee");
			return (Criteria) this;
		}

		public Criteria andTotalfeeGreaterThan(BigDecimal value) {
			addCriterion("totalfee >", value, "totalfee");
			return (Criteria) this;
		}

		public Criteria andTotalfeeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("totalfee >=", value, "totalfee");
			return (Criteria) this;
		}

		public Criteria andTotalfeeLessThan(BigDecimal value) {
			addCriterion("totalfee <", value, "totalfee");
			return (Criteria) this;
		}

		public Criteria andTotalfeeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("totalfee <=", value, "totalfee");
			return (Criteria) this;
		}

		public Criteria andTotalfeeIn(List<BigDecimal> values) {
			addCriterion("totalfee in", values, "totalfee");
			return (Criteria) this;
		}

		public Criteria andTotalfeeNotIn(List<BigDecimal> values) {
			addCriterion("totalfee not in", values, "totalfee");
			return (Criteria) this;
		}

		public Criteria andTotalfeeBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("totalfee between", value1, value2, "totalfee");
			return (Criteria) this;
		}

		public Criteria andTotalfeeNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("totalfee not between", value1, value2, "totalfee");
			return (Criteria) this;
		}

		public Criteria andPayfeeIsNull() {
			addCriterion("payfee is null");
			return (Criteria) this;
		}

		public Criteria andPayfeeIsNotNull() {
			addCriterion("payfee is not null");
			return (Criteria) this;
		}

		public Criteria andPayfeeEqualTo(BigDecimal value) {
			addCriterion("payfee =", value, "payfee");
			return (Criteria) this;
		}

		public Criteria andPayfeeNotEqualTo(BigDecimal value) {
			addCriterion("payfee <>", value, "payfee");
			return (Criteria) this;
		}

		public Criteria andPayfeeGreaterThan(BigDecimal value) {
			addCriterion("payfee >", value, "payfee");
			return (Criteria) this;
		}

		public Criteria andPayfeeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("payfee >=", value, "payfee");
			return (Criteria) this;
		}

		public Criteria andPayfeeLessThan(BigDecimal value) {
			addCriterion("payfee <", value, "payfee");
			return (Criteria) this;
		}

		public Criteria andPayfeeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("payfee <=", value, "payfee");
			return (Criteria) this;
		}

		public Criteria andPayfeeIn(List<BigDecimal> values) {
			addCriterion("payfee in", values, "payfee");
			return (Criteria) this;
		}

		public Criteria andPayfeeNotIn(List<BigDecimal> values) {
			addCriterion("payfee not in", values, "payfee");
			return (Criteria) this;
		}

		public Criteria andPayfeeBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("payfee between", value1, value2, "payfee");
			return (Criteria) this;
		}

		public Criteria andPayfeeNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("payfee not between", value1, value2, "payfee");
			return (Criteria) this;
		}

		public Criteria andTotalnumIsNull() {
			addCriterion("totalnum is null");
			return (Criteria) this;
		}

		public Criteria andTotalnumIsNotNull() {
			addCriterion("totalnum is not null");
			return (Criteria) this;
		}

		public Criteria andTotalnumEqualTo(Integer value) {
			addCriterion("totalnum =", value, "totalnum");
			return (Criteria) this;
		}

		public Criteria andTotalnumNotEqualTo(Integer value) {
			addCriterion("totalnum <>", value, "totalnum");
			return (Criteria) this;
		}

		public Criteria andTotalnumGreaterThan(Integer value) {
			addCriterion("totalnum >", value, "totalnum");
			return (Criteria) this;
		}

		public Criteria andTotalnumGreaterThanOrEqualTo(Integer value) {
			addCriterion("totalnum >=", value, "totalnum");
			return (Criteria) this;
		}

		public Criteria andTotalnumLessThan(Integer value) {
			addCriterion("totalnum <", value, "totalnum");
			return (Criteria) this;
		}

		public Criteria andTotalnumLessThanOrEqualTo(Integer value) {
			addCriterion("totalnum <=", value, "totalnum");
			return (Criteria) this;
		}

		public Criteria andTotalnumIn(List<Integer> values) {
			addCriterion("totalnum in", values, "totalnum");
			return (Criteria) this;
		}

		public Criteria andTotalnumNotIn(List<Integer> values) {
			addCriterion("totalnum not in", values, "totalnum");
			return (Criteria) this;
		}

		public Criteria andTotalnumBetween(Integer value1, Integer value2) {
			addCriterion("totalnum between", value1, value2, "totalnum");
			return (Criteria) this;
		}

		public Criteria andTotalnumNotBetween(Integer value1, Integer value2) {
			addCriterion("totalnum not between", value1, value2, "totalnum");
			return (Criteria) this;
		}

		public Criteria andPlatsourceIsNull() {
			addCriterion("platsource is null");
			return (Criteria) this;
		}

		public Criteria andPlatsourceIsNotNull() {
			addCriterion("platsource is not null");
			return (Criteria) this;
		}

		public Criteria andPlatsourceEqualTo(String value) {
			addCriterion("platsource =", value, "platsource");
			return (Criteria) this;
		}

		public Criteria andPlatsourceNotEqualTo(String value) {
			addCriterion("platsource <>", value, "platsource");
			return (Criteria) this;
		}

		public Criteria andPlatsourceGreaterThan(String value) {
			addCriterion("platsource >", value, "platsource");
			return (Criteria) this;
		}

		public Criteria andPlatsourceGreaterThanOrEqualTo(String value) {
			addCriterion("platsource >=", value, "platsource");
			return (Criteria) this;
		}

		public Criteria andPlatsourceLessThan(String value) {
			addCriterion("platsource <", value, "platsource");
			return (Criteria) this;
		}

		public Criteria andPlatsourceLessThanOrEqualTo(String value) {
			addCriterion("platsource <=", value, "platsource");
			return (Criteria) this;
		}

		public Criteria andPlatsourceLike(String value) {
			addCriterion("platsource like", value, "platsource");
			return (Criteria) this;
		}

		public Criteria andPlatsourceNotLike(String value) {
			addCriterion("platsource not like", value, "platsource");
			return (Criteria) this;
		}

		public Criteria andPlatsourceIn(List<String> values) {
			addCriterion("platsource in", values, "platsource");
			return (Criteria) this;
		}

		public Criteria andPlatsourceNotIn(List<String> values) {
			addCriterion("platsource not in", values, "platsource");
			return (Criteria) this;
		}

		public Criteria andPlatsourceBetween(String value1, String value2) {
			addCriterion("platsource between", value1, value2, "platsource");
			return (Criteria) this;
		}

		public Criteria andPlatsourceNotBetween(String value1, String value2) {
			addCriterion("platsource not between", value1, value2, "platsource");
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

		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
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

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sme_svg_order
	 * 
	 * @mbggenerated do_not_delete_during_merge Mon Mar 07 11:03:45 CST 2016
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sme_svg_order
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
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