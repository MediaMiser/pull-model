// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.enumeration;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import com.mediamiser.api.domain.enumeration.SpoutStatus;

public class SpoutStatusTest {

	@Test
	public void testEnum() {

		// Make sure that the SIZE constant is up to date (used by annotations
		// so much be manually specified)
		Assert.assertEquals(SpoutStatus.values().length, SpoutStatus.SIZE);

		// Make sure that all options are listed
		Assert.assertEquals(StringUtils.join(SpoutStatus.values(), ",").length(), SpoutStatus.VALUES.length());

		// Cover these functions
		Assert.assertTrue(SpoutStatus.values().length > 0);
		Assert.assertEquals(SpoutStatus.COMPLETE, SpoutStatus.valueOf(SpoutStatus.COMPLETE.toString()));
	}
}
