// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.output.spout;

import java.util.Date;
import java.util.Set;

import javax.validation.ConstraintViolation;

import jersey.repackaged.com.google.common.collect.Sets;

import org.junit.Assert;
import org.junit.Test;

import com.mediamiser.api.domain.enumeration.SpoutObjectType;
import com.mediamiser.api.domain.enumeration.SpoutStatus;
import com.mediamiser.api.domain.input.SpoutRequest;
import com.mediamiser.test.AbstractValidatedUnit;

public class SpoutTest extends AbstractValidatedUnit {

	public static final Set<String>				EXPECTED_MONITORING_IDS	= Sets.newHashSet("someid");
	public static final Date					EXPECTED_START_TIME		= new Date(0);
	public static final Date					EXPECTED_END_TIME		= null;
	public static final SpoutStatus				EXPECTED_STATUS			= SpoutStatus.IN_PRORGESS;
	public static final Set<SpoutObjectType>	EXPECTED_OBJECT_TYPES	= Sets
																			.newHashSet(
																					SpoutObjectType.TWITTER_USER,
																					SpoutObjectType.DELETION_NOTIFICATION,
																					SpoutObjectType.STATE_CHANGE_NOTIFICATION);

	public static final Spout					EXPECTED				= ((Spout) new Spout()
																			.monitoringIds(EXPECTED_MONITORING_IDS)
																			.startTime(EXPECTED_START_TIME)
																			.endTime(EXPECTED_END_TIME)).status(
																				EXPECTED_STATUS).objectTypes(
																				EXPECTED_OBJECT_TYPES);

	@Test
	public void synposis() {
		// Create using setters
		final Spout object = EXPECTED;

		// Test getters setters
		Assert.assertEquals(EXPECTED_MONITORING_IDS, object.monitoringIds());
		Assert.assertEquals(EXPECTED_START_TIME, object.startTime());
		Assert.assertEquals(EXPECTED_END_TIME, object.endTime());
		Assert.assertEquals(EXPECTED_STATUS, object.status());
		Assert.assertEquals(EXPECTED_OBJECT_TYPES, object.objectTypes());

		// Ensure that this test object is valid
		final Set<ConstraintViolation<Spout>> violations = getValidator().validate(object);
		Assert.assertEquals(violations.toString(), 0, violations.size());
	}

	@Test
	public void testEqualsNull() {
		Assert.assertNotEquals(new Spout(), null);
		Assert.assertNotEquals(new SpoutRequest(), null);
	}

	@Test
	public void testEqualsEmpty() {
		final Spout object = new Spout();
		final SpoutRequest requestObject = new SpoutRequest();
		Assert.assertEquals(object, new Spout());
		Assert.assertEquals(object, object);
		Assert.assertEquals(requestObject, requestObject);
	}

	@Test
	public void testEquals() {
		Assert.assertEquals(
				new Spout().monitoringIds(EXPECTED_MONITORING_IDS),
				new Spout().monitoringIds(EXPECTED_MONITORING_IDS));
		Assert.assertNotEquals(
				new Spout().monitoringIds(EXPECTED_MONITORING_IDS),
				new Spout().monitoringIds(Sets.<String> newHashSet("random")));

		Assert.assertEquals(new Spout().startTime(EXPECTED_START_TIME), new Spout().startTime(EXPECTED_START_TIME));
		Assert.assertNotEquals(new Spout().startTime(EXPECTED_START_TIME), new Spout().startTime(new Date(23)));

		Assert.assertEquals(new Spout().endTime(EXPECTED_END_TIME), new Spout().endTime(EXPECTED_END_TIME));
		Assert.assertNotEquals(new Spout().endTime(EXPECTED_END_TIME), new Spout().endTime(new Date(23)));

		Assert.assertEquals(new Spout().status(EXPECTED_STATUS), new Spout().status(EXPECTED_STATUS));
		Assert.assertNotEquals(new Spout().status(EXPECTED_STATUS), new Spout().status(SpoutStatus.STOPPED));

		Assert.assertEquals(
				new Spout().objectTypes(EXPECTED_OBJECT_TYPES),
				new Spout().objectTypes(EXPECTED_OBJECT_TYPES));
		Assert.assertNotEquals(
				new Spout().objectTypes(EXPECTED_OBJECT_TYPES),
				new Spout().objectTypes(Sets.<SpoutObjectType> newHashSet()));

	}

	@Test
	public void testHashCode() {
		Assert.assertEquals(new Spout().hashCode(), new Spout().hashCode());
		Assert.assertNotEquals(new Spout().status(EXPECTED_STATUS).hashCode(), new Spout()
			.status(SpoutStatus.STOPPED)
			.hashCode());
	}

	@Test
	public void testConstraints() {
		final Spout object = (Spout) new Spout()
			.status(null)
			.objectTypes(null)
			.monitoringIds(Sets.<String> newHashSet())
			.startTime(null)
			.endTime(null);

		final Set<ConstraintViolation<Spout>> violations = getValidator().validate(object);
		Assert.assertEquals(violations.toString(), 3, violations.size());
	}
}
