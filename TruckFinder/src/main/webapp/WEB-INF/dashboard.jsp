<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Business Dashboard</title>
</head>
<style>
    *{
        margin: 0px;
        padding: 0px;
    }

    button {
        margin: 15px;
    }

    fieldset > *{
        margin: 15px;
    }

    dl > * {
        margin: 20px;
    }

    dd {
        padding: 10px;
    }

    .main {
        display: flex;
        justify-content: space-evenly;
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

    dd {
        background-color: rgb(164, 249, 252);
        border-left: solid 5px rgb(16, 159, 255);
    }

    .navbar > * {
        margin: 15px;
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
    <div class="main">
        <div class="leftmain">
            <div class="yourjobpostings">
                <h3>Your current Job Postings</h3>
                <dl>
                    <dt>Job ID</dt>
                    <dd>Location:Pick Up Date:Drop Off Date:</dd>
                    <dt>Job ID</dt>
                    <dd>Location:Pick Up Date:Drop Off Date:</dd>
                    <dt>Job ID</dt>
                    <dd>Location:Pick Up Date:Drop Off Date:</dd>
                </dl>
                <button>Create new Job</button>
            </div>

        </div>

        <div class="rightmain">
            
            <div class="driversinarea">
                <h3>Avaliable Drivers in area</h3>
                    <dl>
                        <dt>Driver Name</dt>
                        <dd>driver 1</dd>
                        <dt>Driver Name</dt>
                        <dd>driver 2</dd>
                        <dt>Driver Name</dt>
                        <dd>driver 2</dd>
                    </dl>
            </div>

            <div class="completedjobs">
                <fieldset>
                    <h4>Job ID</h4>
                    <h4>Job Location</h4>
                    <h4>Job Date</h4>
                    <h4>Job Dropoff</h4>
                    <h4>Job Driver</h4>
                </fieldset>
                <button>View all previous Jobs</button>
            </div>
        </div>


    </div>
</body>
</html>