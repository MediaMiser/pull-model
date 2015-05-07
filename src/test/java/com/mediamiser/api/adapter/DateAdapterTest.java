// Copyright (c) 2014-2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.adapter;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;


public class DateAdapterTest {

	protected static final DateAdapter	ADAPTER							= new DateAdapter();

	protected static final Date			DATE_1985_04_12T23_20_50_520Z	= new Date(482196050520l);
	protected static final Date			DATE_1996_12_20T00_39_57Z		= new Date(851042397000l);
	protected static final Date			DATE_1990_12_31T23_59_60Z		= new Date(662688000000l);
	protected static final Date			DATE_1937_01_01T11_40_27_870Z	= new Date(-1041337172130l);

	@Test
	public void testMarshall() throws Exception {
		// Marshall RFC 3339 examples.

		Assert.assertEquals("1985-04-12T23:20:50.520Z", ADAPTER.marshal(DATE_1985_04_12T23_20_50_520Z));
		Assert.assertEquals("1996-12-20T00:39:57Z", ADAPTER.marshal(DATE_1996_12_20T00_39_57Z));
		Assert.assertEquals("1991-01-01T00:00:00Z", ADAPTER.marshal(DATE_1990_12_31T23_59_60Z));
		Assert.assertEquals("1937-01-01T11:40:27.870Z", ADAPTER.marshal(DATE_1937_01_01T11_40_27_870Z));
	}

	@Test
	public void testUnmarshall() throws Exception {
		// Unmarshall RFC 3339 examples.

		// 20 minutes and 50.52 seconds after the 23rd hour of April 12th, 1985
		// in UTC
		Assert.assertEquals(DATE_1985_04_12T23_20_50_520Z, ADAPTER.unmarshal("1985-04-12T23:20:50.52Z"));

		// 39 minutes and 57 seconds after the 16th hour of December 19th, 1996
		// with an offset of -08:00 from UTC (Pacific Standard Time).
		Assert.assertEquals(DATE_1996_12_20T00_39_57Z, ADAPTER.unmarshal("1996-12-19T16:39:57-08:00"));

		// The leap second inserted at the end of 1990
		Assert.assertEquals(DATE_1990_12_31T23_59_60Z, ADAPTER.unmarshal("1990-12-31T23:59:60Z"));

		// The same leap second in Pacific Standard Time, 8 hours behind UTC
		Assert.assertEquals(DATE_1990_12_31T23_59_60Z, ADAPTER.unmarshal("1990-12-31T15:59:60-08:00"));

		// This represents the same instant of time as noon, January 1, 1937,
		// Netherlands time
		Assert.assertEquals(DATE_1937_01_01T11_40_27_870Z, ADAPTER.unmarshal("1937-01-01T12:00:27.87+00:20"));
	}

	@Test
	public void testMarshallBlank() throws Exception {
		Assert.assertEquals(null, ADAPTER.marshal(null));
	}

	@Test
	public void testUnmarshallBlank() throws Exception {
		Assert.assertEquals(null, ADAPTER.unmarshal(null));
		Assert.assertEquals(null, ADAPTER.unmarshal(""));
		Assert.assertEquals(null, ADAPTER.unmarshal(" "));
	}
}
