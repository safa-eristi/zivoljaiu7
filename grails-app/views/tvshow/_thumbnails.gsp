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
                        params:'\'sortOption=\' + escape(this.value)',
						onSuccess:'clearSearchInput();'
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
	<g:renderImageThumbnail type="Tvshows" name="${tvshow.name.toLowerCase().replaceAll("\\s","")}">
	</g:renderImageThumbnail >
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

<div id="videoPlaybackDiv" style="position:absolute; top:0px; left:0px; width:90%; height:90%; display:none; z-index:9998; background-color:black;">

<video id="example_video_1" class="video-js vjs-default-skin"
  controls preload="auto"
  poster="http://video-js.zencoder.com/oceans-clip.png"
  data-setup='{"example_option":true}'>
 <source src="http://static-ua.ororo.tv/uploads/video/file/43/Friends_S01E03_-_The_One_with_the_Thumb.webm" type='video/webm' />
</video>

</div> 


</div>