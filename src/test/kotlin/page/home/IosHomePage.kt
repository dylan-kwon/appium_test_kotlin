package page.home

import driver.platform.uiautomator2.mobile.scrollGuesture.UiAutomatorScrollDirection
import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.iOSBy
import org.openqa.selenium.WebElement

class IosHomePage(
    override val driver: AppiumDriver
) : DefaultHomePage() {

    @iOSBy
    override lateinit var articleList: WebElement

    @iOSBy
    override lateinit var firstArticle: WebElement

    override fun clickFirstArticle() {
        TODO("Not yet implemented")
    }

    override fun scroll(direction: UiAutomatorScrollDirection) {
        TODO("Not yet implemented")
    }
}