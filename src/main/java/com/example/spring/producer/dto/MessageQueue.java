package com.example.spring.producer.dto;

import javax.validation.constraints.NotEmpty;

public class MessageQueue {
	
	@NotEmpty
	private String type;
	
	@NotEmpty
	private String text;

    public MessageQueue() {}

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
