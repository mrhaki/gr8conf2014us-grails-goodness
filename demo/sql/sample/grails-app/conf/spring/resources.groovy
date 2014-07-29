// Place your Spring DSL code here

import groovy.sql.*

beans = {

	groovySql(Sql, ref('dataSource'))
}
