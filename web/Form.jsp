<%-- 
    Document   : Form
    Created on : 14 Feb 2022, 13:27:32
    Author     : docto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Client Requirements Form</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<body>

	<div class="bg-contact3" style="background-image: url('images/bg-01.jpg');">
		<div class="container-contact3">
			<div class="wrap-contact3">  


					
<h1 class="my-4">Add Requirements</h1>





<div class="row">
<c:url value="/Insert" var="insertRequirementsUrl">
<c:param name="action" value="insertRequirements"/>
</c:url>



<form action="${insertRequirementsUrl}" method="POST">
					<label for="Project_Name" class="col-4 col-form-label">Project_Name</label>
<div class="col-8">
<input id="Project_Name" name="Project_Name" type="text" class="form-control" required="required">
</div>

                    
                    <label for="Services" class="col-4 col-form-label">Services</label>
<div class="col-8">
<input id="Services" name="Services" type="text" class="form-control" required="required">
</div>
            
             <label for="Budget" class="col-4 col-form-label">Budget</label>
<div class="col-8">
<input id="Budget" name="Budget" type="text" class="form-control" required="required">
</div>
    

<label for="Client_Req" class="col-4 col-form-label">Client_Req</label>
<div class="col-8">
<input id="Client_Req" name="Client_Req" type="text" class="form-control" required="required">
</div>



    
    
            
            

<!--					<div class="wrap-input3 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<input class="input3" type="text" name="email" placeholder="Your Email">
						<span class="focus-input3"></span>
					</div>

					<div class="wrap-input3 input3-select">
						<div>
							<select class="selection-2" name="service">
								<option>Needed Services</option>
								<option>eCommerce Bussiness</option>
								<option>UI/UX Design</option>
								<option>Online Services</option>
							</select>
						</div>-->
<!--						<span class="focus-input3"></span>
					</div>

					<div class="wrap-input3 input3-select">
						<div>
							<select class="selection-2" name="budget">
								<option>Budget</option>
								<option>€100k-200k</option>
								<option>€300k-700k</option>
								<option>€700k-1M+</option>
							</select>
						</div>
						<span class="focus-input3"></span>
					</div>-->

<!--					<div class="wrap-input3 validate-input" data-validate = "Message is required">
						<textarea class="input3" name="message" placeholder="Client Requirements"></textarea>
						<span class="focus-input3"></span>
					</div>-->

					<div class="form-group row">
<div class="offset-4 col-8">
<button name="submit" type="submit" class="btn btn-primary">Submit</button>
</div>
</div>
</form> 
					
</div>		
			</div>
		</div>
	</div>


	<div id="dropDownSelect1"></div>

<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
	<script>
		$(".selection-2").select2({
			minimumResultsForSearch: 20,
			dropdownParent: $('#dropDownSelect1')
		});
	</script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

	<!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-23581568-13');
</script>

</body>
</html>
