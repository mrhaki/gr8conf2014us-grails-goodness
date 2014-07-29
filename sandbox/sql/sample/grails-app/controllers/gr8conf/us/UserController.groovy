package gr8conf.us

import groovy.sql.*

class UserController {

	def sessionFactory

	def dataSource

	def groovySql

    def index() { 
    	def sql = 'select id, version, username, email from user'
    	
    	//def session = sessionFactory.currentSession
    	//def query = session.createSQLQuery(sql)
    	//def users = query.addEntity(User).list()

    	//def users = User.list().collect { [name: it.username, email: it.email] }

    	//def gSQL = new Sql(dataSource)
    	//def users = gSQL.rows(sql)

    	def users = groovySql.rows(sql)

    	render users
    }
}
