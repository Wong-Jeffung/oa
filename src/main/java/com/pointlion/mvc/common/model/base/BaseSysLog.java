package com.pointlion.mvc.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysLog<M extends BaseSysLog<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public void setUsername(java.lang.String username) {
		set("username", username);
	}
	
	public java.lang.String getUsername() {
		return getStr("username");
	}

	public void setTarget(java.lang.String target) {
		set("target", target);
	}
	
	public java.lang.String getTarget() {
		return getStr("target");
	}

	public void setPara(java.lang.String para) {
		set("para", para);
	}
	
	public java.lang.String getPara() {
		return getStr("para");
	}

	public void setIfSuccess(java.lang.String ifSuccess) {
		set("if_success", ifSuccess);
	}
	
	public java.lang.String getIfSuccess() {
		return getStr("if_success");
	}

	public void setCreateTime(java.lang.String createTime) {
		set("create_time", createTime);
	}
	
	public java.lang.String getCreateTime() {
		return getStr("create_time");
	}

	public void setClient(java.lang.String client) {
		set("client", client);
	}
	
	public java.lang.String getClient() {
		return getStr("client");
	}

	public void setErrorMessage(java.lang.String error_message) {
		set("error_message", error_message);
	}
	
	public java.lang.String getErrorMessage() {
		return getStr("error_message");
	}


	public void setIp(java.lang.String ip) {
		set("ip", ip);
	}

	public java.lang.String getIp() {
		return getStr("ip");
	}

	public void setModule(java.lang.String module) {
		set("module", module);
	}

	public java.lang.String getModule() {
		return getStr("module");
	}

	public void setOperateMethod(java.lang.String operateMethod) {
		set("operate_method", operateMethod);
	}

	public java.lang.String getOperateMethod() {
		return getStr("operate_method");
	}


	public void setBusinessType(java.lang.String businessType) {
		set("business_type", businessType);
	}

	public java.lang.String getBusinessType() {
		return getStr("business_type");
	}
}
