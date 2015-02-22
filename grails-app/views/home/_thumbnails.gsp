<div id="thumbnails" class="container">

 <!-- Start Info Unit -->

<div id="info-unit"> <div class="alert alert-block alert-info fade in">

 <!-- Yeni Haberler Buraya Yazilabilir -->

<div>

<div class="row-fluid" >
<div class="span9 main-section">


<!-- Options bar (Left Section) -->

<div id="options" class="options-bar">

<g:select class="span2 pull-left" optionValue="${it}"
          name="sortOption" from="${sortOptions}" 
          onchange="${remoteFunction(
                        action:'sortMovies',
						update:'thumbnails',
                        params:'\'sortOption=\' + escape(this.value)',
                        onSuccess:'updateMovies(data);')}"/>
             <span><strong>${moviesCount}</strong> Titles Found</span>
</div>



 <!-- End Options Bar -->


<!-- Start Left Section -->

<div class="row-fluid">
<ul class="thumbnails">
                         
<g:each in="${movies}" var="movie">

	<li class="span3">
	<div class="thumbnail">
	<img data-src="holder.js/300x200" alt="300x200"  src="http://placehold.it/300x400">
	<div class="caption">
	<h6><a href="">${movie.name}</a></h6>
	<p>${movie.summary}</p>
	</div>
	</div>
	</li>

</g:each>

</ul>
</div>

<div class="pagination pagination-small pull-right">
       <ul>         
       </ul>
     </div>
 </div>

 <!-- End Left Section -->

 <g:render template="rightside"></g:render>
 
 
  
 

<g:javascript>

function updateMovies(){

	console.write("AHANDA");
}

</g:javascript>
