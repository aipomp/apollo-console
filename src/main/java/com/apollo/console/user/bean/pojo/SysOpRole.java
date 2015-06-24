package com.apollo.console.user.bean.pojo;

import java.util.Date;

public class SysOpRole {
    private Long opRoleId;

    private Long roleId;

    private Long opId;

    private Short opRoleDfltFlag;

    private Integer domainId;

    private String notes;

    private Short state;

    private Short dataState;

    private Long creator;

    private Date createDate;

    private Long modifier;

    private Date modifyDate;

    public Long getOpRoleId() {
        return opRoleId;
    }

    public void setOpRoleId(Long opRoleId) {
        this.opRoleId = opRoleId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getOpId() {
        return opId;
    }

    public void setOpId(Long opId) {
        this.opId = opId;
    }

    public Short getOpRoleDfltFlag() {
        return opRoleDfltFlag;
    }

    public void setOpRoleDfltFlag(Short opRoleDfltFlag) {
        this.opRoleDfltFlag = opRoleDfltFlag;
    }

    public Integer getDomainId() {
        return domainId;
    }

    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Short getDataState() {
        return dataState;
    }

    public void setDataState(Short dataState) {
        this.dataState = dataState;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getModifier() {
        return modifier;
    }

    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}