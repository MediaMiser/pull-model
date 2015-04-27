// Copyright (c) 2015 MediaMiser Ltd. All rights reserved.
package com.mediamiser;

import org.junit.runner.RunWith;
import org.junit.extensions.cpsuite.ClasspathSuite;
import org.junit.extensions.cpsuite.ClasspathSuite.ClassnameFilters;
import org.junit.extensions.cpsuite.ClasspathSuite.IncludeJars;

/**
 * Runs JUnit Tests that DO NOT require access to ANY external resources, be they Hadoop/HBase, daemons, or any network access.
 * 
 * Note: Test order is not guaranteed on the CI server.
 * 
 * @author Samer Al-Buhaisi <samer.albuhaisi@mediamiser.com>
 */

@RunWith(ClasspathSuite.class)
@IncludeJars(false)
@ClassnameFilters({ ".*Test" })
public class UnitSuite {

}
