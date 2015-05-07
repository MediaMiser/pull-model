// Copyright (c) 2012-2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser.test;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorContext;

public abstract class AbstractValidatedUnit {

	protected final ValidatorContext	validatorContext;

	protected AbstractValidatedUnit() {
		validatorContext = Validation.buildDefaultValidatorFactory().usingContext();
	}

	protected Validator getValidator() {
		return validatorContext.getValidator();
	}
}
