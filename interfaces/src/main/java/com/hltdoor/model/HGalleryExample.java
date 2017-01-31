package com.hltdoor.model;

import java.util.ArrayList;
import java.util.List;

public class HGalleryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HGalleryExample() {
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

        public Criteria andHSubTitleIsNull() {
            addCriterion("h_sub_title is null");
            return (Criteria) this;
        }

        public Criteria andHSubTitleIsNotNull() {
            addCriterion("h_sub_title is not null");
            return (Criteria) this;
        }

        public Criteria andHSubTitleEqualTo(String value) {
            addCriterion("h_sub_title =", value, "hSubTitle");
            return (Criteria) this;
        }

        public Criteria andHSubTitleNotEqualTo(String value) {
            addCriterion("h_sub_title <>", value, "hSubTitle");
            return (Criteria) this;
        }

        public Criteria andHSubTitleGreaterThan(String value) {
            addCriterion("h_sub_title >", value, "hSubTitle");
            return (Criteria) this;
        }

        public Criteria andHSubTitleGreaterThanOrEqualTo(String value) {
            addCriterion("h_sub_title >=", value, "hSubTitle");
            return (Criteria) this;
        }

        public Criteria andHSubTitleLessThan(String value) {
            addCriterion("h_sub_title <", value, "hSubTitle");
            return (Criteria) this;
        }

        public Criteria andHSubTitleLessThanOrEqualTo(String value) {
            addCriterion("h_sub_title <=", value, "hSubTitle");
            return (Criteria) this;
        }

        public Criteria andHSubTitleLike(String value) {
            addCriterion("h_sub_title like", value, "hSubTitle");
            return (Criteria) this;
        }

        public Criteria andHSubTitleNotLike(String value) {
            addCriterion("h_sub_title not like", value, "hSubTitle");
            return (Criteria) this;
        }

        public Criteria andHSubTitleIn(List<String> values) {
            addCriterion("h_sub_title in", values, "hSubTitle");
            return (Criteria) this;
        }

        public Criteria andHSubTitleNotIn(List<String> values) {
            addCriterion("h_sub_title not in", values, "hSubTitle");
            return (Criteria) this;
        }

        public Criteria andHSubTitleBetween(String value1, String value2) {
            addCriterion("h_sub_title between", value1, value2, "hSubTitle");
            return (Criteria) this;
        }

        public Criteria andHSubTitleNotBetween(String value1, String value2) {
            addCriterion("h_sub_title not between", value1, value2, "hSubTitle");
            return (Criteria) this;
        }

        public Criteria andHTypeIdIsNull() {
            addCriterion("h_type_id is null");
            return (Criteria) this;
        }

        public Criteria andHTypeIdIsNotNull() {
            addCriterion("h_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andHTypeIdEqualTo(Integer value) {
            addCriterion("h_type_id =", value, "hTypeId");
            return (Criteria) this;
        }

        public Criteria andHTypeIdNotEqualTo(Integer value) {
            addCriterion("h_type_id <>", value, "hTypeId");
            return (Criteria) this;
        }

        public Criteria andHTypeIdGreaterThan(Integer value) {
            addCriterion("h_type_id >", value, "hTypeId");
            return (Criteria) this;
        }

        public Criteria andHTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_type_id >=", value, "hTypeId");
            return (Criteria) this;
        }

        public Criteria andHTypeIdLessThan(Integer value) {
            addCriterion("h_type_id <", value, "hTypeId");
            return (Criteria) this;
        }

        public Criteria andHTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("h_type_id <=", value, "hTypeId");
            return (Criteria) this;
        }

        public Criteria andHTypeIdIn(List<Integer> values) {
            addCriterion("h_type_id in", values, "hTypeId");
            return (Criteria) this;
        }

        public Criteria andHTypeIdNotIn(List<Integer> values) {
            addCriterion("h_type_id not in", values, "hTypeId");
            return (Criteria) this;
        }

        public Criteria andHTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("h_type_id between", value1, value2, "hTypeId");
            return (Criteria) this;
        }

        public Criteria andHTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("h_type_id not between", value1, value2, "hTypeId");
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

        public Criteria andHVrIsNull() {
            addCriterion("h_vr is null");
            return (Criteria) this;
        }

        public Criteria andHVrIsNotNull() {
            addCriterion("h_vr is not null");
            return (Criteria) this;
        }

        public Criteria andHVrEqualTo(String value) {
            addCriterion("h_vr =", value, "hVr");
            return (Criteria) this;
        }

        public Criteria andHVrNotEqualTo(String value) {
            addCriterion("h_vr <>", value, "hVr");
            return (Criteria) this;
        }

        public Criteria andHVrGreaterThan(String value) {
            addCriterion("h_vr >", value, "hVr");
            return (Criteria) this;
        }

        public Criteria andHVrGreaterThanOrEqualTo(String value) {
            addCriterion("h_vr >=", value, "hVr");
            return (Criteria) this;
        }

        public Criteria andHVrLessThan(String value) {
            addCriterion("h_vr <", value, "hVr");
            return (Criteria) this;
        }

        public Criteria andHVrLessThanOrEqualTo(String value) {
            addCriterion("h_vr <=", value, "hVr");
            return (Criteria) this;
        }

        public Criteria andHVrLike(String value) {
            addCriterion("h_vr like", value, "hVr");
            return (Criteria) this;
        }

        public Criteria andHVrNotLike(String value) {
            addCriterion("h_vr not like", value, "hVr");
            return (Criteria) this;
        }

        public Criteria andHVrIn(List<String> values) {
            addCriterion("h_vr in", values, "hVr");
            return (Criteria) this;
        }

        public Criteria andHVrNotIn(List<String> values) {
            addCriterion("h_vr not in", values, "hVr");
            return (Criteria) this;
        }

        public Criteria andHVrBetween(String value1, String value2) {
            addCriterion("h_vr between", value1, value2, "hVr");
            return (Criteria) this;
        }

        public Criteria andHVrNotBetween(String value1, String value2) {
            addCriterion("h_vr not between", value1, value2, "hVr");
            return (Criteria) this;
        }

        public Criteria andHBuildingIsNull() {
            addCriterion("h_building is null");
            return (Criteria) this;
        }

        public Criteria andHBuildingIsNotNull() {
            addCriterion("h_building is not null");
            return (Criteria) this;
        }

        public Criteria andHBuildingEqualTo(String value) {
            addCriterion("h_building =", value, "hBuilding");
            return (Criteria) this;
        }

        public Criteria andHBuildingNotEqualTo(String value) {
            addCriterion("h_building <>", value, "hBuilding");
            return (Criteria) this;
        }

        public Criteria andHBuildingGreaterThan(String value) {
            addCriterion("h_building >", value, "hBuilding");
            return (Criteria) this;
        }

        public Criteria andHBuildingGreaterThanOrEqualTo(String value) {
            addCriterion("h_building >=", value, "hBuilding");
            return (Criteria) this;
        }

        public Criteria andHBuildingLessThan(String value) {
            addCriterion("h_building <", value, "hBuilding");
            return (Criteria) this;
        }

        public Criteria andHBuildingLessThanOrEqualTo(String value) {
            addCriterion("h_building <=", value, "hBuilding");
            return (Criteria) this;
        }

        public Criteria andHBuildingLike(String value) {
            addCriterion("h_building like", value, "hBuilding");
            return (Criteria) this;
        }

        public Criteria andHBuildingNotLike(String value) {
            addCriterion("h_building not like", value, "hBuilding");
            return (Criteria) this;
        }

        public Criteria andHBuildingIn(List<String> values) {
            addCriterion("h_building in", values, "hBuilding");
            return (Criteria) this;
        }

        public Criteria andHBuildingNotIn(List<String> values) {
            addCriterion("h_building not in", values, "hBuilding");
            return (Criteria) this;
        }

        public Criteria andHBuildingBetween(String value1, String value2) {
            addCriterion("h_building between", value1, value2, "hBuilding");
            return (Criteria) this;
        }

        public Criteria andHBuildingNotBetween(String value1, String value2) {
            addCriterion("h_building not between", value1, value2, "hBuilding");
            return (Criteria) this;
        }

        public Criteria andHHouseTypeIsNull() {
            addCriterion("h_house_type is null");
            return (Criteria) this;
        }

        public Criteria andHHouseTypeIsNotNull() {
            addCriterion("h_house_type is not null");
            return (Criteria) this;
        }

        public Criteria andHHouseTypeEqualTo(String value) {
            addCriterion("h_house_type =", value, "hHouseType");
            return (Criteria) this;
        }

        public Criteria andHHouseTypeNotEqualTo(String value) {
            addCriterion("h_house_type <>", value, "hHouseType");
            return (Criteria) this;
        }

        public Criteria andHHouseTypeGreaterThan(String value) {
            addCriterion("h_house_type >", value, "hHouseType");
            return (Criteria) this;
        }

        public Criteria andHHouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("h_house_type >=", value, "hHouseType");
            return (Criteria) this;
        }

        public Criteria andHHouseTypeLessThan(String value) {
            addCriterion("h_house_type <", value, "hHouseType");
            return (Criteria) this;
        }

        public Criteria andHHouseTypeLessThanOrEqualTo(String value) {
            addCriterion("h_house_type <=", value, "hHouseType");
            return (Criteria) this;
        }

        public Criteria andHHouseTypeLike(String value) {
            addCriterion("h_house_type like", value, "hHouseType");
            return (Criteria) this;
        }

        public Criteria andHHouseTypeNotLike(String value) {
            addCriterion("h_house_type not like", value, "hHouseType");
            return (Criteria) this;
        }

        public Criteria andHHouseTypeIn(List<String> values) {
            addCriterion("h_house_type in", values, "hHouseType");
            return (Criteria) this;
        }

        public Criteria andHHouseTypeNotIn(List<String> values) {
            addCriterion("h_house_type not in", values, "hHouseType");
            return (Criteria) this;
        }

        public Criteria andHHouseTypeBetween(String value1, String value2) {
            addCriterion("h_house_type between", value1, value2, "hHouseType");
            return (Criteria) this;
        }

        public Criteria andHHouseTypeNotBetween(String value1, String value2) {
            addCriterion("h_house_type not between", value1, value2, "hHouseType");
            return (Criteria) this;
        }

        public Criteria andHHouseSizeIsNull() {
            addCriterion("h_house_size is null");
            return (Criteria) this;
        }

        public Criteria andHHouseSizeIsNotNull() {
            addCriterion("h_house_size is not null");
            return (Criteria) this;
        }

        public Criteria andHHouseSizeEqualTo(String value) {
            addCriterion("h_house_size =", value, "hHouseSize");
            return (Criteria) this;
        }

        public Criteria andHHouseSizeNotEqualTo(String value) {
            addCriterion("h_house_size <>", value, "hHouseSize");
            return (Criteria) this;
        }

        public Criteria andHHouseSizeGreaterThan(String value) {
            addCriterion("h_house_size >", value, "hHouseSize");
            return (Criteria) this;
        }

        public Criteria andHHouseSizeGreaterThanOrEqualTo(String value) {
            addCriterion("h_house_size >=", value, "hHouseSize");
            return (Criteria) this;
        }

        public Criteria andHHouseSizeLessThan(String value) {
            addCriterion("h_house_size <", value, "hHouseSize");
            return (Criteria) this;
        }

        public Criteria andHHouseSizeLessThanOrEqualTo(String value) {
            addCriterion("h_house_size <=", value, "hHouseSize");
            return (Criteria) this;
        }

        public Criteria andHHouseSizeLike(String value) {
            addCriterion("h_house_size like", value, "hHouseSize");
            return (Criteria) this;
        }

        public Criteria andHHouseSizeNotLike(String value) {
            addCriterion("h_house_size not like", value, "hHouseSize");
            return (Criteria) this;
        }

        public Criteria andHHouseSizeIn(List<String> values) {
            addCriterion("h_house_size in", values, "hHouseSize");
            return (Criteria) this;
        }

        public Criteria andHHouseSizeNotIn(List<String> values) {
            addCriterion("h_house_size not in", values, "hHouseSize");
            return (Criteria) this;
        }

        public Criteria andHHouseSizeBetween(String value1, String value2) {
            addCriterion("h_house_size between", value1, value2, "hHouseSize");
            return (Criteria) this;
        }

        public Criteria andHHouseSizeNotBetween(String value1, String value2) {
            addCriterion("h_house_size not between", value1, value2, "hHouseSize");
            return (Criteria) this;
        }

        public Criteria andHHouseStyleIsNull() {
            addCriterion("h_house_style is null");
            return (Criteria) this;
        }

        public Criteria andHHouseStyleIsNotNull() {
            addCriterion("h_house_style is not null");
            return (Criteria) this;
        }

        public Criteria andHHouseStyleEqualTo(String value) {
            addCriterion("h_house_style =", value, "hHouseStyle");
            return (Criteria) this;
        }

        public Criteria andHHouseStyleNotEqualTo(String value) {
            addCriterion("h_house_style <>", value, "hHouseStyle");
            return (Criteria) this;
        }

        public Criteria andHHouseStyleGreaterThan(String value) {
            addCriterion("h_house_style >", value, "hHouseStyle");
            return (Criteria) this;
        }

        public Criteria andHHouseStyleGreaterThanOrEqualTo(String value) {
            addCriterion("h_house_style >=", value, "hHouseStyle");
            return (Criteria) this;
        }

        public Criteria andHHouseStyleLessThan(String value) {
            addCriterion("h_house_style <", value, "hHouseStyle");
            return (Criteria) this;
        }

        public Criteria andHHouseStyleLessThanOrEqualTo(String value) {
            addCriterion("h_house_style <=", value, "hHouseStyle");
            return (Criteria) this;
        }

        public Criteria andHHouseStyleLike(String value) {
            addCriterion("h_house_style like", value, "hHouseStyle");
            return (Criteria) this;
        }

        public Criteria andHHouseStyleNotLike(String value) {
            addCriterion("h_house_style not like", value, "hHouseStyle");
            return (Criteria) this;
        }

        public Criteria andHHouseStyleIn(List<String> values) {
            addCriterion("h_house_style in", values, "hHouseStyle");
            return (Criteria) this;
        }

        public Criteria andHHouseStyleNotIn(List<String> values) {
            addCriterion("h_house_style not in", values, "hHouseStyle");
            return (Criteria) this;
        }

        public Criteria andHHouseStyleBetween(String value1, String value2) {
            addCriterion("h_house_style between", value1, value2, "hHouseStyle");
            return (Criteria) this;
        }

        public Criteria andHHouseStyleNotBetween(String value1, String value2) {
            addCriterion("h_house_style not between", value1, value2, "hHouseStyle");
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