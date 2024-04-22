package page.home

import base.Page
import driver.platform.uiautomator2.mobile.scrollGuesture.UiAutomatorScrollDirection
import org.openqa.selenium.WebElement

interface HomePage : Page {

    var articleList: WebElement

    var firstArticle: WebElement

    fun clickFirstArticle()

    fun scroll(direction: UiAutomatorScrollDirection)

}