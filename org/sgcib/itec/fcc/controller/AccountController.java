package org.sgcib.itec.fcc.controller;


@RestController
@RequestMapping(value = "api/v1")
public class AccountController {

	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/customers/{login}/accounts/{accountId}", method = RequestMethod.GET)
	public double getBalance(){
		
	}
	
	
}
