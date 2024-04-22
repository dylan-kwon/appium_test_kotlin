package driver.extension.wait.waitElement

import io.appium.java_client.AppiumDriver
import org.openqa.selenium.WebElement
import driver.extension.wait.DriverWaitConstant
import driver.extension.wait.waitUntil.waitUntil
import kotlin.time.Duration.Companion.seconds
import kotlin.time.Duration as KotlinDuration

fun AppiumDriver.waitElement(
    element: WebElement,
    timeout: KotlinDuration = DriverWaitConstant.TIMEOUT.seconds,
): WebElement = waitUntil(timeout) {
    element.also {
        if (!it.isDisplayed) throw NoSuchElementException()
    }
}
