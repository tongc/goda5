package com.goda5.hagendaz.common.util;

import java.beans.PropertyEditorSupport;

import com.goda5.hagendaz.common.domain.User;

public class UserEditor extends PropertyEditorSupport {
	public UserEditor(User user) {
		super(user);
	}
	
	@Override
	public void setAsText(String text) {
		((User)this.getSource()).setUsername(text);
	}
	
	@Override
	public String getAsText() {
		return ((User)this.getSource()).getUsername();
	}
}
