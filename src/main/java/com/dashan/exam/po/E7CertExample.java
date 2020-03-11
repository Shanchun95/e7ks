package com.dashan.exam.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class E7CertExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public E7CertExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(Integer value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(Integer value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(Integer value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(Integer value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(Integer value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(Integer value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<Integer> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<Integer> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(Integer value1, Integer value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(Integer value1, Integer value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEnterIsNull() {
            addCriterion("enter is null");
            return (Criteria) this;
        }

        public Criteria andEnterIsNotNull() {
            addCriterion("enter is not null");
            return (Criteria) this;
        }

        public Criteria andEnterEqualTo(String value) {
            addCriterion("enter =", value, "enter");
            return (Criteria) this;
        }

        public Criteria andEnterNotEqualTo(String value) {
            addCriterion("enter <>", value, "enter");
            return (Criteria) this;
        }

        public Criteria andEnterGreaterThan(String value) {
            addCriterion("enter >", value, "enter");
            return (Criteria) this;
        }

        public Criteria andEnterGreaterThanOrEqualTo(String value) {
            addCriterion("enter >=", value, "enter");
            return (Criteria) this;
        }

        public Criteria andEnterLessThan(String value) {
            addCriterion("enter <", value, "enter");
            return (Criteria) this;
        }

        public Criteria andEnterLessThanOrEqualTo(String value) {
            addCriterion("enter <=", value, "enter");
            return (Criteria) this;
        }

        public Criteria andEnterLike(String value) {
            addCriterion("enter like", value, "enter");
            return (Criteria) this;
        }

        public Criteria andEnterNotLike(String value) {
            addCriterion("enter not like", value, "enter");
            return (Criteria) this;
        }

        public Criteria andEnterIn(List<String> values) {
            addCriterion("enter in", values, "enter");
            return (Criteria) this;
        }

        public Criteria andEnterNotIn(List<String> values) {
            addCriterion("enter not in", values, "enter");
            return (Criteria) this;
        }

        public Criteria andEnterBetween(String value1, String value2) {
            addCriterion("enter between", value1, value2, "enter");
            return (Criteria) this;
        }

        public Criteria andEnterNotBetween(String value1, String value2) {
            addCriterion("enter not between", value1, value2, "enter");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(String value) {
            addCriterion("point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(String value) {
            addCriterion("point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(String value) {
            addCriterion("point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(String value) {
            addCriterion("point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(String value) {
            addCriterion("point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(String value) {
            addCriterion("point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLike(String value) {
            addCriterion("point like", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotLike(String value) {
            addCriterion("point not like", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<String> values) {
            addCriterion("point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<String> values) {
            addCriterion("point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(String value1, String value2) {
            addCriterion("point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(String value1, String value2) {
            addCriterion("point not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andOutlineIsNull() {
            addCriterion("outline is null");
            return (Criteria) this;
        }

        public Criteria andOutlineIsNotNull() {
            addCriterion("outline is not null");
            return (Criteria) this;
        }

        public Criteria andOutlineEqualTo(String value) {
            addCriterion("outline =", value, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineNotEqualTo(String value) {
            addCriterion("outline <>", value, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineGreaterThan(String value) {
            addCriterion("outline >", value, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineGreaterThanOrEqualTo(String value) {
            addCriterion("outline >=", value, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineLessThan(String value) {
            addCriterion("outline <", value, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineLessThanOrEqualTo(String value) {
            addCriterion("outline <=", value, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineLike(String value) {
            addCriterion("outline like", value, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineNotLike(String value) {
            addCriterion("outline not like", value, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineIn(List<String> values) {
            addCriterion("outline in", values, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineNotIn(List<String> values) {
            addCriterion("outline not in", values, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineBetween(String value1, String value2) {
            addCriterion("outline between", value1, value2, "outline");
            return (Criteria) this;
        }

        public Criteria andOutlineNotBetween(String value1, String value2) {
            addCriterion("outline not between", value1, value2, "outline");
            return (Criteria) this;
        }

        public Criteria andExamIsNull() {
            addCriterion("exam is null");
            return (Criteria) this;
        }

        public Criteria andExamIsNotNull() {
            addCriterion("exam is not null");
            return (Criteria) this;
        }

        public Criteria andExamEqualTo(String value) {
            addCriterion("exam =", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamNotEqualTo(String value) {
            addCriterion("exam <>", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamGreaterThan(String value) {
            addCriterion("exam >", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamGreaterThanOrEqualTo(String value) {
            addCriterion("exam >=", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamLessThan(String value) {
            addCriterion("exam <", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamLessThanOrEqualTo(String value) {
            addCriterion("exam <=", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamLike(String value) {
            addCriterion("exam like", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamNotLike(String value) {
            addCriterion("exam not like", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamIn(List<String> values) {
            addCriterion("exam in", values, "exam");
            return (Criteria) this;
        }

        public Criteria andExamNotIn(List<String> values) {
            addCriterion("exam not in", values, "exam");
            return (Criteria) this;
        }

        public Criteria andExamBetween(String value1, String value2) {
            addCriterion("exam between", value1, value2, "exam");
            return (Criteria) this;
        }

        public Criteria andExamNotBetween(String value1, String value2) {
            addCriterion("exam not between", value1, value2, "exam");
            return (Criteria) this;
        }

        public Criteria andKnowIsNull() {
            addCriterion("know is null");
            return (Criteria) this;
        }

        public Criteria andKnowIsNotNull() {
            addCriterion("know is not null");
            return (Criteria) this;
        }

        public Criteria andKnowEqualTo(String value) {
            addCriterion("know =", value, "know");
            return (Criteria) this;
        }

        public Criteria andKnowNotEqualTo(String value) {
            addCriterion("know <>", value, "know");
            return (Criteria) this;
        }

        public Criteria andKnowGreaterThan(String value) {
            addCriterion("know >", value, "know");
            return (Criteria) this;
        }

        public Criteria andKnowGreaterThanOrEqualTo(String value) {
            addCriterion("know >=", value, "know");
            return (Criteria) this;
        }

        public Criteria andKnowLessThan(String value) {
            addCriterion("know <", value, "know");
            return (Criteria) this;
        }

        public Criteria andKnowLessThanOrEqualTo(String value) {
            addCriterion("know <=", value, "know");
            return (Criteria) this;
        }

        public Criteria andKnowLike(String value) {
            addCriterion("know like", value, "know");
            return (Criteria) this;
        }

        public Criteria andKnowNotLike(String value) {
            addCriterion("know not like", value, "know");
            return (Criteria) this;
        }

        public Criteria andKnowIn(List<String> values) {
            addCriterion("know in", values, "know");
            return (Criteria) this;
        }

        public Criteria andKnowNotIn(List<String> values) {
            addCriterion("know not in", values, "know");
            return (Criteria) this;
        }

        public Criteria andKnowBetween(String value1, String value2) {
            addCriterion("know between", value1, value2, "know");
            return (Criteria) this;
        }

        public Criteria andKnowNotBetween(String value1, String value2) {
            addCriterion("know not between", value1, value2, "know");
            return (Criteria) this;
        }

        public Criteria andCertGroupIsNull() {
            addCriterion("cert_group is null");
            return (Criteria) this;
        }

        public Criteria andCertGroupIsNotNull() {
            addCriterion("cert_group is not null");
            return (Criteria) this;
        }

        public Criteria andCertGroupEqualTo(String value) {
            addCriterion("cert_group =", value, "certGroup");
            return (Criteria) this;
        }

        public Criteria andCertGroupNotEqualTo(String value) {
            addCriterion("cert_group <>", value, "certGroup");
            return (Criteria) this;
        }

        public Criteria andCertGroupGreaterThan(String value) {
            addCriterion("cert_group >", value, "certGroup");
            return (Criteria) this;
        }

        public Criteria andCertGroupGreaterThanOrEqualTo(String value) {
            addCriterion("cert_group >=", value, "certGroup");
            return (Criteria) this;
        }

        public Criteria andCertGroupLessThan(String value) {
            addCriterion("cert_group <", value, "certGroup");
            return (Criteria) this;
        }

        public Criteria andCertGroupLessThanOrEqualTo(String value) {
            addCriterion("cert_group <=", value, "certGroup");
            return (Criteria) this;
        }

        public Criteria andCertGroupLike(String value) {
            addCriterion("cert_group like", value, "certGroup");
            return (Criteria) this;
        }

        public Criteria andCertGroupNotLike(String value) {
            addCriterion("cert_group not like", value, "certGroup");
            return (Criteria) this;
        }

        public Criteria andCertGroupIn(List<String> values) {
            addCriterion("cert_group in", values, "certGroup");
            return (Criteria) this;
        }

        public Criteria andCertGroupNotIn(List<String> values) {
            addCriterion("cert_group not in", values, "certGroup");
            return (Criteria) this;
        }

        public Criteria andCertGroupBetween(String value1, String value2) {
            addCriterion("cert_group between", value1, value2, "certGroup");
            return (Criteria) this;
        }

        public Criteria andCertGroupNotBetween(String value1, String value2) {
            addCriterion("cert_group not between", value1, value2, "certGroup");
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