<%@page import="java.util.*" %>





<html>
<head>
	<title>Vehicle Plate Number</title>

	<link rel="stylesheet" href="css/bootstrap.min.css">

</head>
<body>
	<%@include file= "header.html" %>

	<div class="container">
		
			<div class="row">
			    <div class="col-md-4 mr-5">
					<h2 class="text-center mt-3 mb-3">Enter  Details</h2>
			    </div>
			 </div>
                 <form method="post" action="putplatenum.hawa">

                 	  <div class="col-md-4 mr-5">
                      <label for="Registration ID">Registration Id</label>
                     <input type="text" class="form-control" name="regid" placeholder="Registration Id">
			  </div>

			  <div class="col-md-4 mr-5">
                      <label for="pluate Numbere">Plate Number</label>
                     <input type="text" class="form-control" name="platenum" placeholder="Unique Plate Number">
			  </div>

			   <div class="col-md-4 mr-5 ">
                 	<br><br>
                  <button type="submit" style="width:300px" class="btn btn-danger">Submit</button>


               </div>
                     </form>

			</div>


</body>
</html>

