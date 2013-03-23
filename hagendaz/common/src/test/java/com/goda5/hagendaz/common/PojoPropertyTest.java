package com.goda5.hagendaz.common;

import java.beans.PropertyEditorSupport;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.goda5.hagendaz.common.domain.User;
import com.goda5.hagendaz.common.util.UserEditor;

@Test
public class PojoPropertyTest {
	public void testSetProperty() {
		User user = new User();
		PropertyEditorSupport s = new UserEditor(user);
		s.setAsText("username:TEST");
		Assert.assertEquals(s.getAsText(), "username:TEST");
	}
}
