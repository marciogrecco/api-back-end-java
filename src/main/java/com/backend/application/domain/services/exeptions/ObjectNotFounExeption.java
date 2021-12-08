package com.backend.application.domain.services.exeptions;

public class ObjectNotFounExeption extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFounExeption(String msg) {

		super(msg);
	}

	public ObjectNotFounExeption(String msg, Throwable cause) {
		super(msg, cause);
	}
}