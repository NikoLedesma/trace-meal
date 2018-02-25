package com.vogella.grails

import Person.Person
import helloworld.RegPerson

class PersonController {

    def index() {
        RegPerson p = new RegPerson(firstName: 'jhon',lastName: 'Doe',salary: 44.23,dateOfBirth: new Date())
        //p.firstName = 'John'
        //p.lastName = 'Doe'
        //p.salary = 44.23
        p.save(failOnError: true)
        log.info "An insert"
        println("An insert")
        //Person.add()
        //def list = Person.list()
    }

    def persons(){
        /*Person p = new Person()
        p.firstName = 'John'
        p.lastName = 'Doe'
        p.salary = 44.23
        def listOfPersons = []
        listOfPersons.add(p)*/
       // def p = RegPerson.get(1)
        def listOfPersons = RegPerson.list()
       // listOfPersons.add(p)
        return [list: listOfPersons]
    }

}
