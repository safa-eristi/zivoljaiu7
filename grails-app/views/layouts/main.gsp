<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>u7ZivOljai - Video Portal Theme</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    
		     <!-- Include CSS Assets -->
		    <asset:stylesheet src="jkit.css"/>
		    <asset:stylesheet src="bootstrap.css"/>
		    <asset:stylesheet src="app.css"/>
		    <asset:stylesheet src="font-awesome.css"/>
		    <asset:stylesheet src="bootstrap-responsive.css"/>
		
		    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
		    <!--[if lt IE 9]>
		      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		    <![endif]-->

  </head>
  <body>
  
  	<!-- Start Header -->

	<div id="header">
	    <div class="navbar navbar-static-top">
	      <div class="navbar-inner">
	        <div class="container">
	          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </a>
	         <a href="index.htm"> <h1>.</h1></a>
	          <div class="nav-collapse collapse">
	            <form class="navbar-form pull-left">
	<div class="input-append">
	  <input class="span3" id="appendedInputButtons" type="text">
	  <button class="btn btn-primary" type="button"><i class="icon-search"></i></button>
	</div>           
	</form>
            <ul class="nav">
              <li class="active"><a href="#">Movies</a></li>
              <li><a href="#">TV Shows</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Features <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li><a href="404.htm">404 Page</a></li>
                  <li><a href="page-elements.htm">Page elements</a></li>
                  <li><a href="login.htm">Login Page</a></li>
                  <li><a href="register.htm">Register Page</a></li>
                  <li><a href="pricing-plans.htm">Pricing Plans</a></li>
                </ul>
              </li>
            </ul>
	         <p class="navbar-text pull-right">
	            <a href="login.htm" class="navbar-link">login</a> or <a href="register.htm"   class="navbar-link">register</a>
	            </p> 
	          </div><!--/.nav-collapse -->
	        </div>
	      </div>
	    </div>
	 </div>

 	<!-- End Header -->
 	
    <g:layoutBody />  <!-- Additional Content Will Go Here -->
  
  
  
  
  
  
	<footer class="footer">
	<div class="container">
	<div class="row-fluid">
	<div class="span6"> <p class="copyright">
	
	<asset:image src="logo-ts.png" class="foot-logo" alt="Brand Logo"/> &copy; 2015 <strong>u7ZivOljai</strong> Video Portal
	</div>
	<div class="span6">   <div class="pagination pull-right">
	 <ul>
	<li><a data-rel="tooltip" data-placement="top" data-original-title="Follow us on Twitter" href="#"><i class="icon-twitter"></i></a></li>
	<li><a data-rel="tooltip" data-placement="top" data-original-title="Share us on Pinterest" href="#"><i class="icon-pinterest"></i></a></li>
	<li><a data-rel="tooltip" data-placement="top" data-original-title="Like us on Facebook" href="#"><i class="icon-facebook"></i></a></li>
	<li><a data-rel="tooltip" data-placement="top" data-original-title="+1 us on Google+" href="#"><i class="icon-google-plus"></i></a></li>          
	</ul>
	</div>
	</div>
	</div>
	</div>
	
	
	
	
	</footer>

	
	    <!-- Include Javascript/JQuery Assets
	    ================================================== -->
	    <!-- Placed at the end of the document so the pages load faster -->
	    	    
	 <asset:javascript src="jquery.js"/>
	 <asset:javascript src="bootstrap.js"/>
	 <asset:javascript src="jquery.jkit.1.1.10.js"/>
	 <asset:javascript src="jquery.easing.1.3.js"/>
	 	
	<script type="text/javascript">
	    $("[data-rel=tooltip]").tooltip();
	</script>
	
	<script type="text/javascript">
	$(document).ready(function(){
	  $('body').jKit();
	});
	</script>  
  
   
  </body>
</html>
