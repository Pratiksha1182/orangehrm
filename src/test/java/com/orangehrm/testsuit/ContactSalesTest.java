package com.orangehrm.testsuit;

import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.Test;

public class ContactSalesTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserIsAbleToSubmitContactSalesDetails(){
      homePage.clickOnContactSalesButton();
      homePage.enterFirstName();
      homePage.enterLastName();
      homePage.enterCompanyName();
      homePage.selectNumberOfEmployeesFromDropDown();
      homePage.enterPhoneNumber();
      homePage.enterJobTitle();
      homePage.enterEmail();
      homePage.selectCountryNameFromDropDown();
      homePage.enterComment();
      homePage.clickOnSubmitButton();
    }
}

