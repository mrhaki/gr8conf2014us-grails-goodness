package gr8conf.us

import grails.rest.*

@Resource()
class User {

	String username
	String email

    static constraints = {    	
    	username maxSize: 100
    	email shared: 'email'
    }
}
