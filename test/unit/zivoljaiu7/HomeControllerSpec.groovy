package zivoljaiu7

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HomeController)
class HomeControllerSpec extends Specification {
	
	
	def index() {
		def quotes =  "SAFA, MERVE"
		["quotes": quotes, "totalQuotes": Quote.count()]
	}

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
    }
}
