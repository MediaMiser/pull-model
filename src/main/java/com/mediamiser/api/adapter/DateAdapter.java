// Copyright (c) 2014-2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.adapter;

import org.apache.commons.lang3.StringUtils;

import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * This adapter allows for {@link java.util.Date} objects to be marshalled/unmarshalled
 * to and from <a href="https://tools.ietf.org/html/rfc3339">RFC 3339 timestamps</a>.
 *
 * @author Chris Fournier <chris.fournier@mediamiser.com>
 */
public class DateAdapter extends XmlAdapter<String, Date> {

    public static final TimeZone TIMEZONE = TimeZone.getTimeZone("GMT");

    @Override
    public String marshal(final Date date) throws Exception {
        String string = null;
        if (date != null) {
            Calendar calendar = Calendar.getInstance(TIMEZONE);
            calendar.setTime(date);
            string = DatatypeConverter.printDateTime(calendar);
        }
        return string;
    }

    @Override
    public Date unmarshal(final String string) throws Exception {
        if (StringUtils.isNotBlank(string)) {
            return DatatypeConverter.parseDateTime(string).getTime();
        } else {
            return null;
        }
    }

}
