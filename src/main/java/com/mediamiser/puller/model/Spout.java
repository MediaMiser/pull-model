// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.puller.model;

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
public class Spout extends AbstractDomain {

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

	@NotNull
	@ApiModelProperty(
			required = false)
	protected SpoutStatus			status;

	@NotNull
	@ApiModelProperty(
			required = false)
	@Size(
			min = 1,
			max = 10)
	protected Set<SpoutObjectType>	objectTypes		= Sets.newHashSet();

	public Set<String> monitoringIds() {
		return monitoringIds;
	}

	public Spout monitoringIds(final Set<String> monitoringIds) {
		this.monitoringIds = monitoringIds;
		return this;
	}

	public Date startTime() {
		return startTime;
	}

	public Spout startTime(final Date startTime) {
		this.startTime = startTime;
		return this;
	}

	public Date endTime() {
		return endTime;
	}

	public Spout endTime(final Date endTime) {
		this.endTime = endTime;
		return this;
	}

	public SpoutStatus status() {
		return status;
	}

	public Spout status(final SpoutStatus status) {
		this.status = status;
		return this;
	}

	public Set<SpoutObjectType> objectTypes() {
		return objectTypes;
	}

	public Spout objectTypes(final Set<SpoutObjectType> objectTypes) {
		this.objectTypes = objectTypes;
		return this;
	}

	@Override
	public boolean equals(final Object object) {
		boolean equals = false;

		if (this == object) {
			equals = true;
		} else if (object instanceof Spout) {
			final Spout other = (Spout) object;
			equals = Objects.equals(monitoringIds, other.monitoringIds) && Objects.equals(startTime, other.startTime)
					&& Objects.equals(endTime, other.endTime) && Objects.equals(status, other.status)
					&& Objects.equals(objectTypes, other.objectTypes);
		}
		return equals;
	}

	@Override
	public int hashCode() {
		return Objects.hash(monitoringIds, startTime, endTime, status, objectTypes);
	}
}
