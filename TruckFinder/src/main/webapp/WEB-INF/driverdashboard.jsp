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

    .search {
        margin: 15px;
    }

    .maincontainer {
        display: flex;
    }

    .navbar {
        display: flex;
        justify-content: space-between;
        align-items: center;
        background: rgb(58,80,180);
        background: linear-gradient(90deg, rgb(94, 202, 235) 0%, rgba(29,164,253,1) 44%, rgba(69,252,238,1) 100%);

        color: rgb(11, 11, 24);
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
        border-radius: 25px;
        background-color: aqua;
        margin: 25px;
        padding: 25px;
        height: 250px;
        width: 250px;
    }

    .container {
        display: flex;
        justify-content: space-between;
    }

    .joblist {
        margin: 25px;
        padding: 25px;
    }

    legend {
        margin: 10px;
    } 

    .profile {
        border-radius: 10px;
    }
</style>
<body>
    <div class="navbar">
        <h3>Dashboard</h3>
        <div>
            <a href="">Home</a>
            <a href="">Logout</a>
        </div>
    </div>

    <div class="maincontainer">
        
        
        
        <div class="lmain">
            
        <div class="search">
            <label for="jobsearch" >Search for jobs:</label>
            <input type="search" placeholder="Enter search here..."></input>
            <button>Search</button>
        </div>
        
        <div class="jobsnearyou">
            <fieldset>
                <legend><h4>Near you</h4></legend>
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
                        <td><a href="${locations.job_id}">${locations.job_id}</a></td>
                        <td>${location.company}</td>
                        <td>${location.street}</td>
                        <td>${location.city}</td>
                        <td>${location.state}</td>
                        <td>${location.zipcode}</td>
                    </tbody>
                </table>
            </fieldset>
        </div>
        
        </div>
    <div class="rmain">
        <div class="googleapi">
            <h4>Google api here</h4>
        </div>


            <fieldset class="profile">
                <legend><h4>User Name</h4></legend>
                <ul>
                    <p>Email: ${user.email}</p>
                    <p>Contact Number:  ${user.number}</p>
                </ul>
            </fieldset>

    </div>

    </div>
        
</body>
</html>