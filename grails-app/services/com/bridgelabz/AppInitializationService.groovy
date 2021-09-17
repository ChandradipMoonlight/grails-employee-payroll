package com.bridgelabz

import grails.gorm.transactions.Transactional

@Transactional
class AppInitializationService {

    static initialize() {
        initMember()
    }

    private static initMember() {
        if (EmployeeModel.count == 0) {
            println("Sorry No Data Found")
        }
    }
}
