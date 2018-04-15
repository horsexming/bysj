package com.bysj.bean;

import java.util.ArrayList;
import java.util.List;

public class BgoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BgoodsExample() {
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

        public Criteria andGnameIsNull() {
            addCriterion("Gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("Gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("Gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("Gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("Gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("Gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("Gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("Gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("Gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("Gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("Gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("Gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("Gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("Gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGpriceIsNull() {
            addCriterion("Gprice is null");
            return (Criteria) this;
        }

        public Criteria andGpriceIsNotNull() {
            addCriterion("Gprice is not null");
            return (Criteria) this;
        }

        public Criteria andGpriceEqualTo(Long value) {
            addCriterion("Gprice =", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotEqualTo(Long value) {
            addCriterion("Gprice <>", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceGreaterThan(Long value) {
            addCriterion("Gprice >", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("Gprice >=", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceLessThan(Long value) {
            addCriterion("Gprice <", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceLessThanOrEqualTo(Long value) {
            addCriterion("Gprice <=", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceIn(List<Long> values) {
            addCriterion("Gprice in", values, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotIn(List<Long> values) {
            addCriterion("Gprice not in", values, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceBetween(Long value1, Long value2) {
            addCriterion("Gprice between", value1, value2, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotBetween(Long value1, Long value2) {
            addCriterion("Gprice not between", value1, value2, "gprice");
            return (Criteria) this;
        }

        public Criteria andGcategoryIsNull() {
            addCriterion("Gcategory is null");
            return (Criteria) this;
        }

        public Criteria andGcategoryIsNotNull() {
            addCriterion("Gcategory is not null");
            return (Criteria) this;
        }

        public Criteria andGcategoryEqualTo(String value) {
            addCriterion("Gcategory =", value, "gcategory");
            return (Criteria) this;
        }

        public Criteria andGcategoryNotEqualTo(String value) {
            addCriterion("Gcategory <>", value, "gcategory");
            return (Criteria) this;
        }

        public Criteria andGcategoryGreaterThan(String value) {
            addCriterion("Gcategory >", value, "gcategory");
            return (Criteria) this;
        }

        public Criteria andGcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("Gcategory >=", value, "gcategory");
            return (Criteria) this;
        }

        public Criteria andGcategoryLessThan(String value) {
            addCriterion("Gcategory <", value, "gcategory");
            return (Criteria) this;
        }

        public Criteria andGcategoryLessThanOrEqualTo(String value) {
            addCriterion("Gcategory <=", value, "gcategory");
            return (Criteria) this;
        }

        public Criteria andGcategoryLike(String value) {
            addCriterion("Gcategory like", value, "gcategory");
            return (Criteria) this;
        }

        public Criteria andGcategoryNotLike(String value) {
            addCriterion("Gcategory not like", value, "gcategory");
            return (Criteria) this;
        }

        public Criteria andGcategoryIn(List<String> values) {
            addCriterion("Gcategory in", values, "gcategory");
            return (Criteria) this;
        }

        public Criteria andGcategoryNotIn(List<String> values) {
            addCriterion("Gcategory not in", values, "gcategory");
            return (Criteria) this;
        }

        public Criteria andGcategoryBetween(String value1, String value2) {
            addCriterion("Gcategory between", value1, value2, "gcategory");
            return (Criteria) this;
        }

        public Criteria andGcategoryNotBetween(String value1, String value2) {
            addCriterion("Gcategory not between", value1, value2, "gcategory");
            return (Criteria) this;
        }

        public Criteria andGumberIsNull() {
            addCriterion("Gumber is null");
            return (Criteria) this;
        }

        public Criteria andGumberIsNotNull() {
            addCriterion("Gumber is not null");
            return (Criteria) this;
        }

        public Criteria andGumberEqualTo(Integer value) {
            addCriterion("Gumber =", value, "gumber");
            return (Criteria) this;
        }

        public Criteria andGumberNotEqualTo(Integer value) {
            addCriterion("Gumber <>", value, "gumber");
            return (Criteria) this;
        }

        public Criteria andGumberGreaterThan(Integer value) {
            addCriterion("Gumber >", value, "gumber");
            return (Criteria) this;
        }

        public Criteria andGumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("Gumber >=", value, "gumber");
            return (Criteria) this;
        }

        public Criteria andGumberLessThan(Integer value) {
            addCriterion("Gumber <", value, "gumber");
            return (Criteria) this;
        }

        public Criteria andGumberLessThanOrEqualTo(Integer value) {
            addCriterion("Gumber <=", value, "gumber");
            return (Criteria) this;
        }

        public Criteria andGumberIn(List<Integer> values) {
            addCriterion("Gumber in", values, "gumber");
            return (Criteria) this;
        }

        public Criteria andGumberNotIn(List<Integer> values) {
            addCriterion("Gumber not in", values, "gumber");
            return (Criteria) this;
        }

        public Criteria andGumberBetween(Integer value1, Integer value2) {
            addCriterion("Gumber between", value1, value2, "gumber");
            return (Criteria) this;
        }

        public Criteria andGumberNotBetween(Integer value1, Integer value2) {
            addCriterion("Gumber not between", value1, value2, "gumber");
            return (Criteria) this;
        }

        public Criteria andGpictureIsNull() {
            addCriterion("Gpicture is null");
            return (Criteria) this;
        }

        public Criteria andGpictureIsNotNull() {
            addCriterion("Gpicture is not null");
            return (Criteria) this;
        }

        public Criteria andGpictureEqualTo(String value) {
            addCriterion("Gpicture =", value, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureNotEqualTo(String value) {
            addCriterion("Gpicture <>", value, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureGreaterThan(String value) {
            addCriterion("Gpicture >", value, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureGreaterThanOrEqualTo(String value) {
            addCriterion("Gpicture >=", value, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureLessThan(String value) {
            addCriterion("Gpicture <", value, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureLessThanOrEqualTo(String value) {
            addCriterion("Gpicture <=", value, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureLike(String value) {
            addCriterion("Gpicture like", value, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureNotLike(String value) {
            addCriterion("Gpicture not like", value, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureIn(List<String> values) {
            addCriterion("Gpicture in", values, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureNotIn(List<String> values) {
            addCriterion("Gpicture not in", values, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureBetween(String value1, String value2) {
            addCriterion("Gpicture between", value1, value2, "gpicture");
            return (Criteria) this;
        }

        public Criteria andGpictureNotBetween(String value1, String value2) {
            addCriterion("Gpicture not between", value1, value2, "gpicture");
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