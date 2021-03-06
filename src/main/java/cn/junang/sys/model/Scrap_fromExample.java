package cn.junang.sys.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Scrap_fromExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table scrap_from
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table scrap_from
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table scrap_from
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scrap_from
     *
     * @mbg.generated
     */
    public Scrap_fromExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scrap_from
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scrap_from
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scrap_from
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scrap_from
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scrap_from
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scrap_from
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scrap_from
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
     * This method corresponds to the database table scrap_from
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
     * This method corresponds to the database table scrap_from
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scrap_from
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
     * This class corresponds to the database table scrap_from
     *
     * @mbg.generated
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

        public Criteria andChecIdIsNull() {
            addCriterion("chec_id is null");
            return (Criteria) this;
        }

        public Criteria andChecIdIsNotNull() {
            addCriterion("chec_id is not null");
            return (Criteria) this;
        }

        public Criteria andChecIdEqualTo(Integer value) {
            addCriterion("chec_id =", value, "checId");
            return (Criteria) this;
        }

        public Criteria andChecIdNotEqualTo(Integer value) {
            addCriterion("chec_id <>", value, "checId");
            return (Criteria) this;
        }

        public Criteria andChecIdGreaterThan(Integer value) {
            addCriterion("chec_id >", value, "checId");
            return (Criteria) this;
        }

        public Criteria andChecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chec_id >=", value, "checId");
            return (Criteria) this;
        }

        public Criteria andChecIdLessThan(Integer value) {
            addCriterion("chec_id <", value, "checId");
            return (Criteria) this;
        }

        public Criteria andChecIdLessThanOrEqualTo(Integer value) {
            addCriterion("chec_id <=", value, "checId");
            return (Criteria) this;
        }

        public Criteria andChecIdIn(List<Integer> values) {
            addCriterion("chec_id in", values, "checId");
            return (Criteria) this;
        }

        public Criteria andChecIdNotIn(List<Integer> values) {
            addCriterion("chec_id not in", values, "checId");
            return (Criteria) this;
        }

        public Criteria andChecIdBetween(Integer value1, Integer value2) {
            addCriterion("chec_id between", value1, value2, "checId");
            return (Criteria) this;
        }

        public Criteria andChecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chec_id not between", value1, value2, "checId");
            return (Criteria) this;
        }

        public Criteria andSupNameIsNull() {
            addCriterion("sup_name is null");
            return (Criteria) this;
        }

        public Criteria andSupNameIsNotNull() {
            addCriterion("sup_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupNameEqualTo(String value) {
            addCriterion("sup_name =", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameNotEqualTo(String value) {
            addCriterion("sup_name <>", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameGreaterThan(String value) {
            addCriterion("sup_name >", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameGreaterThanOrEqualTo(String value) {
            addCriterion("sup_name >=", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameLessThan(String value) {
            addCriterion("sup_name <", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameLessThanOrEqualTo(String value) {
            addCriterion("sup_name <=", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameLike(String value) {
            addCriterion("sup_name like", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameNotLike(String value) {
            addCriterion("sup_name not like", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameIn(List<String> values) {
            addCriterion("sup_name in", values, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameNotIn(List<String> values) {
            addCriterion("sup_name not in", values, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameBetween(String value1, String value2) {
            addCriterion("sup_name between", value1, value2, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameNotBetween(String value1, String value2) {
            addCriterion("sup_name not between", value1, value2, "supName");
            return (Criteria) this;
        }

        public Criteria andSpeModelIsNull() {
            addCriterion("spe_model is null");
            return (Criteria) this;
        }

        public Criteria andSpeModelIsNotNull() {
            addCriterion("spe_model is not null");
            return (Criteria) this;
        }

        public Criteria andSpeModelEqualTo(String value) {
            addCriterion("spe_model =", value, "speModel");
            return (Criteria) this;
        }

        public Criteria andSpeModelNotEqualTo(String value) {
            addCriterion("spe_model <>", value, "speModel");
            return (Criteria) this;
        }

        public Criteria andSpeModelGreaterThan(String value) {
            addCriterion("spe_model >", value, "speModel");
            return (Criteria) this;
        }

        public Criteria andSpeModelGreaterThanOrEqualTo(String value) {
            addCriterion("spe_model >=", value, "speModel");
            return (Criteria) this;
        }

        public Criteria andSpeModelLessThan(String value) {
            addCriterion("spe_model <", value, "speModel");
            return (Criteria) this;
        }

        public Criteria andSpeModelLessThanOrEqualTo(String value) {
            addCriterion("spe_model <=", value, "speModel");
            return (Criteria) this;
        }

        public Criteria andSpeModelLike(String value) {
            addCriterion("spe_model like", value, "speModel");
            return (Criteria) this;
        }

        public Criteria andSpeModelNotLike(String value) {
            addCriterion("spe_model not like", value, "speModel");
            return (Criteria) this;
        }

        public Criteria andSpeModelIn(List<String> values) {
            addCriterion("spe_model in", values, "speModel");
            return (Criteria) this;
        }

        public Criteria andSpeModelNotIn(List<String> values) {
            addCriterion("spe_model not in", values, "speModel");
            return (Criteria) this;
        }

        public Criteria andSpeModelBetween(String value1, String value2) {
            addCriterion("spe_model between", value1, value2, "speModel");
            return (Criteria) this;
        }

        public Criteria andSpeModelNotBetween(String value1, String value2) {
            addCriterion("spe_model not between", value1, value2, "speModel");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andScrDataIsNull() {
            addCriterion("scr_data is null");
            return (Criteria) this;
        }

        public Criteria andScrDataIsNotNull() {
            addCriterion("scr_data is not null");
            return (Criteria) this;
        }

        public Criteria andScrDataEqualTo(Date value) {
            addCriterionForJDBCDate("scr_data =", value, "scrData");
            return (Criteria) this;
        }

        public Criteria andScrDataNotEqualTo(Date value) {
            addCriterionForJDBCDate("scr_data <>", value, "scrData");
            return (Criteria) this;
        }

        public Criteria andScrDataGreaterThan(Date value) {
            addCriterionForJDBCDate("scr_data >", value, "scrData");
            return (Criteria) this;
        }

        public Criteria andScrDataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("scr_data >=", value, "scrData");
            return (Criteria) this;
        }

        public Criteria andScrDataLessThan(Date value) {
            addCriterionForJDBCDate("scr_data <", value, "scrData");
            return (Criteria) this;
        }

        public Criteria andScrDataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("scr_data <=", value, "scrData");
            return (Criteria) this;
        }

        public Criteria andScrDataIn(List<Date> values) {
            addCriterionForJDBCDate("scr_data in", values, "scrData");
            return (Criteria) this;
        }

        public Criteria andScrDataNotIn(List<Date> values) {
            addCriterionForJDBCDate("scr_data not in", values, "scrData");
            return (Criteria) this;
        }

        public Criteria andScrDataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("scr_data between", value1, value2, "scrData");
            return (Criteria) this;
        }

        public Criteria andScrDataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("scr_data not between", value1, value2, "scrData");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table scrap_from
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
     * This class corresponds to the database table scrap_from
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