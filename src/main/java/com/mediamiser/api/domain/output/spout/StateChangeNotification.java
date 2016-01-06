// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain.output.spout;

import com.mediamiser.api.adapter.DateAdapter;
import com.mediamiser.api.domain.AbstractDomain;
import com.mediamiser.api.domain.enumeration.SpoutReason;
import com.mediamiser.api.domain.enumeration.SpoutStatus;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.Objects;

/**
 * A notification that a spout's state has changed.
 *
 * @author Samer Al-Buhaisi <samer.albuhaisi@mediamiser.com>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "")
public class StateChangeNotification extends AbstractDomain {

    @NotNull
    protected SpoutStatus status;

    @NotNull
    protected SpoutReason reason;

    @NotNull
    @XmlJavaTypeAdapter(DateAdapter.class)
    protected Date timestamp;

    public SpoutStatus status() {
        return status;
    }

    public StateChangeNotification status(final SpoutStatus status) {
        this.status = status;
        return this;
    }

    public SpoutReason reason() {
        return reason;
    }

    public StateChangeNotification reason(final SpoutReason reason) {
        this.reason = reason;
        return this;
    }

    public Date timestamp() {
        return timestamp;
    }

    public StateChangeNotification timestamp(final Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public boolean equals(final Object object) {
        boolean equals = false;

        if (this == object) {
            equals = true;
        } else if (object instanceof StateChangeNotification) {
            final StateChangeNotification other = (StateChangeNotification) object;
            equals = Objects.equals(status, other.status) && Objects.equals(reason, other.reason) && Objects.equals(
                    timestamp,
                    other.timestamp);
        }

        return equals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, reason, timestamp);
    }
}
