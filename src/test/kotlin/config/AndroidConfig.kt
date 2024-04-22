package config

import io.appium.java_client.android.options.UiAutomator2Options

object AndroidConfig {

    val defaultOptions: UiAutomator2Options = UiAutomator2Options()
        .setAppPackage("dylan.kwon.android_test")
        .setAppActivity(".ui.MainActivity")
        .setLocale("KR")
        .setLanguage("ko")
        .amend("disableIdLocatorAutocompletion", true)

}