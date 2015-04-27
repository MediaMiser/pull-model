// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.enumeration;

/**
 * Media types supported by SNA monitoring.
 * 
 * @author Samer Al-Buhaisi <samer.albuhaisi@mediamiser.com>
 */
public enum MetaDataMediaType {
	TWITTER_USER,
	FACEBOOK_PAGE;

	// These are used by annotations, which require string/int constants
	public static final String	TWITTER_USER_VALUE = "TWITTER_USER";
	public static final String	FACEBOOK_PAGE_VALUE = "FACEBOOK_PAGE";
	public static final String	VALUES	= TWITTER_USER_VALUE + "," + FACEBOOK_PAGE_VALUE;
	public static final int		SIZE	= 2;
}
