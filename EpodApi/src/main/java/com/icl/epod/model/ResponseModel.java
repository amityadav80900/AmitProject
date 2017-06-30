package com.icl.epod.model;

/**
 * @author Vijendra.y
 *
 */
public class ResponseModel {
	
	private String success;
	private String failure;
	private Integer Record_Number;
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	
	public String getFailure() {
		return failure;
	}
	public void setFailure(String failure) {
		this.failure = failure;
	}
	public Integer getRecord_Number() {
		return Record_Number;
	}
	public void setRecord_Number(Integer record_Number) {
		Record_Number = record_Number;
	}
}
