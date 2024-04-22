package driver.platform.uiautomator2.mobile.scrollGuesture

import driver.platform.uiautomator2.UiAutomatorDriver
import org.openqa.selenium.WebElement

fun UiAutomatorDriver.scroll(
    element: WebElement,
    direction: UiAutomatorScrollDirection = UiAutomatorScrollGesture.DEFAULT_DIRECTION,
    percent: Float = UiAutomatorScrollGesture.DEFAULT_PERCENT,
    speed: Int? = null
): Any = scroll(
    left = element.location.x + 1,
    top = element.location.y + 1,
    width = element.size.width - 2,
    height = element.size.height - 2,
    direction = direction,
    percent = percent,
    speed = speed
)