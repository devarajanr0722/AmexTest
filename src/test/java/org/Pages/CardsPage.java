package org.Pages;

import org.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static org.helper.PropertyHelper.*;

public class CardsPage extends Base {

    public CardsPage() {
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//*[contains(text(),'Carte Gold American Express')]/ancestor::div[@class='card-art parbase']/following-sibling::div[@class='button parbase']//a")
    static  WebElement enSaviorPlusButton ;

    @FindBy(xpath = "//button[text()='Comparer les Cartes']/parent::div/preceding-sibling::div/a")
    static WebElement camparerLesCartesButton;

    /////////////////Page 1 ////////////////////
    @FindBy(xpath = "//label[@for='MR']")
    static WebElement civility_Mr;

    @FindBy(xpath = "//input[@id='fieldControl-input-firstName']")
    static WebElement firstName;

    @FindBy(xpath = "//input[@id='fieldControl-input-lastName']")
    static  WebElement name;

    @FindBy(xpath = "//input[@id='fieldControl-input-dateOfBirth']")
    static  WebElement Dob;

    @FindBy(xpath = "//input[@id='fieldControl-input-email']")
    static  WebElement email;

    @FindBy(xpath = "//select[@id='countryCode']")
    static  WebElement countryCodeDrp;

    @FindBy(xpath = "//input[@id='fieldControl-input-mobilePhoneNumber']")
    static  WebElement mobileNumber;

    @FindBy(xpath = "//button[@type='submit']")
    static  WebElement saveAndContinue;

    /////////////////Page 2 ////////////////////

    @FindBy(xpath = "//input[@id='birthName']")
    static  WebElement birthName;

    @FindBy(xpath = "//input[@id='fieldControl-input-placeOfBirth']")
    static  WebElement placeOfBirth;

    @FindBy(xpath = "//select[@id='fieldControl-input-departmentOfBirth']")
    static  WebElement departmentOfBirthDrp;

    @FindBy(xpath = "//select[@id='fieldControl-input-countryOfBirth']")
    static  WebElement countryOfBirthDrp;

    @FindBy(xpath = "//select[@id='fieldControl-input-nationality']")
    static  WebElement nationalityDrp;

    @FindBy(xpath = "//select[@id='fieldControl-input-country']")
    static  WebElement countryDrp;

    @FindBy(xpath = "//input[@id='fieldControl-input-residentialAddressLine2']")
    static  WebElement residentialAddressLine;

    @FindBy(xpath = "//input[@id='fieldControl-input-postcode']")
    static  WebElement postcode;

    @FindBy(xpath = "//input[@id='fieldControl-input-cityTown']")
    static  WebElement cityTown;

    @FindBy(xpath = "//select[@id='fieldControl-input-personalResidentialStatus']")
    static  WebElement personalResidentialStatus;

    /////////////////Page 3 ////////////////////

    @FindBy(xpath = "//input[@id='fieldControl-input-bankAccountNumber']")
    static  WebElement bankAccountNumber;

    @FindBy(xpath = "//input[@id='fieldControl-input-bankIdentifierCode']")
    static  WebElement bankIdentifierCode;

    @FindBy(xpath = "//select[@id='fieldControl-input-tenureOfAccount']")
    static  WebElement tenureOfAccountDrp;

    @FindBy(xpath = "//input[@id='fieldControl-input-annualPersonalIncome']")
    static  WebElement annualPersonalIncome;

    @FindBy(xpath = "//label[@for='hasAdditionalIncome1-NO']")
    static  WebElement hasAdditionalIncomeCheckBox;

    @FindBy(xpath = "//select[@id='fieldControl-input-totalAssets']")
    static  WebElement totalAssetsDrp;

    @FindBy(xpath = "//select[@id='fieldControl-input-occupation']")
    static  WebElement occupationDrp;

    @FindBy(xpath = "//select[@id='fieldControl-input-occupationDescription']")
    static  WebElement occupationDescriptionDrp;

    /////////////////Page 4 ////////////////////

    @FindBy(xpath = "//input[@id='fieldControl-input-mothersMaidenName']")
    static  WebElement mothersMaidenName;

    @FindBy(xpath = "//input[@id='fieldControl-input-pin']")
    static  WebElement pin;

    @FindBy(xpath = "//input[@id='fieldControl-input-confirmPin']")
    static  WebElement confirmPin;

    @FindBy(xpath = "//label[@for='marketingEmailPreferences-false']")
    static  WebElement marketingEmailPreferencesRadioBtn;

    @FindBy(xpath = "//label[@for='marketingSMSPhonePostalPreferences-OPT_OUT'] ")
    static  WebElement marketingSMSPhonePostalPreferences;

    @FindBy(xpath = "//button[@type='submit']")
    static  WebElement SubmitBtn;

    @FindBy(xpath = "(//h3//font)[1]")
    static  WebElement confirmPage;

    @FindBy(xpath = "//button[contains(@class,'btn btn')]")
    static  WebElement CloseThePage;



    static String firstNameData = "deva";
    static String ExpMessage = "Thank you Mr. "+firstNameData+", we appreciate your interest in the AMERICAN EXPRESS GOLD CARD.";



    public static void vosInformationDeContact_Form(){
        waitForElementPresent(civility_Mr);
        clickByJS(civility_Mr);
        waitForElementPresent(firstName);
        sendKeys(firstName, firstNameData);
        waitForElementPresent(name);
        sendKeys(name,"Rajan");
        waitForElementPresent(Dob);
        sendKeys(Dob, "12/09/1999");
        waitForElementPresent(email);
        sendKeys(email, "uhfyrefge@gmail.com");
        waitForElementPresent(countryCodeDrp);
        selectByValue(countryCodeDrp, "Inde");
        waitForElementPresent(mobileNumber);
        sendKeys(mobileNumber, "8975372545");
        waitForElementPresent(saveAndContinue);
        clickByJS(saveAndContinue);
    }

    public static void VosInformationsPersonnelles_Form(){
        waitForElementPresent(birthName);
        sendKeys(birthName, "Rajan");
        waitForElementPresent(placeOfBirth);
        sendKeys(placeOfBirth, "Chennai");
        waitForElementPresent(departmentOfBirthDrp);
        selectByValue(departmentOfBirthDrp, "015");
        waitForElementPresent(countryOfBirthDrp);
        selectByValue(countryOfBirthDrp, "356");
        waitForElementPresent(nationalityDrp);
        selectByValue(nationalityDrp, "356");
        waitForElementPresent(countryDrp);
        selectByValue(countryDrp, "356");
        waitForElementPresent(residentialAddressLine);
        sendKeys(residentialAddressLine, "chennai");
        waitForElementPresent(postcode);
        sendKeys(postcode, "600351");
        waitForElementPresent(cityTown);
        sendKeys(cityTown, "AA Nagar");
        waitForElementPresent(personalResidentialStatus);
        selectByValue(personalResidentialStatus, "RENT");
        waitForElementPresent(saveAndContinue);
        clickByJS(saveAndContinue);
    }

    public static void YourFinancialInformation_Form(){
        waitForElementPresent(bankAccountNumber);
        sendKeys(bankAccountNumber, "GB29 NWBK 6016 1331 9268 19");
        waitForElementPresent(bankIdentifierCode);
        sendKeys(bankIdentifierCode, "34556778");
        waitForElementPresent(tenureOfAccountDrp);
        selectByValue(tenureOfAccountDrp, "0300");
        waitForElementPresent(annualPersonalIncome);
        sendKeys(annualPersonalIncome, "356589");
        waitForElementPresent(hasAdditionalIncomeCheckBox);
        clickByJS(hasAdditionalIncomeCheckBox);
        waitForElementPresent(totalAssetsDrp);
        selectByValue(totalAssetsDrp, "50");
        waitForElementPresent(occupationDrp);
        selectByValue(occupationDrp, "UNEMPLOYED");
        waitForElementPresent(occupationDescriptionDrp);
        selectByValue(occupationDescriptionDrp, "STUDENT");
        waitForElementPresent(saveAndContinue);
        clickByJS(saveAndContinue);
    }

    public static void YourSecurityInformation_Form(){
        waitForElementPresent(mothersMaidenName);
        sendKeys(mothersMaidenName, "Banu");
        waitForElementPresent(pin);
        sendKeys(pin, "7687");
        waitForElementPresent(confirmPin);
        sendKeys(confirmPin, "7687");
        waitForElementPresent(marketingEmailPreferencesRadioBtn);
        clickByJS(marketingEmailPreferencesRadioBtn);
        waitForElementPresent(marketingSMSPhonePostalPreferences);
        clickByJS(marketingSMSPhonePostalPreferences);
        waitForElementPresent(SubmitBtn);
        clickByJS(SubmitBtn);
    }


    public static void navigateToFRAllCards(){
       driver.get(getFRURL());
    }

    public static void navigateToGoldCardDescriptionPage(){
        scrollIntoViewWebElement(enSaviorPlusButton);
        clickByJS(enSaviorPlusButton);
    }

    public static void navigateToUserDetailsPage(){
        waitForElementToClickable(camparerLesCartesButton);
        clickByJS(camparerLesCartesButton);
    }

}
