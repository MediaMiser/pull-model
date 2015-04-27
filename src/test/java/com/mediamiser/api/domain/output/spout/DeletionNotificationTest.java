// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.output.spout;

import java.util.Date;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.junit.Assert;
import org.junit.Test;

import com.mediamiser.api.domain.enumeration.MetaDataMediaType;
import com.mediamiser.api.domain.output.spout.DeletionNotification;
import com.mediamiser.test.AbstractValidatedUnit;

public class DeletionNotificationTest extends AbstractValidatedUnit {

	public static final String					EXPECTED_MEDIA_ID				= "deletedObjectId";
	public static final MetaDataMediaType		EXPECTED_MEDIA_TYPE				= MetaDataMediaType.TWITTER_USER;
	public static final Date					EXPECTED_DELETION_TIMESTAMP		= new Date();
	public static final DeletionNotification	EXPECTED_DELETION_NOTIFICATION	= new DeletionNotification()
																					.mediaId(EXPECTED_MEDIA_ID)
																					.mediaType(EXPECTED_MEDIA_TYPE)
																					.timestamp(
																							EXPECTED_DELETION_TIMESTAMP);

	@Test
	public void synposis() {
		// Create using setters
		final DeletionNotification object = EXPECTED_DELETION_NOTIFICATION;

		// Test getters setters
		Assert.assertEquals(EXPECTED_MEDIA_ID, object.mediaId());
		Assert.assertEquals(EXPECTED_MEDIA_TYPE, object.mediaType());
		Assert.assertEquals(EXPECTED_DELETION_TIMESTAMP, object.timestamp());

		// Ensure that this test object is valid
		final Set<ConstraintViolation<DeletionNotification>> violations = getValidator().validate(object);
		Assert.assertEquals(violations.toString(), 0, violations.size());
	}

	@Test
	public void testEqualsNull() {
		Assert.assertNotEquals(new DeletionNotification(), null);
	}

	@Test
	public void testEqualsEmpty() {
		final DeletionNotification object = new DeletionNotification();
		Assert.assertEquals(object, new DeletionNotification());
		Assert.assertEquals(object, object);
	}

	@Test
	public void testEquals() {
		Assert.assertEquals(
				new DeletionNotification().mediaId(EXPECTED_MEDIA_ID),
				new DeletionNotification().mediaId(EXPECTED_MEDIA_ID));
		Assert.assertNotEquals(
				new DeletionNotification().mediaId(EXPECTED_MEDIA_ID),
				new DeletionNotification().mediaId("random"));

		Assert.assertEquals(
				new DeletionNotification().mediaType(EXPECTED_MEDIA_TYPE),
				new DeletionNotification().mediaType(EXPECTED_MEDIA_TYPE));
		Assert.assertNotEquals(
				new DeletionNotification().mediaType(EXPECTED_MEDIA_TYPE),
				new DeletionNotification().mediaType(MetaDataMediaType.FACEBOOK_PAGE));

		Assert.assertEquals(
				new DeletionNotification().timestamp(EXPECTED_DELETION_TIMESTAMP),
				new DeletionNotification().timestamp(EXPECTED_DELETION_TIMESTAMP));
		Assert.assertNotEquals(
				new DeletionNotification().timestamp(EXPECTED_DELETION_TIMESTAMP),
				new DeletionNotification().timestamp(new Date(23)));
	}

	@Test
	public void testHashCode() {
		Assert.assertEquals(new DeletionNotification().hashCode(), new DeletionNotification().hashCode());
		Assert.assertNotEquals(
				new DeletionNotification().timestamp(EXPECTED_DELETION_TIMESTAMP).hashCode(),
				new DeletionNotification().timestamp(new Date(23)).hashCode());
	}

	@Test
	public void testConstraints() {
		final DeletionNotification object = new DeletionNotification().mediaId(null).mediaType(null).timestamp(null);

		// Should have no violations
		final Set<ConstraintViolation<DeletionNotification>> violations = getValidator().validate(object);
		Assert.assertEquals(violations.toString(), 3, violations.size());
	}
}
