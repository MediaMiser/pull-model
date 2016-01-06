// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.enumeration;

import org.junit.Assert;
import org.junit.Test;

public class SpoutReasonTest {

    @Test
    public void testEnum() {

        // Cover these functions
        Assert.assertTrue(SpoutReason.values().length > 0);
        Assert.assertEquals(SpoutReason.FINISHED, SpoutReason.valueOf(SpoutReason.FINISHED.toString()));
    }
}
