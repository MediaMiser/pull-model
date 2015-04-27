// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.enumeration;

/**
 * The currents status of a spout.
 * 
 * @author Samer Al-Buhaisi <samer.albuhaisi@mediamiser.com>
 */
public enum SpoutStatus {
	COMPLETE,
	STOPPED,
	IN_PRORGESS;

	// These are used by annotations, which require string/int constants
	public static final String	VALUES	= "COMPLETE,STOPPED,IN_PRORGESS";
	public static final int		SIZE	= 3;
}
