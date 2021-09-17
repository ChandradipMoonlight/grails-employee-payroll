/**
 * Purpose : To create a model of Employee and apply constraints on model
 *
 * @author Chandradip Shivankar
 * @since 15-09-2021
 */

package com.bridgelabz

import java.time.LocalDate

class EmployeeModel {
    Integer id
    String name
    String profilePic
    String gender
    List<String> department = ["HR", "Sales", "Finance", "Engineer", "Others"]
    Integer salary
    LocalDate joinedDate
    String notes

    static constraints = {
        id blank: false
        name blank: false
        profilePic nullable: true
        gender blank: false, nullable: true
        salary blank: false, min: 10000, nullable: true

    }

    @Override
    String toString() {
        return super.toString()
    }
}
