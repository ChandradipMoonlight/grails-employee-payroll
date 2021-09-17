package com.bridgelabz

import grails.gorm.transactions.Transactional
import grails.web.servlet.mvc.GrailsParameterMap
import org.springframework.validation.BindingResult


@Transactional
class EmployeeService {

    def save(GrailsParameterMap params) {
        EmployeeModel employeeModel = new EmployeeModel(params)
        def response = AppUtil.saveResponse(false, employeeModel)
        if (employeeModel.validate()) {
            employeeModel.save(flush: true)
            if (!employeeModel.hasErrors()) {
                response.isSuccess = true
            }
        }
        return response
    }

    def update(EmployeeModel employeeModel, GrailsParameterMap params) {
        employeeModel.properties = params as BindingResult
        def response = AppUtil.saveResponse(false, employeeModel)
        if (employeeModel.validate())
            employeeModel.save(flush: true)
        if (!employeeModel.hasErrors())
            response.isSuccess = true
        return response
    }

    def getById(Serializable id) {
        return EmployeeModel.get(id)
    }

    def list(GrailsParameterMap params) {
        params.max = params.max ?: GlobalConfig.itemsPerPage()
        List<EmployeeModel> employeeList = EmployeeModel.createCriteria().list(params) {
            if (params?.colName && params?.colValue) {
                like(params.colName, "%" + params.colValue + "%")
            }
            if (!params.sort) {
                order("id", "desc")
            }
        } as List<EmployeeModel>
        return [list: employeeList, count: EmployeeModel.count()]
    }


    def delete(EmployeeModel employeeModel) {
        try {
            employeeModel.delete(flush: true)
        } catch (Exception e) {
            println(e.getMessage())
            return false
        }
        return true
    }
}
