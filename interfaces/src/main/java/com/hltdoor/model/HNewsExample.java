package com.hltdoor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HNewsExample() {
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

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHTitleIsNull() {
            addCriterion("h_title is null");
            return (Criteria) this;
        }

        public Criteria andHTitleIsNotNull() {
            addCriterion("h_title is not null");
            return (Criteria) this;
        }

        public Criteria andHTitleEqualTo(String value) {
            addCriterion("h_title =", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleNotEqualTo(String value) {
            addCriterion("h_title <>", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleGreaterThan(String value) {
            addCriterion("h_title >", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleGreaterThanOrEqualTo(String value) {
            addCriterion("h_title >=", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleLessThan(String value) {
            addCriterion("h_title <", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleLessThanOrEqualTo(String value) {
            addCriterion("h_title <=", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleLike(String value) {
            addCriterion("h_title like", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleNotLike(String value) {
            addCriterion("h_title not like", value, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleIn(List<String> values) {
            addCriterion("h_title in", values, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleNotIn(List<String> values) {
            addCriterion("h_title not in", values, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleBetween(String value1, String value2) {
            addCriterion("h_title between", value1, value2, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHTitleNotBetween(String value1, String value2) {
            addCriterion("h_title not between", value1, value2, "hTitle");
            return (Criteria) this;
        }

        public Criteria andHAuthorIsNull() {
            addCriterion("h_author is null");
            return (Criteria) this;
        }

        public Criteria andHAuthorIsNotNull() {
            addCriterion("h_author is not null");
            return (Criteria) this;
        }

        public Criteria andHAuthorEqualTo(String value) {
            addCriterion("h_author =", value, "hAuthor");
            return (Criteria) this;
        }

        public Criteria andHAuthorNotEqualTo(String value) {
            addCriterion("h_author <>", value, "hAuthor");
            return (Criteria) this;
        }

        public Criteria andHAuthorGreaterThan(String value) {
            addCriterion("h_author >", value, "hAuthor");
            return (Criteria) this;
        }

        public Criteria andHAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("h_author >=", value, "hAuthor");
            return (Criteria) this;
        }

        public Criteria andHAuthorLessThan(String value) {
            addCriterion("h_author <", value, "hAuthor");
            return (Criteria) this;
        }

        public Criteria andHAuthorLessThanOrEqualTo(String value) {
            addCriterion("h_author <=", value, "hAuthor");
            return (Criteria) this;
        }

        public Criteria andHAuthorLike(String value) {
            addCriterion("h_author like", value, "hAuthor");
            return (Criteria) this;
        }

        public Criteria andHAuthorNotLike(String value) {
            addCriterion("h_author not like", value, "hAuthor");
            return (Criteria) this;
        }

        public Criteria andHAuthorIn(List<String> values) {
            addCriterion("h_author in", values, "hAuthor");
            return (Criteria) this;
        }

        public Criteria andHAuthorNotIn(List<String> values) {
            addCriterion("h_author not in", values, "hAuthor");
            return (Criteria) this;
        }

        public Criteria andHAuthorBetween(String value1, String value2) {
            addCriterion("h_author between", value1, value2, "hAuthor");
            return (Criteria) this;
        }

        public Criteria andHAuthorNotBetween(String value1, String value2) {
            addCriterion("h_author not between", value1, value2, "hAuthor");
            return (Criteria) this;
        }

        public Criteria andHTimeIsNull() {
            addCriterion("h_time is null");
            return (Criteria) this;
        }

        public Criteria andHTimeIsNotNull() {
            addCriterion("h_time is not null");
            return (Criteria) this;
        }

        public Criteria andHTimeEqualTo(Date value) {
            addCriterion("h_time =", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeNotEqualTo(Date value) {
            addCriterion("h_time <>", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeGreaterThan(Date value) {
            addCriterion("h_time >", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("h_time >=", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeLessThan(Date value) {
            addCriterion("h_time <", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeLessThanOrEqualTo(Date value) {
            addCriterion("h_time <=", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeIn(List<Date> values) {
            addCriterion("h_time in", values, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeNotIn(List<Date> values) {
            addCriterion("h_time not in", values, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeBetween(Date value1, Date value2) {
            addCriterion("h_time between", value1, value2, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeNotBetween(Date value1, Date value2) {
            addCriterion("h_time not between", value1, value2, "hTime");
            return (Criteria) this;
        }

        public Criteria andHImgIsNull() {
            addCriterion("h_img is null");
            return (Criteria) this;
        }

        public Criteria andHImgIsNotNull() {
            addCriterion("h_img is not null");
            return (Criteria) this;
        }

        public Criteria andHImgEqualTo(String value) {
            addCriterion("h_img =", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgNotEqualTo(String value) {
            addCriterion("h_img <>", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgGreaterThan(String value) {
            addCriterion("h_img >", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgGreaterThanOrEqualTo(String value) {
            addCriterion("h_img >=", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgLessThan(String value) {
            addCriterion("h_img <", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgLessThanOrEqualTo(String value) {
            addCriterion("h_img <=", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgLike(String value) {
            addCriterion("h_img like", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgNotLike(String value) {
            addCriterion("h_img not like", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgIn(List<String> values) {
            addCriterion("h_img in", values, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgNotIn(List<String> values) {
            addCriterion("h_img not in", values, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgBetween(String value1, String value2) {
            addCriterion("h_img between", value1, value2, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgNotBetween(String value1, String value2) {
            addCriterion("h_img not between", value1, value2, "hImg");
            return (Criteria) this;
        }

        public Criteria andHAbstractIsNull() {
            addCriterion("h_abstract is null");
            return (Criteria) this;
        }

        public Criteria andHAbstractIsNotNull() {
            addCriterion("h_abstract is not null");
            return (Criteria) this;
        }

        public Criteria andHAbstractEqualTo(String value) {
            addCriterion("h_abstract =", value, "hAbstract");
            return (Criteria) this;
        }

        public Criteria andHAbstractNotEqualTo(String value) {
            addCriterion("h_abstract <>", value, "hAbstract");
            return (Criteria) this;
        }

        public Criteria andHAbstractGreaterThan(String value) {
            addCriterion("h_abstract >", value, "hAbstract");
            return (Criteria) this;
        }

        public Criteria andHAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("h_abstract >=", value, "hAbstract");
            return (Criteria) this;
        }

        public Criteria andHAbstractLessThan(String value) {
            addCriterion("h_abstract <", value, "hAbstract");
            return (Criteria) this;
        }

        public Criteria andHAbstractLessThanOrEqualTo(String value) {
            addCriterion("h_abstract <=", value, "hAbstract");
            return (Criteria) this;
        }

        public Criteria andHAbstractLike(String value) {
            addCriterion("h_abstract like", value, "hAbstract");
            return (Criteria) this;
        }

        public Criteria andHAbstractNotLike(String value) {
            addCriterion("h_abstract not like", value, "hAbstract");
            return (Criteria) this;
        }

        public Criteria andHAbstractIn(List<String> values) {
            addCriterion("h_abstract in", values, "hAbstract");
            return (Criteria) this;
        }

        public Criteria andHAbstractNotIn(List<String> values) {
            addCriterion("h_abstract not in", values, "hAbstract");
            return (Criteria) this;
        }

        public Criteria andHAbstractBetween(String value1, String value2) {
            addCriterion("h_abstract between", value1, value2, "hAbstract");
            return (Criteria) this;
        }

        public Criteria andHAbstractNotBetween(String value1, String value2) {
            addCriterion("h_abstract not between", value1, value2, "hAbstract");
            return (Criteria) this;
        }

        public Criteria andHTypeIsNull() {
            addCriterion("h_type is null");
            return (Criteria) this;
        }

        public Criteria andHTypeIsNotNull() {
            addCriterion("h_type is not null");
            return (Criteria) this;
        }

        public Criteria andHTypeEqualTo(Integer value) {
            addCriterion("h_type =", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotEqualTo(Integer value) {
            addCriterion("h_type <>", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeGreaterThan(Integer value) {
            addCriterion("h_type >", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_type >=", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLessThan(Integer value) {
            addCriterion("h_type <", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLessThanOrEqualTo(Integer value) {
            addCriterion("h_type <=", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeIn(List<Integer> values) {
            addCriterion("h_type in", values, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotIn(List<Integer> values) {
            addCriterion("h_type not in", values, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeBetween(Integer value1, Integer value2) {
            addCriterion("h_type between", value1, value2, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("h_type not between", value1, value2, "hType");
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