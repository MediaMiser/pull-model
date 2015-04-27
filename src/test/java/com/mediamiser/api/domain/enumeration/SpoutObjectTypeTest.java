// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.enumeration;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import com.mediamiser.api.domain.enumeration.SpoutObjectType;

public class SpoutObjectTypeTest {

	@Test
	public void testEnum() {

		// Make sure that the SIZE constant is up to date (used by annotations
		// so much be manually specified)
		Assert.assertEquals(SpoutObjectType.values().length, SpoutObjectType.SIZE);

		// Make sure that all options are listed
		Assert.assertEquals(StringUtils.join(SpoutObjectType.values(), ",").length(), SpoutObjectType.VALUES.length());

		// Cover these functions
		Assert.assertTrue(SpoutObjectType.values().length > 0);
		Assert.assertEquals(
				SpoutObjectType.TWITTER_USER,
				SpoutObjectType.valueOf(SpoutObjectType.TWITTER_USER.toString()));
	}
}
