package kenbox.core.exception;

import java.util.Date;

public class ErrorDetails {
	private Date timestamp;
	private String message;
	private String details;
	private int errorCode;

	public ErrorDetails(Date timestamp, String message, String details,int errorCode) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
		this.errorCode = errorCode;
	}
}
