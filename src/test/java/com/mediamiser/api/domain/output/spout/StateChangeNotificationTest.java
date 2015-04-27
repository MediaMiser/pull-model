// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.output.spout;

import java.util.Date;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.junit.Assert;
import org.junit.Test;

import com.mediamiser.api.domain.enumeration.SpoutReason;
import com.mediamiser.api.domain.enumeration.SpoutStatus;
import com.mediamiser.api.domain.output.spout.StateChangeNotification;
import com.mediamiser.test.AbstractValidatedUnit;

public class StateChangeNotificationTest extends AbstractValidatedUnit {

	public static final SpoutStatus				EXPECTED_SPOUT_STATUS				= SpoutStatus.COMPLETE;
	public static final SpoutReason				EXPECTED_SPOUT_REASON				= SpoutReason.NO_CONTENT;
	public static final Date					EXPECTED_STATE_CHANGE_TIMESTAMP		= new Date();
	public static final StateChangeNotification	EXPECTED_STATE_CHANGE_NOTIFICATION	= new StateChangeNotification()
																						.status(EXPECTED_SPOUT_STATUS)
																						.reason(EXPECTED_SPOUT_REASON)
																						.timestamp(
																								EXPECTED_STATE_CHANGE_TIMESTAMP);

	@Test
	public void synposis() {
		// Create using setters
		final StateChangeNotification object = EXPECTED_STATE_CHANGE_NOTIFICATION;

		// Test getters setters
		Assert.assertEquals(EXPECTED_SPOUT_STATUS, object.status());
		Assert.assertEquals(EXPECTED_SPOUT_REASON, object.reason());
		Assert.assertEquals(EXPECTED_STATE_CHANGE_TIMESTAMP, object.timestamp());

		// Ensure that this test object is valid
		final Set<ConstraintViolation<StateChangeNotification>> violations = getValidator().validate(object);
		Assert.assertEquals(violations.toString(), 0, violations.size());
	}

	@Test
	public void testEqualsNull() {
		Assert.assertNotEquals(new StateChangeNotification(), null);
	}

	@Test
	public void testEqualsEmpty() {
		final StateChangeNotification object = new StateChangeNotification();
		Assert.assertEquals(object, new StateChangeNotification());
		Assert.assertEquals(object, object);
	}

	@Test
	public void testEquals() {
		Assert.assertEquals(
				new StateChangeNotification().status(EXPECTED_SPOUT_STATUS),
				new StateChangeNotification().status(EXPECTED_SPOUT_STATUS));
		Assert.assertNotEquals(
				new StateChangeNotification().status(EXPECTED_SPOUT_STATUS),
				new StateChangeNotification().status(SpoutStatus.IN_PRORGESS));

		Assert.assertEquals(
				new StateChangeNotification().reason(EXPECTED_SPOUT_REASON),
				new StateChangeNotification().reason(EXPECTED_SPOUT_REASON));
		Assert.assertNotEquals(
				new StateChangeNotification().reason(EXPECTED_SPOUT_REASON),
				new StateChangeNotification().reason(SpoutReason.RATE_LIMITED));

		Assert.assertEquals(
				new StateChangeNotification().timestamp(EXPECTED_STATE_CHANGE_TIMESTAMP),
				new StateChangeNotification().timestamp(EXPECTED_STATE_CHANGE_TIMESTAMP));
		Assert.assertNotEquals(
				new StateChangeNotification().timestamp(EXPECTED_STATE_CHANGE_TIMESTAMP),
				new StateChangeNotification().timestamp(new Date(23)));
	}

	@Test
	public void testHashCode() {
		Assert.assertEquals(new StateChangeNotification().hashCode(), new StateChangeNotification().hashCode());
		Assert.assertNotEquals(new StateChangeNotification()
			.timestamp(EXPECTED_STATE_CHANGE_TIMESTAMP)
			.hashCode(), new StateChangeNotification().timestamp(new Date(23)).hashCode());
	}

	@Test
	public void testConstraints() {
		final StateChangeNotification object = new StateChangeNotification().status(null).reason(null).timestamp(null);

		// Should have no violations
		final Set<ConstraintViolation<StateChangeNotification>> violations = getValidator().validate(object);
		Assert.assertEquals(violations.toString(), 3, violations.size());
	}
}
