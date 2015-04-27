// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.output.metadata;

import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.mediamiser.api.adapter.DateAdapter;
import com.mediamiser.api.adapter.LocaleAdapter;
import com.mediamiser.api.domain.AbstractDomain;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Represents a twitter user.
 * 
 * @author Samer Al-Buhaisi <samer.albuhaisi@mediamiser.com>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
		name = "")
public class TwitterUser extends AbstractDomain {

	protected String		name;

	protected String		location;

	@XmlJavaTypeAdapter(DateAdapter.class)
	@ApiModelProperty(
			required = false,
			value = DateAdapter.DOCUMENTATION_DATETIME)
	protected Date			createdAt;

	protected String		id;

	@XmlJavaTypeAdapter(LocaleAdapter.class)
	@ApiModelProperty(
			value = LocaleAdapter.DOCUMENTATION_LOCALE)
	protected Locale		language;

	protected Long			followersCount;

	protected Boolean		verified;

	protected String		timeZone;

	protected Long			statusesCount;

	protected Boolean		isProtected;

	protected Boolean		isGeoEnabled;

	protected Boolean		isTranslator;

	protected Long			favouritesCount;

	protected Long			listedCount;

	protected String		url;

	protected String		description;

	protected Long			friendsCount;

	protected String		screenName;

	protected Set<String>	followers;

	protected Set<String>	friends;

	protected String		profileSidebarFillColor;

	protected String		profileSidebarBorderColor;

	protected Boolean		profileBackgroundTile;

	protected String		profileImageUrl;

	protected String		profileImageUrlHttps;

	protected String		profileLinkColor;

	protected String		profileBannerUrl;

	protected String		profileTextColor;

	protected String		profileBackgroundImageUrl;

	protected String		profileBackgroundImageUrlHttps;

	protected String		profileBackgroundColor;

	public String name() {
		return name;
	}

	public TwitterUser name(final String name) {
		this.name = name;
		return this;
	}

	public String location() {
		return location;
	}

	public TwitterUser location(final String location) {
		this.location = location;
		return this;
	}

	public Date createdAt() {
		return createdAt;
	}

	public TwitterUser createdAt(final Date createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public String id() {
		return id;
	}

	public TwitterUser id(final String id) {
		this.id = id;
		return this;
	}

	public Locale language() {
		return language;
	}

	public TwitterUser language(final Locale language) {
		this.language = language;
		return this;
	}

	public Long followersCount() {
		return followersCount;
	}

	public TwitterUser followersCount(final Long followersCount) {
		this.followersCount = followersCount;
		return this;
	}

	public Boolean verified() {
		return verified;
	}

	public TwitterUser verified(final Boolean verified) {
		this.verified = verified;
		return this;
	}

	public String timeZone() {
		return timeZone;
	}

	public TwitterUser timeZone(final String timeZone) {
		this.timeZone = timeZone;
		return this;
	}

	public Long statusesCount() {
		return statusesCount;
	}

	public TwitterUser statusesCount(final Long statusesCount) {
		this.statusesCount = statusesCount;
		return this;
	}

	public Boolean isProtected() {
		return isProtected;
	}

	public TwitterUser isProtected(final Boolean isProtected) {
		this.isProtected = isProtected;
		return this;
	}

	public Boolean isGeoEnabled() {
		return isGeoEnabled;
	}

	public TwitterUser isGeoEnabled(final Boolean isGeoEnabled) {
		this.isGeoEnabled = isGeoEnabled;
		return this;
	}

	public Boolean isTranslator() {
		return isTranslator;
	}

	public TwitterUser isTranslator(final Boolean isTranslator) {
		this.isTranslator = isTranslator;
		return this;
	}

	public Long favouritesCount() {
		return favouritesCount;
	}

	public TwitterUser favouritesCount(final Long favouritesCount) {
		this.favouritesCount = favouritesCount;
		return this;
	}

	public Long listedCount() {
		return listedCount;
	}

	public TwitterUser listedCount(final Long listedCount) {
		this.listedCount = listedCount;
		return this;
	}

	public String url() {
		return url;
	}

	public TwitterUser url(final String url) {
		this.url = url;
		return this;
	}

	public String description() {
		return description;
	}

	public TwitterUser description(final String description) {
		this.description = description;
		return this;
	}

	public Long friendsCount() {
		return friendsCount;
	}

	public TwitterUser friendsCount(final Long friendsCount) {
		this.friendsCount = friendsCount;
		return this;
	}

	public String screenName() {
		return screenName;
	}

	public TwitterUser screenName(final String screenName) {
		this.screenName = screenName;
		return this;
	}

	public Set<String> followers() {
		return followers;
	}

	public TwitterUser followers(final Set<String> followers) {
		this.followers = followers;
		return this;
	}

	public Set<String> friends() {
		return friends;
	}

	public TwitterUser friends(final Set<String> friends) {
		this.friends = friends;
		return this;
	}

	public String profileSidebarFillColor() {
		return profileSidebarFillColor;
	}

	public TwitterUser profileSidebarFillColor(final String profileSidebarFillColor) {
		this.profileSidebarFillColor = profileSidebarFillColor;
		return this;
	}

	public String profileSidebarBorderColor() {
		return profileSidebarBorderColor;
	}

	public TwitterUser profileSidebarBorderColor(final String profileSidebarBorderColor) {
		this.profileSidebarBorderColor = profileSidebarBorderColor;
		return this;
	}

	public Boolean profileBackgroundTile() {
		return profileBackgroundTile;
	}

	public TwitterUser profileBackgroundTile(final Boolean profilebackgroundTile) {
		this.profileBackgroundTile = profilebackgroundTile;
		return this;
	}

	public String profileImageUrl() {
		return profileImageUrl;
	}

	public TwitterUser profileImageUrl(final String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
		return this;
	}

	public String profileImageUrlHttps() {
		return profileImageUrlHttps;
	}

	public TwitterUser profileImageUrlHttps(final String profileImageUrlHttps) {
		this.profileImageUrlHttps = profileImageUrlHttps;
		return this;
	}

	public String profileLinkColor() {
		return profileLinkColor;
	}

	public TwitterUser profileLinkColor(final String profileLinkColor) {
		this.profileLinkColor = profileLinkColor;
		return this;
	}

	public String profileBannerUrl() {
		return profileBannerUrl;
	}

	public TwitterUser profileBannerUrl(final String profileBannerUrl) {
		this.profileBannerUrl = profileBannerUrl;
		return this;
	}

	public String profileTextColor() {
		return profileTextColor;
	}

	public TwitterUser profileTextColor(final String profileTextColor) {
		this.profileTextColor = profileTextColor;
		return this;
	}

	public String profileBackgroundImageUrl() {
		return profileBackgroundImageUrl;
	}

	public TwitterUser profileBackgroundImageUrl(final String profileBackgroundImageUrl) {
		this.profileBackgroundImageUrl = profileBackgroundImageUrl;
		return this;
	}

	public String profileBackgroundImageUrlHttps() {
		return profileBackgroundImageUrlHttps;
	}

	public TwitterUser profileBackgroundImageUrlHttps(final String profileBackgroundImageUrlHttps) {
		this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
		return this;
	}

	public String profileBackgroundColor() {
		return profileBackgroundColor;
	}

	public TwitterUser profileBackgroundColor(final String profileBackgroundColor) {
		this.profileBackgroundColor = profileBackgroundColor;
		return this;
	}

	@Override
	public boolean equals(final Object object) {
		boolean equals = false;

		if (this == object) {
			equals = true;
		} else if (object instanceof TwitterUser) {
			final TwitterUser other = (TwitterUser) object;
			equals = Objects.equals(name, other.name) 
					&& Objects.equals(location, other.location)
					&& Objects.equals(createdAt, other.createdAt) && Objects.equals(id, other.id)
					&& Objects.equals(language, other.language) && Objects.equals(followersCount, other.followersCount)
					&& Objects.equals(verified, other.verified) && Objects.equals(timeZone, other.timeZone)
					&& Objects.equals(statusesCount, other.statusesCount)
					&& Objects.equals(isProtected, other.isProtected)
					&& Objects.equals(isGeoEnabled, other.isGeoEnabled)
					&& Objects.equals(isTranslator, other.isTranslator)
					&& Objects.equals(favouritesCount, other.favouritesCount)
					&& Objects.equals(listedCount, other.listedCount) && Objects.equals(url, other.url)
					&& Objects.equals(description, other.description)
					&& Objects.equals(friendsCount, other.friendsCount) && Objects.equals(screenName, other.screenName)
					&& Objects.equals(followers, other.followers) && Objects.equals(friends, other.friends)
					&& Objects.equals(profileSidebarFillColor, other.profileSidebarFillColor)
					&& Objects.equals(profileSidebarBorderColor, other.profileSidebarBorderColor)
					&& Objects.equals(profileBackgroundTile, other.profileBackgroundTile)
					&& Objects.equals(profileImageUrl, other.profileImageUrl)
					&& Objects.equals(profileImageUrlHttps, other.profileImageUrlHttps)
					&& Objects.equals(profileLinkColor, other.profileLinkColor)
					&& Objects.equals(profileBannerUrl, other.profileBannerUrl)
					&& Objects.equals(profileTextColor, other.profileTextColor)
					&& Objects.equals(profileBackgroundImageUrl, other.profileBackgroundImageUrl)
					&& Objects.equals(profileBackgroundImageUrlHttps, other.profileBackgroundImageUrlHttps)
					&& Objects.equals(profileBackgroundColor, other.profileBackgroundColor);
		}

		return equals;
	}

	@Override
	public int hashCode() {
		return Objects.hash(
				name,
				location,
				createdAt,
				id,
				language,
				followersCount,
				verified,
				timeZone,
				statusesCount,
				isProtected,
				isGeoEnabled,
				isTranslator,
				favouritesCount,
				listedCount,
				url,
				description,
				friendsCount,
				screenName,
				followers,
				friends,
				profileSidebarFillColor,
				profileSidebarBorderColor,
				profileBackgroundTile,
				profileImageUrl,
				profileImageUrlHttps,
				profileLinkColor,
				profileBannerUrl,
				profileTextColor,
				profileBackgroundImageUrl,
				profileBackgroundImageUrlHttps,
				profileBackgroundColor);
	}
}
