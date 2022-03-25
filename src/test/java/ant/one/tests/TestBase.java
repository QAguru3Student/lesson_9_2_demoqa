package ant.one.tests;

import ant.one.pages.RegistrationsPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;


public class TestBase {

    RegistrationsPage registrationsPage = new RegistrationsPage();

    @BeforeAll
    static void config() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "2100x1080";
    }

}

