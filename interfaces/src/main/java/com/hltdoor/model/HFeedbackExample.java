package com.hltdoor.model;

import java.util.ArrayList;
import java.util.List;

public class HFeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HFeedbackExample() {
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

        public Criteria andHForIsNull() {
            addCriterion("h_for is null");
            return (Criteria) this;
        }

        public Criteria andHForIsNotNull() {
            addCriterion("h_for is not null");
            return (Criteria) this;
        }

        public Criteria andHForEqualTo(Integer value) {
            addCriterion("h_for =", value, "hFor");
            return (Criteria) this;
        }

        public Criteria andHForNotEqualTo(Integer value) {
            addCriterion("h_for <>", value, "hFor");
            return (Criteria) this;
        }

        public Criteria andHForGreaterThan(Integer value) {
            addCriterion("h_for >", value, "hFor");
            return (Criteria) this;
        }

        public Criteria andHForGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_for >=", value, "hFor");
            return (Criteria) this;
        }

        public Criteria andHForLessThan(Integer value) {
            addCriterion("h_for <", value, "hFor");
            return (Criteria) this;
        }

        public Criteria andHForLessThanOrEqualTo(Integer value) {
            addCriterion("h_for <=", value, "hFor");
            return (Criteria) this;
        }

        public Criteria andHForIn(List<Integer> values) {
            addCriterion("h_for in", values, "hFor");
            return (Criteria) this;
        }

        public Criteria andHForNotIn(List<Integer> values) {
            addCriterion("h_for not in", values, "hFor");
            return (Criteria) this;
        }

        public Criteria andHForBetween(Integer value1, Integer value2) {
            addCriterion("h_for between", value1, value2, "hFor");
            return (Criteria) this;
        }

        public Criteria andHForNotBetween(Integer value1, Integer value2) {
            addCriterion("h_for not between", value1, value2, "hFor");
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

        public Criteria andHTypeEqualTo(String value) {
            addCriterion("h_type =", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotEqualTo(String value) {
            addCriterion("h_type <>", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeGreaterThan(String value) {
            addCriterion("h_type >", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeGreaterThanOrEqualTo(String value) {
            addCriterion("h_type >=", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLessThan(String value) {
            addCriterion("h_type <", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLessThanOrEqualTo(String value) {
            addCriterion("h_type <=", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeLike(String value) {
            addCriterion("h_type like", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotLike(String value) {
            addCriterion("h_type not like", value, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeIn(List<String> values) {
            addCriterion("h_type in", values, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotIn(List<String> values) {
            addCriterion("h_type not in", values, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeBetween(String value1, String value2) {
            addCriterion("h_type between", value1, value2, "hType");
            return (Criteria) this;
        }

        public Criteria andHTypeNotBetween(String value1, String value2) {
            addCriterion("h_type not between", value1, value2, "hType");
            return (Criteria) this;
        }

        public Criteria andHContentIsNull() {
            addCriterion("h_content is null");
            return (Criteria) this;
        }

        public Criteria andHContentIsNotNull() {
            addCriterion("h_content is not null");
            return (Criteria) this;
        }

        public Criteria andHContentEqualTo(String value) {
            addCriterion("h_content =", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentNotEqualTo(String value) {
            addCriterion("h_content <>", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentGreaterThan(String value) {
            addCriterion("h_content >", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentGreaterThanOrEqualTo(String value) {
            addCriterion("h_content >=", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentLessThan(String value) {
            addCriterion("h_content <", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentLessThanOrEqualTo(String value) {
            addCriterion("h_content <=", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentLike(String value) {
            addCriterion("h_content like", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentNotLike(String value) {
            addCriterion("h_content not like", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentIn(List<String> values) {
            addCriterion("h_content in", values, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentNotIn(List<String> values) {
            addCriterion("h_content not in", values, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentBetween(String value1, String value2) {
            addCriterion("h_content between", value1, value2, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentNotBetween(String value1, String value2) {
            addCriterion("h_content not between", value1, value2, "hContent");
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

        public Criteria andHFromIsNull() {
            addCriterion("h_from is null");
            return (Criteria) this;
        }

        public Criteria andHFromIsNotNull() {
            addCriterion("h_from is not null");
            return (Criteria) this;
        }

        public Criteria andHFromEqualTo(String value) {
            addCriterion("h_from =", value, "hFrom");
            return (Criteria) this;
        }

        public Criteria andHFromNotEqualTo(String value) {
            addCriterion("h_from <>", value, "hFrom");
            return (Criteria) this;
        }

        public Criteria andHFromGreaterThan(String value) {
            addCriterion("h_from >", value, "hFrom");
            return (Criteria) this;
        }

        public Criteria andHFromGreaterThanOrEqualTo(String value) {
            addCriterion("h_from >=", value, "hFrom");
            return (Criteria) this;
        }

        public Criteria andHFromLessThan(String value) {
            addCriterion("h_from <", value, "hFrom");
            return (Criteria) this;
        }

        public Criteria andHFromLessThanOrEqualTo(String value) {
            addCriterion("h_from <=", value, "hFrom");
            return (Criteria) this;
        }

        public Criteria andHFromLike(String value) {
            addCriterion("h_from like", value, "hFrom");
            return (Criteria) this;
        }

        public Criteria andHFromNotLike(String value) {
            addCriterion("h_from not like", value, "hFrom");
            return (Criteria) this;
        }

        public Criteria andHFromIn(List<String> values) {
            addCriterion("h_from in", values, "hFrom");
            return (Criteria) this;
        }

        public Criteria andHFromNotIn(List<String> values) {
            addCriterion("h_from not in", values, "hFrom");
            return (Criteria) this;
        }

        public Criteria andHFromBetween(String value1, String value2) {
            addCriterion("h_from between", value1, value2, "hFrom");
            return (Criteria) this;
        }

        public Criteria andHFromNotBetween(String value1, String value2) {
            addCriterion("h_from not between", value1, value2, "hFrom");
            return (Criteria) this;
        }

        public Criteria andHLogoIsNull() {
            addCriterion("h_logo is null");
            return (Criteria) this;
        }

        public Criteria andHLogoIsNotNull() {
            addCriterion("h_logo is not null");
            return (Criteria) this;
        }

        public Criteria andHLogoEqualTo(String value) {
            addCriterion("h_logo =", value, "hLogo");
            return (Criteria) this;
        }

        public Criteria andHLogoNotEqualTo(String value) {
            addCriterion("h_logo <>", value, "hLogo");
            return (Criteria) this;
        }

        public Criteria andHLogoGreaterThan(String value) {
            addCriterion("h_logo >", value, "hLogo");
            return (Criteria) this;
        }

        public Criteria andHLogoGreaterThanOrEqualTo(String value) {
            addCriterion("h_logo >=", value, "hLogo");
            return (Criteria) this;
        }

        public Criteria andHLogoLessThan(String value) {
            addCriterion("h_logo <", value, "hLogo");
            return (Criteria) this;
        }

        public Criteria andHLogoLessThanOrEqualTo(String value) {
            addCriterion("h_logo <=", value, "hLogo");
            return (Criteria) this;
        }

        public Criteria andHLogoLike(String value) {
            addCriterion("h_logo like", value, "hLogo");
            return (Criteria) this;
        }

        public Criteria andHLogoNotLike(String value) {
            addCriterion("h_logo not like", value, "hLogo");
            return (Criteria) this;
        }

        public Criteria andHLogoIn(List<String> values) {
            addCriterion("h_logo in", values, "hLogo");
            return (Criteria) this;
        }

        public Criteria andHLogoNotIn(List<String> values) {
            addCriterion("h_logo not in", values, "hLogo");
            return (Criteria) this;
        }

        public Criteria andHLogoBetween(String value1, String value2) {
            addCriterion("h_logo between", value1, value2, "hLogo");
            return (Criteria) this;
        }

        public Criteria andHLogoNotBetween(String value1, String value2) {
            addCriterion("h_logo not between", value1, value2, "hLogo");
            return (Criteria) this;
        }

        public Criteria andHByIsNull() {
            addCriterion("h_by is null");
            return (Criteria) this;
        }

        public Criteria andHByIsNotNull() {
            addCriterion("h_by is not null");
            return (Criteria) this;
        }

        public Criteria andHByEqualTo(String value) {
            addCriterion("h_by =", value, "hBy");
            return (Criteria) this;
        }

        public Criteria andHByNotEqualTo(String value) {
            addCriterion("h_by <>", value, "hBy");
            return (Criteria) this;
        }

        public Criteria andHByGreaterThan(String value) {
            addCriterion("h_by >", value, "hBy");
            return (Criteria) this;
        }

        public Criteria andHByGreaterThanOrEqualTo(String value) {
            addCriterion("h_by >=", value, "hBy");
            return (Criteria) this;
        }

        public Criteria andHByLessThan(String value) {
            addCriterion("h_by <", value, "hBy");
            return (Criteria) this;
        }

        public Criteria andHByLessThanOrEqualTo(String value) {
            addCriterion("h_by <=", value, "hBy");
            return (Criteria) this;
        }

        public Criteria andHByLike(String value) {
            addCriterion("h_by like", value, "hBy");
            return (Criteria) this;
        }

        public Criteria andHByNotLike(String value) {
            addCriterion("h_by not like", value, "hBy");
            return (Criteria) this;
        }

        public Criteria andHByIn(List<String> values) {
            addCriterion("h_by in", values, "hBy");
            return (Criteria) this;
        }

        public Criteria andHByNotIn(List<String> values) {
            addCriterion("h_by not in", values, "hBy");
            return (Criteria) this;
        }

        public Criteria andHByBetween(String value1, String value2) {
            addCriterion("h_by between", value1, value2, "hBy");
            return (Criteria) this;
        }

        public Criteria andHByNotBetween(String value1, String value2) {
            addCriterion("h_by not between", value1, value2, "hBy");
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