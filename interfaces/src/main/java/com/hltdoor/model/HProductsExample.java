package com.hltdoor.model;

import java.util.ArrayList;
import java.util.List;

public class HProductsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HProductsExample() {
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

        public Criteria andHCoverImgIsNull() {
            addCriterion("h_cover_img is null");
            return (Criteria) this;
        }

        public Criteria andHCoverImgIsNotNull() {
            addCriterion("h_cover_img is not null");
            return (Criteria) this;
        }

        public Criteria andHCoverImgEqualTo(String value) {
            addCriterion("h_cover_img =", value, "hCoverImg");
            return (Criteria) this;
        }

        public Criteria andHCoverImgNotEqualTo(String value) {
            addCriterion("h_cover_img <>", value, "hCoverImg");
            return (Criteria) this;
        }

        public Criteria andHCoverImgGreaterThan(String value) {
            addCriterion("h_cover_img >", value, "hCoverImg");
            return (Criteria) this;
        }

        public Criteria andHCoverImgGreaterThanOrEqualTo(String value) {
            addCriterion("h_cover_img >=", value, "hCoverImg");
            return (Criteria) this;
        }

        public Criteria andHCoverImgLessThan(String value) {
            addCriterion("h_cover_img <", value, "hCoverImg");
            return (Criteria) this;
        }

        public Criteria andHCoverImgLessThanOrEqualTo(String value) {
            addCriterion("h_cover_img <=", value, "hCoverImg");
            return (Criteria) this;
        }

        public Criteria andHCoverImgLike(String value) {
            addCriterion("h_cover_img like", value, "hCoverImg");
            return (Criteria) this;
        }

        public Criteria andHCoverImgNotLike(String value) {
            addCriterion("h_cover_img not like", value, "hCoverImg");
            return (Criteria) this;
        }

        public Criteria andHCoverImgIn(List<String> values) {
            addCriterion("h_cover_img in", values, "hCoverImg");
            return (Criteria) this;
        }

        public Criteria andHCoverImgNotIn(List<String> values) {
            addCriterion("h_cover_img not in", values, "hCoverImg");
            return (Criteria) this;
        }

        public Criteria andHCoverImgBetween(String value1, String value2) {
            addCriterion("h_cover_img between", value1, value2, "hCoverImg");
            return (Criteria) this;
        }

        public Criteria andHCoverImgNotBetween(String value1, String value2) {
            addCriterion("h_cover_img not between", value1, value2, "hCoverImg");
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

        public Criteria andHGuigeIsNull() {
            addCriterion("h_guige is null");
            return (Criteria) this;
        }

        public Criteria andHGuigeIsNotNull() {
            addCriterion("h_guige is not null");
            return (Criteria) this;
        }

        public Criteria andHGuigeEqualTo(String value) {
            addCriterion("h_guige =", value, "hGuige");
            return (Criteria) this;
        }

        public Criteria andHGuigeNotEqualTo(String value) {
            addCriterion("h_guige <>", value, "hGuige");
            return (Criteria) this;
        }

        public Criteria andHGuigeGreaterThan(String value) {
            addCriterion("h_guige >", value, "hGuige");
            return (Criteria) this;
        }

        public Criteria andHGuigeGreaterThanOrEqualTo(String value) {
            addCriterion("h_guige >=", value, "hGuige");
            return (Criteria) this;
        }

        public Criteria andHGuigeLessThan(String value) {
            addCriterion("h_guige <", value, "hGuige");
            return (Criteria) this;
        }

        public Criteria andHGuigeLessThanOrEqualTo(String value) {
            addCriterion("h_guige <=", value, "hGuige");
            return (Criteria) this;
        }

        public Criteria andHGuigeLike(String value) {
            addCriterion("h_guige like", value, "hGuige");
            return (Criteria) this;
        }

        public Criteria andHGuigeNotLike(String value) {
            addCriterion("h_guige not like", value, "hGuige");
            return (Criteria) this;
        }

        public Criteria andHGuigeIn(List<String> values) {
            addCriterion("h_guige in", values, "hGuige");
            return (Criteria) this;
        }

        public Criteria andHGuigeNotIn(List<String> values) {
            addCriterion("h_guige not in", values, "hGuige");
            return (Criteria) this;
        }

        public Criteria andHGuigeBetween(String value1, String value2) {
            addCriterion("h_guige between", value1, value2, "hGuige");
            return (Criteria) this;
        }

        public Criteria andHGuigeNotBetween(String value1, String value2) {
            addCriterion("h_guige not between", value1, value2, "hGuige");
            return (Criteria) this;
        }

        public Criteria andHPriceIsNull() {
            addCriterion("h_price is null");
            return (Criteria) this;
        }

        public Criteria andHPriceIsNotNull() {
            addCriterion("h_price is not null");
            return (Criteria) this;
        }

        public Criteria andHPriceEqualTo(String value) {
            addCriterion("h_price =", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceNotEqualTo(String value) {
            addCriterion("h_price <>", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceGreaterThan(String value) {
            addCriterion("h_price >", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceGreaterThanOrEqualTo(String value) {
            addCriterion("h_price >=", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceLessThan(String value) {
            addCriterion("h_price <", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceLessThanOrEqualTo(String value) {
            addCriterion("h_price <=", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceLike(String value) {
            addCriterion("h_price like", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceNotLike(String value) {
            addCriterion("h_price not like", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceIn(List<String> values) {
            addCriterion("h_price in", values, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceNotIn(List<String> values) {
            addCriterion("h_price not in", values, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceBetween(String value1, String value2) {
            addCriterion("h_price between", value1, value2, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceNotBetween(String value1, String value2) {
            addCriterion("h_price not between", value1, value2, "hPrice");
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

        public Criteria andHStyleIsNull() {
            addCriterion("h_style is null");
            return (Criteria) this;
        }

        public Criteria andHStyleIsNotNull() {
            addCriterion("h_style is not null");
            return (Criteria) this;
        }

        public Criteria andHStyleEqualTo(Integer value) {
            addCriterion("h_style =", value, "hStyle");
            return (Criteria) this;
        }

        public Criteria andHStyleNotEqualTo(Integer value) {
            addCriterion("h_style <>", value, "hStyle");
            return (Criteria) this;
        }

        public Criteria andHStyleGreaterThan(Integer value) {
            addCriterion("h_style >", value, "hStyle");
            return (Criteria) this;
        }

        public Criteria andHStyleGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_style >=", value, "hStyle");
            return (Criteria) this;
        }

        public Criteria andHStyleLessThan(Integer value) {
            addCriterion("h_style <", value, "hStyle");
            return (Criteria) this;
        }

        public Criteria andHStyleLessThanOrEqualTo(Integer value) {
            addCriterion("h_style <=", value, "hStyle");
            return (Criteria) this;
        }

        public Criteria andHStyleIn(List<Integer> values) {
            addCriterion("h_style in", values, "hStyle");
            return (Criteria) this;
        }

        public Criteria andHStyleNotIn(List<Integer> values) {
            addCriterion("h_style not in", values, "hStyle");
            return (Criteria) this;
        }

        public Criteria andHStyleBetween(Integer value1, Integer value2) {
            addCriterion("h_style between", value1, value2, "hStyle");
            return (Criteria) this;
        }

        public Criteria andHStyleNotBetween(Integer value1, Integer value2) {
            addCriterion("h_style not between", value1, value2, "hStyle");
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