package com.handzap.util;

public enum APIStatus {

	// Common status
	OK(200, null), ERR_INTERNAL_SERVER(500, "Internal Error"), SQL_ERROR(501,
			"SQL Error"), ERR_BAD_REQUEST(400, "Bad request"), ERR_SESSION_DATA_INVALID(
			603, "Session data invalid"), ERR_SESSION_NOT_FOUND(604,
			"Session not found"), ERR_GET_LIST_ORDERS(800,
			"Can not get list orders"), ERR_GET_DETAIL_ORDERS(801,
			"Can not get detail orders"), ERR_ORDER_ID_EMPTY(802,
			"Order can't empty"), ERR_DELETE_ORDER(803, "Delete order is fail"), ERR_ORDER_ID_NOT_FOUND(
			804, "Order id not found");

	private final int code;
	private final String description;

	private APIStatus(int s, String v) {
		code = s;
		description = v;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

}