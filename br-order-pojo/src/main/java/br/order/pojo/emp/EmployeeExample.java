package br.order.pojo.emp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Long value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Long value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Long value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Long value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Long value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Long> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Long> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Long value1, Long value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Long value1, Long value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andBrUserIdIsNull() {
            addCriterion("br_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBrUserIdIsNotNull() {
            addCriterion("br_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrUserIdEqualTo(Long value) {
            addCriterion("br_user_id =", value, "brUserId");
            return (Criteria) this;
        }

        public Criteria andBrUserIdNotEqualTo(Long value) {
            addCriterion("br_user_id <>", value, "brUserId");
            return (Criteria) this;
        }

        public Criteria andBrUserIdGreaterThan(Long value) {
            addCriterion("br_user_id >", value, "brUserId");
            return (Criteria) this;
        }

        public Criteria andBrUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("br_user_id >=", value, "brUserId");
            return (Criteria) this;
        }

        public Criteria andBrUserIdLessThan(Long value) {
            addCriterion("br_user_id <", value, "brUserId");
            return (Criteria) this;
        }

        public Criteria andBrUserIdLessThanOrEqualTo(Long value) {
            addCriterion("br_user_id <=", value, "brUserId");
            return (Criteria) this;
        }

        public Criteria andBrUserIdIn(List<Long> values) {
            addCriterion("br_user_id in", values, "brUserId");
            return (Criteria) this;
        }

        public Criteria andBrUserIdNotIn(List<Long> values) {
            addCriterion("br_user_id not in", values, "brUserId");
            return (Criteria) this;
        }

        public Criteria andBrUserIdBetween(Long value1, Long value2) {
            addCriterion("br_user_id between", value1, value2, "brUserId");
            return (Criteria) this;
        }

        public Criteria andBrUserIdNotBetween(Long value1, Long value2) {
            addCriterion("br_user_id not between", value1, value2, "brUserId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Long value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Long value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Long value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Long value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Long value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Long> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Long> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Long value1, Long value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Long value1, Long value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andEmpNumberIsNull() {
            addCriterion("emp_number is null");
            return (Criteria) this;
        }

        public Criteria andEmpNumberIsNotNull() {
            addCriterion("emp_number is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNumberEqualTo(String value) {
            addCriterion("emp_number =", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotEqualTo(String value) {
            addCriterion("emp_number <>", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberGreaterThan(String value) {
            addCriterion("emp_number >", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberGreaterThanOrEqualTo(String value) {
            addCriterion("emp_number >=", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberLessThan(String value) {
            addCriterion("emp_number <", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberLessThanOrEqualTo(String value) {
            addCriterion("emp_number <=", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberLike(String value) {
            addCriterion("emp_number like", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotLike(String value) {
            addCriterion("emp_number not like", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberIn(List<String> values) {
            addCriterion("emp_number in", values, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotIn(List<String> values) {
            addCriterion("emp_number not in", values, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberBetween(String value1, String value2) {
            addCriterion("emp_number between", value1, value2, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotBetween(String value1, String value2) {
            addCriterion("emp_number not between", value1, value2, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpStatusIsNull() {
            addCriterion("emp_status is null");
            return (Criteria) this;
        }

        public Criteria andEmpStatusIsNotNull() {
            addCriterion("emp_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmpStatusEqualTo(Integer value) {
            addCriterion("emp_status =", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotEqualTo(Integer value) {
            addCriterion("emp_status <>", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusGreaterThan(Integer value) {
            addCriterion("emp_status >", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_status >=", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusLessThan(Integer value) {
            addCriterion("emp_status <", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusLessThanOrEqualTo(Integer value) {
            addCriterion("emp_status <=", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusIn(List<Integer> values) {
            addCriterion("emp_status in", values, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotIn(List<Integer> values) {
            addCriterion("emp_status not in", values, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusBetween(Integer value1, Integer value2) {
            addCriterion("emp_status between", value1, value2, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_status not between", value1, value2, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNull() {
            addCriterion("emp_sex is null");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNotNull() {
            addCriterion("emp_sex is not null");
            return (Criteria) this;
        }

        public Criteria andEmpSexEqualTo(Integer value) {
            addCriterion("emp_sex =", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotEqualTo(Integer value) {
            addCriterion("emp_sex <>", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThan(Integer value) {
            addCriterion("emp_sex >", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_sex >=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThan(Integer value) {
            addCriterion("emp_sex <", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThanOrEqualTo(Integer value) {
            addCriterion("emp_sex <=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexIn(List<Integer> values) {
            addCriterion("emp_sex in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotIn(List<Integer> values) {
            addCriterion("emp_sex not in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexBetween(Integer value1, Integer value2) {
            addCriterion("emp_sex between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_sex not between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andNationIdIsNull() {
            addCriterion("nation_id is null");
            return (Criteria) this;
        }

        public Criteria andNationIdIsNotNull() {
            addCriterion("nation_id is not null");
            return (Criteria) this;
        }

        public Criteria andNationIdEqualTo(Integer value) {
            addCriterion("nation_id =", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotEqualTo(Integer value) {
            addCriterion("nation_id <>", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdGreaterThan(Integer value) {
            addCriterion("nation_id >", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("nation_id >=", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdLessThan(Integer value) {
            addCriterion("nation_id <", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdLessThanOrEqualTo(Integer value) {
            addCriterion("nation_id <=", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdIn(List<Integer> values) {
            addCriterion("nation_id in", values, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotIn(List<Integer> values) {
            addCriterion("nation_id not in", values, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdBetween(Integer value1, Integer value2) {
            addCriterion("nation_id between", value1, value2, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("nation_id not between", value1, value2, "nationId");
            return (Criteria) this;
        }

        public Criteria andEmpBirthDateIsNull() {
            addCriterion("emp_birth_date is null");
            return (Criteria) this;
        }

        public Criteria andEmpBirthDateIsNotNull() {
            addCriterion("emp_birth_date is not null");
            return (Criteria) this;
        }

        public Criteria andEmpBirthDateEqualTo(Date value) {
            addCriterion("emp_birth_date =", value, "empBirthDate");
            return (Criteria) this;
        }

        public Criteria andEmpBirthDateNotEqualTo(Date value) {
            addCriterion("emp_birth_date <>", value, "empBirthDate");
            return (Criteria) this;
        }

        public Criteria andEmpBirthDateGreaterThan(Date value) {
            addCriterion("emp_birth_date >", value, "empBirthDate");
            return (Criteria) this;
        }

        public Criteria andEmpBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("emp_birth_date >=", value, "empBirthDate");
            return (Criteria) this;
        }

        public Criteria andEmpBirthDateLessThan(Date value) {
            addCriterion("emp_birth_date <", value, "empBirthDate");
            return (Criteria) this;
        }

        public Criteria andEmpBirthDateLessThanOrEqualTo(Date value) {
            addCriterion("emp_birth_date <=", value, "empBirthDate");
            return (Criteria) this;
        }

        public Criteria andEmpBirthDateIn(List<Date> values) {
            addCriterion("emp_birth_date in", values, "empBirthDate");
            return (Criteria) this;
        }

        public Criteria andEmpBirthDateNotIn(List<Date> values) {
            addCriterion("emp_birth_date not in", values, "empBirthDate");
            return (Criteria) this;
        }

        public Criteria andEmpBirthDateBetween(Date value1, Date value2) {
            addCriterion("emp_birth_date between", value1, value2, "empBirthDate");
            return (Criteria) this;
        }

        public Criteria andEmpBirthDateNotBetween(Date value1, Date value2) {
            addCriterion("emp_birth_date not between", value1, value2, "empBirthDate");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNumberIsNull() {
            addCriterion("emp_identity_number is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNumberIsNotNull() {
            addCriterion("emp_identity_number is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNumberEqualTo(String value) {
            addCriterion("emp_identity_number =", value, "empIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNumberNotEqualTo(String value) {
            addCriterion("emp_identity_number <>", value, "empIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNumberGreaterThan(String value) {
            addCriterion("emp_identity_number >", value, "empIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNumberGreaterThanOrEqualTo(String value) {
            addCriterion("emp_identity_number >=", value, "empIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNumberLessThan(String value) {
            addCriterion("emp_identity_number <", value, "empIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNumberLessThanOrEqualTo(String value) {
            addCriterion("emp_identity_number <=", value, "empIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNumberLike(String value) {
            addCriterion("emp_identity_number like", value, "empIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNumberNotLike(String value) {
            addCriterion("emp_identity_number not like", value, "empIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNumberIn(List<String> values) {
            addCriterion("emp_identity_number in", values, "empIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNumberNotIn(List<String> values) {
            addCriterion("emp_identity_number not in", values, "empIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNumberBetween(String value1, String value2) {
            addCriterion("emp_identity_number between", value1, value2, "empIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNumberNotBetween(String value1, String value2) {
            addCriterion("emp_identity_number not between", value1, value2, "empIdentityNumber");
            return (Criteria) this;
        }

        public Criteria andEmpMaritalStatusIsNull() {
            addCriterion("emp_marital_status is null");
            return (Criteria) this;
        }

        public Criteria andEmpMaritalStatusIsNotNull() {
            addCriterion("emp_marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmpMaritalStatusEqualTo(Integer value) {
            addCriterion("emp_marital_status =", value, "empMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMaritalStatusNotEqualTo(Integer value) {
            addCriterion("emp_marital_status <>", value, "empMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMaritalStatusGreaterThan(Integer value) {
            addCriterion("emp_marital_status >", value, "empMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMaritalStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_marital_status >=", value, "empMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMaritalStatusLessThan(Integer value) {
            addCriterion("emp_marital_status <", value, "empMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMaritalStatusLessThanOrEqualTo(Integer value) {
            addCriterion("emp_marital_status <=", value, "empMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMaritalStatusIn(List<Integer> values) {
            addCriterion("emp_marital_status in", values, "empMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMaritalStatusNotIn(List<Integer> values) {
            addCriterion("emp_marital_status not in", values, "empMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMaritalStatusBetween(Integer value1, Integer value2) {
            addCriterion("emp_marital_status between", value1, value2, "empMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMaritalStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_marital_status not between", value1, value2, "empMaritalStatus");
            return (Criteria) this;
        }

        public Criteria andEmpHometownIsNull() {
            addCriterion("emp_hometown is null");
            return (Criteria) this;
        }

        public Criteria andEmpHometownIsNotNull() {
            addCriterion("emp_hometown is not null");
            return (Criteria) this;
        }

        public Criteria andEmpHometownEqualTo(String value) {
            addCriterion("emp_hometown =", value, "empHometown");
            return (Criteria) this;
        }

        public Criteria andEmpHometownNotEqualTo(String value) {
            addCriterion("emp_hometown <>", value, "empHometown");
            return (Criteria) this;
        }

        public Criteria andEmpHometownGreaterThan(String value) {
            addCriterion("emp_hometown >", value, "empHometown");
            return (Criteria) this;
        }

        public Criteria andEmpHometownGreaterThanOrEqualTo(String value) {
            addCriterion("emp_hometown >=", value, "empHometown");
            return (Criteria) this;
        }

        public Criteria andEmpHometownLessThan(String value) {
            addCriterion("emp_hometown <", value, "empHometown");
            return (Criteria) this;
        }

        public Criteria andEmpHometownLessThanOrEqualTo(String value) {
            addCriterion("emp_hometown <=", value, "empHometown");
            return (Criteria) this;
        }

        public Criteria andEmpHometownLike(String value) {
            addCriterion("emp_hometown like", value, "empHometown");
            return (Criteria) this;
        }

        public Criteria andEmpHometownNotLike(String value) {
            addCriterion("emp_hometown not like", value, "empHometown");
            return (Criteria) this;
        }

        public Criteria andEmpHometownIn(List<String> values) {
            addCriterion("emp_hometown in", values, "empHometown");
            return (Criteria) this;
        }

        public Criteria andEmpHometownNotIn(List<String> values) {
            addCriterion("emp_hometown not in", values, "empHometown");
            return (Criteria) this;
        }

        public Criteria andEmpHometownBetween(String value1, String value2) {
            addCriterion("emp_hometown between", value1, value2, "empHometown");
            return (Criteria) this;
        }

        public Criteria andEmpHometownNotBetween(String value1, String value2) {
            addCriterion("emp_hometown not between", value1, value2, "empHometown");
            return (Criteria) this;
        }

        public Criteria andEmpFamillyAddressIsNull() {
            addCriterion("emp_familly_address is null");
            return (Criteria) this;
        }

        public Criteria andEmpFamillyAddressIsNotNull() {
            addCriterion("emp_familly_address is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFamillyAddressEqualTo(String value) {
            addCriterion("emp_familly_address =", value, "empFamillyAddress");
            return (Criteria) this;
        }

        public Criteria andEmpFamillyAddressNotEqualTo(String value) {
            addCriterion("emp_familly_address <>", value, "empFamillyAddress");
            return (Criteria) this;
        }

        public Criteria andEmpFamillyAddressGreaterThan(String value) {
            addCriterion("emp_familly_address >", value, "empFamillyAddress");
            return (Criteria) this;
        }

        public Criteria andEmpFamillyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("emp_familly_address >=", value, "empFamillyAddress");
            return (Criteria) this;
        }

        public Criteria andEmpFamillyAddressLessThan(String value) {
            addCriterion("emp_familly_address <", value, "empFamillyAddress");
            return (Criteria) this;
        }

        public Criteria andEmpFamillyAddressLessThanOrEqualTo(String value) {
            addCriterion("emp_familly_address <=", value, "empFamillyAddress");
            return (Criteria) this;
        }

        public Criteria andEmpFamillyAddressLike(String value) {
            addCriterion("emp_familly_address like", value, "empFamillyAddress");
            return (Criteria) this;
        }

        public Criteria andEmpFamillyAddressNotLike(String value) {
            addCriterion("emp_familly_address not like", value, "empFamillyAddress");
            return (Criteria) this;
        }

        public Criteria andEmpFamillyAddressIn(List<String> values) {
            addCriterion("emp_familly_address in", values, "empFamillyAddress");
            return (Criteria) this;
        }

        public Criteria andEmpFamillyAddressNotIn(List<String> values) {
            addCriterion("emp_familly_address not in", values, "empFamillyAddress");
            return (Criteria) this;
        }

        public Criteria andEmpFamillyAddressBetween(String value1, String value2) {
            addCriterion("emp_familly_address between", value1, value2, "empFamillyAddress");
            return (Criteria) this;
        }

        public Criteria andEmpFamillyAddressNotBetween(String value1, String value2) {
            addCriterion("emp_familly_address not between", value1, value2, "empFamillyAddress");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIsNull() {
            addCriterion("emp_phone is null");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIsNotNull() {
            addCriterion("emp_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneEqualTo(String value) {
            addCriterion("emp_phone =", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotEqualTo(String value) {
            addCriterion("emp_phone <>", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneGreaterThan(String value) {
            addCriterion("emp_phone >", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("emp_phone >=", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLessThan(String value) {
            addCriterion("emp_phone <", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLessThanOrEqualTo(String value) {
            addCriterion("emp_phone <=", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLike(String value) {
            addCriterion("emp_phone like", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotLike(String value) {
            addCriterion("emp_phone not like", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIn(List<String> values) {
            addCriterion("emp_phone in", values, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotIn(List<String> values) {
            addCriterion("emp_phone not in", values, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneBetween(String value1, String value2) {
            addCriterion("emp_phone between", value1, value2, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotBetween(String value1, String value2) {
            addCriterion("emp_phone not between", value1, value2, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpEmailIsNull() {
            addCriterion("emp_email is null");
            return (Criteria) this;
        }

        public Criteria andEmpEmailIsNotNull() {
            addCriterion("emp_email is not null");
            return (Criteria) this;
        }

        public Criteria andEmpEmailEqualTo(String value) {
            addCriterion("emp_email =", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotEqualTo(String value) {
            addCriterion("emp_email <>", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailGreaterThan(String value) {
            addCriterion("emp_email >", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailGreaterThanOrEqualTo(String value) {
            addCriterion("emp_email >=", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailLessThan(String value) {
            addCriterion("emp_email <", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailLessThanOrEqualTo(String value) {
            addCriterion("emp_email <=", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailLike(String value) {
            addCriterion("emp_email like", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotLike(String value) {
            addCriterion("emp_email not like", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailIn(List<String> values) {
            addCriterion("emp_email in", values, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotIn(List<String> values) {
            addCriterion("emp_email not in", values, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailBetween(String value1, String value2) {
            addCriterion("emp_email between", value1, value2, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotBetween(String value1, String value2) {
            addCriterion("emp_email not between", value1, value2, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpHouseholdTypeIsNull() {
            addCriterion("emp_household_type is null");
            return (Criteria) this;
        }

        public Criteria andEmpHouseholdTypeIsNotNull() {
            addCriterion("emp_household_type is not null");
            return (Criteria) this;
        }

        public Criteria andEmpHouseholdTypeEqualTo(Integer value) {
            addCriterion("emp_household_type =", value, "empHouseholdType");
            return (Criteria) this;
        }

        public Criteria andEmpHouseholdTypeNotEqualTo(Integer value) {
            addCriterion("emp_household_type <>", value, "empHouseholdType");
            return (Criteria) this;
        }

        public Criteria andEmpHouseholdTypeGreaterThan(Integer value) {
            addCriterion("emp_household_type >", value, "empHouseholdType");
            return (Criteria) this;
        }

        public Criteria andEmpHouseholdTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_household_type >=", value, "empHouseholdType");
            return (Criteria) this;
        }

        public Criteria andEmpHouseholdTypeLessThan(Integer value) {
            addCriterion("emp_household_type <", value, "empHouseholdType");
            return (Criteria) this;
        }

        public Criteria andEmpHouseholdTypeLessThanOrEqualTo(Integer value) {
            addCriterion("emp_household_type <=", value, "empHouseholdType");
            return (Criteria) this;
        }

        public Criteria andEmpHouseholdTypeIn(List<Integer> values) {
            addCriterion("emp_household_type in", values, "empHouseholdType");
            return (Criteria) this;
        }

        public Criteria andEmpHouseholdTypeNotIn(List<Integer> values) {
            addCriterion("emp_household_type not in", values, "empHouseholdType");
            return (Criteria) this;
        }

        public Criteria andEmpHouseholdTypeBetween(Integer value1, Integer value2) {
            addCriterion("emp_household_type between", value1, value2, "empHouseholdType");
            return (Criteria) this;
        }

        public Criteria andEmpHouseholdTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_household_type not between", value1, value2, "empHouseholdType");
            return (Criteria) this;
        }

        public Criteria andEmpRegisteredAddressIsNull() {
            addCriterion("emp_registered_address is null");
            return (Criteria) this;
        }

        public Criteria andEmpRegisteredAddressIsNotNull() {
            addCriterion("emp_registered_address is not null");
            return (Criteria) this;
        }

        public Criteria andEmpRegisteredAddressEqualTo(String value) {
            addCriterion("emp_registered_address =", value, "empRegisteredAddress");
            return (Criteria) this;
        }

        public Criteria andEmpRegisteredAddressNotEqualTo(String value) {
            addCriterion("emp_registered_address <>", value, "empRegisteredAddress");
            return (Criteria) this;
        }

        public Criteria andEmpRegisteredAddressGreaterThan(String value) {
            addCriterion("emp_registered_address >", value, "empRegisteredAddress");
            return (Criteria) this;
        }

        public Criteria andEmpRegisteredAddressGreaterThanOrEqualTo(String value) {
            addCriterion("emp_registered_address >=", value, "empRegisteredAddress");
            return (Criteria) this;
        }

        public Criteria andEmpRegisteredAddressLessThan(String value) {
            addCriterion("emp_registered_address <", value, "empRegisteredAddress");
            return (Criteria) this;
        }

        public Criteria andEmpRegisteredAddressLessThanOrEqualTo(String value) {
            addCriterion("emp_registered_address <=", value, "empRegisteredAddress");
            return (Criteria) this;
        }

        public Criteria andEmpRegisteredAddressLike(String value) {
            addCriterion("emp_registered_address like", value, "empRegisteredAddress");
            return (Criteria) this;
        }

        public Criteria andEmpRegisteredAddressNotLike(String value) {
            addCriterion("emp_registered_address not like", value, "empRegisteredAddress");
            return (Criteria) this;
        }

        public Criteria andEmpRegisteredAddressIn(List<String> values) {
            addCriterion("emp_registered_address in", values, "empRegisteredAddress");
            return (Criteria) this;
        }

        public Criteria andEmpRegisteredAddressNotIn(List<String> values) {
            addCriterion("emp_registered_address not in", values, "empRegisteredAddress");
            return (Criteria) this;
        }

        public Criteria andEmpRegisteredAddressBetween(String value1, String value2) {
            addCriterion("emp_registered_address between", value1, value2, "empRegisteredAddress");
            return (Criteria) this;
        }

        public Criteria andEmpRegisteredAddressNotBetween(String value1, String value2) {
            addCriterion("emp_registered_address not between", value1, value2, "empRegisteredAddress");
            return (Criteria) this;
        }

        public Criteria andEmpCreateIdIsNull() {
            addCriterion("emp_create_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpCreateIdIsNotNull() {
            addCriterion("emp_create_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCreateIdEqualTo(Long value) {
            addCriterion("emp_create_id =", value, "empCreateId");
            return (Criteria) this;
        }

        public Criteria andEmpCreateIdNotEqualTo(Long value) {
            addCriterion("emp_create_id <>", value, "empCreateId");
            return (Criteria) this;
        }

        public Criteria andEmpCreateIdGreaterThan(Long value) {
            addCriterion("emp_create_id >", value, "empCreateId");
            return (Criteria) this;
        }

        public Criteria andEmpCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("emp_create_id >=", value, "empCreateId");
            return (Criteria) this;
        }

        public Criteria andEmpCreateIdLessThan(Long value) {
            addCriterion("emp_create_id <", value, "empCreateId");
            return (Criteria) this;
        }

        public Criteria andEmpCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("emp_create_id <=", value, "empCreateId");
            return (Criteria) this;
        }

        public Criteria andEmpCreateIdIn(List<Long> values) {
            addCriterion("emp_create_id in", values, "empCreateId");
            return (Criteria) this;
        }

        public Criteria andEmpCreateIdNotIn(List<Long> values) {
            addCriterion("emp_create_id not in", values, "empCreateId");
            return (Criteria) this;
        }

        public Criteria andEmpCreateIdBetween(Long value1, Long value2) {
            addCriterion("emp_create_id between", value1, value2, "empCreateId");
            return (Criteria) this;
        }

        public Criteria andEmpCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("emp_create_id not between", value1, value2, "empCreateId");
            return (Criteria) this;
        }

        public Criteria andEmpCreateNameIsNull() {
            addCriterion("emp_create_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpCreateNameIsNotNull() {
            addCriterion("emp_create_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCreateNameEqualTo(String value) {
            addCriterion("emp_create_name =", value, "empCreateName");
            return (Criteria) this;
        }

        public Criteria andEmpCreateNameNotEqualTo(String value) {
            addCriterion("emp_create_name <>", value, "empCreateName");
            return (Criteria) this;
        }

        public Criteria andEmpCreateNameGreaterThan(String value) {
            addCriterion("emp_create_name >", value, "empCreateName");
            return (Criteria) this;
        }

        public Criteria andEmpCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_create_name >=", value, "empCreateName");
            return (Criteria) this;
        }

        public Criteria andEmpCreateNameLessThan(String value) {
            addCriterion("emp_create_name <", value, "empCreateName");
            return (Criteria) this;
        }

        public Criteria andEmpCreateNameLessThanOrEqualTo(String value) {
            addCriterion("emp_create_name <=", value, "empCreateName");
            return (Criteria) this;
        }

        public Criteria andEmpCreateNameLike(String value) {
            addCriterion("emp_create_name like", value, "empCreateName");
            return (Criteria) this;
        }

        public Criteria andEmpCreateNameNotLike(String value) {
            addCriterion("emp_create_name not like", value, "empCreateName");
            return (Criteria) this;
        }

        public Criteria andEmpCreateNameIn(List<String> values) {
            addCriterion("emp_create_name in", values, "empCreateName");
            return (Criteria) this;
        }

        public Criteria andEmpCreateNameNotIn(List<String> values) {
            addCriterion("emp_create_name not in", values, "empCreateName");
            return (Criteria) this;
        }

        public Criteria andEmpCreateNameBetween(String value1, String value2) {
            addCriterion("emp_create_name between", value1, value2, "empCreateName");
            return (Criteria) this;
        }

        public Criteria andEmpCreateNameNotBetween(String value1, String value2) {
            addCriterion("emp_create_name not between", value1, value2, "empCreateName");
            return (Criteria) this;
        }

        public Criteria andEmpCreateTimeIsNull() {
            addCriterion("emp_create_time is null");
            return (Criteria) this;
        }

        public Criteria andEmpCreateTimeIsNotNull() {
            addCriterion("emp_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCreateTimeEqualTo(Date value) {
            addCriterion("emp_create_time =", value, "empCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmpCreateTimeNotEqualTo(Date value) {
            addCriterion("emp_create_time <>", value, "empCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmpCreateTimeGreaterThan(Date value) {
            addCriterion("emp_create_time >", value, "empCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmpCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("emp_create_time >=", value, "empCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmpCreateTimeLessThan(Date value) {
            addCriterion("emp_create_time <", value, "empCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmpCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("emp_create_time <=", value, "empCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmpCreateTimeIn(List<Date> values) {
            addCriterion("emp_create_time in", values, "empCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmpCreateTimeNotIn(List<Date> values) {
            addCriterion("emp_create_time not in", values, "empCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmpCreateTimeBetween(Date value1, Date value2) {
            addCriterion("emp_create_time between", value1, value2, "empCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmpCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("emp_create_time not between", value1, value2, "empCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmpEditIdIsNull() {
            addCriterion("emp_edit_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpEditIdIsNotNull() {
            addCriterion("emp_edit_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpEditIdEqualTo(Long value) {
            addCriterion("emp_edit_id =", value, "empEditId");
            return (Criteria) this;
        }

        public Criteria andEmpEditIdNotEqualTo(Long value) {
            addCriterion("emp_edit_id <>", value, "empEditId");
            return (Criteria) this;
        }

        public Criteria andEmpEditIdGreaterThan(Long value) {
            addCriterion("emp_edit_id >", value, "empEditId");
            return (Criteria) this;
        }

        public Criteria andEmpEditIdGreaterThanOrEqualTo(Long value) {
            addCriterion("emp_edit_id >=", value, "empEditId");
            return (Criteria) this;
        }

        public Criteria andEmpEditIdLessThan(Long value) {
            addCriterion("emp_edit_id <", value, "empEditId");
            return (Criteria) this;
        }

        public Criteria andEmpEditIdLessThanOrEqualTo(Long value) {
            addCriterion("emp_edit_id <=", value, "empEditId");
            return (Criteria) this;
        }

        public Criteria andEmpEditIdIn(List<Long> values) {
            addCriterion("emp_edit_id in", values, "empEditId");
            return (Criteria) this;
        }

        public Criteria andEmpEditIdNotIn(List<Long> values) {
            addCriterion("emp_edit_id not in", values, "empEditId");
            return (Criteria) this;
        }

        public Criteria andEmpEditIdBetween(Long value1, Long value2) {
            addCriterion("emp_edit_id between", value1, value2, "empEditId");
            return (Criteria) this;
        }

        public Criteria andEmpEditIdNotBetween(Long value1, Long value2) {
            addCriterion("emp_edit_id not between", value1, value2, "empEditId");
            return (Criteria) this;
        }

        public Criteria andEmpEditNameIsNull() {
            addCriterion("emp_edit_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpEditNameIsNotNull() {
            addCriterion("emp_edit_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpEditNameEqualTo(String value) {
            addCriterion("emp_edit_name =", value, "empEditName");
            return (Criteria) this;
        }

        public Criteria andEmpEditNameNotEqualTo(String value) {
            addCriterion("emp_edit_name <>", value, "empEditName");
            return (Criteria) this;
        }

        public Criteria andEmpEditNameGreaterThan(String value) {
            addCriterion("emp_edit_name >", value, "empEditName");
            return (Criteria) this;
        }

        public Criteria andEmpEditNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_edit_name >=", value, "empEditName");
            return (Criteria) this;
        }

        public Criteria andEmpEditNameLessThan(String value) {
            addCriterion("emp_edit_name <", value, "empEditName");
            return (Criteria) this;
        }

        public Criteria andEmpEditNameLessThanOrEqualTo(String value) {
            addCriterion("emp_edit_name <=", value, "empEditName");
            return (Criteria) this;
        }

        public Criteria andEmpEditNameLike(String value) {
            addCriterion("emp_edit_name like", value, "empEditName");
            return (Criteria) this;
        }

        public Criteria andEmpEditNameNotLike(String value) {
            addCriterion("emp_edit_name not like", value, "empEditName");
            return (Criteria) this;
        }

        public Criteria andEmpEditNameIn(List<String> values) {
            addCriterion("emp_edit_name in", values, "empEditName");
            return (Criteria) this;
        }

        public Criteria andEmpEditNameNotIn(List<String> values) {
            addCriterion("emp_edit_name not in", values, "empEditName");
            return (Criteria) this;
        }

        public Criteria andEmpEditNameBetween(String value1, String value2) {
            addCriterion("emp_edit_name between", value1, value2, "empEditName");
            return (Criteria) this;
        }

        public Criteria andEmpEditNameNotBetween(String value1, String value2) {
            addCriterion("emp_edit_name not between", value1, value2, "empEditName");
            return (Criteria) this;
        }

        public Criteria andEmpEditTimeIsNull() {
            addCriterion("emp_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEmpEditTimeIsNotNull() {
            addCriterion("emp_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEmpEditTimeEqualTo(Date value) {
            addCriterion("emp_edit_time =", value, "empEditTime");
            return (Criteria) this;
        }

        public Criteria andEmpEditTimeNotEqualTo(Date value) {
            addCriterion("emp_edit_time <>", value, "empEditTime");
            return (Criteria) this;
        }

        public Criteria andEmpEditTimeGreaterThan(Date value) {
            addCriterion("emp_edit_time >", value, "empEditTime");
            return (Criteria) this;
        }

        public Criteria andEmpEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("emp_edit_time >=", value, "empEditTime");
            return (Criteria) this;
        }

        public Criteria andEmpEditTimeLessThan(Date value) {
            addCriterion("emp_edit_time <", value, "empEditTime");
            return (Criteria) this;
        }

        public Criteria andEmpEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("emp_edit_time <=", value, "empEditTime");
            return (Criteria) this;
        }

        public Criteria andEmpEditTimeIn(List<Date> values) {
            addCriterion("emp_edit_time in", values, "empEditTime");
            return (Criteria) this;
        }

        public Criteria andEmpEditTimeNotIn(List<Date> values) {
            addCriterion("emp_edit_time not in", values, "empEditTime");
            return (Criteria) this;
        }

        public Criteria andEmpEditTimeBetween(Date value1, Date value2) {
            addCriterion("emp_edit_time between", value1, value2, "empEditTime");
            return (Criteria) this;
        }

        public Criteria andEmpEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("emp_edit_time not between", value1, value2, "empEditTime");
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