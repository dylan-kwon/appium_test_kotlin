package extension

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.junit.jupiter.api.extension.BeforeEachCallback
import org.junit.jupiter.api.extension.ExtensionContext
import org.openqa.selenium.support.PageFactory

abstract class PageExtensions<Page : base.Page>(
    val fetchDriver: () -> AppiumDriver
) : BeforeEachCallback {

    lateinit var page: Page

    abstract fun createScreen(driver: AppiumDriver): Page

    override fun beforeEach(context: ExtensionContext?) {
        val driver = this.fetchDriver()
        page = createScreen(driver)
        PageFactory.initElements(AppiumFieldDecorator(driver), page)
    }
}
