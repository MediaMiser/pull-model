// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.output.metadata;

import java.util.Date;
import java.util.Locale;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.google.common.collect.Sets;

import org.junit.Assert;
import org.junit.Test;

import com.mediamiser.api.domain.output.metadata.TwitterUser;
import com.mediamiser.test.AbstractValidatedUnit;

public class TwitterUserTest extends AbstractValidatedUnit {

	public static final String			EXPECTED_NAME								= "Gregory House";
	public static final String			EXPECTED_LOCATION							= "San Francisco, CA";
	public static final Date			EXPECTED_CREATED_AT							= new Date();
	public static final String			EXPECTED_ID									= "783214";
	public static final Locale			EXPECTED_LANGUAGE							= Locale.ENGLISH;
	public static final Long			EXPECTED_FOLLOWERS_COUNT					= 12788713L;
	public static final Boolean			EXPECTED_VERIFIED							= true;
	public static final String			EXPECTED_TIME_ZONE							= "Pacific Time (US & Canada)";
	public static final Long			EXPECTED_STATUSES_COUNT						= 1379L;
	public static final Boolean			EXPECTED_IS_PROTECTED						= false;
	public static final Boolean			EXPECTED_IS_GEO_ENABLED						= true;
	public static final Boolean			EXPECTED_IS_TRANSLATOR						= false;
	public static final Long			EXPECTED_FAVORITES_COUNT					= 17L;
	public static final Long			EXPECTED_LISTED_COUNT						= 72534L;
	public static final String			EXPECTED_URL								= "http://blog.twitter.com/";
	public static final String			EXPECTED_DESCRIPTION						= "Always wondering what's happening. ";
	public static final Long			EXPECTED_FRIENDS_COUNT						= 1195L;
	public static final String			EXPECTED_SCREEN_NAME						= "twitter";
	public static final Set<String>		EXPECTED_FOLLOWERS							= Sets.newHashSet(
																							"1531298594",
																							"2148879981");
	public static final Set<String>		EXPECTED_FRIENDS							= Sets.newHashSet(
																							"2148879981",
																							"1531298594");																	;
	public static final String			EXPECTED_PROFILE_SIDEBAR_FILL_COLOR			= "F6F6F6";
	public static final Boolean			EXPECTED_PROFILE_BACKGROUND_TILE			= true;
	public static final String			EXPECTED_PROFILE_SIDEBAR_BORDER_COLOR		= "EEEEEE";
	public static final String			EXPECTED_PROFILE_IMAGE_URL					= "http://a0.twimg.com/profile_images/2284174758/v65oai7fxn47qv9nectx_normal.png";
	public static final String			EXPECTED_PROFILE_LINK_COLOR					= "038543";
	public static final String			EXPECTED_PROFILE_IMAGE_URL_HTTPS			= "https://si0.twimg.com/profile_images/2284174758/v65oai7fxn47qv9nectx_normal.png";
	public static final String			EXPECTED_PROFILE_BACKGROUND_IMAGE_URL_HTTPS	= "https://si0.twimg.com/profile_background_images/378245879/Twitter_1544x2000.png";
	public static final String			EXPECTED_PROFILE_BACKGROUND_IMAGE_URL		= "http://a0.twimg.com/profile_background_images/378245879/Twitter_1544x2000.png";
	public static final String			EXPECTED_PROFILE_BANNER_URL					= "https://si0.twimg.com/brand_banners/twitter/1323368512/live";
	public static final String			EXPECTED_PROFILE_TEXT_COLOR					= "333333";
	public static final String			EXPECTED_PROFILE_BACKGROUND_COLOR			= "ACDED6";

	public static final TwitterUser		EXPECTED_TWITTER_USER						= new TwitterUser()
																						.name(EXPECTED_NAME)
																						.location(EXPECTED_LOCATION)
																						.createdAt(EXPECTED_CREATED_AT)
																						.id(EXPECTED_ID)
																						.language(EXPECTED_LANGUAGE)
																						.followersCount(
																								EXPECTED_FOLLOWERS_COUNT)
																						.verified(EXPECTED_VERIFIED)
																						.timeZone(EXPECTED_TIME_ZONE)
																						.statusesCount(
																								EXPECTED_STATUSES_COUNT)
																						.isProtected(
																								EXPECTED_IS_PROTECTED)
																						.isGeoEnabled(
																								EXPECTED_IS_GEO_ENABLED)
																						.isTranslator(
																								EXPECTED_IS_TRANSLATOR)
																						.favouritesCount(
																								EXPECTED_FAVORITES_COUNT)
																						.listedCount(
																								EXPECTED_LISTED_COUNT)
																						.url(EXPECTED_URL)
																						.description(
																								EXPECTED_DESCRIPTION)
																						.friendsCount(
																								EXPECTED_FRIENDS_COUNT)
																						.screenName(
																								EXPECTED_SCREEN_NAME)
																						.followers(EXPECTED_FOLLOWERS)
																						.friends(EXPECTED_FRIENDS)
																						.profileSidebarFillColor(
																								EXPECTED_PROFILE_SIDEBAR_FILL_COLOR)
																						.profileBackgroundTile(
																								EXPECTED_PROFILE_BACKGROUND_TILE)
																						.profileSidebarBorderColor(
																								EXPECTED_PROFILE_SIDEBAR_BORDER_COLOR)
																						.profileImageUrl(
																								EXPECTED_PROFILE_IMAGE_URL)
																						.profileLinkColor(
																								EXPECTED_PROFILE_LINK_COLOR)
																						.profileImageUrlHttps(
																								EXPECTED_PROFILE_IMAGE_URL_HTTPS)
																						.profileBackgroundImageUrlHttps(
																								EXPECTED_PROFILE_BACKGROUND_IMAGE_URL_HTTPS)
																						.profileBackgroundImageUrl(
																								EXPECTED_PROFILE_BACKGROUND_IMAGE_URL)
																						.profileBannerUrl(
																								EXPECTED_PROFILE_BANNER_URL)
																						.profileTextColor(
																								EXPECTED_PROFILE_TEXT_COLOR)
																						.profileBackgroundColor(
																								EXPECTED_PROFILE_BACKGROUND_COLOR);

	@Test
	public void synposis() {
		// Create using setters
		final TwitterUser object = EXPECTED_TWITTER_USER;

		// Test getters setters
		Assert.assertEquals(EXPECTED_NAME, object.name());

		Assert.assertEquals(EXPECTED_NAME, object.name());
		Assert.assertEquals(EXPECTED_LOCATION, object.location());
		Assert.assertEquals(EXPECTED_CREATED_AT, object.createdAt());
		Assert.assertEquals(EXPECTED_ID, object.id());
		Assert.assertEquals(EXPECTED_LANGUAGE, object.language());
		Assert.assertEquals(EXPECTED_FOLLOWERS_COUNT, object.followersCount());
		Assert.assertEquals(EXPECTED_VERIFIED, object.verified());
		Assert.assertEquals(EXPECTED_TIME_ZONE, object.timeZone());
		Assert.assertEquals(EXPECTED_STATUSES_COUNT, object.statusesCount());
		Assert.assertEquals(EXPECTED_IS_PROTECTED, object.isProtected());
		Assert.assertEquals(EXPECTED_IS_GEO_ENABLED, object.isGeoEnabled());
		Assert.assertEquals(EXPECTED_IS_TRANSLATOR, object.isTranslator());
		Assert.assertEquals(EXPECTED_FAVORITES_COUNT, object.favouritesCount());
		Assert.assertEquals(EXPECTED_LISTED_COUNT, object.listedCount());
		Assert.assertEquals(EXPECTED_URL, object.url());
		Assert.assertEquals(EXPECTED_DESCRIPTION, object.description());
		Assert.assertEquals(EXPECTED_FRIENDS_COUNT, object.friendsCount());
		Assert.assertEquals(EXPECTED_SCREEN_NAME, object.screenName());
		Assert.assertEquals(EXPECTED_FOLLOWERS, object.followers());
		Assert.assertEquals(EXPECTED_FRIENDS, object.friends());
		Assert.assertEquals(EXPECTED_PROFILE_SIDEBAR_FILL_COLOR, object.profileSidebarFillColor());
		Assert.assertEquals(EXPECTED_PROFILE_BACKGROUND_TILE, object.profileBackgroundTile());
		Assert.assertEquals(EXPECTED_PROFILE_SIDEBAR_BORDER_COLOR, object.profileSidebarBorderColor());
		Assert.assertEquals(EXPECTED_PROFILE_IMAGE_URL, object.profileImageUrl());
		Assert.assertEquals(EXPECTED_PROFILE_LINK_COLOR, object.profileLinkColor());
		Assert.assertEquals(EXPECTED_PROFILE_IMAGE_URL_HTTPS, object.profileImageUrlHttps());
		Assert.assertEquals(
				EXPECTED_PROFILE_BACKGROUND_IMAGE_URL_HTTPS,
				object.profileBackgroundImageUrlHttps());
		Assert.assertEquals(EXPECTED_PROFILE_BACKGROUND_IMAGE_URL, object.profileBackgroundImageUrl());
		Assert.assertEquals(EXPECTED_PROFILE_BANNER_URL, object.profileBannerUrl());
		Assert.assertEquals(EXPECTED_PROFILE_TEXT_COLOR, object.profileTextColor());
		Assert.assertEquals(EXPECTED_PROFILE_BACKGROUND_COLOR, object.profileBackgroundColor());

		// Ensure that this test object is valid
		final Set<ConstraintViolation<TwitterUser>> violations = getValidator().validate(object);
		Assert.assertEquals(violations.toString(), 0, violations.size());
	}

	@Test
	public void testEqualsNull() {
		Assert.assertNotEquals(new TwitterUser(), null);
	}

	@Test
	public void testEqualsEmpty() {
		final TwitterUser object = new TwitterUser();
		Assert.assertEquals(object, new TwitterUser());
		Assert.assertEquals(object, object);
	}

	@Test
	public void testEquals() {
		Assert.assertEquals(EXPECTED_TWITTER_USER, EXPECTED_TWITTER_USER);

		Assert.assertNotEquals(new TwitterUser().name(EXPECTED_NAME), new TwitterUser().name("random"));
		Assert.assertNotEquals(
				new TwitterUser().location(EXPECTED_LOCATION),
				new TwitterUser().location("random"));
		Assert.assertNotEquals(
				new TwitterUser().createdAt(EXPECTED_CREATED_AT),
				new TwitterUser().createdAt(new Date(23)));
		Assert.assertNotEquals(new TwitterUser().id(EXPECTED_ID), new TwitterUser().id("random"));
		Assert.assertNotEquals(
				new TwitterUser().language(EXPECTED_LANGUAGE),
				new TwitterUser().language(Locale.FRENCH));
		Assert.assertNotEquals(
				new TwitterUser().followersCount(EXPECTED_FOLLOWERS_COUNT),
				new TwitterUser().followersCount(0L));
		Assert.assertNotEquals(
				new TwitterUser().verified(EXPECTED_VERIFIED),
				new TwitterUser().verified(false));
		Assert.assertNotEquals(
				new TwitterUser().timeZone(EXPECTED_TIME_ZONE),
				new TwitterUser().timeZone("random"));
		Assert.assertNotEquals(
				new TwitterUser().statusesCount(EXPECTED_STATUSES_COUNT),
				new TwitterUser().statusesCount(0L));
		Assert.assertNotEquals(
				new TwitterUser().isProtected(EXPECTED_IS_PROTECTED),
				new TwitterUser().isProtected(true));
		Assert.assertNotEquals(
				new TwitterUser().isGeoEnabled(EXPECTED_IS_GEO_ENABLED),
				new TwitterUser().isGeoEnabled(false));
		Assert.assertNotEquals(
				new TwitterUser().isTranslator(EXPECTED_IS_TRANSLATOR),
				new TwitterUser().isTranslator(true));
		Assert.assertNotEquals(
				new TwitterUser().favouritesCount(EXPECTED_FAVORITES_COUNT),
				new TwitterUser().favouritesCount(0L));
		Assert.assertNotEquals(
				new TwitterUser().listedCount(EXPECTED_LISTED_COUNT),
				new TwitterUser().listedCount(0L));
		Assert.assertNotEquals(new TwitterUser().url(EXPECTED_URL), new TwitterUser().url("random"));
		Assert.assertNotEquals(
				new TwitterUser().description(EXPECTED_DESCRIPTION),
				new TwitterUser().description("random"));
		Assert.assertNotEquals(
				new TwitterUser().friendsCount(EXPECTED_FRIENDS_COUNT),
				new TwitterUser().friendsCount(0L));
		Assert.assertNotEquals(
				new TwitterUser().screenName(EXPECTED_SCREEN_NAME),
				new TwitterUser().screenName("random"));
		Assert.assertNotEquals(
				new TwitterUser().followers(EXPECTED_FOLLOWERS),
				new TwitterUser().followers(Sets.<String> newHashSet()));
		Assert.assertNotEquals(
				new TwitterUser().friends(EXPECTED_FRIENDS),
				new TwitterUser().friends(Sets.<String> newHashSet()));
		Assert.assertNotEquals(
				new TwitterUser().profileSidebarFillColor(EXPECTED_PROFILE_SIDEBAR_FILL_COLOR),
				new TwitterUser().profileSidebarFillColor("random"));
		Assert.assertNotEquals(
				new TwitterUser().profileBackgroundTile(EXPECTED_PROFILE_BACKGROUND_TILE),
				new TwitterUser().profileBackgroundTile(false));
		Assert.assertNotEquals(
				new TwitterUser().profileSidebarBorderColor(EXPECTED_PROFILE_SIDEBAR_BORDER_COLOR),
				new TwitterUser().profileSidebarBorderColor("random"));
		Assert.assertNotEquals(
				new TwitterUser().profileImageUrl(EXPECTED_PROFILE_IMAGE_URL),
				new TwitterUser().profileImageUrl("random"));
		Assert.assertNotEquals(
				new TwitterUser().profileLinkColor(EXPECTED_PROFILE_LINK_COLOR),
				new TwitterUser().profileLinkColor("random"));
		Assert.assertNotEquals(
				new TwitterUser().profileImageUrlHttps(EXPECTED_PROFILE_IMAGE_URL_HTTPS),
				new TwitterUser().profileImageUrlHttps("random"));
		Assert.assertNotEquals(
				new TwitterUser().profileBackgroundImageUrlHttps(EXPECTED_PROFILE_BACKGROUND_IMAGE_URL_HTTPS),
				new TwitterUser().profileBackgroundImageUrlHttps("random"));
		Assert.assertNotEquals(
				new TwitterUser().profileBackgroundImageUrl(EXPECTED_PROFILE_BACKGROUND_IMAGE_URL),
				new TwitterUser().profileBackgroundImageUrl("random"));
		Assert.assertNotEquals(
				new TwitterUser().profileBannerUrl(EXPECTED_PROFILE_BANNER_URL),
				new TwitterUser().profileBannerUrl("random"));
		Assert.assertNotEquals(
				new TwitterUser().profileTextColor(EXPECTED_PROFILE_TEXT_COLOR),
				new TwitterUser().profileTextColor("random"));
		Assert.assertNotEquals(
				new TwitterUser().profileBackgroundColor(EXPECTED_PROFILE_BACKGROUND_COLOR),
				new TwitterUser().profileBackgroundColor("random"));
	}

	@Test
	public void testHashCode() {
		Assert.assertEquals(new TwitterUser().hashCode(), new TwitterUser().hashCode());
		Assert.assertNotEquals(new TwitterUser().name(EXPECTED_NAME).hashCode(), new TwitterUser()
			.name("")
			.hashCode());
	}

	@Test
	public void testConstraints() {
		final TwitterUser object = new TwitterUser().name(null);

		// Should have no violations
		final Set<ConstraintViolation<TwitterUser>> violations = getValidator().validate(object);
		Assert.assertEquals(violations.toString(), 0, violations.size());
	}
}
