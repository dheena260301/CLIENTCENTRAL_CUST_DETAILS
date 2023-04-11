// for get customerDetails where nric and advstf name
function showCustDetails(){
	$( "#CustomerDetailsTable tbody").empty();
	console.log("inside the showCustDetails")
	let data1 = document.getElementById("selAdvStfName") ;
	let data2 = document.getElementById("selCustNric") ;
	//var daval = data.value;
	var advStfId = data1.options[data1.selectedIndex].value;	 
	var StrAdvStfId =advStfId.toString();
	
	var custNric = data2.options[data2.selectedIndex].value;	 
	 var strCustNric =custNric.toString();
	
	
	$.ajax({
		type : "GET",
		url : "/CLIENTCENTRAL/getCustDetailsByAdfStfAndNric/",
		data : {
			"agentIdCurrent":StrAdvStfId,
			"custNric": strCustNric
		},
		contentType: "application/json; charset=utf-8",
		dataType : "json",
		success : function(result){
			console.log(result);
			var lstDetails = result;
			if(lstDetails == ""){
				alert("No Data Found");
			}
			var count = 1;
			for(var i=0;i<lstDetails.length;i++){
				 $('#CustomerDetailsTable').append('<tr><td>'+count+'</td>'+
         		                          '<td>'+lstDetails[i].customerName+'</td>'+
     	                                  '<td>'+lstDetails[i].custNRIC+'</td>'+
     	                                  '<td>'+lstDetails[i].custFin+'</td>'+
     	                                  '<td>'+lstDetails[i].custInitials+'</td>'+
     	                                  '<td>'+lstDetails[i].custPassportNum+'</td>'+
     	                                  '<td>'+lstDetails[i].custCoreId+'</td>'+
     	                                  '<td>'+lstDetails[i].agentIdCurrent+'</td></tr>');
            count++;
			}
		},
		error : function(result){
			alert("some error");
		}
	});
}