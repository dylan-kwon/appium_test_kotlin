package scenario.home

import base.Scenario
import driver.platform.uiautomator2.mobile.scrollGuesture.UiAutomatorScrollDirection
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.RegisterExtension
import page.articleDetail.ArticleDetailPageExtensions
import page.home.HomePageExtensions


class HomeScenario : Scenario() {

    @JvmField
    @RegisterExtension
    val homePageExtensions = HomePageExtensions(::fetchDriver)

    @JvmField
    @RegisterExtension
    val articleDetailPageExtensions = ArticleDetailPageExtensions(::fetchDriver)

    @Test
    fun scenarioTest() {
        val homePage = homePageExtensions.page
        val articleDetailPage = articleDetailPageExtensions.page

        // 홈의 첫 번째 기사 클릭
        homePage.clickFirstArticle()

        // 기사 상세 페이지 스크롤
        articleDetailPage.scroll()

        // 종료
        articleDetailPage.finish()

        // 홈 위, 아래로 스크롤
        homePage.scroll(UiAutomatorScrollDirection.DOWN)
        homePage.scroll(UiAutomatorScrollDirection.UP)
    }
}
