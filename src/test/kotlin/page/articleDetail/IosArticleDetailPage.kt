package page.articleDetail

import driver.platform.xcuitest.XCUITestDriver
import org.openqa.selenium.WebElement

class IosArticleDetailPage(
    override val driver: XCUITestDriver
) : DefaultArticleDetailPage() {

    override lateinit var articleDetail: WebElement

    override fun scroll() {
        TODO("Not yet implemented")
    }

    override fun finish() {
        TODO("Not yet implemented")
    }

}