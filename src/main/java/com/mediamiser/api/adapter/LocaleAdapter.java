// Copyright (c) 2014-2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.adapter;

import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This adapter allows for {@link java.util.Locale} objects to be
 * marshalled/unmarshalled to and from
 * <a href="http://tools.ietf.org/html/bcp47">BCP 47 tags</a>.
 *
 * @author Chris Fournier <chris.fournier@mediamiser.com>
 */
public class LocaleAdapter extends XmlAdapter<String, Locale> {

    // Regex based upon one by Christoph Schneegans (http://schneegans.de/lv/)
    public static final String REGULAR_EXPRESSION_BCP47 = "^((((([a-zA-Z]{2,3})(-([a-zA-Z]{3})){0,3})|([a-zA-Z]{4})|([a-zA-Z]{5,8}))(-([a-zA-Z]{4}))?(-([a-zA-Z]{2}|[0-9]{3}))?(-([a-zA-Z0-9]{5,8}|[0-9][a-zA-Z0-9]{3}))*(-([a-zA-Z0-9-[x]](-[a-zA-Z0-9]{2,8})+))*(-x(-([a-zA-Z0-9]{1,8}))+)?)|(x(-([a-zA-Z0-9]{1,8}))+)|((en-GB-oed|i-ami|i-bnn|i-default|i-enochian|i-hak|i-klingon|i-lux|i-mingo|i-navajo|i-pwn|i-tao|i-tay|i-tsu|sgn-BE-FR|sgn-BE-NL|sgn-CH-DE)|(art-lojban|cel-gaulish|no-bok|no-nyn|zh-guoyu|zh-hakka|zh-min|zh-min-nan|zh-xiang)))";

    protected static final Pattern PATTERN_BCP47 = Pattern.compile(
            REGULAR_EXPRESSION_BCP47, Pattern.CASE_INSENSITIVE);

    @Override
    public String marshal(final Locale locale) throws Exception {
        String string = null;
        if (locale != null) {
            string = locale.toLanguageTag();
        }
        return string;
    }

    @Override
    public Locale unmarshal(final String string) throws Exception {
        Locale locale = null;

        if (StringUtils.isNotBlank(string)) {
            final Matcher matcher = PATTERN_BCP47.matcher(string);
            if (matcher.matches()) {
                locale = Locale.forLanguageTag(string);
            } else {
                final Set<? extends ConstraintViolation<?>> violations = Sets.newHashSet();
                throw new ConstraintViolationException(
                        "Expected a valid BCP47 language tag, not " + string,
                        violations);
            }
        }

        return locale;
    }

}
