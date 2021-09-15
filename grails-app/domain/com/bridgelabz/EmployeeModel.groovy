package com.bridgelabz

import grails.rest.Resource

import java.time.LocalDate

class EmployeeModel {
    Integer id
    String name
    String profilePic
    String gender
    String department
    Long salary
    LocalDate joinedDate
    String notes

    static constraints = {
        id blank: false
        name blank: false
    }
}
