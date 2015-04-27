// Copyright (c) 2014 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.adapter;

import java.util.Locale;

import javax.validation.ConstraintViolationException;

import org.junit.Assert;
import org.junit.Test;


public class LocaleAdapterTest {

	protected static final LocaleAdapter	ADAPTER						= new LocaleAdapter();

	protected static final Locale			LOCALE_EN					= Locale.ENGLISH;
	protected static final Locale			LOCALE_EN_CA				= new Locale.Builder()
																			.setLanguage("en")
																			.setRegion("CA")
																			.build();
	protected static final Locale			LOCALE_FR_CA				= Locale.CANADA_FRENCH;

	protected static final Locale			LOCALE_DE					= Locale.GERMAN;
	protected static final Locale			LOCALE_FR					= Locale.FRENCH;
	protected static final Locale			LOCALE_JA					= Locale.JAPANESE;

	protected static final Locale			LOCALE_ZH_HANT				= new Locale.Builder()
																			.setLanguage("zh")
																			.setScript("Hant")
																			.build();
	protected static final Locale			LOCALE_ZH_HANS				= new Locale.Builder()
																			.setLanguage("zh")
																			.setScript("Hans")
																			.build();
	protected static final Locale			LOCALE_SR_CYRL				= new Locale.Builder()
																			.setLanguage("sr")
																			.setScript("Cyrl")
																			.build();
	protected static final Locale			LOCALE_SR_LATN				= new Locale.Builder()
																			.setLanguage("sr")
																			.setScript("Latn")
																			.build();

	protected static final Locale			LOCALE_CMN_HANS_CN			= new Locale.Builder()
																			.setLanguage("cmn")
																			.setScript("Hans")
																			.setRegion("CN")
																			.build();
	protected static final Locale			LOCALE_YUE_HK				= new Locale.Builder()
																			.setLanguage("yue")
																			.setRegion("HK")
																			.build();

	protected static final Locale			LOCALE_ZH_HANS_CN			= new Locale.Builder()
																			.setLanguage("zh")
																			.setScript("Hans")
																			.setRegion("CN")
																			.build();
	protected static final Locale			LOCALE_SR_LATN_RS			= new Locale.Builder()
																			.setLanguage("sr")
																			.setScript("Latn")
																			.setRegion("RS")
																			.build();

	protected static final Locale			LOCALE_SL_ROZAJ				= new Locale.Builder()
																			.setLanguage("sl")
																			.setVariant("rozaj")
																			.build();
	protected static final Locale			LOCALE_SL_NEDIS				= new Locale.Builder()
																			.setLanguage("sl")
																			.setVariant("nedis")
																			.build();

	protected static final Locale			LOCALE_DE_CH_1901			= new Locale.Builder()
																			.setLanguage("de")
																			.setRegion("CH")
																			.setVariant("1901")
																			.build();
	protected static final Locale			LOCALE_SL_IT_NEDIS			= new Locale.Builder()
																			.setLanguage("sl")
																			.setRegion("IT")
																			.setVariant("nedis")
																			.build();

	protected static final Locale			LOCALE_HY_LATN_IT_AREVELA	= new Locale.Builder()
																			.setLanguage("hy")
																			.setScript("Latn")
																			.setRegion("IT")
																			.setVariant("arevela")
																			.build();

	protected static final Locale			LOCALE_DE_DE				= new Locale.Builder()
																			.setLanguage("de")
																			.setRegion("DE")
																			.build();
	protected static final Locale			LOCALE_EN_US				= new Locale.Builder()
																			.setLanguage("en")
																			.setRegion("US")
																			.build();
	protected static final Locale			LOCALE_ES_419				= new Locale.Builder()
																			.setLanguage("es")
																			.setRegion("419")
																			.build();

	@Test
	public void testMarshallCommon() throws Exception {
		Assert.assertEquals("en", ADAPTER.marshal(LOCALE_EN));
		Assert.assertEquals("fr", ADAPTER.marshal(LOCALE_FR));
		Assert.assertEquals("en-CA", ADAPTER.marshal(LOCALE_EN_CA));
		Assert.assertEquals("fr-CA", ADAPTER.marshal(LOCALE_FR_CA));
	}

	@Test
	public void testMarshallBlank() throws Exception {
		Assert.assertEquals(null, ADAPTER.marshal(null));
	}

	@Test
	public void testMarshall() throws Exception {
		// Marshall BCP 47 Appendix A examples.

		// Simple language subtags
		Assert.assertEquals("de", ADAPTER.marshal(LOCALE_DE));
		Assert.assertEquals("fr", ADAPTER.marshal(LOCALE_FR));
		Assert.assertEquals("ja", ADAPTER.marshal(LOCALE_JA));

		// Language subtags plus Script subtags
		Assert.assertEquals("zh-Hant", ADAPTER.marshal(LOCALE_ZH_HANT));
		Assert.assertEquals("zh-Hans", ADAPTER.marshal(LOCALE_ZH_HANS));
		Assert.assertEquals("sr-Cyrl", ADAPTER.marshal(LOCALE_SR_CYRL));
		Assert.assertEquals("sr-Latn", ADAPTER.marshal(LOCALE_SR_LATN));

		// Extended language subtags and their primary language subtag
		// counterparts
		Assert.assertEquals("cmn-Hans-CN", ADAPTER.marshal(LOCALE_CMN_HANS_CN));
		Assert.assertEquals("yue-HK", ADAPTER.marshal(LOCALE_YUE_HK));

		// Language-Script-Regions
		Assert.assertEquals("zh-Hans-CN", ADAPTER.marshal(LOCALE_ZH_HANS_CN));
		Assert.assertEquals("sr-Latn-RS", ADAPTER.marshal(LOCALE_SR_LATN_RS));

		// Language-Variant
		Assert.assertEquals("sl-rozaj", ADAPTER.marshal(LOCALE_SL_ROZAJ));
		Assert.assertEquals("sl-nedis", ADAPTER.marshal(LOCALE_SL_NEDIS));

		// Language-Region-Variant
		Assert.assertEquals("de-CH-1901", ADAPTER.marshal(LOCALE_DE_CH_1901));
		Assert.assertEquals("sl-IT-nedis", ADAPTER.marshal(LOCALE_SL_IT_NEDIS));

		// Language-Script-Region-Variant
		Assert.assertEquals("hy-Latn-IT-arevela", ADAPTER.marshal(LOCALE_HY_LATN_IT_AREVELA));

		// Language-Region
		Assert.assertEquals("de-DE", ADAPTER.marshal(LOCALE_DE_DE));
		Assert.assertEquals("en-US", ADAPTER.marshal(LOCALE_EN_US));
		Assert.assertEquals("es-419", ADAPTER.marshal(LOCALE_ES_419));
	}

	@Test
	public void testUnmarshallCommon() throws Exception {
		Assert.assertEquals(LOCALE_EN, ADAPTER.unmarshal("en"));
		Assert.assertEquals(LOCALE_FR, ADAPTER.unmarshal("fr"));
		Assert.assertEquals(LOCALE_EN_CA, ADAPTER.unmarshal("en-CA"));
		Assert.assertEquals(LOCALE_FR_CA, ADAPTER.unmarshal("fr-CA"));
	}

	@Test
	public void testUnmarshall() throws Exception {
		// Unmarshall BCP 47 Appendix A examples.

		// Simple language subtags
		Assert.assertEquals(LOCALE_DE, ADAPTER.unmarshal("de"));
		Assert.assertEquals(LOCALE_FR, ADAPTER.unmarshal("fr"));
		Assert.assertEquals(LOCALE_JA, ADAPTER.unmarshal("ja"));

		// Language subtags plus Script subtags
		Assert.assertEquals(LOCALE_ZH_HANT, ADAPTER.unmarshal("zh-Hant"));
		Assert.assertEquals(LOCALE_ZH_HANS, ADAPTER.unmarshal("zh-Hans"));
		Assert.assertEquals(LOCALE_SR_CYRL, ADAPTER.unmarshal("sr-Cyrl"));
		Assert.assertEquals(LOCALE_SR_LATN, ADAPTER.unmarshal("sr-Latn"));

		// Extended language subtags and their primary language subtag
		// counterparts
		Assert.assertEquals(LOCALE_CMN_HANS_CN, ADAPTER.unmarshal("cmn-Hans-CN"));
		Assert.assertEquals(LOCALE_YUE_HK, ADAPTER.unmarshal("yue-HK"));

		// Language-Script-Regions
		Assert.assertEquals(LOCALE_ZH_HANS_CN, ADAPTER.unmarshal("zh-Hans-CN"));
		Assert.assertEquals(LOCALE_SR_LATN_RS, ADAPTER.unmarshal("sr-Latn-RS"));

		// Language-Variant
		Assert.assertEquals(LOCALE_SL_ROZAJ, ADAPTER.unmarshal("sl-rozaj"));
		Assert.assertEquals(LOCALE_SL_NEDIS, ADAPTER.unmarshal("sl-nedis"));

		// Language-Region-Variant
		Assert.assertEquals(LOCALE_DE_CH_1901, ADAPTER.unmarshal("de-CH-1901"));
		Assert.assertEquals(LOCALE_SL_IT_NEDIS, ADAPTER.unmarshal("sl-IT-nedis"));

		// Language-Script-Region-Variant
		Assert.assertEquals(LOCALE_HY_LATN_IT_AREVELA, ADAPTER.unmarshal("hy-Latn-IT-arevela"));

		// Language-Region
		Assert.assertEquals(LOCALE_DE_DE, ADAPTER.unmarshal("de-DE"));
		Assert.assertEquals(LOCALE_EN_US, ADAPTER.unmarshal("en-US"));
		Assert.assertEquals(LOCALE_ES_419, ADAPTER.unmarshal("es-419"));
	}

	@Test
	public void testUnmarshallBlank() throws Exception {
		Assert.assertEquals(null, ADAPTER.unmarshal(null));
		Assert.assertEquals(null, ADAPTER.unmarshal(""));
		Assert.assertEquals(null, ADAPTER.unmarshal(" "));
	}

	@Test(
			expected = ConstraintViolationException.class)
	public void testUnmarshallBadlyFormed() throws Exception {
		Assert.assertEquals(null, ADAPTER.unmarshal("fakelanguage"));
	}
}
