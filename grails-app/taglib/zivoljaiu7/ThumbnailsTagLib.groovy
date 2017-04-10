package zivoljaiu7

class ThumbnailsTagLib {
	
	def renderImageThumbnail = { attrs ->   
		
		 def thumbnailType= attrs.type
		 def imageName = attrs.name
		 def cdnPrefix= "http://i283.photobucket.com/albums/kk320/seristi/u7Zivlojai"
		 
		 def imagePath = cdnPrefix + "/" + thumbnailType + "/" + imageName
		 
		 def modelMap = [imagePath:imagePath]
		 
         out << render(template:"/taglibTemplates/imageThumbnail", model:modelMap)
    }
}
