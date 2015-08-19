/*search result*/
/*search data from mongodb*/
function searchData(){
	var platform = "";
	var priority = "";
	var type="automated";
	var country = "";
	
	$.ajax({
		type:"GET",
		url:"/DMC/searchDatas",
		data:"platform=" + platform + "&priority=" + priority + "&type=" + type + "&country=" + country,
		success:function(data){
			
		}
	});
}


/*data table*/
$(document).ready(function(){
	$("#searchResult").DataTable({
	});
});

