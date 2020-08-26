package exceptions;

public class ExceptionChannel extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExceptionChannel(String msg) {
		super(msg);
	}
}
