<%@page import="java.util.*" %>





<html>
<head>
	<title>Vehicle Registration</title>

	<link rel="stylesheet" href="css/bootstrap.min.css">

</head>
<body>
	<%@include file= "header.html" %>

	<div class="container">
		
			<div class="row">
			    <div class="col-md-4 mr-5">
					<h2 class="text-center mt-3 mb-3">Enter Vehicle Details</h2>
			    </div>
			 </div>
                 <form method="post" action="putvehicle.hawa">

                 	  <div class="col-md-4 mr-5">
                      <label for="Chassis ID">Chassis Number</label>
                     <input type="text" class="form-control" name="chassisid" placeholder="Chassis Id">
			  </div>

			  <div class="col-md-4 mr-5">
                      <label for="Client's ID">Client's ID</label>
                     <input type="text" class="form-control" name="clientid" placeholder="Client Id">
			  </div>

			   <div class="col-md-4 mr-5 ">
                 	<br><br>
                  <button type="submit" style="width:300px" class="btn btn-danger">Submit</button>


               </div>
                     </form>

			</div>


</body>
</html>

