package stepDefinations;

import apiEngine.Endpoints;

import helpers.TestContext;

public class BaseStepDefinitions {
	
	    private Endpoints endPoints;
	    
	    
	    public BaseStepDefinitions(TestContext testContext) {
	    	endPoints = testContext.getEndPoints();
	    	
	    }
	 
	    public Endpoints getEndPoints() {
	        return endPoints;
	    }
	    
	   
	}


