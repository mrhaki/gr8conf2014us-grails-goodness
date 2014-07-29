package gr8conf.us

@grails.rest.Resource(readOnly=true)
class Book {

	String title
	int pages

    static constraints = {
    }
}
