// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.enumeration;

/**
 * Reasons for state changes for spouts.
 * 
 * @author Samer Al-Buhaisi <samer.albuhaisi@mediamiser.com>
 */
public enum SpoutReason {
	RATE_LIMITED,
	NO_CONTENT;

	// These are used by annotations, which require string/int constants
	public static final String	VALUES	= "RATE_LIMITED,NO_CONTENT";
	public static final int		SIZE	= 2;
}
