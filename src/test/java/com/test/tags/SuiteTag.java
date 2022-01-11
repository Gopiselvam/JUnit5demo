package com.test.tags;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@IncludeTags({"success"})
@SelectPackages("com.test")
@RunWith(JUnitPlatform.class)
public class SuiteTag {
}
