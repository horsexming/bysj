package com.bysj.bean;

import java.util.ArrayList;
import java.util.List;

public class BusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessExample() {
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

        public Criteria andBnameIsNull() {
            addCriterion("Bname is null");
            return (Criteria) this;
        }

        public Criteria andBnameIsNotNull() {
            addCriterion("Bname is not null");
            return (Criteria) this;
        }

        public Criteria andBnameEqualTo(String value) {
            addCriterion("Bname =", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotEqualTo(String value) {
            addCriterion("Bname <>", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThan(String value) {
            addCriterion("Bname >", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThanOrEqualTo(String value) {
            addCriterion("Bname >=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThan(String value) {
            addCriterion("Bname <", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThanOrEqualTo(String value) {
            addCriterion("Bname <=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLike(String value) {
            addCriterion("Bname like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotLike(String value) {
            addCriterion("Bname not like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameIn(List<String> values) {
            addCriterion("Bname in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotIn(List<String> values) {
            addCriterion("Bname not in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameBetween(String value1, String value2) {
            addCriterion("Bname between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotBetween(String value1, String value2) {
            addCriterion("Bname not between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBpassworIsNull() {
            addCriterion("Bpasswor is null");
            return (Criteria) this;
        }

        public Criteria andBpassworIsNotNull() {
            addCriterion("Bpasswor is not null");
            return (Criteria) this;
        }

        public Criteria andBpassworEqualTo(String value) {
            addCriterion("Bpasswor =", value, "bpasswor");
            return (Criteria) this;
        }

        public Criteria andBpassworNotEqualTo(String value) {
            addCriterion("Bpasswor <>", value, "bpasswor");
            return (Criteria) this;
        }

        public Criteria andBpassworGreaterThan(String value) {
            addCriterion("Bpasswor >", value, "bpasswor");
            return (Criteria) this;
        }

        public Criteria andBpassworGreaterThanOrEqualTo(String value) {
            addCriterion("Bpasswor >=", value, "bpasswor");
            return (Criteria) this;
        }

        public Criteria andBpassworLessThan(String value) {
            addCriterion("Bpasswor <", value, "bpasswor");
            return (Criteria) this;
        }

        public Criteria andBpassworLessThanOrEqualTo(String value) {
            addCriterion("Bpasswor <=", value, "bpasswor");
            return (Criteria) this;
        }

        public Criteria andBpassworLike(String value) {
            addCriterion("Bpasswor like", value, "bpasswor");
            return (Criteria) this;
        }

        public Criteria andBpassworNotLike(String value) {
            addCriterion("Bpasswor not like", value, "bpasswor");
            return (Criteria) this;
        }

        public Criteria andBpassworIn(List<String> values) {
            addCriterion("Bpasswor in", values, "bpasswor");
            return (Criteria) this;
        }

        public Criteria andBpassworNotIn(List<String> values) {
            addCriterion("Bpasswor not in", values, "bpasswor");
            return (Criteria) this;
        }

        public Criteria andBpassworBetween(String value1, String value2) {
            addCriterion("Bpasswor between", value1, value2, "bpasswor");
            return (Criteria) this;
        }

        public Criteria andBpassworNotBetween(String value1, String value2) {
            addCriterion("Bpasswor not between", value1, value2, "bpasswor");
            return (Criteria) this;
        }

        public Criteria andBphoneIsNull() {
            addCriterion("Bphone is null");
            return (Criteria) this;
        }

        public Criteria andBphoneIsNotNull() {
            addCriterion("Bphone is not null");
            return (Criteria) this;
        }

        public Criteria andBphoneEqualTo(String value) {
            addCriterion("Bphone =", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotEqualTo(String value) {
            addCriterion("Bphone <>", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneGreaterThan(String value) {
            addCriterion("Bphone >", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneGreaterThanOrEqualTo(String value) {
            addCriterion("Bphone >=", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneLessThan(String value) {
            addCriterion("Bphone <", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneLessThanOrEqualTo(String value) {
            addCriterion("Bphone <=", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneLike(String value) {
            addCriterion("Bphone like", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotLike(String value) {
            addCriterion("Bphone not like", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneIn(List<String> values) {
            addCriterion("Bphone in", values, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotIn(List<String> values) {
            addCriterion("Bphone not in", values, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneBetween(String value1, String value2) {
            addCriterion("Bphone between", value1, value2, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotBetween(String value1, String value2) {
            addCriterion("Bphone not between", value1, value2, "bphone");
            return (Criteria) this;
        }

        public Criteria andBemailIsNull() {
            addCriterion("Bemail is null");
            return (Criteria) this;
        }

        public Criteria andBemailIsNotNull() {
            addCriterion("Bemail is not null");
            return (Criteria) this;
        }

        public Criteria andBemailEqualTo(String value) {
            addCriterion("Bemail =", value, "bemail");
            return (Criteria) this;
        }

        public Criteria andBemailNotEqualTo(String value) {
            addCriterion("Bemail <>", value, "bemail");
            return (Criteria) this;
        }

        public Criteria andBemailGreaterThan(String value) {
            addCriterion("Bemail >", value, "bemail");
            return (Criteria) this;
        }

        public Criteria andBemailGreaterThanOrEqualTo(String value) {
            addCriterion("Bemail >=", value, "bemail");
            return (Criteria) this;
        }

        public Criteria andBemailLessThan(String value) {
            addCriterion("Bemail <", value, "bemail");
            return (Criteria) this;
        }

        public Criteria andBemailLessThanOrEqualTo(String value) {
            addCriterion("Bemail <=", value, "bemail");
            return (Criteria) this;
        }

        public Criteria andBemailLike(String value) {
            addCriterion("Bemail like", value, "bemail");
            return (Criteria) this;
        }

        public Criteria andBemailNotLike(String value) {
            addCriterion("Bemail not like", value, "bemail");
            return (Criteria) this;
        }

        public Criteria andBemailIn(List<String> values) {
            addCriterion("Bemail in", values, "bemail");
            return (Criteria) this;
        }

        public Criteria andBemailNotIn(List<String> values) {
            addCriterion("Bemail not in", values, "bemail");
            return (Criteria) this;
        }

        public Criteria andBemailBetween(String value1, String value2) {
            addCriterion("Bemail between", value1, value2, "bemail");
            return (Criteria) this;
        }

        public Criteria andBemailNotBetween(String value1, String value2) {
            addCriterion("Bemail not between", value1, value2, "bemail");
            return (Criteria) this;
        }

        public Criteria andBaddressIsNull() {
            addCriterion("Baddress is null");
            return (Criteria) this;
        }

        public Criteria andBaddressIsNotNull() {
            addCriterion("Baddress is not null");
            return (Criteria) this;
        }

        public Criteria andBaddressEqualTo(String value) {
            addCriterion("Baddress =", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressNotEqualTo(String value) {
            addCriterion("Baddress <>", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressGreaterThan(String value) {
            addCriterion("Baddress >", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressGreaterThanOrEqualTo(String value) {
            addCriterion("Baddress >=", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressLessThan(String value) {
            addCriterion("Baddress <", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressLessThanOrEqualTo(String value) {
            addCriterion("Baddress <=", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressLike(String value) {
            addCriterion("Baddress like", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressNotLike(String value) {
            addCriterion("Baddress not like", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressIn(List<String> values) {
            addCriterion("Baddress in", values, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressNotIn(List<String> values) {
            addCriterion("Baddress not in", values, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressBetween(String value1, String value2) {
            addCriterion("Baddress between", value1, value2, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressNotBetween(String value1, String value2) {
            addCriterion("Baddress not between", value1, value2, "baddress");
            return (Criteria) this;
        }

        public Criteria andBsexIsNull() {
            addCriterion("Bsex is null");
            return (Criteria) this;
        }

        public Criteria andBsexIsNotNull() {
            addCriterion("Bsex is not null");
            return (Criteria) this;
        }

        public Criteria andBsexEqualTo(String value) {
            addCriterion("Bsex =", value, "bsex");
            return (Criteria) this;
        }

        public Criteria andBsexNotEqualTo(String value) {
            addCriterion("Bsex <>", value, "bsex");
            return (Criteria) this;
        }

        public Criteria andBsexGreaterThan(String value) {
            addCriterion("Bsex >", value, "bsex");
            return (Criteria) this;
        }

        public Criteria andBsexGreaterThanOrEqualTo(String value) {
            addCriterion("Bsex >=", value, "bsex");
            return (Criteria) this;
        }

        public Criteria andBsexLessThan(String value) {
            addCriterion("Bsex <", value, "bsex");
            return (Criteria) this;
        }

        public Criteria andBsexLessThanOrEqualTo(String value) {
            addCriterion("Bsex <=", value, "bsex");
            return (Criteria) this;
        }

        public Criteria andBsexLike(String value) {
            addCriterion("Bsex like", value, "bsex");
            return (Criteria) this;
        }

        public Criteria andBsexNotLike(String value) {
            addCriterion("Bsex not like", value, "bsex");
            return (Criteria) this;
        }

        public Criteria andBsexIn(List<String> values) {
            addCriterion("Bsex in", values, "bsex");
            return (Criteria) this;
        }

        public Criteria andBsexNotIn(List<String> values) {
            addCriterion("Bsex not in", values, "bsex");
            return (Criteria) this;
        }

        public Criteria andBsexBetween(String value1, String value2) {
            addCriterion("Bsex between", value1, value2, "bsex");
            return (Criteria) this;
        }

        public Criteria andBsexNotBetween(String value1, String value2) {
            addCriterion("Bsex not between", value1, value2, "bsex");
            return (Criteria) this;
        }

        public Criteria andBgoodsIsNull() {
            addCriterion("Bgoods is null");
            return (Criteria) this;
        }

        public Criteria andBgoodsIsNotNull() {
            addCriterion("Bgoods is not null");
            return (Criteria) this;
        }

        public Criteria andBgoodsEqualTo(Integer value) {
            addCriterion("Bgoods =", value, "bgoods");
            return (Criteria) this;
        }

        public Criteria andBgoodsNotEqualTo(Integer value) {
            addCriterion("Bgoods <>", value, "bgoods");
            return (Criteria) this;
        }

        public Criteria andBgoodsGreaterThan(Integer value) {
            addCriterion("Bgoods >", value, "bgoods");
            return (Criteria) this;
        }

        public Criteria andBgoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("Bgoods >=", value, "bgoods");
            return (Criteria) this;
        }

        public Criteria andBgoodsLessThan(Integer value) {
            addCriterion("Bgoods <", value, "bgoods");
            return (Criteria) this;
        }

        public Criteria andBgoodsLessThanOrEqualTo(Integer value) {
            addCriterion("Bgoods <=", value, "bgoods");
            return (Criteria) this;
        }

        public Criteria andBgoodsIn(List<Integer> values) {
            addCriterion("Bgoods in", values, "bgoods");
            return (Criteria) this;
        }

        public Criteria andBgoodsNotIn(List<Integer> values) {
            addCriterion("Bgoods not in", values, "bgoods");
            return (Criteria) this;
        }

        public Criteria andBgoodsBetween(Integer value1, Integer value2) {
            addCriterion("Bgoods between", value1, value2, "bgoods");
            return (Criteria) this;
        }

        public Criteria andBgoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("Bgoods not between", value1, value2, "bgoods");
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