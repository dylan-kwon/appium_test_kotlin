package driver.extension.wait.waitUntil

import io.appium.java_client.AppiumDriver
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.WebDriverWait
import driver.extension.wait.DriverWaitConstant
import java.util.function.Function
import kotlin.time.Duration.Companion.seconds
import kotlin.time.toJavaDuration
import kotlin.time.Duration as KotlinDuration

fun <V> AppiumDriver.waitUntil(
    timeout: KotlinDuration = DriverWaitConstant.TIMEOUT.seconds,
    isTrue: Function<in WebDriver, V>,
): V = WebDriverWait(this, timeout.toJavaDuration()).until(isTrue)

