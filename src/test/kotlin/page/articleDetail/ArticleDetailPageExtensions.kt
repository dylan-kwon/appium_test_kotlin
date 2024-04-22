package page.articleDetail

import driver.platform.uiautomator2.uiAutomator
import driver.platform.xcuitest.xcUiTest
import config.CommonConfig
import config.Platform
import extension.PageExtensions
import io.appium.java_client.AppiumDriver


class ArticleDetailPageExtensions(
    fetchDriver: () -> AppiumDriver
) : PageExtensions<ArticleDetailPage>(fetchDriver) {

    override fun createScreen(driver: AppiumDriver): ArticleDetailPage = when (CommonConfig.platform) {
        Platform.IOS -> IosArticleDetailPage(driver.xcUiTest)
        Platform.ANDROID -> AndroidArticleDetailPage(driver.uiAutomator)
    }

}