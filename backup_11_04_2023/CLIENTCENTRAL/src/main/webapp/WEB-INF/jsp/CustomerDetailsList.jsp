<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Details List</title>
    <link rel="shortcut icon" href="#">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/CustomerDetailsList.js"></script>
    <style>
    @import url('https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400;600;700;800&display=swap');


* {
    margin: 0;
    padding: 0;
    font-family: 'Open Sans', sans-serif;
    box-sizing: border-box;
}

body {
    width: 100vw;
    height: 100vh;
    display: flex;
   
    justify-content: top;
    align-items: center;
    flex-direction: column;
    overflow-x: hidden;
    background-color: #c5c5c5;
}
}



option {
    cursor: pointer;
    width: 300px;
    min-height: 60px;
    max-height: 300px;
    border-radius: 15px;
    background-color: rgb(250, 250, 250);
    box-shadow: 2px 4px 8px #c5c5c5;
    transition: all 300ms;
    
    
}



option {
    width: 100%;
    height: 60px;
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 0 15px;
    transition: all 300ms;
    
}

select {
        width: 300px;
        height: 30px;
        border: 1px solid lightgrey;
        font-size: 18px;
        color: #121414;
       
        border-radius: 5px;
        background-color: darkgrey;
        
      }
option{
        width: 300px;
        height: 30px;
        color: #121414;
        background-color: #cfd1d1;
        border: 1px solid #cfd1d1;
        font-size: 18px;
        border-radius: 5px;
}
.table__body {
    width: 95%;
    max-height: calc(89% - 1.6rem);
    background-color: #fffb;

    margin: .8rem auto;
    border-radius: .6rem;

    overflow: auto;
    overflow: overlay;
}
.table__body::-webkit-scrollbar{
    width: 0.5rem;
    height: 0.5rem;
}
.table__body::-webkit-scrollbar-thumb{
    border-radius: .5rem;
    background-color: #0004;
    visibility: hidden;
}
.table__body:hover::-webkit-scrollbar-thumb{ 
    visibility: visible;
}
table {
    width: 100%;
}
table, th, td {
    border-collapse: collapse;
    padding: 1rem;
    text-align: left;
}
thead th {
    position: sticky;
    top: 0;
    left: 0;
    background-color: #7e8181fe;
    cursor: pointer;
    text-transform: capitalize;
}
.table__body tbody tr:nth-child(even) {
    background-color: #0000000b;
}
.table__body tbody tr {
    --delay: .1s;
    transition: .5s ease-in-out var(--delay), background-color 0s;
}
.table__body tbody tr.hide {
    opacity: 0;
    transform: translateX(100%);
}
.table__body tbody tr:hover {
    background-color: #fff6 !important;
}
tbody tr td,
tbody tr td p,
tbody tr td img {
    transition: .2s ease-in-out;
}
tbody tr.hide td,
tbody tr.hide td p {
    padding: 0;
    font: 0 / 0 sans-serif;
    transition: .2s ease-in-out .5s;
}
tbody tr.hide td img {
    width: 0;
    height: 0;
    transition: .2s ease-in-out .5s;
}

</style>
 
</head>
<body>

<h1> CLIENT CENTRAL </h1>
     <table>
     <tr>
     <td>Advider Staff Name:</td>
     <td>
       <select path="AdviserStaff Name" id="selAdvStfName" onchange="showCustDetails()">
                <option value="" label="Select" />
                <c:forEach var="advStf" items="${allAdvisersList}">
                    <option value="${advStf.advstfId}" label="${advStf.advstfName}"/>
                </c:forEach>
            </select>
            </td>
            <td> Customer NRIC: </td>
            <td>
            <select path="Customer Nric" id="selCustNric" onchange="showCustDetails()">
            <option value="" label="Select"/>
            <c:forEach var="custNric" items="${custNricList}">
               <option value="${custNric}" label="${custNric}" />
            </c:forEach>
            </select>
       </td>
    </tr>
          
            
     </table>    
            
             <section class="table__body">
            <table id ="CustomerDetailsTable">
                <thead>
                    <tr>
                        <th> No </th>
                        <th> Customer Name </th>
                        <th> Nric </th>
                        <th> Fin </th>
                        <th> Initials </th>
                        <th> Passport Number </th>
                        <th> Core Id </th>
                        <th> Agent Id Current </th>
                    </tr>
                </thead>
                <tbody>
                     
                </tbody>
            </table>
        </section>
           
</body>
</html>