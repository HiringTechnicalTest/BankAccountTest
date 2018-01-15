package com.spec.steps;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import com.bank.domain.Account;
import com.bank.domain.Customer;
import com.bank.domain.repository.IAccountRepository;
import com.bank.domain.repository.ICustomerRepository;
import com.bank.services.CustomerService;

import cucumber.api.PendingException;
import cucumber.api.java8.En;


public class ReadAccountStepDefs implements En {


	private Account account ;
	
	private Customer customer = new Customer("TOTO");
	
	private CustomerService customerService = new CustomerService();
	
	private ICustomerRepository iCustomerRepository = new ICustomerRepository(){
		@Override
		public Optional<Customer> getCustomer(String login) {
			// TODO Auto-generated method stub
			return Optional.of(customer);
		}
	};
	
	
	private IAccountRepository iIAccountRepository = new IAccountRepository(){

	@Override
	public Optional<Account> getAccount(String id) {
		// TODO Auto-generated method stub
		return Optional.of(account);
	}
		
	};
	
	
	public ReadAccountStepDefs() {

		double vBalance;
		Given("^I am a customer with \"([^\"]*)\" on my account \"([^\"]*)\"$", (String arg1, String arg2) -> {
			  account = new Account(arg1, Double.valueOf(arg2));
			
		});

		When("^I check my account \"([^\"]*)\"$", (String arg1) -> {
		    // Write code here that turns the phrase above into concrete actions
			vBalance =  customerService.checkAccount(iIAccountRepository.getAccount(arg1).get());
		});

		Then("^my balance should be \"([^\"]*)\"$", (String arg1) -> {
		    // Write code here that turns the phrase above into concrete actions
		   assertEquals(Double.valueOf(arg1),vBalance);
		});


	}
}
