package driver.platform.uiautomator2

import driver.platform.uiautomator2.mobile.scrollGuesture.UiAutomatorScrollDirection
import driver.platform.uiautomator2.mobile.scrollGuesture.UiAutomatorScrollGesture
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.options.UiAutomator2Options
import java.net.URL

class UiAutomatorDriver(
    remoteAddress: URL,
    options: UiAutomator2Options
) : AndroidDriver(remoteAddress, options) {

    fun scroll(
        left: Int,
        top: Int,
        width: Int,
        height: Int,
        direction: UiAutomatorScrollDirection = UiAutomatorScrollGesture.DEFAULT_DIRECTION,
        percent: Float = UiAutomatorScrollGesture.DEFAULT_PERCENT,
        speed: Int? = null
    ): Any = executeScript(
        "mobile: scrollGesture",
        mutableMapOf(
            "left" to left,
            "top" to top,
            "width" to width,
            "height" to height,
            "direction" to direction.name,
            "percent" to percent
        ).apply {
            if (speed != null) {
                put("speed", speed)
            }
        }
    )
}