// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain;

import java.util.Objects;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Represents a store containing access tokens for our thirds party providers.
 *
 * @author Samer Al-Buhaisi <samer.albuhaisi@mediamiser.com>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "")
public class AccessTokenStore extends AbstractDomain {

    @Size(
            min = 30,
            max = 120)
    protected String twitterBearerToken;

    public String twitterBearerToken() {
        return twitterBearerToken;
    }

    public AccessTokenStore twitterBearerToken(final String twitterBearerToken) {
        this.twitterBearerToken = twitterBearerToken;
        return this;
    }

    @Override
    public boolean equals(final Object object) {
        boolean equals = false;

        if (this == object) {
            equals = true;
        } else if (object instanceof AccessTokenStore) {
            final AccessTokenStore other = (AccessTokenStore) object;
            equals = Objects.equals(twitterBearerToken, other.twitterBearerToken);
        }

        return equals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(twitterBearerToken);
    }
}
