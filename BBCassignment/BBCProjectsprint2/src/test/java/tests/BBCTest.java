package tests;

import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.BBCHomePage;
import pages.TestBase;

public class BBCTest extends TestBase {
	BBCHomePage hp;

	@BeforeClass
	public void init() {
		hp = PageFactory.initElements(driver, BBCHomePage.class);
	}

	@Test
	public void verifyAllLinksTest() {
		hp.findAllLinks();
	}

	@Test
	public void verifyNewsLinksTest() throws EncryptedDocumentException, IOException, InvalidFormatException {
		hp.findNewsLinks();
	}

}
