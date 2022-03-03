<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
    * {
        margin: 0px;
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

    .navbar > h3 {
        margin: 15px;
    }

    .api{
        margin: 20px;
        border-radius: 40px;
        background-color: aqua;
        height: 300px;
        width: 300px;
    }

    fieldset {
        margin: 15px;
    }

    fieldset > * {
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
        <div class="jobInfo">
            <fieldset>
                <h4>Job Information:</h4>
                <h4>Pick up by: </h4>
                <h4>Drop off by:</h4>
                <h4>Pallet Count:</h4>
                <h4>Weight:</h4>
                <button>Accept</button>
                <button>Reject</button>
            </fieldset>
        </div>
        
        <div class="api">
            <h6>Google api here</h6>
        </div>
    </div>
</body>
</body>
</html>