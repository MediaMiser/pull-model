// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.enumeration;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import com.mediamiser.api.domain.enumeration.MetaDataMediaType;

public class MetaDataMediaTypeTest {

	@Test
	public void testEnum() {

		// Make sure that the SIZE constant is up to date (used by annotations
		// so much be manually specified)
		Assert.assertEquals(MetaDataMediaType.values().length, MetaDataMediaType.SIZE);

		// Make sure that all options are listed
		Assert.assertEquals(StringUtils.join(MetaDataMediaType.values(), ",").length(), MetaDataMediaType.VALUES.length());

		// Cover these functions
		Assert.assertTrue(MetaDataMediaType.values().length > 0);
		Assert.assertEquals(MetaDataMediaType.TWITTER_USER, MetaDataMediaType.valueOf(MetaDataMediaType.TWITTER_USER.toString()));
	}
}
