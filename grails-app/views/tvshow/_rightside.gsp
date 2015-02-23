<!-- Start Right Section -->

<g:link></g:link>

  <div id="side-section" class="span3">
  <ul class="nav nav-list">
                <li class="nav-header">filter by</li>
                <li class="active"><a onclick="${remoteFunction(
                    action:'sortTvshows',
					update:'thumbnails',
                    params:'\'sortOption=Newest\''
                    )}"><i class="icon-time"></i> Recently added</a></li>
                <li><a onclick="${remoteFunction(
                    action:'sortTvshows',
					update:'thumbnails',
                    params:'\'sortOption=Popular\''
                    )}"><i class="icon-heart-empty"></i> Most Popular</a></li>
                <li><a onclick="${remoteFunction(
                    action:'sortTvshows',
					update:'thumbnails',
                    params:'\'sortOption=Highest Rating\''
                    )}"><i class="icon-star-empty"></i> Highest Rating</a></li>
              </ul>


<div class="module-top"><i class="icon-lock"></i> Quick Login</div>
<div class="module">
<form method="post" action="?" data-jkit="[form:validateonly=true]">
  <fieldset>
    <label class="label-main">Username</label>
    <input name="miniusername" class="span10" id="miniusername"  type="text" data-jkit="[validate:required=true;min=3;max=10;error=Please enter your username (3-10 characters)]">
    <label class="label-main">Password</label>
    <input name="miniusername" class="span10" id="miniusername"  type="text" data-jkit="[validate:required=true;min=3;max=10;error=Please enter your username (3-10 characters)]">
<p><label class="checkbox"><input type="checkbox">remember me</label></p>
    <button name="send" type="submit" value="Submit"  class="btn btn-small">Login</button>
  </fieldset>
</form></div>

 
<div class="module-top"><i class="icon-comments"></i> Latest Comments</div>
<div class="module">
<ul class="comment-list">
<li class="comment">         
<div class="comment-body">
<h4 class="comment-heading">Comment title <span class="time">4:34am</span></h4>
<p>Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at.</p>
</div>
</li>

</ul>
</div>
</div>
</div>
<hr>
</div>
</div>