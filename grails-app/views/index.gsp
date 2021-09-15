<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Employee Payroll App</title>
</head>
<body>
<div class="main-content">
    <div class="header-content">
        <div class="emp-detail-text">
            Employee Details
            <div class="emp-count">10</div>
        </div>
        <g:link controller="employee" action="create" class="add-button">
            <g:img dir="..assets/icons/add-24px.svg" file="add-24px.svg" alt="Add User"/>
            <g:message code="add.user"/>
        </g:link>
    </div>

    <div class="table-main">
        <table id="table-display" class="table">

            <tr>
                <!-- Table Headers -->
                <th>Profile Pic</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Department</th>
                <th>Salary</th>
                <th>Joining Date</th>
                <th>Actions</th>
            </tr>
            <!-- Employee Details in Table Rows -->
            <tr>
                <td>
                    <g:img class="profile" dir="..assets/profile-images/Ellipse -2.png" file="Ellipse -2.png" alt="Profile"/>
                </td>
                <td>Dipak Kumar</td>
                <td>Male</td>
                <td><div class="dept-label">HR</div><div class="dept-label">Finance</div></td>
                <td>&#8377; 1200000</td>
                <td>21 Aug 2020</td>
                <!--To update and delete an employee from the database-->
                <td>
                    <g:img (click)="remove(employee.id)" dir="../assets/icons/" file="delete-black-18dp.svg" alt="delete" />
                    <g:img (click)="update(employee)" dir="../assets/icons/" file="create-black-18dp.svg" alt="edit" />
                </td>
            </tr>

        </table>
    </div>
</div>
</body>
</html>
