// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.enumeration;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import com.mediamiser.api.domain.enumeration.SpoutReason;

public class SpoutReasonTest {

	@Test
	public void testEnum() {

		// Make sure that the SIZE constant is up to date (used by annotations
		// so much be manually specified)
		Assert.assertEquals(SpoutReason.values().length, SpoutReason.SIZE);

		// Make sure that all options are listed
		Assert.assertEquals(StringUtils.join(SpoutReason.values(), ",").length(), SpoutReason.VALUES.length());

		// Cover these functions
		Assert.assertTrue(SpoutReason.values().length > 0);
		Assert.assertEquals(SpoutReason.FINISHED, SpoutReason.valueOf(SpoutReason.FINISHED.toString()));
	}
}
