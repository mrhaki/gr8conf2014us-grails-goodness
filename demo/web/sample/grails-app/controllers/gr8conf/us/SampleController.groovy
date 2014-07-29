package gr8conf.us

class SampleController {

    def index() { 
    	[content: '<em>Should be emphasized.</em>']
    }

    def sample() {
    	def value = params.date('value', ['dd-MM-yyyy', 'ddMMyyyy'])

    	def clsName = value.class.name

    	render "[value: $value, clsName: $clsName]"
    }

    def other(@grails.web.RequestParameter('othervalue') int value) {
    	def clsName = value.class.name

    	render "[value: $value, clsName: $clsName]"
    }

    def raise(boolean raiseException) {
    	if (raiseException) {
    		throw new CustomException('customexception')
    	}
    	render "SUCCESS"
    }

    def customException(CustomException customException) {
    	render customException.message
    }

    def header(String value) {
    	header('New-Header', value)

    	render 'OK'
    }

}
