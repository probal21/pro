package stapes;

import org.junit.Assert;

import cucumberanam.cucumberanam.Bank;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class DepositStapes {
	Bank bank;
	
	@Given("I have an account with {int} amount")
	public void i_have_an_account_with_amount(Integer init) {
	  bank = new Bank(init);
	 
	}

	@When("I deposit {int} amount in my account")
	public void i_deposit_amount_in_my_account(Integer some) {
	   bank.deposit(some);
	   
	}

	@Then("I verify the balance will be {int} in my account")
	public void i_verify_the_balance_will_be_in_my_account(Integer expectedbal) {
	int currentBalance = bank.getBalance();
	  Integer actulalBalance = new Integer(currentBalance);
	  
	Assert.assertEquals(expectedbal, actulalBalance);
	
	
	}

}
