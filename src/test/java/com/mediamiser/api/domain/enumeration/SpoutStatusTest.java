// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.enumeration;

import org.junit.Assert;
import org.junit.Test;

public class SpoutStatusTest {

    @Test
    public void testEnum() {

        // Cover these functions
        Assert.assertTrue(SpoutStatus.values().length > 0);
        Assert.assertEquals(SpoutStatus.COMPLETE, SpoutStatus.valueOf(SpoutStatus.COMPLETE.toString()));
    }
}
