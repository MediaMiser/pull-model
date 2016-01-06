// Copyright (c) 2014-2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain;

import javax.validation.constraints.Null;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Common methods/properties for all domain objects.
 *
 * @author Chris Fournier <chris.fournier@mediamiser.com>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(
        name = "")
public abstract class AbstractDomain {

    /**
     * This is a catch all field used to ensure no unrecognized fields are
     * accepted. This field must always be null. Any extra fields will be
     * unmarshaled into this field, causing a validation error.
     */
    @Null(
            message = "unrecognized field")
    @XmlAnyElement()
    public Object[] unknown;

    /**
     * To aid debugging, this method summarizes a domain object's contents in
     * logs and in a debugger.
     */
    @XmlTransient
    @Override
    public String toString() {
        final ReflectionToStringBuilder builder = new ReflectionToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE);
        // Exclude the unknown field, it will always be null.
        builder.setExcludeFieldNames("unknown");
        return builder.toString();
    }
}
