package br.order.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrUser implements Serializable{
    private Long userId;

    private String userLoginName;

    private String userName;

    private String userPhone;

    private String userEmail;

    private String userPassword;

    private Integer userStatus;

    private Date userCreateTime;

    private Date userEditTime;

    private Long userEditId;

    private String userEditName;

    private Date userLoginTime;

    private Date userLastTime;
    

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName == null ? null : userLoginName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Date getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    public Date getUserEditTime() {
        return userEditTime;
    }

    public void setUserEditTime(Date userEditTime) {
        this.userEditTime = userEditTime;
    }

    public Long getUserEditId() {
        return userEditId;
    }

    public void setUserEditId(Long userEditId) {
        this.userEditId = userEditId;
    }

    public String getUserEditName() {
        return userEditName;
    }

    public void setUserEditName(String userEditName) {
        this.userEditName = userEditName == null ? null : userEditName.trim();
    }

    public Date getUserLoginTime() {
        return userLoginTime;
    }

    public void setUserLoginTime(Date userLoginTime) {
        this.userLoginTime = userLoginTime;
    }

    public Date getUserLastTime() {
        return userLastTime;
    }

    public void setUserLastTime(Date userLastTime) {
        this.userLastTime = userLastTime;
    }
    

}