package employee.payroll.grails.app

import com.bridgelabz.EmployeeController

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

//        "/"(controller: EmployeeController, view:"/employee/index")
        "/"( controller:"employee", action: "index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
