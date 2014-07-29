package gr8conf.us

class User {

	String username
	String email

    static constraints = {
    	username maxSize: 100
    	email shared: 'customEmail'
    }
}
