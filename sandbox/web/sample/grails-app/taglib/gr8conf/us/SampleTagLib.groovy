package gr8conf.us

class SampleTagLib {
    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def sample = { attributes, body ->
    	def value = attributes.boolean('enabled')
    }
}
