// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.enumeration;

import org.junit.Assert;
import org.junit.Test;

public class SpoutObjectTypeTest {

    @Test
    public void testEnum() {

        // Cover these functions
        Assert.assertTrue(SpoutObjectType.values().length > 0);
        Assert.assertEquals(
                SpoutObjectType.TWITTER_USER, SpoutObjectType.valueOf(SpoutObjectType.TWITTER_USER.toString()));
    }
}
