# Appium Test (Kotlin)

Writing multi-platform test code in appium [(show)](https://dylan-kwon.notion.site/Appium-423a2f81c03c429ca918991f6e3fc97d?pvs=4)


## Example

```kotlin
class HomeScenario : Scenario() {

    @JvmField
    @RegisterExtension
    val homePageExtensions =
        HomePageExtensions(::fetchDriver)

    @JvmField
    @RegisterExtension
    val articleDetailPageExtensions =
        ArticleDetailPageExtensions(::fetchDriver)

    @Test
    fun scenarioTest() {
        // 페이지 인스턴스
        val homeScreen = homeScreenExtensions.screen
        val articleDetailScreen = articleDetailExtensions.screen

        // 홈 페이지의 첫 번째 기사 클릭
        homeScreen.clickFirstArticle()

        // 기사 상세 페이지 컨텐츠 스크롤
        articleDetailScreen.scroll()

        // 기사 상세 페이지 종료
        articleDetailScreen.finish()

        // 홈 페이지 위, 아래 스크롤 
        homeScreen.scroll(ScrollDirection.DOWN)
        homeScreen.scroll(ScrollDirection.UP)
    }
}
```