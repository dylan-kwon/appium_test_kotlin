package base

import extension.DriverExtensions
import io.appium.java_client.AppiumDriver
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.extension.RegisterExtension

open class Scenario {
    @Order(0)
    @JvmField
    @RegisterExtension
    val driverExtensions = DriverExtensions()

    lateinit var driver: AppiumDriver

    fun fetchDriver() = driverExtensions.driver

    @BeforeEach
    fun setUp() {
        driver = driverExtensions.driver
    }
}