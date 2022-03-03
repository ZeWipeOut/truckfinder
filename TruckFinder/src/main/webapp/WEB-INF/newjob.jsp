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
        color: rgb(11, 11, 24);
        height: 35px;
    }

    .navbar > * {
        margin: 15px;
    }

    .mainjob {
        display: flex;
        justify-content: center;
    }

    .jobdetails {
        display: flex;
        align-items: center;
        width: 500px;
    }
    
    fieldset{
        padding: 10px;
        margin: 10px;
    }

    legend {
        margin: 15px;
        padding: 10px;
    }

    label{
    float: left;
    clear: left;
    width: 250px;
    text-align: left;
}
    input {
        margin: 15px;
        display: inline-block;
}

    button {
        margin: 10px;
        padding: 5px;
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

    <div class="mainjob">

        <div class="jobdetails">
            <fieldset>
            <legend>Job Details</legend>
            <form>
                <label>Pick Up:</label>
                <input type="text">

                <label>Drop Off:</label>
                <input type="text">
                
                <label>Number of Pallets:</label>
                <input type="number">
                
                <label>Weight:</label>
                <input type="double">
                
                <label>Trailer type required:</label>
                <input type="text">
                
                <label>Description:</label>
                <input type="text">
                
                <button>Post Job</button>
                
            </form>
            
        </fieldset>
    </div>
</div>
</body>
</html>