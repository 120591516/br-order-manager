package br.order.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrUserExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrUserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameIsNull() {
            addCriterion("user_login_name is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameIsNotNull() {
            addCriterion("user_login_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameEqualTo(String value) {
            addCriterion("user_login_name =", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotEqualTo(String value) {
            addCriterion("user_login_name <>", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameGreaterThan(String value) {
            addCriterion("user_login_name >", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_name >=", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameLessThan(String value) {
            addCriterion("user_login_name <", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameLessThanOrEqualTo(String value) {
            addCriterion("user_login_name <=", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameLike(String value) {
            addCriterion("user_login_name like", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotLike(String value) {
            addCriterion("user_login_name not like", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameIn(List<String> values) {
            addCriterion("user_login_name in", values, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotIn(List<String> values) {
            addCriterion("user_login_name not in", values, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameBetween(String value1, String value2) {
            addCriterion("user_login_name between", value1, value2, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotBetween(String value1, String value2) {
            addCriterion("user_login_name not between", value1, value2, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Integer value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Integer value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Integer value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Integer value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Integer value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Integer> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Integer> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Integer value1, Integer value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIsNull() {
            addCriterion("user_create_time is null");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIsNotNull() {
            addCriterion("user_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeEqualTo(Date value) {
            addCriterion("user_create_time =", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotEqualTo(Date value) {
            addCriterion("user_create_time <>", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeGreaterThan(Date value) {
            addCriterion("user_create_time >", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_create_time >=", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLessThan(Date value) {
            addCriterion("user_create_time <", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_create_time <=", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIn(List<Date> values) {
            addCriterion("user_create_time in", values, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotIn(List<Date> values) {
            addCriterion("user_create_time not in", values, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeBetween(Date value1, Date value2) {
            addCriterion("user_create_time between", value1, value2, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_create_time not between", value1, value2, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserEditTimeIsNull() {
            addCriterion("user_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andUserEditTimeIsNotNull() {
            addCriterion("user_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserEditTimeEqualTo(Date value) {
            addCriterion("user_edit_time =", value, "userEditTime");
            return (Criteria) this;
        }

        public Criteria andUserEditTimeNotEqualTo(Date value) {
            addCriterion("user_edit_time <>", value, "userEditTime");
            return (Criteria) this;
        }

        public Criteria andUserEditTimeGreaterThan(Date value) {
            addCriterion("user_edit_time >", value, "userEditTime");
            return (Criteria) this;
        }

        public Criteria andUserEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_edit_time >=", value, "userEditTime");
            return (Criteria) this;
        }

        public Criteria andUserEditTimeLessThan(Date value) {
            addCriterion("user_edit_time <", value, "userEditTime");
            return (Criteria) this;
        }

        public Criteria andUserEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_edit_time <=", value, "userEditTime");
            return (Criteria) this;
        }

        public Criteria andUserEditTimeIn(List<Date> values) {
            addCriterion("user_edit_time in", values, "userEditTime");
            return (Criteria) this;
        }

        public Criteria andUserEditTimeNotIn(List<Date> values) {
            addCriterion("user_edit_time not in", values, "userEditTime");
            return (Criteria) this;
        }

        public Criteria andUserEditTimeBetween(Date value1, Date value2) {
            addCriterion("user_edit_time between", value1, value2, "userEditTime");
            return (Criteria) this;
        }

        public Criteria andUserEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_edit_time not between", value1, value2, "userEditTime");
            return (Criteria) this;
        }

        public Criteria andUserEditIdIsNull() {
            addCriterion("user_edit_id is null");
            return (Criteria) this;
        }

        public Criteria andUserEditIdIsNotNull() {
            addCriterion("user_edit_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserEditIdEqualTo(Long value) {
            addCriterion("user_edit_id =", value, "userEditId");
            return (Criteria) this;
        }

        public Criteria andUserEditIdNotEqualTo(Long value) {
            addCriterion("user_edit_id <>", value, "userEditId");
            return (Criteria) this;
        }

        public Criteria andUserEditIdGreaterThan(Long value) {
            addCriterion("user_edit_id >", value, "userEditId");
            return (Criteria) this;
        }

        public Criteria andUserEditIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_edit_id >=", value, "userEditId");
            return (Criteria) this;
        }

        public Criteria andUserEditIdLessThan(Long value) {
            addCriterion("user_edit_id <", value, "userEditId");
            return (Criteria) this;
        }

        public Criteria andUserEditIdLessThanOrEqualTo(Long value) {
            addCriterion("user_edit_id <=", value, "userEditId");
            return (Criteria) this;
        }

        public Criteria andUserEditIdIn(List<Long> values) {
            addCriterion("user_edit_id in", values, "userEditId");
            return (Criteria) this;
        }

        public Criteria andUserEditIdNotIn(List<Long> values) {
            addCriterion("user_edit_id not in", values, "userEditId");
            return (Criteria) this;
        }

        public Criteria andUserEditIdBetween(Long value1, Long value2) {
            addCriterion("user_edit_id between", value1, value2, "userEditId");
            return (Criteria) this;
        }

        public Criteria andUserEditIdNotBetween(Long value1, Long value2) {
            addCriterion("user_edit_id not between", value1, value2, "userEditId");
            return (Criteria) this;
        }

        public Criteria andUserEditNameIsNull() {
            addCriterion("user_edit_name is null");
            return (Criteria) this;
        }

        public Criteria andUserEditNameIsNotNull() {
            addCriterion("user_edit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserEditNameEqualTo(String value) {
            addCriterion("user_edit_name =", value, "userEditName");
            return (Criteria) this;
        }

        public Criteria andUserEditNameNotEqualTo(String value) {
            addCriterion("user_edit_name <>", value, "userEditName");
            return (Criteria) this;
        }

        public Criteria andUserEditNameGreaterThan(String value) {
            addCriterion("user_edit_name >", value, "userEditName");
            return (Criteria) this;
        }

        public Criteria andUserEditNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_edit_name >=", value, "userEditName");
            return (Criteria) this;
        }

        public Criteria andUserEditNameLessThan(String value) {
            addCriterion("user_edit_name <", value, "userEditName");
            return (Criteria) this;
        }

        public Criteria andUserEditNameLessThanOrEqualTo(String value) {
            addCriterion("user_edit_name <=", value, "userEditName");
            return (Criteria) this;
        }

        public Criteria andUserEditNameLike(String value) {
            addCriterion("user_edit_name like", value, "userEditName");
            return (Criteria) this;
        }

        public Criteria andUserEditNameNotLike(String value) {
            addCriterion("user_edit_name not like", value, "userEditName");
            return (Criteria) this;
        }

        public Criteria andUserEditNameIn(List<String> values) {
            addCriterion("user_edit_name in", values, "userEditName");
            return (Criteria) this;
        }

        public Criteria andUserEditNameNotIn(List<String> values) {
            addCriterion("user_edit_name not in", values, "userEditName");
            return (Criteria) this;
        }

        public Criteria andUserEditNameBetween(String value1, String value2) {
            addCriterion("user_edit_name between", value1, value2, "userEditName");
            return (Criteria) this;
        }

        public Criteria andUserEditNameNotBetween(String value1, String value2) {
            addCriterion("user_edit_name not between", value1, value2, "userEditName");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeIsNull() {
            addCriterion("user_login_time is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeIsNotNull() {
            addCriterion("user_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeEqualTo(Date value) {
            addCriterion("user_login_time =", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotEqualTo(Date value) {
            addCriterion("user_login_time <>", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeGreaterThan(Date value) {
            addCriterion("user_login_time >", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_login_time >=", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeLessThan(Date value) {
            addCriterion("user_login_time <", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_login_time <=", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeIn(List<Date> values) {
            addCriterion("user_login_time in", values, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotIn(List<Date> values) {
            addCriterion("user_login_time not in", values, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeBetween(Date value1, Date value2) {
            addCriterion("user_login_time between", value1, value2, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_login_time not between", value1, value2, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeIsNull() {
            addCriterion("user_last_time is null");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeIsNotNull() {
            addCriterion("user_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeEqualTo(Date value) {
            addCriterion("user_last_time =", value, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeNotEqualTo(Date value) {
            addCriterion("user_last_time <>", value, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeGreaterThan(Date value) {
            addCriterion("user_last_time >", value, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_last_time >=", value, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeLessThan(Date value) {
            addCriterion("user_last_time <", value, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_last_time <=", value, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeIn(List<Date> values) {
            addCriterion("user_last_time in", values, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeNotIn(List<Date> values) {
            addCriterion("user_last_time not in", values, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeBetween(Date value1, Date value2) {
            addCriterion("user_last_time between", value1, value2, "userLastTime");
            return (Criteria) this;
        }

        public Criteria andUserLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_last_time not between", value1, value2, "userLastTime");
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