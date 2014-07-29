package gr8conf.us

class SampleController {

    def index() { 
    	[content: '<em>Gr8Conf US</em>']
    }

    def view() {
    	//def value = params.sample
    	//def value = params.int('sample')
    	//def value = params.date('sample', 1000)
		//def value = params.date('sample', 'dd-MM-yyyy')
		def value = params.list('sample')

    	def clsName = value.class.name

    	render "[value: $value, class: $clsName]"
    }

    def sample(int value) {
    	//value = value ?: 1000

    	def clsName = value.class.name

    	render "[value: $value, class: $clsName]"	
    }


    def calc(@grails.web.RequestParameter('value') int x, int multiply) {
    	def result = x * multiply

    	render "[Result: $result, x: $x, multiply: $multiply]"
    }

    def invoke(boolean exception) {
    	if (exception) {
    		throw new CustomException('You got me')
    	}
    	render 'Succes'
    }

    def customException(CustomException customException) {
    	render "Exception occurred: $customException.message"
    }

    def header(String value) {
    	header('Custom-Header', value)
    	render 'Custom header is set'
    }
}
