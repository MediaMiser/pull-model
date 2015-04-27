// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.input;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.google.common.collect.Sets;
import com.mediamiser.api.adapter.DateAdapter;
import com.mediamiser.api.domain.AbstractDomain;
import com.wordnik.swagger.annotations.ApiModelProperty;
import cz.jirutka.validator.collection.constraints.EachSize;

/**
 * Represents a means of consuming data.
 * 
 * @author Samer Al-Buhaisi <samer.albuhaisi@mediamiser.com>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
		name = "")
public class SpoutRequest extends AbstractDomain {

	@NotNull
	@Size(
			min = 1,
			max = 100)
	@EachSize(
			min = 1,
			max = 60)
	@ApiModelProperty(
			required = false)
	protected Set<String>			monitoringIds	= Sets.newHashSet();

	@XmlJavaTypeAdapter(DateAdapter.class)
	@ApiModelProperty(
			required = false,
			value = DateAdapter.DOCUMENTATION_DATETIME)
	protected Date					startTime;

	@XmlJavaTypeAdapter(DateAdapter.class)
	@ApiModelProperty(
			required = false,
			value = DateAdapter.DOCUMENTATION_DATETIME)
	protected Date					endTime;

	public Set<String> monitoringIds() {
		return monitoringIds;
	}

	public SpoutRequest monitoringIds(final Set<String> monitoringIds) {
		this.monitoringIds = monitoringIds;
		return this;
	}

	public Date startTime() {
		return startTime;
	}

	public SpoutRequest startTime(final Date startTime) {
		this.startTime = startTime;
		return this;
	}

	public Date endTime() {
		return endTime;
	}

	public SpoutRequest endTime(final Date endTime) {
		this.endTime = endTime;
		return this;
	}

	@Override
	public boolean equals(final Object object) {
		boolean equals = false;

		if (this == object) {
			equals = true;
		} else if (object instanceof SpoutRequest) {
			final SpoutRequest other = (SpoutRequest) object;
			equals = Objects.equals(monitoringIds, other.monitoringIds) && Objects.equals(startTime, other.startTime)
					&& Objects.equals(endTime, other.endTime);
		}
		return equals;
	}

	@Override
	public int hashCode() {
		return Objects.hash(monitoringIds, startTime, endTime);
	}
}
