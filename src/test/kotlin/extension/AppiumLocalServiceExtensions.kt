package extension

import io.appium.java_client.service.local.AppiumDriverLocalService
import org.junit.jupiter.api.extension.AfterEachCallback
import org.junit.jupiter.api.extension.BeforeEachCallback
import org.junit.jupiter.api.extension.ExtensionContext

class AppiumLocalServiceExtensions(

    val service: AppiumDriverLocalService = AppiumDriverLocalService.buildDefaultService()

) : BeforeEachCallback, AfterEachCallback {

    override fun beforeEach(context: ExtensionContext?) {
        service.start()
    }

    override fun afterEach(context: ExtensionContext?) {
        service.stop()
    }

}