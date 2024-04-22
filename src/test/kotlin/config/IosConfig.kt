package config

import io.appium.java_client.ios.options.XCUITestOptions

object IosConfig {

    val defaultOptions: XCUITestOptions = XCUITestOptions()
        .setLocale("KR")
        .setLanguage("ko")

}