// Copyright (c) 2014 MediaMiser Ltd. All rights reserved.
package com.mediamiser.api.domain;

import org.junit.Assert;
import org.junit.Test;

public class DomainTest {

	class DomainObjectParent extends AbstractDomain {
		protected String	parentField	= "data";
	}

	class DomainObject extends DomainObjectParent {
		protected String	childField	= "more data";
	}

	@Test
	public void testToString() {
		final String string = new DomainObject().toString();
		Assert.assertTrue(string, string.startsWith("com.mediamiser.api.domain.DomainTest$DomainObject"));
		Assert.assertTrue(string, string.endsWith("[\n  childField=more data\n  parentField=data\n]"));
	}
}
