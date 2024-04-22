package page.articleDetail

abstract class DefaultArticleDetailPage : ArticleDetailPage {

    override fun finish() {
        driver.navigate().back()
    }

}