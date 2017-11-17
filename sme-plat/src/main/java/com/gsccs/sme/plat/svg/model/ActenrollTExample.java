package com.gsccs.sme.plat.svg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.sme.plat.bass.BaseExample;

public class ActenrollTExample extends BaseExample{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    public ActenrollTExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_actenroll
     *
     * @mbggenerated Mon Mar 14 17:58:32 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_actenroll
     *
     * @mbggenerated Mon Mar 14 17:58:32 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_actenroll
     *
     * @mbggenerated Mon Mar 14 17:58:32 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_actenroll
     *
     * @mbggenerated Mon Mar 14 17:58:32 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_actenroll
     *
     * @mbggenerated Mon Mar 14 17:58:32 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_actenroll
     *
     * @mbggenerated Mon Mar 14 17:58:32 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_actenroll
     *
     * @mbggenerated Mon Mar 14 17:58:32 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_actenroll
     *
     * @mbggenerated Mon Mar 14 17:58:32 CST 2016
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
     * This method corresponds to the database table sme_actenroll
     *
     * @mbggenerated Mon Mar 14 17:58:32 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_actenroll
     *
     * @mbggenerated Mon Mar 14 17:58:32 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sme_actenroll
     *
     * @mbggenerated Mon Mar 14 17:58:32 CST 2016
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

        public Criteria andActidIsNull() {
            addCriterion("actid is null");
            return (Criteria) this;
        }

        public Criteria andActidIsNotNull() {
            addCriterion("actid is not null");
            return (Criteria) this;
        }

        public Criteria andActidEqualTo(Long value) {
            addCriterion("actid =", value, "actid");
            return (Criteria) this;
        }

        public Criteria andActidNotEqualTo(Long value) {
            addCriterion("actid <>", value, "actid");
            return (Criteria) this;
        }

        public Criteria andActidGreaterThan(Long value) {
            addCriterion("actid >", value, "actid");
            return (Criteria) this;
        }

        public Criteria andActidGreaterThanOrEqualTo(Long value) {
            addCriterion("actid >=", value, "actid");
            return (Criteria) this;
        }

        public Criteria andActidLessThan(Long value) {
            addCriterion("actid <", value, "actid");
            return (Criteria) this;
        }

        public Criteria andActidLessThanOrEqualTo(Long value) {
            addCriterion("actid <=", value, "actid");
            return (Criteria) this;
        }

        public Criteria andActidIn(List<Long> values) {
            addCriterion("actid in", values, "actid");
            return (Criteria) this;
        }

        public Criteria andActidNotIn(List<Long> values) {
            addCriterion("actid not in", values, "actid");
            return (Criteria) this;
        }

        public Criteria andActidBetween(Long value1, Long value2) {
            addCriterion("actid between", value1, value2, "actid");
            return (Criteria) this;
        }

        public Criteria andActidNotBetween(Long value1, Long value2) {
            addCriterion("actid not between", value1, value2, "actid");
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

        public Criteria andExpidIsNull() {
            addCriterion("expid is null");
            return (Criteria) this;
        }

        public Criteria andExpidIsNotNull() {
            addCriterion("expid is not null");
            return (Criteria) this;
        }

        public Criteria andExpidEqualTo(Long value) {
            addCriterion("expid =", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidNotEqualTo(Long value) {
            addCriterion("expid <>", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidGreaterThan(Long value) {
            addCriterion("expid >", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidGreaterThanOrEqualTo(Long value) {
            addCriterion("expid >=", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidLessThan(Long value) {
            addCriterion("expid <", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidLessThanOrEqualTo(Long value) {
            addCriterion("expid <=", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidIn(List<Long> values) {
            addCriterion("expid in", values, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidNotIn(List<Long> values) {
            addCriterion("expid not in", values, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidBetween(Long value1, Long value2) {
            addCriterion("expid between", value1, value2, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidNotBetween(Long value1, Long value2) {
            addCriterion("expid not between", value1, value2, "expid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userid not between", value1, value2, "userid");
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

        public Criteria andUsernumGreaterThan(Integer value) {
            addCriterion("usernum >", value, "usernum");
            return (Criteria) this;
        }

        public Criteria andUsernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("usernum >=", value, "usernum");
            return (Criteria) this;
        }

        public Criteria andUsernumLessThan(Integer value) {
            addCriterion("usernum <", value, "usernum");
            return (Criteria) this;
        }

        public Criteria andUsernumLessThanOrEqualTo(Integer value) {
            addCriterion("usernum <=", value, "usernum");
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andComtimeIsNull() {
            addCriterion("comtime is null");
            return (Criteria) this;
        }

        public Criteria andComtimeIsNotNull() {
            addCriterion("comtime is not null");
            return (Criteria) this;
        }

        public Criteria andComtimeEqualTo(Date value) {
            addCriterion("comtime =", value, "comtime");
            return (Criteria) this;
        }

        public Criteria andComtimeNotEqualTo(Date value) {
            addCriterion("comtime <>", value, "comtime");
            return (Criteria) this;
        }

        public Criteria andComtimeGreaterThan(Date value) {
            addCriterion("comtime >", value, "comtime");
            return (Criteria) this;
        }

        public Criteria andComtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comtime >=", value, "comtime");
            return (Criteria) this;
        }

        public Criteria andComtimeLessThan(Date value) {
            addCriterion("comtime <", value, "comtime");
            return (Criteria) this;
        }

        public Criteria andComtimeLessThanOrEqualTo(Date value) {
            addCriterion("comtime <=", value, "comtime");
            return (Criteria) this;
        }

        public Criteria andComtimeIn(List<Date> values) {
            addCriterion("comtime in", values, "comtime");
            return (Criteria) this;
        }

        public Criteria andComtimeNotIn(List<Date> values) {
            addCriterion("comtime not in", values, "comtime");
            return (Criteria) this;
        }

        public Criteria andComtimeBetween(Date value1, Date value2) {
            addCriterion("comtime between", value1, value2, "comtime");
            return (Criteria) this;
        }

        public Criteria andComtimeNotBetween(Date value1, Date value2) {
            addCriterion("comtime not between", value1, value2, "comtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sme_actenroll
     *
     * @mbggenerated do_not_delete_during_merge Mon Mar 14 17:58:32 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sme_actenroll
     *
     * @mbggenerated Mon Mar 14 17:58:32 CST 2016
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