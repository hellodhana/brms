package com.amerbcs.sobacklog.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TeamsAction implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "To ")
	private java.util.List<java.lang.String> to;
	@org.kie.api.definition.type.Label(value = "Message")
	private java.lang.String message;

	public TeamsAction() {
	}

	public java.util.List<java.lang.String> getTo() {
		return this.to;
	}

	public void setTo(java.util.List<java.lang.String> to) {
		this.to = to;
	}

	public java.lang.String getMessage() {
		return this.message;
	}

	public void setMessage(java.lang.String message) {
		this.message = message;
	}

	public TeamsAction(java.util.List<java.lang.String> to,
			java.lang.String message) {
		this.to = to;
		this.message = message;
	}

}