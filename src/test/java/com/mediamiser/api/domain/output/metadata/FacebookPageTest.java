// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.output.metadata;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.junit.Assert;
import org.junit.Test;

import com.mediamiser.api.domain.output.metadata.FacebookPage;
import com.mediamiser.test.AbstractValidatedUnit;

public class FacebookPageTest extends AbstractValidatedUnit {
	public static final String			EXPECTED_PAGE_ID		= "myId";
	public static final FacebookPage	EXPECTED_FACEBOOK_PAGE	= new FacebookPage().pageId(EXPECTED_PAGE_ID);

	@Test
	public void synposis() {
		// Create using setters
		final FacebookPage object = EXPECTED_FACEBOOK_PAGE;

		// Test getters setters
		Assert.assertEquals(EXPECTED_PAGE_ID, object.pageId());

		// Ensure that this test object is valid
		final Set<ConstraintViolation<FacebookPage>> violations = getValidator().validate(object);
		Assert.assertEquals(violations.toString(), 0, violations.size());
	}

	@Test
	public void testEqualsNull() {
		Assert.assertNotEquals(new FacebookPage(), null);
	}

	@Test
	public void testEqualsEmpty() {
		final FacebookPage object = new FacebookPage();
		Assert.assertEquals(object, new FacebookPage());
		Assert.assertEquals(object, object);
	}

	@Test
	public void testEquals() {
		Assert.assertEquals(new FacebookPage().pageId(EXPECTED_PAGE_ID), new FacebookPage().pageId(EXPECTED_PAGE_ID));
		Assert.assertNotEquals(new FacebookPage().pageId(EXPECTED_PAGE_ID), new FacebookPage().pageId("random"));

	}

	@Test
	public void testHashCode() {
		Assert.assertEquals(new FacebookPage().hashCode(), new FacebookPage().hashCode());
		Assert.assertNotEquals(new FacebookPage().pageId(EXPECTED_PAGE_ID).hashCode(), new FacebookPage()
			.pageId("")
			.hashCode());
	}

	@Test
	public void testConstraints() {
		final FacebookPage object = new FacebookPage().pageId(null);

		// Should have no violations
		final Set<ConstraintViolation<FacebookPage>> violations = getValidator().validate(object);
		Assert.assertEquals(violations.toString(), 1, violations.size());
	}
}
