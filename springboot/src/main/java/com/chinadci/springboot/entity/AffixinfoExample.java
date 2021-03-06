package com.chinadci.springboot.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AffixinfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    public AffixinfoExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
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
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
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

        public Criteria andAffixidIsNull() {
            addCriterion("affixid is null");
            return (Criteria) this;
        }

        public Criteria andAffixidIsNotNull() {
            addCriterion("affixid is not null");
            return (Criteria) this;
        }

        public Criteria andAffixidEqualTo(String value) {
            addCriterion("affixid =", value, "affixid");
            return (Criteria) this;
        }

        public Criteria andAffixidNotEqualTo(String value) {
            addCriterion("affixid <>", value, "affixid");
            return (Criteria) this;
        }

        public Criteria andAffixidGreaterThan(String value) {
            addCriterion("affixid >", value, "affixid");
            return (Criteria) this;
        }

        public Criteria andAffixidGreaterThanOrEqualTo(String value) {
            addCriterion("affixid >=", value, "affixid");
            return (Criteria) this;
        }

        public Criteria andAffixidLessThan(String value) {
            addCriterion("affixid <", value, "affixid");
            return (Criteria) this;
        }

        public Criteria andAffixidLessThanOrEqualTo(String value) {
            addCriterion("affixid <=", value, "affixid");
            return (Criteria) this;
        }

        public Criteria andAffixidLike(String value) {
            addCriterion("affixid like", value, "affixid");
            return (Criteria) this;
        }

        public Criteria andAffixidNotLike(String value) {
            addCriterion("affixid not like", value, "affixid");
            return (Criteria) this;
        }

        public Criteria andAffixidIn(List<String> values) {
            addCriterion("affixid in", values, "affixid");
            return (Criteria) this;
        }

        public Criteria andAffixidNotIn(List<String> values) {
            addCriterion("affixid not in", values, "affixid");
            return (Criteria) this;
        }

        public Criteria andAffixidBetween(String value1, String value2) {
            addCriterion("affixid between", value1, value2, "affixid");
            return (Criteria) this;
        }

        public Criteria andAffixidNotBetween(String value1, String value2) {
            addCriterion("affixid not between", value1, value2, "affixid");
            return (Criteria) this;
        }

        public Criteria andAffixenameIsNull() {
            addCriterion("affixename is null");
            return (Criteria) this;
        }

        public Criteria andAffixenameIsNotNull() {
            addCriterion("affixename is not null");
            return (Criteria) this;
        }

        public Criteria andAffixenameEqualTo(String value) {
            addCriterion("affixename =", value, "affixename");
            return (Criteria) this;
        }

        public Criteria andAffixenameNotEqualTo(String value) {
            addCriterion("affixename <>", value, "affixename");
            return (Criteria) this;
        }

        public Criteria andAffixenameGreaterThan(String value) {
            addCriterion("affixename >", value, "affixename");
            return (Criteria) this;
        }

        public Criteria andAffixenameGreaterThanOrEqualTo(String value) {
            addCriterion("affixename >=", value, "affixename");
            return (Criteria) this;
        }

        public Criteria andAffixenameLessThan(String value) {
            addCriterion("affixename <", value, "affixename");
            return (Criteria) this;
        }

        public Criteria andAffixenameLessThanOrEqualTo(String value) {
            addCriterion("affixename <=", value, "affixename");
            return (Criteria) this;
        }

        public Criteria andAffixenameLike(String value) {
            addCriterion("affixename like", value, "affixename");
            return (Criteria) this;
        }

        public Criteria andAffixenameNotLike(String value) {
            addCriterion("affixename not like", value, "affixename");
            return (Criteria) this;
        }

        public Criteria andAffixenameIn(List<String> values) {
            addCriterion("affixename in", values, "affixename");
            return (Criteria) this;
        }

        public Criteria andAffixenameNotIn(List<String> values) {
            addCriterion("affixename not in", values, "affixename");
            return (Criteria) this;
        }

        public Criteria andAffixenameBetween(String value1, String value2) {
            addCriterion("affixename between", value1, value2, "affixename");
            return (Criteria) this;
        }

        public Criteria andAffixenameNotBetween(String value1, String value2) {
            addCriterion("affixename not between", value1, value2, "affixename");
            return (Criteria) this;
        }

        public Criteria andAffixcnameIsNull() {
            addCriterion("affixcname is null");
            return (Criteria) this;
        }

        public Criteria andAffixcnameIsNotNull() {
            addCriterion("affixcname is not null");
            return (Criteria) this;
        }

        public Criteria andAffixcnameEqualTo(String value) {
            addCriterion("affixcname =", value, "affixcname");
            return (Criteria) this;
        }

        public Criteria andAffixcnameNotEqualTo(String value) {
            addCriterion("affixcname <>", value, "affixcname");
            return (Criteria) this;
        }

        public Criteria andAffixcnameGreaterThan(String value) {
            addCriterion("affixcname >", value, "affixcname");
            return (Criteria) this;
        }

        public Criteria andAffixcnameGreaterThanOrEqualTo(String value) {
            addCriterion("affixcname >=", value, "affixcname");
            return (Criteria) this;
        }

        public Criteria andAffixcnameLessThan(String value) {
            addCriterion("affixcname <", value, "affixcname");
            return (Criteria) this;
        }

        public Criteria andAffixcnameLessThanOrEqualTo(String value) {
            addCriterion("affixcname <=", value, "affixcname");
            return (Criteria) this;
        }

        public Criteria andAffixcnameLike(String value) {
            addCriterion("affixcname like", value, "affixcname");
            return (Criteria) this;
        }

        public Criteria andAffixcnameNotLike(String value) {
            addCriterion("affixcname not like", value, "affixcname");
            return (Criteria) this;
        }

        public Criteria andAffixcnameIn(List<String> values) {
            addCriterion("affixcname in", values, "affixcname");
            return (Criteria) this;
        }

        public Criteria andAffixcnameNotIn(List<String> values) {
            addCriterion("affixcname not in", values, "affixcname");
            return (Criteria) this;
        }

        public Criteria andAffixcnameBetween(String value1, String value2) {
            addCriterion("affixcname between", value1, value2, "affixcname");
            return (Criteria) this;
        }

        public Criteria andAffixcnameNotBetween(String value1, String value2) {
            addCriterion("affixcname not between", value1, value2, "affixcname");
            return (Criteria) this;
        }

        public Criteria andExtnameIsNull() {
            addCriterion("extname is null");
            return (Criteria) this;
        }

        public Criteria andExtnameIsNotNull() {
            addCriterion("extname is not null");
            return (Criteria) this;
        }

        public Criteria andExtnameEqualTo(String value) {
            addCriterion("extname =", value, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameNotEqualTo(String value) {
            addCriterion("extname <>", value, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameGreaterThan(String value) {
            addCriterion("extname >", value, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameGreaterThanOrEqualTo(String value) {
            addCriterion("extname >=", value, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameLessThan(String value) {
            addCriterion("extname <", value, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameLessThanOrEqualTo(String value) {
            addCriterion("extname <=", value, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameLike(String value) {
            addCriterion("extname like", value, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameNotLike(String value) {
            addCriterion("extname not like", value, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameIn(List<String> values) {
            addCriterion("extname in", values, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameNotIn(List<String> values) {
            addCriterion("extname not in", values, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameBetween(String value1, String value2) {
            addCriterion("extname between", value1, value2, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameNotBetween(String value1, String value2) {
            addCriterion("extname not between", value1, value2, "extname");
            return (Criteria) this;
        }

        public Criteria andFilemgidIsNull() {
            addCriterion("filemgid is null");
            return (Criteria) this;
        }

        public Criteria andFilemgidIsNotNull() {
            addCriterion("filemgid is not null");
            return (Criteria) this;
        }

        public Criteria andFilemgidEqualTo(String value) {
            addCriterion("filemgid =", value, "filemgid");
            return (Criteria) this;
        }

        public Criteria andFilemgidNotEqualTo(String value) {
            addCriterion("filemgid <>", value, "filemgid");
            return (Criteria) this;
        }

        public Criteria andFilemgidGreaterThan(String value) {
            addCriterion("filemgid >", value, "filemgid");
            return (Criteria) this;
        }

        public Criteria andFilemgidGreaterThanOrEqualTo(String value) {
            addCriterion("filemgid >=", value, "filemgid");
            return (Criteria) this;
        }

        public Criteria andFilemgidLessThan(String value) {
            addCriterion("filemgid <", value, "filemgid");
            return (Criteria) this;
        }

        public Criteria andFilemgidLessThanOrEqualTo(String value) {
            addCriterion("filemgid <=", value, "filemgid");
            return (Criteria) this;
        }

        public Criteria andFilemgidLike(String value) {
            addCriterion("filemgid like", value, "filemgid");
            return (Criteria) this;
        }

        public Criteria andFilemgidNotLike(String value) {
            addCriterion("filemgid not like", value, "filemgid");
            return (Criteria) this;
        }

        public Criteria andFilemgidIn(List<String> values) {
            addCriterion("filemgid in", values, "filemgid");
            return (Criteria) this;
        }

        public Criteria andFilemgidNotIn(List<String> values) {
            addCriterion("filemgid not in", values, "filemgid");
            return (Criteria) this;
        }

        public Criteria andFilemgidBetween(String value1, String value2) {
            addCriterion("filemgid between", value1, value2, "filemgid");
            return (Criteria) this;
        }

        public Criteria andFilemgidNotBetween(String value1, String value2) {
            addCriterion("filemgid not between", value1, value2, "filemgid");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNull() {
            addCriterion("filesize is null");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNotNull() {
            addCriterion("filesize is not null");
            return (Criteria) this;
        }

        public Criteria andFilesizeEqualTo(Double value) {
            addCriterion("filesize =", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotEqualTo(Double value) {
            addCriterion("filesize <>", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThan(Double value) {
            addCriterion("filesize >", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThanOrEqualTo(Double value) {
            addCriterion("filesize >=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThan(Double value) {
            addCriterion("filesize <", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThanOrEqualTo(Double value) {
            addCriterion("filesize <=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeIn(List<Double> values) {
            addCriterion("filesize in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotIn(List<Double> values) {
            addCriterion("filesize not in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeBetween(Double value1, Double value2) {
            addCriterion("filesize between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotBetween(Double value1, Double value2) {
            addCriterion("filesize not between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("createuser is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("createuser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(String value) {
            addCriterion("createuser =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(String value) {
            addCriterion("createuser <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(String value) {
            addCriterion("createuser >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("createuser >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(String value) {
            addCriterion("createuser <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(String value) {
            addCriterion("createuser <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLike(String value) {
            addCriterion("createuser like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotLike(String value) {
            addCriterion("createuser not like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<String> values) {
            addCriterion("createuser in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<String> values) {
            addCriterion("createuser not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(String value1, String value2) {
            addCriterion("createuser between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(String value1, String value2) {
            addCriterion("createuser not between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andPreviewurlIsNull() {
            addCriterion("previewurl is null");
            return (Criteria) this;
        }

        public Criteria andPreviewurlIsNotNull() {
            addCriterion("previewurl is not null");
            return (Criteria) this;
        }

        public Criteria andPreviewurlEqualTo(String value) {
            addCriterion("previewurl =", value, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlNotEqualTo(String value) {
            addCriterion("previewurl <>", value, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlGreaterThan(String value) {
            addCriterion("previewurl >", value, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlGreaterThanOrEqualTo(String value) {
            addCriterion("previewurl >=", value, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlLessThan(String value) {
            addCriterion("previewurl <", value, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlLessThanOrEqualTo(String value) {
            addCriterion("previewurl <=", value, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlLike(String value) {
            addCriterion("previewurl like", value, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlNotLike(String value) {
            addCriterion("previewurl not like", value, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlIn(List<String> values) {
            addCriterion("previewurl in", values, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlNotIn(List<String> values) {
            addCriterion("previewurl not in", values, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlBetween(String value1, String value2) {
            addCriterion("previewurl between", value1, value2, "previewurl");
            return (Criteria) this;
        }

        public Criteria andPreviewurlNotBetween(String value1, String value2) {
            addCriterion("previewurl not between", value1, value2, "previewurl");
            return (Criteria) this;
        }

        public Criteria andMainidIsNull() {
            addCriterion("mainid is null");
            return (Criteria) this;
        }

        public Criteria andMainidIsNotNull() {
            addCriterion("mainid is not null");
            return (Criteria) this;
        }

        public Criteria andMainidEqualTo(String value) {
            addCriterion("mainid =", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidNotEqualTo(String value) {
            addCriterion("mainid <>", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidGreaterThan(String value) {
            addCriterion("mainid >", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidGreaterThanOrEqualTo(String value) {
            addCriterion("mainid >=", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidLessThan(String value) {
            addCriterion("mainid <", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidLessThanOrEqualTo(String value) {
            addCriterion("mainid <=", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidLike(String value) {
            addCriterion("mainid like", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidNotLike(String value) {
            addCriterion("mainid not like", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidIn(List<String> values) {
            addCriterion("mainid in", values, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidNotIn(List<String> values) {
            addCriterion("mainid not in", values, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidBetween(String value1, String value2) {
            addCriterion("mainid between", value1, value2, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidNotBetween(String value1, String value2) {
            addCriterion("mainid not between", value1, value2, "mainid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDirectoryidIsNull() {
            addCriterion("directoryid is null");
            return (Criteria) this;
        }

        public Criteria andDirectoryidIsNotNull() {
            addCriterion("directoryid is not null");
            return (Criteria) this;
        }

        public Criteria andDirectoryidEqualTo(String value) {
            addCriterion("directoryid =", value, "directoryid");
            return (Criteria) this;
        }

        public Criteria andDirectoryidNotEqualTo(String value) {
            addCriterion("directoryid <>", value, "directoryid");
            return (Criteria) this;
        }

        public Criteria andDirectoryidGreaterThan(String value) {
            addCriterion("directoryid >", value, "directoryid");
            return (Criteria) this;
        }

        public Criteria andDirectoryidGreaterThanOrEqualTo(String value) {
            addCriterion("directoryid >=", value, "directoryid");
            return (Criteria) this;
        }

        public Criteria andDirectoryidLessThan(String value) {
            addCriterion("directoryid <", value, "directoryid");
            return (Criteria) this;
        }

        public Criteria andDirectoryidLessThanOrEqualTo(String value) {
            addCriterion("directoryid <=", value, "directoryid");
            return (Criteria) this;
        }

        public Criteria andDirectoryidLike(String value) {
            addCriterion("directoryid like", value, "directoryid");
            return (Criteria) this;
        }

        public Criteria andDirectoryidNotLike(String value) {
            addCriterion("directoryid not like", value, "directoryid");
            return (Criteria) this;
        }

        public Criteria andDirectoryidIn(List<String> values) {
            addCriterion("directoryid in", values, "directoryid");
            return (Criteria) this;
        }

        public Criteria andDirectoryidNotIn(List<String> values) {
            addCriterion("directoryid not in", values, "directoryid");
            return (Criteria) this;
        }

        public Criteria andDirectoryidBetween(String value1, String value2) {
            addCriterion("directoryid between", value1, value2, "directoryid");
            return (Criteria) this;
        }

        public Criteria andDirectoryidNotBetween(String value1, String value2) {
            addCriterion("directoryid not between", value1, value2, "directoryid");
            return (Criteria) this;
        }

        public Criteria andOpcountIsNull() {
            addCriterion("opcount is null");
            return (Criteria) this;
        }

        public Criteria andOpcountIsNotNull() {
            addCriterion("opcount is not null");
            return (Criteria) this;
        }

        public Criteria andOpcountEqualTo(Integer value) {
            addCriterion("opcount =", value, "opcount");
            return (Criteria) this;
        }

        public Criteria andOpcountNotEqualTo(Integer value) {
            addCriterion("opcount <>", value, "opcount");
            return (Criteria) this;
        }

        public Criteria andOpcountGreaterThan(Integer value) {
            addCriterion("opcount >", value, "opcount");
            return (Criteria) this;
        }

        public Criteria andOpcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("opcount >=", value, "opcount");
            return (Criteria) this;
        }

        public Criteria andOpcountLessThan(Integer value) {
            addCriterion("opcount <", value, "opcount");
            return (Criteria) this;
        }

        public Criteria andOpcountLessThanOrEqualTo(Integer value) {
            addCriterion("opcount <=", value, "opcount");
            return (Criteria) this;
        }

        public Criteria andOpcountIn(List<Integer> values) {
            addCriterion("opcount in", values, "opcount");
            return (Criteria) this;
        }

        public Criteria andOpcountNotIn(List<Integer> values) {
            addCriterion("opcount not in", values, "opcount");
            return (Criteria) this;
        }

        public Criteria andOpcountBetween(Integer value1, Integer value2) {
            addCriterion("opcount between", value1, value2, "opcount");
            return (Criteria) this;
        }

        public Criteria andOpcountNotBetween(Integer value1, Integer value2) {
            addCriterion("opcount not between", value1, value2, "opcount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table affixinfo
     *
     * @mbg.generated do_not_delete_during_merge Tue Nov 09 15:25:12 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
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