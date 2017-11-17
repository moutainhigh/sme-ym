package com.gsccs.sme.plat.corp.model;

import java.util.ArrayList;
import java.util.List;

import com.gsccs.sme.plat.bass.BaseExample;

public class CorpRunExample extends BaseExample{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sme_corp_run
     *
     * @mbggenerated Tue Jul 26 15:20:16 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sme_corp_run
     *
     * @mbggenerated Tue Jul 26 15:20:16 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sme_corp_run
     *
     * @mbggenerated Tue Jul 26 15:20:16 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_run
     *
     * @mbggenerated Tue Jul 26 15:20:16 CST 2016
     */
    public CorpRunExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_run
     *
     * @mbggenerated Tue Jul 26 15:20:16 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_run
     *
     * @mbggenerated Tue Jul 26 15:20:16 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_run
     *
     * @mbggenerated Tue Jul 26 15:20:16 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_run
     *
     * @mbggenerated Tue Jul 26 15:20:16 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_run
     *
     * @mbggenerated Tue Jul 26 15:20:16 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_run
     *
     * @mbggenerated Tue Jul 26 15:20:16 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_run
     *
     * @mbggenerated Tue Jul 26 15:20:16 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_run
     *
     * @mbggenerated Tue Jul 26 15:20:16 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_run
     *
     * @mbggenerated Tue Jul 26 15:20:16 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_run
     *
     * @mbggenerated Tue Jul 26 15:20:16 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sme_corp_run
     *
     * @mbggenerated Tue Jul 26 15:20:16 CST 2016
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
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

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsNull() {
            addCriterion("employee is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsNotNull() {
            addCriterion("employee is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEqualTo(Integer value) {
            addCriterion("employee =", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotEqualTo(Integer value) {
            addCriterion("employee <>", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeGreaterThan(Integer value) {
            addCriterion("employee >", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee >=", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeLessThan(Integer value) {
            addCriterion("employee <", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeLessThanOrEqualTo(Integer value) {
            addCriterion("employee <=", value, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeIn(List<Integer> values) {
            addCriterion("employee in", values, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotIn(List<Integer> values) {
            addCriterion("employee not in", values, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeBetween(Integer value1, Integer value2) {
            addCriterion("employee between", value1, value2, "employee");
            return (Criteria) this;
        }

        public Criteria andEmployeeNotBetween(Integer value1, Integer value2) {
            addCriterion("employee not between", value1, value2, "employee");
            return (Criteria) this;
        }

        public Criteria andSaleIsNull() {
            addCriterion("sale is null");
            return (Criteria) this;
        }

        public Criteria andSaleIsNotNull() {
            addCriterion("sale is not null");
            return (Criteria) this;
        }

        public Criteria andSaleEqualTo(Float value) {
            addCriterion("sale =", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotEqualTo(Float value) {
            addCriterion("sale <>", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThan(Float value) {
            addCriterion("sale >", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThanOrEqualTo(Float value) {
            addCriterion("sale >=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThan(Float value) {
            addCriterion("sale <", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThanOrEqualTo(Float value) {
            addCriterion("sale <=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleIn(List<Float> values) {
            addCriterion("sale in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotIn(List<Float> values) {
            addCriterion("sale not in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleBetween(Float value1, Float value2) {
            addCriterion("sale between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotBetween(Float value1, Float value2) {
            addCriterion("sale not between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andAssetsIsNull() {
            addCriterion("assets is null");
            return (Criteria) this;
        }

        public Criteria andAssetsIsNotNull() {
            addCriterion("assets is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsEqualTo(Float value) {
            addCriterion("assets =", value, "assets");
            return (Criteria) this;
        }

        public Criteria andAssetsNotEqualTo(Float value) {
            addCriterion("assets <>", value, "assets");
            return (Criteria) this;
        }

        public Criteria andAssetsGreaterThan(Float value) {
            addCriterion("assets >", value, "assets");
            return (Criteria) this;
        }

        public Criteria andAssetsGreaterThanOrEqualTo(Float value) {
            addCriterion("assets >=", value, "assets");
            return (Criteria) this;
        }

        public Criteria andAssetsLessThan(Float value) {
            addCriterion("assets <", value, "assets");
            return (Criteria) this;
        }

        public Criteria andAssetsLessThanOrEqualTo(Float value) {
            addCriterion("assets <=", value, "assets");
            return (Criteria) this;
        }

        public Criteria andAssetsIn(List<Float> values) {
            addCriterion("assets in", values, "assets");
            return (Criteria) this;
        }

        public Criteria andAssetsNotIn(List<Float> values) {
            addCriterion("assets not in", values, "assets");
            return (Criteria) this;
        }

        public Criteria andAssetsBetween(Float value1, Float value2) {
            addCriterion("assets between", value1, value2, "assets");
            return (Criteria) this;
        }

        public Criteria andAssetsNotBetween(Float value1, Float value2) {
            addCriterion("assets not between", value1, value2, "assets");
            return (Criteria) this;
        }

        public Criteria andProfitsIsNull() {
            addCriterion("profits is null");
            return (Criteria) this;
        }

        public Criteria andProfitsIsNotNull() {
            addCriterion("profits is not null");
            return (Criteria) this;
        }

        public Criteria andProfitsEqualTo(Float value) {
            addCriterion("profits =", value, "profits");
            return (Criteria) this;
        }

        public Criteria andProfitsNotEqualTo(Float value) {
            addCriterion("profits <>", value, "profits");
            return (Criteria) this;
        }

        public Criteria andProfitsGreaterThan(Float value) {
            addCriterion("profits >", value, "profits");
            return (Criteria) this;
        }

        public Criteria andProfitsGreaterThanOrEqualTo(Float value) {
            addCriterion("profits >=", value, "profits");
            return (Criteria) this;
        }

        public Criteria andProfitsLessThan(Float value) {
            addCriterion("profits <", value, "profits");
            return (Criteria) this;
        }

        public Criteria andProfitsLessThanOrEqualTo(Float value) {
            addCriterion("profits <=", value, "profits");
            return (Criteria) this;
        }

        public Criteria andProfitsIn(List<Float> values) {
            addCriterion("profits in", values, "profits");
            return (Criteria) this;
        }

        public Criteria andProfitsNotIn(List<Float> values) {
            addCriterion("profits not in", values, "profits");
            return (Criteria) this;
        }

        public Criteria andProfitsBetween(Float value1, Float value2) {
            addCriterion("profits between", value1, value2, "profits");
            return (Criteria) this;
        }

        public Criteria andProfitsNotBetween(Float value1, Float value2) {
            addCriterion("profits not between", value1, value2, "profits");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(Float value) {
            addCriterion("tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(Float value) {
            addCriterion("tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(Float value) {
            addCriterion("tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(Float value) {
            addCriterion("tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(Float value) {
            addCriterion("tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(Float value) {
            addCriterion("tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<Float> values) {
            addCriterion("tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<Float> values) {
            addCriterion("tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(Float value1, Float value2) {
            addCriterion("tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(Float value1, Float value2) {
            addCriterion("tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andDebtIsNull() {
            addCriterion("debt is null");
            return (Criteria) this;
        }

        public Criteria andDebtIsNotNull() {
            addCriterion("debt is not null");
            return (Criteria) this;
        }

        public Criteria andDebtEqualTo(Float value) {
            addCriterion("debt =", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtNotEqualTo(Float value) {
            addCriterion("debt <>", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtGreaterThan(Float value) {
            addCriterion("debt >", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtGreaterThanOrEqualTo(Float value) {
            addCriterion("debt >=", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtLessThan(Float value) {
            addCriterion("debt <", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtLessThanOrEqualTo(Float value) {
            addCriterion("debt <=", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtIn(List<Float> values) {
            addCriterion("debt in", values, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtNotIn(List<Float> values) {
            addCriterion("debt not in", values, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtBetween(Float value1, Float value2) {
            addCriterion("debt between", value1, value2, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtNotBetween(Float value1, Float value2) {
            addCriterion("debt not between", value1, value2, "debt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sme_corp_run
     *
     * @mbggenerated do_not_delete_during_merge Tue Jul 26 15:20:16 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sme_corp_run
     *
     * @mbggenerated Tue Jul 26 15:20:16 CST 2016
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

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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