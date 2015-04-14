// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.puller.model;

import java.util.Date;
import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * A notification that a monitored media type was deleted.
 * 
 * @author Samer Al-Buhaisi <samer.albuhaisi@mediamiser.com>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
		name = "")
public class DeletionNotification extends AbstractDomain {

	@NotNull
	@Size(
			min = 1,
			max = 60)
	@ApiModelProperty(
			required = true)
	protected String			mediaId;

	@NotNull
	@ApiModelProperty(
			required = true)
	protected MetaDataMediaType	mediaType;

	@NotNull
	@XmlJavaTypeAdapter(DateAdapter.class)
	@ApiModelProperty(
			required = true,
			value = DateAdapter.DOCUMENTATION_DATETIME)
	protected Date				timestamp;

	public String mediaId() {
		return mediaId;
	}

	public DeletionNotification mediaId(final String mediaId) {
		this.mediaId = mediaId;
		return this;
	}

	public MetaDataMediaType mediaType() {
		return mediaType;
	}

	public DeletionNotification mediaType(final MetaDataMediaType mediaType) {
		this.mediaType = mediaType;
		return this;
	}

	public Date timestamp() {
		return timestamp;
	}

	public DeletionNotification timestamp(final Date timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	@Override
	public boolean equals(final Object object) {
		boolean equals = false;

		if (this == object) {
			equals = true;
		} else if (object instanceof DeletionNotification) {
			final DeletionNotification other = (DeletionNotification) object;
			equals = Objects.equals(mediaId, other.mediaId) && Objects.equals(mediaType, other.mediaType)
					&& Objects.equals(timestamp, other.timestamp);
		}

		return equals;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mediaId, mediaType, timestamp);
	}
}
