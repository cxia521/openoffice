package com.chinadci.springboot.gisentity;

import java.util.ArrayList;
import java.util.List;

public class XzqhExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table xzqh
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table xzqh
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table xzqh
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xzqh
     *
     * @mbg.generated
     */
    public XzqhExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xzqh
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xzqh
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xzqh
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xzqh
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xzqh
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xzqh
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xzqh
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xzqh
     *
     * @mbg.generated
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
     * This method corresponds to the database table xzqh
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xzqh
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table xzqh
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andObjectidIsNull() {
            addCriterion("objectid is null");
            return (Criteria) this;
        }

        public Criteria andObjectidIsNotNull() {
            addCriterion("objectid is not null");
            return (Criteria) this;
        }

        public Criteria andObjectidEqualTo(Integer value) {
            addCriterion("objectid =", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotEqualTo(Integer value) {
            addCriterion("objectid <>", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidGreaterThan(Integer value) {
            addCriterion("objectid >", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("objectid >=", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidLessThan(Integer value) {
            addCriterion("objectid <", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidLessThanOrEqualTo(Integer value) {
            addCriterion("objectid <=", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidIn(List<Integer> values) {
            addCriterion("objectid in", values, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotIn(List<Integer> values) {
            addCriterion("objectid not in", values, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidBetween(Integer value1, Integer value2) {
            addCriterion("objectid between", value1, value2, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("objectid not between", value1, value2, "objectid");
            return (Criteria) this;
        }

        public Criteria andXianIsNull() {
            addCriterion("xian is null");
            return (Criteria) this;
        }

        public Criteria andXianIsNotNull() {
            addCriterion("xian is not null");
            return (Criteria) this;
        }

        public Criteria andXianEqualTo(String value) {
            addCriterion("xian =", value, "xian");
            return (Criteria) this;
        }

        public Criteria andXianNotEqualTo(String value) {
            addCriterion("xian <>", value, "xian");
            return (Criteria) this;
        }

        public Criteria andXianGreaterThan(String value) {
            addCriterion("xian >", value, "xian");
            return (Criteria) this;
        }

        public Criteria andXianGreaterThanOrEqualTo(String value) {
            addCriterion("xian >=", value, "xian");
            return (Criteria) this;
        }

        public Criteria andXianLessThan(String value) {
            addCriterion("xian <", value, "xian");
            return (Criteria) this;
        }

        public Criteria andXianLessThanOrEqualTo(String value) {
            addCriterion("xian <=", value, "xian");
            return (Criteria) this;
        }

        public Criteria andXianLike(String value) {
            addCriterion("xian like", value, "xian");
            return (Criteria) this;
        }

        public Criteria andXianNotLike(String value) {
            addCriterion("xian not like", value, "xian");
            return (Criteria) this;
        }

        public Criteria andXianIn(List<String> values) {
            addCriterion("xian in", values, "xian");
            return (Criteria) this;
        }

        public Criteria andXianNotIn(List<String> values) {
            addCriterion("xian not in", values, "xian");
            return (Criteria) this;
        }

        public Criteria andXianBetween(String value1, String value2) {
            addCriterion("xian between", value1, value2, "xian");
            return (Criteria) this;
        }

        public Criteria andXianNotBetween(String value1, String value2) {
            addCriterion("xian not between", value1, value2, "xian");
            return (Criteria) this;
        }

        public Criteria andXiangIsNull() {
            addCriterion("xiang is null");
            return (Criteria) this;
        }

        public Criteria andXiangIsNotNull() {
            addCriterion("xiang is not null");
            return (Criteria) this;
        }

        public Criteria andXiangEqualTo(String value) {
            addCriterion("xiang =", value, "xiang");
            return (Criteria) this;
        }

        public Criteria andXiangNotEqualTo(String value) {
            addCriterion("xiang <>", value, "xiang");
            return (Criteria) this;
        }

        public Criteria andXiangGreaterThan(String value) {
            addCriterion("xiang >", value, "xiang");
            return (Criteria) this;
        }

        public Criteria andXiangGreaterThanOrEqualTo(String value) {
            addCriterion("xiang >=", value, "xiang");
            return (Criteria) this;
        }

        public Criteria andXiangLessThan(String value) {
            addCriterion("xiang <", value, "xiang");
            return (Criteria) this;
        }

        public Criteria andXiangLessThanOrEqualTo(String value) {
            addCriterion("xiang <=", value, "xiang");
            return (Criteria) this;
        }

        public Criteria andXiangLike(String value) {
            addCriterion("xiang like", value, "xiang");
            return (Criteria) this;
        }

        public Criteria andXiangNotLike(String value) {
            addCriterion("xiang not like", value, "xiang");
            return (Criteria) this;
        }

        public Criteria andXiangIn(List<String> values) {
            addCriterion("xiang in", values, "xiang");
            return (Criteria) this;
        }

        public Criteria andXiangNotIn(List<String> values) {
            addCriterion("xiang not in", values, "xiang");
            return (Criteria) this;
        }

        public Criteria andXiangBetween(String value1, String value2) {
            addCriterion("xiang between", value1, value2, "xiang");
            return (Criteria) this;
        }

        public Criteria andXiangNotBetween(String value1, String value2) {
            addCriterion("xiang not between", value1, value2, "xiang");
            return (Criteria) this;
        }

        public Criteria andXianNameIsNull() {
            addCriterion("xian_name is null");
            return (Criteria) this;
        }

        public Criteria andXianNameIsNotNull() {
            addCriterion("xian_name is not null");
            return (Criteria) this;
        }

        public Criteria andXianNameEqualTo(String value) {
            addCriterion("xian_name =", value, "xianName");
            return (Criteria) this;
        }

        public Criteria andXianNameNotEqualTo(String value) {
            addCriterion("xian_name <>", value, "xianName");
            return (Criteria) this;
        }

        public Criteria andXianNameGreaterThan(String value) {
            addCriterion("xian_name >", value, "xianName");
            return (Criteria) this;
        }

        public Criteria andXianNameGreaterThanOrEqualTo(String value) {
            addCriterion("xian_name >=", value, "xianName");
            return (Criteria) this;
        }

        public Criteria andXianNameLessThan(String value) {
            addCriterion("xian_name <", value, "xianName");
            return (Criteria) this;
        }

        public Criteria andXianNameLessThanOrEqualTo(String value) {
            addCriterion("xian_name <=", value, "xianName");
            return (Criteria) this;
        }

        public Criteria andXianNameLike(String value) {
            addCriterion("xian_name like", value, "xianName");
            return (Criteria) this;
        }

        public Criteria andXianNameNotLike(String value) {
            addCriterion("xian_name not like", value, "xianName");
            return (Criteria) this;
        }

        public Criteria andXianNameIn(List<String> values) {
            addCriterion("xian_name in", values, "xianName");
            return (Criteria) this;
        }

        public Criteria andXianNameNotIn(List<String> values) {
            addCriterion("xian_name not in", values, "xianName");
            return (Criteria) this;
        }

        public Criteria andXianNameBetween(String value1, String value2) {
            addCriterion("xian_name between", value1, value2, "xianName");
            return (Criteria) this;
        }

        public Criteria andXianNameNotBetween(String value1, String value2) {
            addCriterion("xian_name not between", value1, value2, "xianName");
            return (Criteria) this;
        }

        public Criteria andXiangNameIsNull() {
            addCriterion("xiang_name is null");
            return (Criteria) this;
        }

        public Criteria andXiangNameIsNotNull() {
            addCriterion("xiang_name is not null");
            return (Criteria) this;
        }

        public Criteria andXiangNameEqualTo(String value) {
            addCriterion("xiang_name =", value, "xiangName");
            return (Criteria) this;
        }

        public Criteria andXiangNameNotEqualTo(String value) {
            addCriterion("xiang_name <>", value, "xiangName");
            return (Criteria) this;
        }

        public Criteria andXiangNameGreaterThan(String value) {
            addCriterion("xiang_name >", value, "xiangName");
            return (Criteria) this;
        }

        public Criteria andXiangNameGreaterThanOrEqualTo(String value) {
            addCriterion("xiang_name >=", value, "xiangName");
            return (Criteria) this;
        }

        public Criteria andXiangNameLessThan(String value) {
            addCriterion("xiang_name <", value, "xiangName");
            return (Criteria) this;
        }

        public Criteria andXiangNameLessThanOrEqualTo(String value) {
            addCriterion("xiang_name <=", value, "xiangName");
            return (Criteria) this;
        }

        public Criteria andXiangNameLike(String value) {
            addCriterion("xiang_name like", value, "xiangName");
            return (Criteria) this;
        }

        public Criteria andXiangNameNotLike(String value) {
            addCriterion("xiang_name not like", value, "xiangName");
            return (Criteria) this;
        }

        public Criteria andXiangNameIn(List<String> values) {
            addCriterion("xiang_name in", values, "xiangName");
            return (Criteria) this;
        }

        public Criteria andXiangNameNotIn(List<String> values) {
            addCriterion("xiang_name not in", values, "xiangName");
            return (Criteria) this;
        }

        public Criteria andXiangNameBetween(String value1, String value2) {
            addCriterion("xiang_name between", value1, value2, "xiangName");
            return (Criteria) this;
        }

        public Criteria andXiangNameNotBetween(String value1, String value2) {
            addCriterion("xiang_name not between", value1, value2, "xiangName");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(String value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(String value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(String value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(String value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(String value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(String value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLike(String value) {
            addCriterion("rank like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotLike(String value) {
            addCriterion("rank not like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<String> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<String> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(String value1, String value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(String value1, String value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andSindexIsNull() {
            addCriterion("sindex is null");
            return (Criteria) this;
        }

        public Criteria andSindexIsNotNull() {
            addCriterion("sindex is not null");
            return (Criteria) this;
        }

        public Criteria andSindexEqualTo(String value) {
            addCriterion("sindex =", value, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexNotEqualTo(String value) {
            addCriterion("sindex <>", value, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexGreaterThan(String value) {
            addCriterion("sindex >", value, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexGreaterThanOrEqualTo(String value) {
            addCriterion("sindex >=", value, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexLessThan(String value) {
            addCriterion("sindex <", value, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexLessThanOrEqualTo(String value) {
            addCriterion("sindex <=", value, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexLike(String value) {
            addCriterion("sindex like", value, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexNotLike(String value) {
            addCriterion("sindex not like", value, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexIn(List<String> values) {
            addCriterion("sindex in", values, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexNotIn(List<String> values) {
            addCriterion("sindex not in", values, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexBetween(String value1, String value2) {
            addCriterion("sindex between", value1, value2, "sindex");
            return (Criteria) this;
        }

        public Criteria andSindexNotBetween(String value1, String value2) {
            addCriterion("sindex not between", value1, value2, "sindex");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPcodeIsNull() {
            addCriterion("pcode is null");
            return (Criteria) this;
        }

        public Criteria andPcodeIsNotNull() {
            addCriterion("pcode is not null");
            return (Criteria) this;
        }

        public Criteria andPcodeEqualTo(String value) {
            addCriterion("pcode =", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotEqualTo(String value) {
            addCriterion("pcode <>", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeGreaterThan(String value) {
            addCriterion("pcode >", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeGreaterThanOrEqualTo(String value) {
            addCriterion("pcode >=", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLessThan(String value) {
            addCriterion("pcode <", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLessThanOrEqualTo(String value) {
            addCriterion("pcode <=", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLike(String value) {
            addCriterion("pcode like", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotLike(String value) {
            addCriterion("pcode not like", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeIn(List<String> values) {
            addCriterion("pcode in", values, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotIn(List<String> values) {
            addCriterion("pcode not in", values, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeBetween(String value1, String value2) {
            addCriterion("pcode between", value1, value2, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotBetween(String value1, String value2) {
            addCriterion("pcode not between", value1, value2, "pcode");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
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

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andShapeIsNull() {
            addCriterion("shape is null");
            return (Criteria) this;
        }

        public Criteria andShapeIsNotNull() {
            addCriterion("shape is not null");
            return (Criteria) this;
        }

        public Criteria andShapeEqualTo(Object value) {
            addCriterion("shape =", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeNotEqualTo(Object value) {
            addCriterion("shape <>", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeGreaterThan(Object value) {
            addCriterion("shape >", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeGreaterThanOrEqualTo(Object value) {
            addCriterion("shape >=", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeLessThan(Object value) {
            addCriterion("shape <", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeLessThanOrEqualTo(Object value) {
            addCriterion("shape <=", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeIn(List<Object> values) {
            addCriterion("shape in", values, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeNotIn(List<Object> values) {
            addCriterion("shape not in", values, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeBetween(Object value1, Object value2) {
            addCriterion("shape between", value1, value2, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeNotBetween(Object value1, Object value2) {
            addCriterion("shape not between", value1, value2, "shape");
            return (Criteria) this;
        }

        public Criteria andNfCodeIsNull() {
            addCriterion("nf_code is null");
            return (Criteria) this;
        }

        public Criteria andNfCodeIsNotNull() {
            addCriterion("nf_code is not null");
            return (Criteria) this;
        }

        public Criteria andNfCodeEqualTo(String value) {
            addCriterion("nf_code =", value, "nfCode");
            return (Criteria) this;
        }

        public Criteria andNfCodeNotEqualTo(String value) {
            addCriterion("nf_code <>", value, "nfCode");
            return (Criteria) this;
        }

        public Criteria andNfCodeGreaterThan(String value) {
            addCriterion("nf_code >", value, "nfCode");
            return (Criteria) this;
        }

        public Criteria andNfCodeGreaterThanOrEqualTo(String value) {
            addCriterion("nf_code >=", value, "nfCode");
            return (Criteria) this;
        }

        public Criteria andNfCodeLessThan(String value) {
            addCriterion("nf_code <", value, "nfCode");
            return (Criteria) this;
        }

        public Criteria andNfCodeLessThanOrEqualTo(String value) {
            addCriterion("nf_code <=", value, "nfCode");
            return (Criteria) this;
        }

        public Criteria andNfCodeLike(String value) {
            addCriterion("nf_code like", value, "nfCode");
            return (Criteria) this;
        }

        public Criteria andNfCodeNotLike(String value) {
            addCriterion("nf_code not like", value, "nfCode");
            return (Criteria) this;
        }

        public Criteria andNfCodeIn(List<String> values) {
            addCriterion("nf_code in", values, "nfCode");
            return (Criteria) this;
        }

        public Criteria andNfCodeNotIn(List<String> values) {
            addCriterion("nf_code not in", values, "nfCode");
            return (Criteria) this;
        }

        public Criteria andNfCodeBetween(String value1, String value2) {
            addCriterion("nf_code between", value1, value2, "nfCode");
            return (Criteria) this;
        }

        public Criteria andNfCodeNotBetween(String value1, String value2) {
            addCriterion("nf_code not between", value1, value2, "nfCode");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table xzqh
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table xzqh
     *
     * @mbg.generated
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