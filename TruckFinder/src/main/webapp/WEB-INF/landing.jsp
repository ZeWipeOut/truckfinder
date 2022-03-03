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
    img{
    width: 100%;
    }



    .master{
        border-radius: 40px;
        height: 100%;
        background: rgb(255,255,255);
        background: radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(0,0,0,0.9969364454766282) 100%);
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .main {
        display: flex;
        justify-content: center;
        flex-direction: column;
        width: 300px;
    }

    fieldset {
        background-color: cornsilk;
        border-radius: 10px;
    }

label{
    float: left;
    clear: left;
    width: 250px;
    text-align: left;
}
input {
    display: inline-block;
}

legend {
    margin: 10px;
}

</style>

<body>
    <img src="Emptytrafficedit.jfif" alt="Truck image">
    <div class="master">

        <div class="main">
            
            
            <div class="titlepicture">
                
            </div>
            
            <div class="landingdesc">
                <fieldset>
        
                    <h1>Welcome!</h1>
                    <h4>This page represents Truck Finder which is designed to help indepndent drivers with a CDL liscense 
                        to locate posted jobs made avalible by Buisness Owners without the hassle of going through extra 
                        parties to access information.
                    </h4>
                </fieldset>
            </div>
            
            <div class="login">
            <fieldset>
                <form>
                    <legend>Please Enter your Login Information:</legend>
                    <label>User Name:</label>
                    <input type="text">

                    <label>Password:</label>
                    <input type="text">

                    <button>Log In</button>
                    
                </form>
            </fieldset>
            </div>
            
            <div class="Register">
                <fieldset>
                    <form>
                        <legend>Please Enter Registration Info:</legend>
                        <label>User Name:</label>
                        <input type="text">

                        <label>Email:</label>
                        <input type="text">
    
                        <label>Password:</label>
                        <input type="text">

    
                        <button>Register</button>
                        
                    </form>
                </fieldset>
            </div>
        </div>
    </div>
</body>
</body>
</html>