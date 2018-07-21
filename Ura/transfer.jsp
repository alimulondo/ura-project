<%@page import="java.util.*" %>





<html>
<head>
	<title>Vehicle Transfer</title>

	<link rel="stylesheet" href="css/bootstrap.min.css">

</head>
<body>
	<%@include file= "header.html" %>

	<div class="container">
		
			<div class="row">
			    <div class="col-md-4 mr-5">
					<h2 class="text-center mt-3 mb-3">Vehicle transfer Details</h2>
			    </div>
			 </div>
                 <form method="post" action="managetransfer.hawa">

                 	  <div class="col-md-4 mr-5">
                      <label for="Registration ID">Registration Id</label>
                     <input type="text" class="form-control" name="regid" placeholder="Registration Id">
			  </div>

			  <div class="col-md-4 mr-5">
                      <label for="Old Client's Id">Old Client's Id </label>
                     <input type="text" class="form-control" name="ocid" placeholder="Old Client's Id">
			  </div>

			   <div class="col-md-4 mr-5">
                      <label for="NEW Client's Id">New Client's Id </label>
                     <input type="text" class="form-control" name="ncid" placeholder="New Client's Id">
			  </div>

			   <div class="col-md-4 mr-5">
                      <label for="Mileage">Current Mileage </label>
                     <input type="text" class="form-control" name="mileage" placeholder="Current Mileage">
			  </div>

               <div class="col-md-4 mr-5">
                      <label for="Chassis">Chassis </label>
                     <input type="text" class="form-control" name="chassis" placeholder="chassis Number">
			  </div>

			   <div class="col-md-4 mr-5 ">
                 	<br><br>
                  <button type="submit" style="width:300px" class="btn btn-danger">Submit</button>


               </div>
                     </form>

			</div>


</body>
</html>

