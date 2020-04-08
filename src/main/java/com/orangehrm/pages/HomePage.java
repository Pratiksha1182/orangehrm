package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By contactSalesButton = By.xpath("//a[contains(@class,'btn-orange contact-ohrm')]");
    By firstNameField = By.name("firstname");
    By lastNameField = By.name("lastname");
    By companyNameField = By.name("company");
    By numberOfEmployees = By.name("numemployees");
    By phoneNumberField = By.name("phone");
    By jobTitleField = By.name("jobtitle");
    By emailField = By.name("email");
    By countryField = By.name("country");
    By commentField = By.name("message");
    By submitButton = By.xpath("//input[@class='hs-button primary large']");

    public void clickOnContactSalesButton(){ clickOnElement(contactSalesButton);}
    public void enterFirstName(){ sendTextToElement(firstNameField,"Pratiksha");}
    public void enterLastName(){ sendTextToElement(lastNameField,"Patel");}
    public void enterCompanyName(){sendTextToElement(companyNameField,"PBS Limited");}
    public void selectNumberOfEmployeesFromDropDown(){selectByValueFromDropDown(numberOfEmployees,"801 - 900");}
    public void enterPhoneNumber(){sendTextToElement(phoneNumberField,"07495172051");}
    public void enterJobTitle(){ sendTextToElement(jobTitleField,"Tester");}
    public void enterEmail(){ sendTextToElement(emailField,"patty_appu@yahoo.co.uk");}
    public void selectCountryNameFromDropDown(){ selectByValueFromDropDown(countryField,"United Kingdom");}
    public void enterComment(){ sendTextToElement(commentField,"None");}
    public void clickOnSubmitButton(){ clickOnElement(submitButton);}



}
