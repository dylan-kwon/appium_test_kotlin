package page.home

import driver.platform.uiautomator2.uiAutomator
import driver.platform.xcuitest.xcUiTest
import config.CommonConfig
import config.Platform
import extension.PageExtensions
import io.appium.java_client.AppiumDriver


class HomePageExtensions(
    fetchDriver: () -> AppiumDriver
) : PageExtensions<HomePage>(fetchDriver) {

    override fun createScreen(driver: AppiumDriver): HomePage = when (CommonConfig.platform) {
        Platform.IOS -> IosHomePage(driver.xcUiTest)
        Platform.ANDROID -> AndroidHomePage(driver.uiAutomator)
    }

}