// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.enumeration;

/**
 * Objects supported by a spout.
 * 
 * @author Samer Al-Buhaisi <samer.albuhaisi@mediamiser.com>
 */
public enum SpoutObjectType {
	TWITTER_USER,
	FACEBOOK_PAGE,
	STATE_CHANGE_NOTIFICATION,
	DELETION_NOTIFICATION;

	// These are used by annotations, which require string/int constants
	public static final String	TWITTER_USER_VALUE = "TWITTER_USER";
	public static final String	FACEBOOK_PAGE_VALUE = "FACEBOOK_PAGE";
	public static final String	STATE_CHANGE_NOTIFICATION_VALUE = "STATE_CHANGE_NOTIFICATION";
	public static final String	DELETION_NOTIFICATION_VALUE = "DELETION_NOTIFICATION";
	public static final String	VALUES	= TWITTER_USER_VALUE + "," + FACEBOOK_PAGE_VALUE + "," + STATE_CHANGE_NOTIFICATION_VALUE + "," + DELETION_NOTIFICATION_VALUE;
	public static final int		SIZE	= 4;
}
