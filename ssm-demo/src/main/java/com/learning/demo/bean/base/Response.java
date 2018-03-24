package com.learning.demo.bean.base;

import java.io.Serializable;

public class Response implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static boolean SUCCESS = true;
	private final static boolean FAILURE = false;

	private final static String MESSAGE_SUCCESS = "success";
	private final static String MESSAGE_ERROR = "error";

	private Meta meta;
	private Object data;

	public Meta getMeta() {
		return meta;
	}

	public Object getData() {
		return data;
	}

	public Response success() {
		this.meta = new Meta(SUCCESS, MESSAGE_SUCCESS);
		return this;
	}

	public Response success(Object data) {
		this.data = data;
		this.meta = new Meta(SUCCESS, MESSAGE_SUCCESS);
		return this;
	}

	public Response success(Object data, String message) {
		this.data = data;
		this.meta = new Meta(SUCCESS, message);
		return this;
	}

	public Response failure() {
		this.meta = new Meta(FAILURE, MESSAGE_ERROR);
		return this;
	}

	public Response failure(String message) {
		this.meta = new Meta(FAILURE, message);
		return this;
	}

	public class Meta {

		private boolean status;
		private String message;

		public Meta(boolean status, String message) {
			this.message = message;
			this.status = status;
		}

		public Meta(boolean status) {
			this.status = status;
		}

		public String getMessage() {
			return message;
		}

		public boolean isSuccess() {
			return status;
		}

	}
}
