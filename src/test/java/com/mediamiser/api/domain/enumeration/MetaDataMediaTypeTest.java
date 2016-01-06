// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.enumeration;

import org.junit.Assert;
import org.junit.Test;

public class MetaDataMediaTypeTest {

    @Test
    public void testEnum() {

        // Cover these functions
        Assert.assertTrue(MetaDataMediaType.values().length > 0);
        Assert.assertEquals(
                MetaDataMediaType.TWITTER_USER,
                MetaDataMediaType.valueOf(MetaDataMediaType.TWITTER_USER.toString()));
    }
}
