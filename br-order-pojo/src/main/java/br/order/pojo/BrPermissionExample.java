package br.order.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrPermissionExample implements Serializable {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public BrPermissionExample() {
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

		public Criteria andPermissionIdIsNull() {
			addCriterion("permission_id is null");
			return (Criteria) this;
		}

		public Criteria andPermissionIdIsNotNull() {
			addCriterion("permission_id is not null");
			return (Criteria) this;
		}

		public Criteria andPermissionIdEqualTo(Long value) {
			addCriterion("permission_id =", value, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionIdNotEqualTo(Long value) {
			addCriterion("permission_id <>", value, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionIdGreaterThan(Long value) {
			addCriterion("permission_id >", value, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionIdGreaterThanOrEqualTo(Long value) {
			addCriterion("permission_id >=", value, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionIdLessThan(Long value) {
			addCriterion("permission_id <", value, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionIdLessThanOrEqualTo(Long value) {
			addCriterion("permission_id <=", value, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionIdIn(List<Long> values) {
			addCriterion("permission_id in", values, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionIdNotIn(List<Long> values) {
			addCriterion("permission_id not in", values, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionIdBetween(Long value1, Long value2) {
			addCriterion("permission_id between", value1, value2, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionIdNotBetween(Long value1, Long value2) {
			addCriterion("permission_id not between", value1, value2, "permissionId");
			return (Criteria) this;
		}

		public Criteria andPermissionNameIsNull() {
			addCriterion("permission_name is null");
			return (Criteria) this;
		}

		public Criteria andPermissionNameIsNotNull() {
			addCriterion("permission_name is not null");
			return (Criteria) this;
		}

		public Criteria andPermissionNameEqualTo(String value) {
			addCriterion("permission_name =", value, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameNotEqualTo(String value) {
			addCriterion("permission_name <>", value, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameGreaterThan(String value) {
			addCriterion("permission_name >", value, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameGreaterThanOrEqualTo(String value) {
			addCriterion("permission_name >=", value, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameLessThan(String value) {
			addCriterion("permission_name <", value, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameLessThanOrEqualTo(String value) {
			addCriterion("permission_name <=", value, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameLike(String value) {
			addCriterion("permission_name like", value, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameNotLike(String value) {
			addCriterion("permission_name not like", value, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameIn(List<String> values) {
			addCriterion("permission_name in", values, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameNotIn(List<String> values) {
			addCriterion("permission_name not in", values, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameBetween(String value1, String value2) {
			addCriterion("permission_name between", value1, value2, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionNameNotBetween(String value1, String value2) {
			addCriterion("permission_name not between", value1, value2, "permissionName");
			return (Criteria) this;
		}

		public Criteria andPermissionStatusIsNull() {
			addCriterion("permission_status is null");
			return (Criteria) this;
		}

		public Criteria andPermissionStatusIsNotNull() {
			addCriterion("permission_status is not null");
			return (Criteria) this;
		}

		public Criteria andPermissionStatusEqualTo(Integer value) {
			addCriterion("permission_status =", value, "permissionStatus");
			return (Criteria) this;
		}

		public Criteria andPermissionStatusNotEqualTo(Integer value) {
			addCriterion("permission_status <>", value, "permissionStatus");
			return (Criteria) this;
		}

		public Criteria andPermissionStatusGreaterThan(Integer value) {
			addCriterion("permission_status >", value, "permissionStatus");
			return (Criteria) this;
		}

		public Criteria andPermissionStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("permission_status >=", value, "permissionStatus");
			return (Criteria) this;
		}

		public Criteria andPermissionStatusLessThan(Integer value) {
			addCriterion("permission_status <", value, "permissionStatus");
			return (Criteria) this;
		}

		public Criteria andPermissionStatusLessThanOrEqualTo(Integer value) {
			addCriterion("permission_status <=", value, "permissionStatus");
			return (Criteria) this;
		}

		public Criteria andPermissionStatusIn(List<Integer> values) {
			addCriterion("permission_status in", values, "permissionStatus");
			return (Criteria) this;
		}

		public Criteria andPermissionStatusNotIn(List<Integer> values) {
			addCriterion("permission_status not in", values, "permissionStatus");
			return (Criteria) this;
		}

		public Criteria andPermissionStatusBetween(Integer value1, Integer value2) {
			addCriterion("permission_status between", value1, value2, "permissionStatus");
			return (Criteria) this;
		}

		public Criteria andPermissionStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("permission_status not between", value1, value2, "permissionStatus");
			return (Criteria) this;
		}

		public Criteria andPermissionUrlIsNull() {
			addCriterion("permission_url is null");
			return (Criteria) this;
		}

		public Criteria andPermissionUrlIsNotNull() {
			addCriterion("permission_url is not null");
			return (Criteria) this;
		}

		public Criteria andPermissionUrlEqualTo(String value) {
			addCriterion("permission_url =", value, "permissionUrl");
			return (Criteria) this;
		}

		public Criteria andPermissionUrlNotEqualTo(String value) {
			addCriterion("permission_url <>", value, "permissionUrl");
			return (Criteria) this;
		}

		public Criteria andPermissionUrlGreaterThan(String value) {
			addCriterion("permission_url >", value, "permissionUrl");
			return (Criteria) this;
		}

		public Criteria andPermissionUrlGreaterThanOrEqualTo(String value) {
			addCriterion("permission_url >=", value, "permissionUrl");
			return (Criteria) this;
		}

		public Criteria andPermissionUrlLessThan(String value) {
			addCriterion("permission_url <", value, "permissionUrl");
			return (Criteria) this;
		}

		public Criteria andPermissionUrlLessThanOrEqualTo(String value) {
			addCriterion("permission_url <=", value, "permissionUrl");
			return (Criteria) this;
		}

		public Criteria andPermissionUrlLike(String value) {
			addCriterion("permission_url like", value, "permissionUrl");
			return (Criteria) this;
		}

		public Criteria andPermissionUrlNotLike(String value) {
			addCriterion("permission_url not like", value, "permissionUrl");
			return (Criteria) this;
		}

		public Criteria andPermissionUrlIn(List<String> values) {
			addCriterion("permission_url in", values, "permissionUrl");
			return (Criteria) this;
		}

		public Criteria andPermissionUrlNotIn(List<String> values) {
			addCriterion("permission_url not in", values, "permissionUrl");
			return (Criteria) this;
		}

		public Criteria andPermissionUrlBetween(String value1, String value2) {
			addCriterion("permission_url between", value1, value2, "permissionUrl");
			return (Criteria) this;
		}

		public Criteria andPermissionUrlNotBetween(String value1, String value2) {
			addCriterion("permission_url not between", value1, value2, "permissionUrl");
			return (Criteria) this;
		}

		public Criteria andPermissionDescribeIsNull() {
			addCriterion("permission_describe is null");
			return (Criteria) this;
		}

		public Criteria andPermissionDescribeIsNotNull() {
			addCriterion("permission_describe is not null");
			return (Criteria) this;
		}

		public Criteria andPermissionDescribeEqualTo(String value) {
			addCriterion("permission_describe =", value, "permissionDescribe");
			return (Criteria) this;
		}

		public Criteria andPermissionDescribeNotEqualTo(String value) {
			addCriterion("permission_describe <>", value, "permissionDescribe");
			return (Criteria) this;
		}

		public Criteria andPermissionDescribeGreaterThan(String value) {
			addCriterion("permission_describe >", value, "permissionDescribe");
			return (Criteria) this;
		}

		public Criteria andPermissionDescribeGreaterThanOrEqualTo(String value) {
			addCriterion("permission_describe >=", value, "permissionDescribe");
			return (Criteria) this;
		}

		public Criteria andPermissionDescribeLessThan(String value) {
			addCriterion("permission_describe <", value, "permissionDescribe");
			return (Criteria) this;
		}

		public Criteria andPermissionDescribeLessThanOrEqualTo(String value) {
			addCriterion("permission_describe <=", value, "permissionDescribe");
			return (Criteria) this;
		}

		public Criteria andPermissionDescribeLike(String value) {
			addCriterion("permission_describe like", value, "permissionDescribe");
			return (Criteria) this;
		}

		public Criteria andPermissionDescribeNotLike(String value) {
			addCriterion("permission_describe not like", value, "permissionDescribe");
			return (Criteria) this;
		}

		public Criteria andPermissionDescribeIn(List<String> values) {
			addCriterion("permission_describe in", values, "permissionDescribe");
			return (Criteria) this;
		}

		public Criteria andPermissionDescribeNotIn(List<String> values) {
			addCriterion("permission_describe not in", values, "permissionDescribe");
			return (Criteria) this;
		}

		public Criteria andPermissionDescribeBetween(String value1, String value2) {
			addCriterion("permission_describe between", value1, value2, "permissionDescribe");
			return (Criteria) this;
		}

		public Criteria andPermissionDescribeNotBetween(String value1, String value2) {
			addCriterion("permission_describe not between", value1, value2, "permissionDescribe");
			return (Criteria) this;
		}

		public Criteria andPermissionLevelIsNull() {
			addCriterion("permission_level is null");
			return (Criteria) this;
		}

		public Criteria andPermissionLevelIsNotNull() {
			addCriterion("permission_level is not null");
			return (Criteria) this;
		}

		public Criteria andPermissionLevelEqualTo(Integer value) {
			addCriterion("permission_level =", value, "permissionLevel");
			return (Criteria) this;
		}

		public Criteria andPermissionLevelNotEqualTo(Integer value) {
			addCriterion("permission_level <>", value, "permissionLevel");
			return (Criteria) this;
		}

		public Criteria andPermissionLevelGreaterThan(Integer value) {
			addCriterion("permission_level >", value, "permissionLevel");
			return (Criteria) this;
		}

		public Criteria andPermissionLevelGreaterThanOrEqualTo(Integer value) {
			addCriterion("permission_level >=", value, "permissionLevel");
			return (Criteria) this;
		}

		public Criteria andPermissionLevelLessThan(Integer value) {
			addCriterion("permission_level <", value, "permissionLevel");
			return (Criteria) this;
		}

		public Criteria andPermissionLevelLessThanOrEqualTo(Integer value) {
			addCriterion("permission_level <=", value, "permissionLevel");
			return (Criteria) this;
		}

		public Criteria andPermissionLevelIn(List<Integer> values) {
			addCriterion("permission_level in", values, "permissionLevel");
			return (Criteria) this;
		}

		public Criteria andPermissionLevelNotIn(List<Integer> values) {
			addCriterion("permission_level not in", values, "permissionLevel");
			return (Criteria) this;
		}

		public Criteria andPermissionLevelBetween(Integer value1, Integer value2) {
			addCriterion("permission_level between", value1, value2, "permissionLevel");
			return (Criteria) this;
		}

		public Criteria andPermissionLevelNotBetween(Integer value1, Integer value2) {
			addCriterion("permission_level not between", value1, value2, "permissionLevel");
			return (Criteria) this;
		}

		public Criteria andPermissionParentIdIsNull() {
			addCriterion("permission_parent_id is null");
			return (Criteria) this;
		}

		public Criteria andPermissionParentIdIsNotNull() {
			addCriterion("permission_parent_id is not null");
			return (Criteria) this;
		}

		public Criteria andPermissionParentIdEqualTo(Long value) {
			addCriterion("permission_parent_id =", value, "permissionParentId");
			return (Criteria) this;
		}

		public Criteria andPermissionParentIdNotEqualTo(Long value) {
			addCriterion("permission_parent_id <>", value, "permissionParentId");
			return (Criteria) this;
		}

		public Criteria andPermissionParentIdGreaterThan(Long value) {
			addCriterion("permission_parent_id >", value, "permissionParentId");
			return (Criteria) this;
		}

		public Criteria andPermissionParentIdGreaterThanOrEqualTo(Long value) {
			addCriterion("permission_parent_id >=", value, "permissionParentId");
			return (Criteria) this;
		}

		public Criteria andPermissionParentIdLessThan(Long value) {
			addCriterion("permission_parent_id <", value, "permissionParentId");
			return (Criteria) this;
		}

		public Criteria andPermissionParentIdLessThanOrEqualTo(Long value) {
			addCriterion("permission_parent_id <=", value, "permissionParentId");
			return (Criteria) this;
		}

		public Criteria andPermissionParentIdIn(List<Long> values) {
			addCriterion("permission_parent_id in", values, "permissionParentId");
			return (Criteria) this;
		}

		public Criteria andPermissionParentIdNotIn(List<Long> values) {
			addCriterion("permission_parent_id not in", values, "permissionParentId");
			return (Criteria) this;
		}

		public Criteria andPermissionParentIdBetween(Long value1, Long value2) {
			addCriterion("permission_parent_id between", value1, value2, "permissionParentId");
			return (Criteria) this;
		}

		public Criteria andPermissionParentIdNotBetween(Long value1, Long value2) {
			addCriterion("permission_parent_id not between", value1, value2, "permissionParentId");
			return (Criteria) this;
		}

		public Criteria andPermissionCreateTimeIsNull() {
			addCriterion("permission_create_time is null");
			return (Criteria) this;
		}

		public Criteria andPermissionCreateTimeIsNotNull() {
			addCriterion("permission_create_time is not null");
			return (Criteria) this;
		}

		public Criteria andPermissionCreateTimeEqualTo(Date value) {
			addCriterion("permission_create_time =", value, "permissionCreateTime");
			return (Criteria) this;
		}

		public Criteria andPermissionCreateTimeNotEqualTo(Date value) {
			addCriterion("permission_create_time <>", value, "permissionCreateTime");
			return (Criteria) this;
		}

		public Criteria andPermissionCreateTimeGreaterThan(Date value) {
			addCriterion("permission_create_time >", value, "permissionCreateTime");
			return (Criteria) this;
		}

		public Criteria andPermissionCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("permission_create_time >=", value, "permissionCreateTime");
			return (Criteria) this;
		}

		public Criteria andPermissionCreateTimeLessThan(Date value) {
			addCriterion("permission_create_time <", value, "permissionCreateTime");
			return (Criteria) this;
		}

		public Criteria andPermissionCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("permission_create_time <=", value, "permissionCreateTime");
			return (Criteria) this;
		}

		public Criteria andPermissionCreateTimeIn(List<Date> values) {
			addCriterion("permission_create_time in", values, "permissionCreateTime");
			return (Criteria) this;
		}

		public Criteria andPermissionCreateTimeNotIn(List<Date> values) {
			addCriterion("permission_create_time not in", values, "permissionCreateTime");
			return (Criteria) this;
		}

		public Criteria andPermissionCreateTimeBetween(Date value1, Date value2) {
			addCriterion("permission_create_time between", value1, value2, "permissionCreateTime");
			return (Criteria) this;
		}

		public Criteria andPermissionCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("permission_create_time not between", value1, value2, "permissionCreateTime");
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