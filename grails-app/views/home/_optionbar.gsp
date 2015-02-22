 <!-- Options bar (Left Section) -->

<div class="options-bar">

<g:select class="span2 pull-left" optionValue="${it}"
          name="sortOption" from="${sortOptions}" 
          onchange="${remoteFunction(
                        action:'sortMovies',
                        params:'\'sortOption=\' + escape(this.value)',
                        onSuccess:'updateMovies(data);')}"/>
             <span><strong>${moviesCount}</strong> Titles Found</span>
</div>



 <!-- End Options Bar -->
 

