package helloworld

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class RegPersonSpec extends Specification implements DomainUnitTest<RegPerson> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
