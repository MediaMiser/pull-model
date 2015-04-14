// Copyright (c) 2014 MediaMiser Ltd. All rights reserved.
package com.mediamiser.puller.model;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.apache.commons.lang3.StringUtils;

/**
 * This adapter allows for java.util.Date objects to be marshalled/unmarshalled
 * to and from RFC 3339 timestamps (https://tools.ietf.org/html/rfc3339).
 * 
 * @author Chris Fournier <chris.fournier@mediamiser.com>
 */
public class DateAdapter extends XmlAdapter<String, Date> {

	public static final TimeZone	TIMEZONE				= TimeZone.getTimeZone("GMT");
	public static final String		DOCUMENTATION_DATETIME	= "A <a href=\"http://tools.ietf.org/html/rfc3339\">RFC 3339</a> date time; see this <a href=\"http://www.w3.org/TR/NOTE-datetime\">W3C note</a>";

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
