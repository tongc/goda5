package com.goda5.hagendaz.common.domain.other;

public class Error {
	private String errorMsg;
	public Error(String errorMsg) {
		this.setErrorMsg(errorMsg);
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
