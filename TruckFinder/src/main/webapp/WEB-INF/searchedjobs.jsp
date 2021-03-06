<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

    * {
        margin: 0px;
        padding: 0px;
    }

    .navbar {
        display: flex;
        justify-content: space-between;
        align-items: center;
        background: rgb(58,80,180);
        background: linear-gradient(90deg, rgb(94, 202, 235) 0%, rgba(29,164,253,1) 44%, rgba(69,252,238,1) 100%);
        color: rgb(0, 0, 0);
        height: 35px;
    }

    .navbar a,h3{
        margin: 15px;
    }


    .joblist {
        display: flex;
        flex-direction: column;

    }

    .googleapi{
        background-color: aqua;
        margin: 25px;
        padding: 25px;
        height: 500px;
        width: 500px;
    }

    .container {
        display: flex;
        justify-content: space-evenly;
    }

    .joblist {
        margin: 25px;
        padding: 25px;
    }

    legend {
        margin: 10px;
    } 
</style>
    
<body>
    <div class="navbar">
        <h3>Searched Jobs</h3>
        <div>
            <a href="">Home</a>
            <a href="">Logout</a>
        </div>
    </div>
    <div class="container">
        <div class="joblist">
            <fieldset>
                <legend><h4>By City</h4></legend>
                <table>
                    <thead>
                        <tr>  Job ID  </tr>
                        <tr>  Comapny  </tr>
                        <tr>  Street  </tr>
                        <tr>  City  </tr>
                        <tr>  State  </tr>
                        <tr>  Zipcode </tr>
                    </thead>
                    <tbody>
                        <td><a>${locations.job_id}</a>${locations.job_id}</td>
                        <td>${location.company}</td>
                        <td>${location.street}</td>
                        <td>${location.city}</td>
                        <td>${location.state}</td>
                        <td>${location.zipcode}</td>
                    </tbody>
                </table>
            </fieldset>
            <fieldset>
                <legend><h4>By Date</h4></legend>
                <table>
                    <thead>
                        <tr>  Job ID  </tr>
                        <tr>  Comapny  </tr>
                        <tr>  Street  </tr>
                        <tr>  City  </tr>
                        <tr>  State  </tr>
                        <tr>  Zipcode </tr>
                    </thead>
                    <tbody>
                        <td>${locations.job_id}</td>
                        <td>${location.company}</td>
                        <td>${location.street}</td>
                        <td>${location.city}</td>
                        <td>${location.state}</td>
                        <td>${location.zipcode}</td>
                    </tbody>
                </table>
            </fieldset>
            <a>Dashboard</a>
        </div>
        <div class="googleapi">
            <h3>Googleapi here</h3>
        </div>
    </div>
</body>
</html>