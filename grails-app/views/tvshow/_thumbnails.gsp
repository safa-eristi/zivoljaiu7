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
                        action:'sortTvshows',
						update:'thumbnails',
                        params:'\'sortOption=\' + escape(this.value)'
                        )}"/>
             <span><strong>${tvshowsCount}</strong> Titles Found</span>
</div>

<!-- End Options Bar -->

<!-- Start Left Section -->

<div class="row-fluid">
<ul class="thumbnails">
                         
<g:each in="${tvshows}" var="tvshow">

	<li class="span3">
	<div class="thumbnail">
	<asset:image src="thumbnails/tvshow/${tvshow.name.toLowerCase().replaceAll("\\s","")}.jpg"/>
	<div class="caption">
	<h6><a href="">${tvshow.name}</a></h6>
	<p>${tvshow.summary}</p>
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
 
</div>
</div>
</div>
</div>
</div>
 
<g:javascript>

function updateMovies(){

	console.write("AHANDA");
}

</g:javascript>
