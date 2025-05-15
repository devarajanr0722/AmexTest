package org.execution;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.Base.Base;
import org.helper.AllureReportListener;
import org.junit.jupiter.api.BeforeAll;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.Pages.CardsPage.*;
import static org.Pages.Home.clickOnCartesAmericanExpression;


@Feature("Demo QA Automation")
@Listeners({AllureReportListener.class})
public class ExecutionTest extends Base {

	@Test(description = "Verify New Window operation")
	public void windowTab() {
		launchUrl(base_url);
		clickOnCartesAmericanExpression();
		navigateToFRAllCards();
		navigateToGoldCardDescriptionPage();
		navigateToUserDetailsPage();
		vosInformationDeContact_Form();
		VosInformationsPersonnelles_Form();
		YourFinancialInformation_Form();
	}
}


