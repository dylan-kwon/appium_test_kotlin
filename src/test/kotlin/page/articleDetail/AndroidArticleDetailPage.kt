package page.articleDetail

import driver.platform.uiautomator2.UiAutomatorDriver
import driver.platform.uiautomator2.mobile.scrollGuesture.scroll
import io.appium.java_client.pagefactory.AndroidFindBy
import org.openqa.selenium.WebElement
import driver.extension.wait.waitElement.waitElement

class AndroidArticleDetailPage(
    override val driver: UiAutomatorDriver
) : DefaultArticleDetailPage() {

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@resource-id=\"detail_screen\"]")
    override lateinit var articleDetail: WebElement

    override fun scroll() {
        driver.scroll(
            driver.waitElement(articleDetail)
        )
    }
}