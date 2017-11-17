package com.gsccs.sme.plat.site.model;

import java.util.ArrayList;
import java.util.List;

public class ChanelTExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ChanelTExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_info_channel
	 * 
	 * @mbggenerated Thu Mar 10 17:51:32 CST 2016
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
	 * to the database table sme_info_channel
	 * 
	 * @mbggenerated Thu Mar 10 17:51:32 CST 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_info_channel
	 * 
	 * @mbggenerated Thu Mar 10 17:51:32 CST 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sme_info_channel
	 * 
	 * @mbggenerated Thu Mar 10 17:51:32 CST 2016
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

		public Criteria andParidIsNull() {
			addCriterion("parid is null");
			return (Criteria) this;
		}

		public Criteria andParidIsNotNull() {
			addCriterion("parid is not null");
			return (Criteria) this;
		}

		public Criteria andParidEqualTo(Long value) {
			addCriterion("parid =", value, "parid");
			return (Criteria) this;
		}

		public Criteria andParidNotEqualTo(Long value) {
			addCriterion("parid <>", value, "parid");
			return (Criteria) this;
		}

		public Criteria andParidGreaterThan(Long value) {
			addCriterion("parid >", value, "parid");
			return (Criteria) this;
		}

		public Criteria andParidGreaterThanOrEqualTo(Long value) {
			addCriterion("parid >=", value, "parid");
			return (Criteria) this;
		}

		public Criteria andParidLessThan(Long value) {
			addCriterion("parid <", value, "parid");
			return (Criteria) this;
		}

		public Criteria andParidLessThanOrEqualTo(Long value) {
			addCriterion("parid <=", value, "parid");
			return (Criteria) this;
		}

		public Criteria andParidIn(List<Long> values) {
			addCriterion("parid in", values, "parid");
			return (Criteria) this;
		}

		public Criteria andParidNotIn(List<Long> values) {
			addCriterion("parid not in", values, "parid");
			return (Criteria) this;
		}

		public Criteria andParidBetween(Long value1, Long value2) {
			addCriterion("parid between", value1, value2, "parid");
			return (Criteria) this;
		}

		public Criteria andParidNotBetween(Long value1, Long value2) {
			addCriterion("parid not between", value1, value2, "parid");
			return (Criteria) this;
		}

		public Criteria andParidsIsNull() {
			addCriterion("parids is null");
			return (Criteria) this;
		}

		public Criteria andParidsIsNotNull() {
			addCriterion("parids is not null");
			return (Criteria) this;
		}

		public Criteria andParidsEqualTo(String value) {
			addCriterion("parids =", value, "parids");
			return (Criteria) this;
		}

		public Criteria andParidsNotEqualTo(String value) {
			addCriterion("parids <>", value, "parids");
			return (Criteria) this;
		}

		public Criteria andParidsGreaterThan(String value) {
			addCriterion("parids >", value, "parids");
			return (Criteria) this;
		}

		public Criteria andParidsGreaterThanOrEqualTo(String value) {
			addCriterion("parids >=", value, "parids");
			return (Criteria) this;
		}

		public Criteria andParidsLessThan(String value) {
			addCriterion("parids <", value, "parids");
			return (Criteria) this;
		}

		public Criteria andParidsLessThanOrEqualTo(String value) {
			addCriterion("parids <=", value, "parids");
			return (Criteria) this;
		}

		public Criteria andParidsLike(String value) {
			addCriterion("parids like", value, "parids");
			return (Criteria) this;
		}

		public Criteria andParidsNotLike(String value) {
			addCriterion("parids not like", value, "parids");
			return (Criteria) this;
		}

		public Criteria andParidsIn(List<String> values) {
			addCriterion("parids in", values, "parids");
			return (Criteria) this;
		}

		public Criteria andParidsNotIn(List<String> values) {
			addCriterion("parids not in", values, "parids");
			return (Criteria) this;
		}

		public Criteria andParidsBetween(String value1, String value2) {
			addCriterion("parids between", value1, value2, "parids");
			return (Criteria) this;
		}

		public Criteria andParidsNotBetween(String value1, String value2) {
			addCriterion("parids not between", value1, value2, "parids");
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

		public Criteria andLogoIsNull() {
			addCriterion("logo is null");
			return (Criteria) this;
		}

		public Criteria andLogoIsNotNull() {
			addCriterion("logo is not null");
			return (Criteria) this;
		}

		public Criteria andLogoEqualTo(String value) {
			addCriterion("logo =", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoNotEqualTo(String value) {
			addCriterion("logo <>", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoLike(String value) {
			addCriterion("logo like", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoNotLike(String value) {
			addCriterion("logo not like", value, "logo");
			return (Criteria) this;
		}


		public Criteria andTempletIsNull() {
			addCriterion("templet is null");
			return (Criteria) this;
		}

		public Criteria andTempletIsNotNull() {
			addCriterion("templet is not null");
			return (Criteria) this;
		}

		public Criteria andTempletEqualTo(String value) {
			addCriterion("templet =", value, "templet");
			return (Criteria) this;
		}

		public Criteria andTempletNotEqualTo(String value) {
			addCriterion("templet <>", value, "templet");
			return (Criteria) this;
		}

		public Criteria andTempletLike(String value) {
			addCriterion("templet like", value, "templet");
			return (Criteria) this;
		}

		public Criteria andTempletNotLike(String value) {
			addCriterion("templet not like", value, "templet");
			return (Criteria) this;
		}


		public Criteria andSiteIsNull() {
			addCriterion("site is null");
			return (Criteria) this;
		}

		public Criteria andSiteIsNotNull() {
			addCriterion("site is not null");
			return (Criteria) this;
		}

		public Criteria andSiteEqualTo(String value) {
			addCriterion("site =", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteNotEqualTo(String value) {
			addCriterion("site <>", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteGreaterThan(String value) {
			addCriterion("site >", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteGreaterThanOrEqualTo(String value) {
			addCriterion("site >=", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteLessThan(String value) {
			addCriterion("site <", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteLessThanOrEqualTo(String value) {
			addCriterion("site <=", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteLike(String value) {
			addCriterion("site like", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteNotLike(String value) {
			addCriterion("site not like", value, "site");
			return (Criteria) this;
		}

		public Criteria andSiteIn(List<String> values) {
			addCriterion("site in", values, "site");
			return (Criteria) this;
		}

		public Criteria andSiteNotIn(List<String> values) {
			addCriterion("site not in", values, "site");
			return (Criteria) this;
		}

		public Criteria andSiteBetween(String value1, String value2) {
			addCriterion("site between", value1, value2, "site");
			return (Criteria) this;
		}

		public Criteria andSiteNotBetween(String value1, String value2) {
			addCriterion("site not between", value1, value2, "site");
			return (Criteria) this;
		}

		public Criteria andUrlIsNull() {
			addCriterion("url is null");
			return (Criteria) this;
		}

		public Criteria andUrlIsNotNull() {
			addCriterion("url is not null");
			return (Criteria) this;
		}

		public Criteria andUrlEqualTo(String value) {
			addCriterion("url =", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotEqualTo(String value) {
			addCriterion("url <>", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlGreaterThan(String value) {
			addCriterion("url >", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLike(String value) {
			addCriterion("url like", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotLike(String value) {
			addCriterion("url not like", value, "url");
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


		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
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

		public Criteria andPagemarkIsNull() {
			addCriterion("pagemark is null");
			return (Criteria) this;
		}

		public Criteria andPagemarkIsNotNull() {
			addCriterion("pagemark is not null");
			return (Criteria) this;
		}

		public Criteria andPagemarkEqualTo(String value) {
			addCriterion("pagemark =", value, "pagemark");
			return (Criteria) this;
		}

		public Criteria andPagemarkNotEqualTo(String value) {
			addCriterion("pagemark <>", value, "pagemark");
			return (Criteria) this;
		}

		public Criteria andPagemarkGreaterThan(String value) {
			addCriterion("pagemark >", value, "pagemark");
			return (Criteria) this;
		}

		public Criteria andPagemarkGreaterThanOrEqualTo(String value) {
			addCriterion("pagemark >=", value, "pagemark");
			return (Criteria) this;
		}

		public Criteria andPagemarkLessThan(String value) {
			addCriterion("pagemark <", value, "pagemark");
			return (Criteria) this;
		}

		public Criteria andPagemarkLessThanOrEqualTo(String value) {
			addCriterion("pagemark <=", value, "pagemark");
			return (Criteria) this;
		}

		public Criteria andPagemarkLike(String value) {
			addCriterion("pagemark like", value, "pagemark");
			return (Criteria) this;
		}

		public Criteria andPagemarkNotLike(String value) {
			addCriterion("pagemark not like", value, "pagemark");
			return (Criteria) this;
		}

		public Criteria andPagemarkIn(List<String> values) {
			addCriterion("pagemark in", values, "pagemark");
			return (Criteria) this;
		}

		public Criteria andPagemarkNotIn(List<String> values) {
			addCriterion("pagemark not in", values, "pagemark");
			return (Criteria) this;
		}

		public Criteria andPagemarkBetween(String value1, String value2) {
			addCriterion("pagemark between", value1, value2, "pagemark");
			return (Criteria) this;
		}

		public Criteria andPagemarkNotBetween(String value1, String value2) {
			addCriterion("pagemark not between", value1, value2, "pagemark");
			return (Criteria) this;
		}

		public Criteria andIndexnumIsNull() {
			addCriterion("indexnum is null");
			return (Criteria) this;
		}

		public Criteria andIndexnumIsNotNull() {
			addCriterion("indexnum is not null");
			return (Criteria) this;
		}

		public Criteria andIndexnumEqualTo(Integer value) {
			addCriterion("indexnum =", value, "indexnum");
			return (Criteria) this;
		}

		public Criteria andIndexnumNotEqualTo(Integer value) {
			addCriterion("indexnum <>", value, "indexnum");
			return (Criteria) this;
		}

		public Criteria andIndexnumGreaterThan(Integer value) {
			addCriterion("indexnum >", value, "indexnum");
			return (Criteria) this;
		}

		public Criteria andIndexnumGreaterThanOrEqualTo(Integer value) {
			addCriterion("indexnum >=", value, "indexnum");
			return (Criteria) this;
		}

		public Criteria andIndexnumLessThan(Integer value) {
			addCriterion("indexnum <", value, "indexnum");
			return (Criteria) this;
		}

		public Criteria andIndexnumLessThanOrEqualTo(Integer value) {
			addCriterion("indexnum <=", value, "indexnum");
			return (Criteria) this;
		}

		public Criteria andIndexnumIn(List<Integer> values) {
			addCriterion("indexnum in", values, "indexnum");
			return (Criteria) this;
		}

		public Criteria andIndexnumNotIn(List<Integer> values) {
			addCriterion("indexnum not in", values, "indexnum");
			return (Criteria) this;
		}

		public Criteria andIndexnumBetween(Integer value1, Integer value2) {
			addCriterion("indexnum between", value1, value2, "indexnum");
			return (Criteria) this;
		}

		public Criteria andIndexnumNotBetween(Integer value1, Integer value2) {
			addCriterion("indexnum not between", value1, value2, "indexnum");
			return (Criteria) this;
		}

		public Criteria andMetaTitleIsNull() {
			addCriterion("meta_title is null");
			return (Criteria) this;
		}

		public Criteria andMetaTitleIsNotNull() {
			addCriterion("meta_title is not null");
			return (Criteria) this;
		}

		public Criteria andMetaTitleEqualTo(String value) {
			addCriterion("meta_title =", value, "metaTitle");
			return (Criteria) this;
		}

		public Criteria andMetaTitleNotEqualTo(String value) {
			addCriterion("meta_title <>", value, "metaTitle");
			return (Criteria) this;
		}

		public Criteria andMetaTitleGreaterThan(String value) {
			addCriterion("meta_title >", value, "metaTitle");
			return (Criteria) this;
		}

		public Criteria andMetaTitleGreaterThanOrEqualTo(String value) {
			addCriterion("meta_title >=", value, "metaTitle");
			return (Criteria) this;
		}

		public Criteria andMetaTitleLessThan(String value) {
			addCriterion("meta_title <", value, "metaTitle");
			return (Criteria) this;
		}

		public Criteria andMetaTitleLessThanOrEqualTo(String value) {
			addCriterion("meta_title <=", value, "metaTitle");
			return (Criteria) this;
		}

		public Criteria andMetaTitleLike(String value) {
			addCriterion("meta_title like", value, "metaTitle");
			return (Criteria) this;
		}

		public Criteria andMetaTitleNotLike(String value) {
			addCriterion("meta_title not like", value, "metaTitle");
			return (Criteria) this;
		}

		public Criteria andMetaTitleIn(List<String> values) {
			addCriterion("meta_title in", values, "metaTitle");
			return (Criteria) this;
		}

		public Criteria andMetaTitleNotIn(List<String> values) {
			addCriterion("meta_title not in", values, "metaTitle");
			return (Criteria) this;
		}

		public Criteria andMetaTitleBetween(String value1, String value2) {
			addCriterion("meta_title between", value1, value2, "metaTitle");
			return (Criteria) this;
		}

		public Criteria andMetaTitleNotBetween(String value1, String value2) {
			addCriterion("meta_title not between", value1, value2, "metaTitle");
			return (Criteria) this;
		}

		public Criteria andMetaKeywordsIsNull() {
			addCriterion("meta_keywords is null");
			return (Criteria) this;
		}

		public Criteria andMetaKeywordsIsNotNull() {
			addCriterion("meta_keywords is not null");
			return (Criteria) this;
		}

		public Criteria andMetaKeywordsEqualTo(String value) {
			addCriterion("meta_keywords =", value, "metaKeywords");
			return (Criteria) this;
		}

		public Criteria andMetaKeywordsNotEqualTo(String value) {
			addCriterion("meta_keywords <>", value, "metaKeywords");
			return (Criteria) this;
		}

		public Criteria andMetaKeywordsGreaterThan(String value) {
			addCriterion("meta_keywords >", value, "metaKeywords");
			return (Criteria) this;
		}

		public Criteria andMetaKeywordsGreaterThanOrEqualTo(String value) {
			addCriterion("meta_keywords >=", value, "metaKeywords");
			return (Criteria) this;
		}

		public Criteria andMetaKeywordsLessThan(String value) {
			addCriterion("meta_keywords <", value, "metaKeywords");
			return (Criteria) this;
		}

		public Criteria andMetaKeywordsLessThanOrEqualTo(String value) {
			addCriterion("meta_keywords <=", value, "metaKeywords");
			return (Criteria) this;
		}

		public Criteria andMetaKeywordsLike(String value) {
			addCriterion("meta_keywords like", value, "metaKeywords");
			return (Criteria) this;
		}

		public Criteria andMetaKeywordsNotLike(String value) {
			addCriterion("meta_keywords not like", value, "metaKeywords");
			return (Criteria) this;
		}

		public Criteria andMetaKeywordsIn(List<String> values) {
			addCriterion("meta_keywords in", values, "metaKeywords");
			return (Criteria) this;
		}

		public Criteria andMetaKeywordsNotIn(List<String> values) {
			addCriterion("meta_keywords not in", values, "metaKeywords");
			return (Criteria) this;
		}

		public Criteria andMetaKeywordsBetween(String value1, String value2) {
			addCriterion("meta_keywords between", value1, value2,
					"metaKeywords");
			return (Criteria) this;
		}

		public Criteria andMetaKeywordsNotBetween(String value1, String value2) {
			addCriterion("meta_keywords not between", value1, value2,
					"metaKeywords");
			return (Criteria) this;
		}

		public Criteria andMetaDescrIsNull() {
			addCriterion("meta_descr is null");
			return (Criteria) this;
		}

		public Criteria andMetaDescrIsNotNull() {
			addCriterion("meta_descr is not null");
			return (Criteria) this;
		}

		public Criteria andMetaDescrEqualTo(String value) {
			addCriterion("meta_descr =", value, "metaDescr");
			return (Criteria) this;
		}

		public Criteria andMetaDescrNotEqualTo(String value) {
			addCriterion("meta_descr <>", value, "metaDescr");
			return (Criteria) this;
		}

		public Criteria andMetaDescrGreaterThan(String value) {
			addCriterion("meta_descr >", value, "metaDescr");
			return (Criteria) this;
		}

		public Criteria andMetaDescrGreaterThanOrEqualTo(String value) {
			addCriterion("meta_descr >=", value, "metaDescr");
			return (Criteria) this;
		}

		public Criteria andMetaDescrLessThan(String value) {
			addCriterion("meta_descr <", value, "metaDescr");
			return (Criteria) this;
		}

		public Criteria andMetaDescrLessThanOrEqualTo(String value) {
			addCriterion("meta_descr <=", value, "metaDescr");
			return (Criteria) this;
		}

		public Criteria andMetaDescrLike(String value) {
			addCriterion("meta_descr like", value, "metaDescr");
			return (Criteria) this;
		}

		public Criteria andMetaDescrNotLike(String value) {
			addCriterion("meta_descr not like", value, "metaDescr");
			return (Criteria) this;
		}

		public Criteria andMetaDescrIn(List<String> values) {
			addCriterion("meta_descr in", values, "metaDescr");
			return (Criteria) this;
		}

		public Criteria andMetaDescrNotIn(List<String> values) {
			addCriterion("meta_descr not in", values, "metaDescr");
			return (Criteria) this;
		}

		public Criteria andMetaDescrBetween(String value1, String value2) {
			addCriterion("meta_descr between", value1, value2, "metaDescr");
			return (Criteria) this;
		}

		public Criteria andMetaDescrNotBetween(String value1, String value2) {
			addCriterion("meta_descr not between", value1, value2, "metaDescr");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sme_info_channel
	 * 
	 * @mbggenerated do_not_delete_during_merge Thu Mar 10 17:51:32 CST 2016
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sme_info_channel
	 * 
	 * @mbggenerated Thu Mar 10 17:51:32 CST 2016
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