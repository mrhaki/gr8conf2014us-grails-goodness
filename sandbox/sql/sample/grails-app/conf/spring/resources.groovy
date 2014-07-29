// Place your Spring DSL code here
import groovy.sql.Sql

beans = {

	groovySql(Sql, ref('dataSource'))

}
