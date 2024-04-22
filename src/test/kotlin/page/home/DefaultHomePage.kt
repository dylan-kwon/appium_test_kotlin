package page.home

import driver.extension.wait.waitElement.waitElement

abstract class DefaultHomePage : HomePage {

    override fun clickFirstArticle() {
        driver.waitElement(firstArticle).click()
    }

}