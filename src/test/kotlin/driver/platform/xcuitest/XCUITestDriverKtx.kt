package driver.platform.xcuitest

import io.appium.java_client.AppiumDriver

val AppiumDriver.xcUiTest
    get() = this as XCUITestDriver