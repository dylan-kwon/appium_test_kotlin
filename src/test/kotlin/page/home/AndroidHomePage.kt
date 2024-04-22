package page.home

import driver.platform.uiautomator2.UiAutomatorDriver
import driver.platform.uiautomator2.mobile.scrollGuesture.UiAutomatorScrollDirection
import driver.platform.uiautomator2.mobile.scrollGuesture.scroll
import io.appium.java_client.pagefactory.AndroidFindBy
import org.openqa.selenium.WebElement
import driver.extension.wait.waitElement.waitElement

class AndroidHomePage(
    override val driver: UiAutomatorDriver
) : DefaultHomePage() {

    @AndroidFindBy(id = "article_list")
    override lateinit var articleList: WebElement

    @AndroidFindBy(xpath = "//android.view.View[@resource-id=\"article_list\"]/android.view.View[1]")
    override lateinit var firstArticle: WebElement

    override fun scroll(direction: UiAutomatorScrollDirection) {
        driver.scroll(
            direction = direction,
            element = driver.waitElement(articleList),
        )
    }
}