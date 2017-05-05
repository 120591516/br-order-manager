package br.order.pojo.emp;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private Long empId;

    private Long brUserId;

    private Long departmentId;

    private String empNumber;

    private String empName;

    private Integer empStatus;

    private Integer empSex;

    private Integer nationId;

    private Date empBirthDate;

    private String empIdentityNumber;

    private Integer empMaritalStatus;

    private String empHometown;

    private String empFamillyAddress;

    private String empPhone;

    private String empEmail;

    private Integer empHouseholdType;

    private String empRegisteredAddress;

    private Long empCreateId;

    private String empCreateName;

    private Date empCreateTime;

    private Long empEditId;

    private String empEditName;

    private Date empEditTime;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Long getBrUserId() {
        return brUserId;
    }

    public void setBrUserId(Long brUserId) {
        this.brUserId = brUserId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber == null ? null : empNumber.trim();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public Integer getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(Integer empStatus) {
        this.empStatus = empStatus;
    }

    public Integer getEmpSex() {
        return empSex;
    }

    public void setEmpSex(Integer empSex) {
        this.empSex = empSex;
    }

    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public String getEmpIdentityNumber() {
        return empIdentityNumber;
    }

    public void setEmpIdentityNumber(String empIdentityNumber) {
        this.empIdentityNumber = empIdentityNumber == null ? null : empIdentityNumber.trim();
    }

    public Integer getEmpMaritalStatus() {
        return empMaritalStatus;
    }

    public void setEmpMaritalStatus(Integer empMaritalStatus) {
        this.empMaritalStatus = empMaritalStatus;
    }

    public String getEmpHometown() {
        return empHometown;
    }

    public void setEmpHometown(String empHometown) {
        this.empHometown = empHometown == null ? null : empHometown.trim();
    }

    public String getEmpFamillyAddress() {
        return empFamillyAddress;
    }

    public void setEmpFamillyAddress(String empFamillyAddress) {
        this.empFamillyAddress = empFamillyAddress == null ? null : empFamillyAddress.trim();
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone == null ? null : empPhone.trim();
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail == null ? null : empEmail.trim();
    }

    public Integer getEmpHouseholdType() {
        return empHouseholdType;
    }

    public void setEmpHouseholdType(Integer empHouseholdType) {
        this.empHouseholdType = empHouseholdType;
    }

    public String getEmpRegisteredAddress() {
        return empRegisteredAddress;
    }

    public void setEmpRegisteredAddress(String empRegisteredAddress) {
        this.empRegisteredAddress = empRegisteredAddress == null ? null : empRegisteredAddress.trim();
    }

    public Long getEmpCreateId() {
        return empCreateId;
    }

    public void setEmpCreateId(Long empCreateId) {
        this.empCreateId = empCreateId;
    }

    public String getEmpCreateName() {
        return empCreateName;
    }

    public void setEmpCreateName(String empCreateName) {
        this.empCreateName = empCreateName == null ? null : empCreateName.trim();
    }

    public Date getEmpCreateTime() {
        return empCreateTime;
    }

    public void setEmpCreateTime(Date empCreateTime) {
        this.empCreateTime = empCreateTime;
    }

    public Long getEmpEditId() {
        return empEditId;
    }

    public void setEmpEditId(Long empEditId) {
        this.empEditId = empEditId;
    }

    public String getEmpEditName() {
        return empEditName;
    }

    public void setEmpEditName(String empEditName) {
        this.empEditName = empEditName == null ? null : empEditName.trim();
    }

    public Date getEmpEditTime() {
        return empEditTime;
    }

    public void setEmpEditTime(Date empEditTime) {
        this.empEditTime = empEditTime;
    }
}