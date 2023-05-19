package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitleField;

    @CacheLookup
    @FindBy(id = "location")
    WebElement LocationField;

    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;

    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(id = "gdpr-consent-notice")
    WebElement iframe;


    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitleField, jobTitle);
        log.info("Enter Job Title : " + jobTitleField.toString());
    }

    public void enterLocation(String Location) {
        sendTextToElement(LocationField, Location);
        log.info("Enter Location : " + LocationField.toString());
    }

    public void selectDistance(String Distance) {
        selectByVisibleTextFromDropDown(distanceDropDown, Distance);
        log.info("Select Distance : " + distanceDropDown.toString());
    }

    public void MoreSearchOptionLink() {
        clickOnElement(moreSearchOptionsLink);
        log.info("Click On More Search Option : " + moreSearchOptionsLink.toString());
    }

    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin, minSalary);
        log.info("Enter Min Salary : " + salaryMin.toString());
    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);
        log.info("Enter Max Salary : " + salaryMax.toString());
    }

    public void salaryTypeDropDownLink(String Salary) {
        selectByVisibleTextFromDropDown(salaryTypeDropDown, Salary);
        log.info("Select Salary Type : " + salaryTypeDropDown.toString());
    }

    public void jobTypeDropDownLink(String jobType) {
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
        log.info("Select Job Type : " + jobTypeDropDown.toString());
    }

    public void findJobsButton() {
        clickOnElement(findJobsBtn);
        log.info("click On Find jobs Button : " + findJobsBtn.toString());
    }

    public void acceptCookies() {
        switchToIframe(iframe);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
        log.info("Acceptcookies : " + acceptCookies.toString());
    }


}
