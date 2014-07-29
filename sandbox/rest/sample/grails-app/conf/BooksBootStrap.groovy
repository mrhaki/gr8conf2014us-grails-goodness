import gr8conf.us.Book

class BooksBootStrap {
	def init = { ctx ->
		println Book.findOrSaveByTitleAndPages('Grails in Action', 660)
		println Book.findOrSaveByTitleAndPages('Groovy in Action', 829)
	}
}