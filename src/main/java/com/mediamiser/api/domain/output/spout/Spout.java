// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.output.spout;

import com.google.common.collect.Sets;
import com.mediamiser.api.domain.enumeration.SpoutObjectType;
import com.mediamiser.api.domain.enumeration.SpoutStatus;
import com.mediamiser.api.domain.input.SpoutRequest;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;
import java.util.Set;

/**
 * Represents a means of consuming data.
 *
 * @author Samer Al-Buhaisi <samer.albuhaisi@mediamiser.com>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "")
public class Spout extends SpoutRequest {

    @NotNull
    protected SpoutStatus status;

    @NotNull
    @Size(
            min = 1,
            max = 10)
    protected Set<SpoutObjectType> objectTypes = Sets.newHashSet();

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
            equals = super.equals(other) && Objects.equals(status, other.status) && Objects.equals(
                    objectTypes,
                    other.objectTypes);
        }
        return equals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), monitoringIds, startTime, endTime, status, objectTypes);
    }
}
