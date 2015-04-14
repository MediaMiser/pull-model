// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.puller.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Represents a facebook page.
 * 
 * @author Samer Al-Buhaisi <samer.albuhaisi@mediamiser.com>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
		name = "")
public class FacebookPage extends AbstractDomain {

	@NotNull
	@Size(
			min = 1,
			max = 60)
	@ApiModelProperty(
			required = true)
	protected String	pageId;

	public String pageId() {
		return pageId;
	}

	public FacebookPage pageId(final String pageId) {
		this.pageId = pageId;
		return this;
	}

	@Override
	public boolean equals(final Object object) {
		boolean equals = false;

		if (this == object) {
			equals = true;
		} else if (object instanceof FacebookPage) {
			final FacebookPage other = (FacebookPage) object;
			equals = Objects.equals(pageId, other.pageId);
		}

		return equals;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pageId);
	}
}
