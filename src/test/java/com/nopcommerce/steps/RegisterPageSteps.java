package com.nopcommerce.steps;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;



public class RegisterPageSteps
{
    String field;
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I should be able to navigate to the registration page$")
    public void iShouldBeAbleToNavigateToTheRegistrationPage() {
    }

    @And("^I should be able to see \"([^\"]*)\" page title$")
    public void iShouldBeAbleToSeePageTitle(String expected)  {
        Assert.assertEquals(expected, new RegisterPage().verifyRegisterLinkTxt());
    }

    @Then("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().setRegisterButton();
    }


    @When("^I didn't enter value in field \"([^\"]*)\"$")
    public void iDidnTEnterValueInField(String fieldName)
    {
        new RegisterPage().verifyRequiredMessage(fieldName);
    }



    @Then("^I should be able to see under all field$")
    public void iShouldBeAbleToSeeUnderAllField() {
        System.out.println("validation error");
    }

    @When("^I didn't enter value in field \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iDidnTEnterValueInFieldAnd(String actual,String fieldName)  {
        Assert.assertEquals(actual, new RegisterPage().verifyRequiredMessage(fieldName));


    }

    @And("^I should able to see message \"([^\"]*)\"$")
    public void iShouldAbleToSeeMessage(String actual) {
        Assert.assertEquals(actual, new RegisterPage().verifyRequiredMessage(field));

    }

    @When("^I didn't enter First Name \"([^\"]*)\"$")
    public void iDidnTEnterFirstName(String fname)  {
        field=fname;
    }

    @When("^I didn't enter Last Name \"([^\"]*)\"$")
    public void iDidnTEnterLastName(String lname)  {
        field=lname;
    }

    @When("^I didn't enter Email \"([^\"]*)\"$")
    public void iDidnTEnterEmail(String email)  {
        field=email;
    }

    @When("^I didn't enter Password \"([^\"]*)\"$")
    public void iDidnTEnterPassword(String pass)  {
        field=pass;
    }

    @When("^I didn't enter Confirm Password \"([^\"]*)\"$")
    public void iDidnTEnterConfirmPassword(String cpass)  {
        field=cpass;
    }

    @And("^I Select gender \"([^\"]*)\"$")
    public void iSelectGender()  {
        new RegisterPage().setFemale();
    }

    @And("^I Enter firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String firstName)  {
        new RegisterPage().setFirstname(firstName);
    }

    @And("^I Enter lastname \"([^\"]*)\"$")
    public void iEnterLastname(String lastName) {
        new RegisterPage().setLastname(lastName);
    }

    @And("^I Select day \"([^\"]*)\"$")
    public void iSelectDay(String dob)
    {
        new RegisterPage().setDateOfBirth(dob);
    }

    @And("^I Select month \"([^\"]*)\"$")
    public void iSelectMonth(String dom)  {
        new RegisterPage().setMonthOfBirth(dom);
    }

    @And("^I Select year \"([^\"]*)\"$")
    public void iSelectYear(String doy)  {
        new RegisterPage().setYearOfBirth(doy);
    }

    @And("^I Enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
        new RegisterPage().setEmail();
    }

    @And("^I Enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new RegisterPage().setPassword(password);
    }

    @And("^I Enter  confirm  password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String conPass)
    {
        new RegisterPage().setPassword(conPass);
    }

    @And("^I Click On REGISTER button$")
    public void iClickOnREGISTERButton() {
        new RegisterPage().setRegisterButton();

    }

    @Then("^I should be able to verify message \"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyMessage(String expected)
    {
        Assert.assertEquals(expected, new RegisterPage().verifyYourRegisterCompleteMessage());
    }
}
