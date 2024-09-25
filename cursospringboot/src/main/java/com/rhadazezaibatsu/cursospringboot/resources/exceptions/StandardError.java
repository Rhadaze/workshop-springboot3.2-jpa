package com.rhadazezaibatsu.cursospringboot.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonFormat;

=======
>>>>>>> 9e51a959b2caa1553f87a0ac412d7d4c2abfa1d9
public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;

<<<<<<< HEAD
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd'T'HH:mm:ss'Z'", timezone = "GMT")
=======
>>>>>>> 9e51a959b2caa1553f87a0ac412d7d4c2abfa1d9
	private Instant timestamp;
	private Integer status;
	private String error;
	private String message;
	private String path;

	public StandardError() {}

	public StandardError(Instant timestamp, Integer status, String error, String message, String path) {
		super();
		this.timestamp = timestamp;
<<<<<<< HEAD
		this.status = status;	
=======
		this.status = status;
>>>>>>> 9e51a959b2caa1553f87a0ac412d7d4c2abfa1d9
		this.error = error;
		this.message = message;
		this.path = path;
	}

	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
