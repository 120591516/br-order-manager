package br.order.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrPermissionOperationExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrPermissionOperationExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdIsNull() {
            addCriterion("role_permission_id is null");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdIsNotNull() {
            addCriterion("role_permission_id is not null");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdEqualTo(Long value) {
            addCriterion("role_permission_id =", value, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdNotEqualTo(Long value) {
            addCriterion("role_permission_id <>", value, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdGreaterThan(Long value) {
            addCriterion("role_permission_id >", value, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("role_permission_id >=", value, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdLessThan(Long value) {
            addCriterion("role_permission_id <", value, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdLessThanOrEqualTo(Long value) {
            addCriterion("role_permission_id <=", value, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdIn(List<Long> values) {
            addCriterion("role_permission_id in", values, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdNotIn(List<Long> values) {
            addCriterion("role_permission_id not in", values, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdBetween(Long value1, Long value2) {
            addCriterion("role_permission_id between", value1, value2, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andRolePermissionIdNotBetween(Long value1, Long value2) {
            addCriterion("role_permission_id not between", value1, value2, "rolePermissionId");
            return (Criteria) this;
        }

        public Criteria andOperationIdIsNull() {
            addCriterion("operation_id is null");
            return (Criteria) this;
        }

        public Criteria andOperationIdIsNotNull() {
            addCriterion("operation_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperationIdEqualTo(Long value) {
            addCriterion("operation_id =", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotEqualTo(Long value) {
            addCriterion("operation_id <>", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdGreaterThan(Long value) {
            addCriterion("operation_id >", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("operation_id >=", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdLessThan(Long value) {
            addCriterion("operation_id <", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdLessThanOrEqualTo(Long value) {
            addCriterion("operation_id <=", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdIn(List<Long> values) {
            addCriterion("operation_id in", values, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotIn(List<Long> values) {
            addCriterion("operation_id not in", values, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdBetween(Long value1, Long value2) {
            addCriterion("operation_id between", value1, value2, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotBetween(Long value1, Long value2) {
            addCriterion("operation_id not between", value1, value2, "operationId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdIsNull() {
            addCriterion("edit_user_id is null");
            return (Criteria) this;
        }

        public Criteria andEditUserIdIsNotNull() {
            addCriterion("edit_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andEditUserIdEqualTo(Long value) {
            addCriterion("edit_user_id =", value, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdNotEqualTo(Long value) {
            addCriterion("edit_user_id <>", value, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdGreaterThan(Long value) {
            addCriterion("edit_user_id >", value, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("edit_user_id >=", value, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdLessThan(Long value) {
            addCriterion("edit_user_id <", value, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdLessThanOrEqualTo(Long value) {
            addCriterion("edit_user_id <=", value, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdIn(List<Long> values) {
            addCriterion("edit_user_id in", values, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdNotIn(List<Long> values) {
            addCriterion("edit_user_id not in", values, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdBetween(Long value1, Long value2) {
            addCriterion("edit_user_id between", value1, value2, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdNotBetween(Long value1, Long value2) {
            addCriterion("edit_user_id not between", value1, value2, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserNameIsNull() {
            addCriterion("edit_user_name is null");
            return (Criteria) this;
        }

        public Criteria andEditUserNameIsNotNull() {
            addCriterion("edit_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andEditUserNameEqualTo(String value) {
            addCriterion("edit_user_name =", value, "editUserName");
            return (Criteria) this;
        }

        public Criteria andEditUserNameNotEqualTo(String value) {
            addCriterion("edit_user_name <>", value, "editUserName");
            return (Criteria) this;
        }

        public Criteria andEditUserNameGreaterThan(String value) {
            addCriterion("edit_user_name >", value, "editUserName");
            return (Criteria) this;
        }

        public Criteria andEditUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("edit_user_name >=", value, "editUserName");
            return (Criteria) this;
        }

        public Criteria andEditUserNameLessThan(String value) {
            addCriterion("edit_user_name <", value, "editUserName");
            return (Criteria) this;
        }

        public Criteria andEditUserNameLessThanOrEqualTo(String value) {
            addCriterion("edit_user_name <=", value, "editUserName");
            return (Criteria) this;
        }

        public Criteria andEditUserNameLike(String value) {
            addCriterion("edit_user_name like", value, "editUserName");
            return (Criteria) this;
        }

        public Criteria andEditUserNameNotLike(String value) {
            addCriterion("edit_user_name not like", value, "editUserName");
            return (Criteria) this;
        }

        public Criteria andEditUserNameIn(List<String> values) {
            addCriterion("edit_user_name in", values, "editUserName");
            return (Criteria) this;
        }

        public Criteria andEditUserNameNotIn(List<String> values) {
            addCriterion("edit_user_name not in", values, "editUserName");
            return (Criteria) this;
        }

        public Criteria andEditUserNameBetween(String value1, String value2) {
            addCriterion("edit_user_name between", value1, value2, "editUserName");
            return (Criteria) this;
        }

        public Criteria andEditUserNameNotBetween(String value1, String value2) {
            addCriterion("edit_user_name not between", value1, value2, "editUserName");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNull() {
            addCriterion("edittime is null");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNotNull() {
            addCriterion("edittime is not null");
            return (Criteria) this;
        }

        public Criteria andEdittimeEqualTo(Date value) {
            addCriterion("edittime =", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotEqualTo(Date value) {
            addCriterion("edittime <>", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThan(Date value) {
            addCriterion("edittime >", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edittime >=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThan(Date value) {
            addCriterion("edittime <", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThanOrEqualTo(Date value) {
            addCriterion("edittime <=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIn(List<Date> values) {
            addCriterion("edittime in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotIn(List<Date> values) {
            addCriterion("edittime not in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeBetween(Date value1, Date value2) {
            addCriterion("edittime between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotBetween(Date value1, Date value2) {
            addCriterion("edittime not between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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