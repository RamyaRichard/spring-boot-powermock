package com.javatechie.pm.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderResponse {
	private OrderRequest response;
	private String message;
	private int statusCode;
	public OrderRequest getResponse() {
		return response;
	}
	public void setResponse(OrderRequest response) {
		this.response = response;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public OrderResponse(OrderRequest response, String message, int statusCode) {
		super();
		this.response = response;
		this.message = message;
		this.statusCode = statusCode;
	}
	public OrderResponse() {
		super();
	}
	@Override
	public String toString() {
		return "OrderResponse [response=" + response + ", message=" + message + ", statusCode=" + statusCode + "]";
	}

}
