package gr8conf.us

import groovy.sql.*

class SampleController {

	def sessionFactory 

	def groovySql

    def index() { 
    	def users = groovySql.rows('select * from user')

    	//def users = User.list().collect { [name: it.username, email: it.email] }

    	render users
    }
}
