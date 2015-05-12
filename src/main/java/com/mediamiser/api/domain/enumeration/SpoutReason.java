// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.enumeration;

/**
 * Reasons for state changes for spouts.
 * 
 * @author Samer Al-Buhaisi <samer.albuhaisi@mediamiser.com>
 */
public enum SpoutReason {
	FINISHED,
	NO_CONTENT;

	// Constants that are needed for in documentation/constraint-related annotations
	public static final String	VALUES	= "FINISHED,NO_CONTENT";
	public static final int		SIZE	= 2;
}
