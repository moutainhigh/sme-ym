package com.gsccs.sme.plat.svg.model;

import java.util.ArrayList;
import java.util.List;

public class DeclareAttachTExample {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table sme_declare_attach
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	protected String orderByClause;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table sme_declare_attach
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	protected boolean distinct;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table sme_declare_attach
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_declare_attach
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	public DeclareAttachTExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_declare_attach
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_declare_attach
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_declare_attach
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_declare_attach
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_declare_attach
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_declare_attach
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_declare_attach
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
	 * to the database table sme_declare_attach
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
	 * to the database table sme_declare_attach
	 * 
	 * @mbggenerated Mon Mar 07 11:03:45 CST 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_declare_attach
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
	 * the database table sme_declare_attach
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

		public Criteria andTopicidIsNull() {
			addCriterion("topicid is null");
			return (Criteria) this;
		}

		public Criteria andTopicidIsNotNull() {
			addCriterion("topicid is not null");
			return (Criteria) this;
		}

		public Criteria andTopicidEqualTo(Long value) {
			addCriterion("topicid =", value, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicidNotEqualTo(Long value) {
			addCriterion("topicid <>", value, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicidGreaterThan(Long value) {
			addCriterion("topicid >", value, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicidGreaterThanOrEqualTo(Long value) {
			addCriterion("topicid >=", value, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicidLessThan(Long value) {
			addCriterion("topicid <", value, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicidLessThanOrEqualTo(Long value) {
			addCriterion("topicid <=", value, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicidIn(List<Long> values) {
			addCriterion("topicid in", values, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicidNotIn(List<Long> values) {
			addCriterion("topicid not in", values, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicidBetween(Long value1, Long value2) {
			addCriterion("topicid between", value1, value2, "topicid");
			return (Criteria) this;
		}

		public Criteria andTopicidNotBetween(Long value1, Long value2) {
			addCriterion("topicid not between", value1, value2, "topicid");
			return (Criteria) this;
		}

		public Criteria andItemidIsNull() {
			addCriterion("itemid is null");
			return (Criteria) this;
		}

		public Criteria andItemidIsNotNull() {
			addCriterion("itemid is not null");
			return (Criteria) this;
		}

		public Criteria andItemidEqualTo(Long value) {
			addCriterion("itemid =", value, "itemid");
			return (Criteria) this;
		}

		public Criteria andItemidNotEqualTo(Long value) {
			addCriterion("itemid <>", value, "itemid");
			return (Criteria) this;
		}

		public Criteria andItemidIn(List<Long> values) {
			addCriterion("itemid in", values, "itemid");
			return (Criteria) this;
		}

		public Criteria andItemidNotIn(List<Long> values) {
			addCriterion("itemid not in", values, "itemid");
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

		public Criteria andCorpidIn(List<Long> values) {
			addCriterion("corpid in", values, "corpid");
			return (Criteria) this;
		}

		public Criteria andCorpidNotIn(List<Long> values) {
			addCriterion("corpid not in", values, "corpid");
			return (Criteria) this;
		}

		public Criteria andFilenameIsNull() {
			addCriterion("filename is null");
			return (Criteria) this;
		}

		public Criteria andFilenameIsNotNull() {
			addCriterion("filename is not null");
			return (Criteria) this;
		}

		public Criteria andFilenameEqualTo(String value) {
			addCriterion("filename =", value, "filename");
			return (Criteria) this;
		}

		public Criteria andFilenameNotEqualTo(String value) {
			addCriterion("filename <>", value, "filename");
			return (Criteria) this;
		}

		public Criteria andFilenameLike(String value) {
			addCriterion("filename like", value, "filename");
			return (Criteria) this;
		}

		public Criteria andFilenameNotLike(String value) {
			addCriterion("filename not like", value, "filename");
			return (Criteria) this;
		}

		public Criteria andFilepathIsNull() {
			addCriterion("filepath is null");
			return (Criteria) this;
		}

		public Criteria andFilepathIsNotNull() {
			addCriterion("filepath is not null");
			return (Criteria) this;
		}

		public Criteria andFilepathEqualTo(String value) {
			addCriterion("filepath =", value, "filepath");
			return (Criteria) this;
		}

		public Criteria andFilepathNotEqualTo(String value) {
			addCriterion("filepath <>", value, "filepath");
			return (Criteria) this;
		}

		public Criteria andFilepathLike(String value) {
			addCriterion("filepath like", value, "filepath");
			return (Criteria) this;
		}

		public Criteria andFilepathNotLike(String value) {
			addCriterion("filepath not like", value, "filepath");
			return (Criteria) this;
		}

		public Criteria andFiletypeIsNull() {
			addCriterion("filetype is null");
			return (Criteria) this;
		}

		public Criteria andFiletypeIsNotNull() {
			addCriterion("filetype is not null");
			return (Criteria) this;
		}

		public Criteria andFiletypeEqualTo(String value) {
			addCriterion("filetype =", value, "filetype");
			return (Criteria) this;
		}

		public Criteria andFiletypeNotEqualTo(String value) {
			addCriterion("filetype <>", value, "filetype");
			return (Criteria) this;
		}

		public Criteria andFiletypeLike(String value) {
			addCriterion("filetype like", value, "filetype");
			return (Criteria) this;
		}

		public Criteria andFiletypeNotLike(String value) {
			addCriterion("filetype not like", value, "filetype");
			return (Criteria) this;
		}

		public Criteria andFiletypeIn(List<String> values) {
			addCriterion("filetype in", values, "filetype");
			return (Criteria) this;
		}

		public Criteria andFiletypeNotIn(List<String> values) {
			addCriterion("filetype not in", values, "filetype");
			return (Criteria) this;
		}

	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sme_declare_attach
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
	 * the database table sme_declare_attach
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