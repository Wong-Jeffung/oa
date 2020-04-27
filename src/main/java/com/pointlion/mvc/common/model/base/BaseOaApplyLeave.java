package com.pointlion.mvc.common.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

import java.util.Date;

public abstract class BaseOaApplyLeave<M extends BaseOaApplyLeave<M>> extends Model<M> implements IBean {
    public void setId(java.lang.String id) {
        set("id", id);
    }

    public java.lang.String getId() {
        return getStr("id");
    }

    public void setApplicantId(java.lang.String applicantId) {
        set("applicant_id", applicantId);
    }

    public java.lang.String getApplicantId() {
        return getStr("applicant_id");
    }

    public void setApplicantName(java.lang.String applicantName) {
        set("applicant_name", applicantName);
    }

    public java.lang.String getApplicantName() {
        return getStr("applicant_name");
    }

    public void setOrgId(java.lang.String orgId) {
        set("org_id", orgId);
    }

    public java.lang.String getOrgId() {
        return getStr("org_id");
    }

    public void setOrgName(java.lang.String orgName) {
        set("org_name", orgName);
    }

    public java.lang.String getOrgName() {
        return getStr("org_name");
    }

    public void setType(String type) {
        set("type", type);
    }

    public String getType() {
        return getStr("type");
    }

    public void setTypeName(String typeName) {
        set("type_name", typeName);
    }

    public String getTypeName() {
        return getStr("type_name");
    }

    public void setIfSubmit(java.lang.String ifSubmit) {
        set("if_submit", ifSubmit);
    }

    public java.lang.String getIfSubmit() {
        return getStr("if_submit");
    }

    public void setStartTime(Date startTime) {
        set("start_time", startTime);
    }

    public Date getStartTime() {
        return getDate("start_time");
    }

    public void setEndTime(Date endTime) {
        set("end_time", endTime);
    }

    public Date getEndTime() {
        return getDate("end_time");
    }

    public void setProcInsId(java.lang.String procInsId) {
        set("proc_ins_id", procInsId);
    }

    public java.lang.String getProcInsId() {
        return getStr("proc_ins_id");
    }

    public void setCreateTime(java.lang.String createTime) {
        set("create_time", createTime);
    }

    public java.lang.String getCreateTime() {
        return getStr("create_time");
    }

    public void setPeriod(Integer period) {
        set("period", period);
    }

    public Integer getPeriod() {
        return getInt("period");
    }

    public void setReason(java.lang.String reason) {
        set("reason", reason);
    }

    public java.lang.String getReason() {
        return getStr("reason");
    }

//    public void setTitle(java.lang.String title) {
//        set("title", title);
//    }
//
//    public java.lang.String getTitle() {
//        return getStr("title");
//    }
}
