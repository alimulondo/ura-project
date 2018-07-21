<%@page import="java.util.*" %>





<html>
<head>
	<title>Client Registration</title>

	<link rel="stylesheet" href="css/bootstrap.min.css">

</head>
<body>
	<%@include file= "header.html" %>


	<div class="container">
		
			<div class="row">
			    <div class="col-md-4 mr-5">
					<h2 class="text-center mt-3 mb-3">Enter Client's Details</h2>
			    </div>
			 </div>
                 <form method="post" action="putclient.hawa">
			 
			  <div class="col-md-4 mr-5">
                      <label for="First Name">First Name</label>
                     <input type="text" class="form-control" name="fname" placeholder="First Name">
			  </div>

			  <div class="col-md-4 mr-5">
                      <label for="Last Name">Last Name</label>
                     <input type="text" class="form-control" name="lname" placeholder="Last Name">
			  </div>

			  <div class="col-md-4 mr-5">
                      <label for="Date of Birth">Date of Birth</label>
                     <input type="text" class="form-control" name="dateob" placeholder="DD/MM/YYYY">
			  </div>

			  
           <div class="col-md-4 mr-5">
			  <label for="First Name">Gender</label>
				      <select class="form-control" name = "gender">
						  <option>Male</option>
						  <option>Female</option>
						 
					  </select>

					 </div>  

			 <div class="col-md-4 mr-5">
                      <label for="Location">Location</label>
                     <input type="text" class="form-control" name="location" placeholder="Where do you stay?">
			  </div>

			   <div class="col-md-4 mr-5">
                      <label for="Phone Number">Phone Number</label>
                     <input type="text" class="form-control" name="phonenum" placeholder="+256xxxxxxxxx">
			  </div>

			 <div class="col-md-4 mr-5">
			  <label for="Status">Status</label>
				      <select class="form-control" name="status">
						  <option>Agent</option>
						  <option>Normal</option>
						 
					  </select>

					 </div> 

                 <div class="col-md-4 mr-5 ">
                 	<br><br>
                  <button type="submit" style="width:300px" class="btn btn-danger">Submit</button>


               </div>
                     </form>

			</div>
                    

	<%@include file= "footer.html" %>


</body>
</html>
