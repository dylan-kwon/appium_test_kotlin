package extension

import driver.platform.uiautomator2.UiAutomatorDriver
import driver.platform.xcuitest.XCUITestDriver
import config.AndroidConfig
import config.CommonConfig
import config.IosConfig
import config.Platform
import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.options.UiAutomator2Options
import io.appium.java_client.ios.options.XCUITestOptions
import org.junit.jupiter.api.extension.AfterEachCallback
import org.junit.jupiter.api.extension.BeforeEachCallback
import org.junit.jupiter.api.extension.ExtensionContext
import java.net.URL

class DriverExtensions(
    private val platform: Platform = CommonConfig.platform,
    private val server: URL = CommonConfig.server,
    private val iosOptions: XCUITestOptions = IosConfig.defaultOptions,
    private val androidOptions: UiAutomator2Options = AndroidConfig.defaultOptions,
) : BeforeEachCallback, AfterEachCallback {

    lateinit var driver: AppiumDriver

    override fun beforeEach(context: ExtensionContext?) {
        driver = when (platform) {
            Platform.IOS -> XCUITestDriver(server, iosOptions)
            Platform.ANDROID -> UiAutomatorDriver(CommonConfig.server, androidOptions)
        }
    }

    override fun afterEach(context: ExtensionContext?) {
        driver.quit()
    }
}
