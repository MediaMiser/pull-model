// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.junit.Assert;
import org.junit.Test;

import com.mediamiser.test.AbstractValidatedUnit;

public class AccessTokenStoreTest extends AbstractValidatedUnit {

	// This is an example token from Twitter's documentation
	// (https://dev.twitter.com/oauth/application-only). It is not
	// a real token.
	public static final String				EXPECTED_TWITTER_BEARER_TOKEN	= "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA%2FAAAAAAAAAAAAAAAAAAAA%3DAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
	public static final AccessTokenStore	EXPECTED						= new AccessTokenStore()
																				.twitterBearerToken(EXPECTED_TWITTER_BEARER_TOKEN);

	@Test
	public void synposis() {
		// Create using setters
		final AccessTokenStore object = EXPECTED;

		// Test getters setters
		Assert.assertEquals(EXPECTED_TWITTER_BEARER_TOKEN, object.twitterBearerToken());

		// Ensure that this test object is valid
		final Set<ConstraintViolation<AccessTokenStore>> violations = getValidator().validate(object);
		Assert.assertEquals(violations.toString(), 0, violations.size());
	}

	@Test
	public void testEqualsNull() {
		Assert.assertNotEquals(new AccessTokenStore(), null);
	}

	@Test
	public void testEqualsEmpty() {
		final AccessTokenStore object = new AccessTokenStore();
		Assert.assertEquals(object, new AccessTokenStore());
		Assert.assertEquals(object, object);
	}

	@Test
	public void testEquals() {
		final AccessTokenStore objectA = new AccessTokenStore().twitterBearerToken(EXPECTED_TWITTER_BEARER_TOKEN);
		final AccessTokenStore objectB = new AccessTokenStore().twitterBearerToken(EXPECTED_TWITTER_BEARER_TOKEN);
		final AccessTokenStore objectC = new AccessTokenStore().twitterBearerToken(EXPECTED_TWITTER_BEARER_TOKEN + "1");

		Assert.assertEquals(objectA, objectB);
		Assert.assertNotEquals(objectA, objectC);
	}

	@Test
	public void testHashCode() {
		Assert.assertEquals(new AccessTokenStore().hashCode(), new AccessTokenStore().hashCode());
		Assert.assertNotEquals(
				new AccessTokenStore().twitterBearerToken(EXPECTED_TWITTER_BEARER_TOKEN).hashCode(),
				new AccessTokenStore().twitterBearerToken("different").hashCode());
	}

	@Test
	public void testConstraints() {
		// Create
		final AccessTokenStore object1 = new AccessTokenStore().twitterBearerToken("notlongenough");

		// Should violate length
		final Set<ConstraintViolation<AccessTokenStore>> violations1 = getValidator().validate(object1);
		Assert.assertEquals(violations1.toString(), 1, violations1.size());
	}
}
