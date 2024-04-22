package page.articleDetail

import base.Page
import org.openqa.selenium.WebElement

interface ArticleDetailPage : Page {

    var articleDetail: WebElement

    fun scroll()

    fun finish()

}