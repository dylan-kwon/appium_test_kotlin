package driver.platform.uiautomator2

import io.appium.java_client.AppiumDriver

val AppiumDriver.uiAutomator
    get() = this as UiAutomatorDriver