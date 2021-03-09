var goodsService=(function(){
	
	function getGoodsList(search, callback){
		console.log("goods List");
			
		$.ajax({ 
			type : 'get',						
			url : '/goods/rest',	
			data : JSON.stringify(search),			
			contentType : "application/json; charset=utf-8",
			
			success : function(result, status, xhr){
				if(callback){
					callback(result);
				}
			}, error : function(e){
				console.log(e);
			}
		})
	}
	
	return {
		getGoodsList:getGoodsList
	};
	
})();



function callGetGoodsList(){
	var pageNum = $('#')
}

//form 직렬화
jQuery.fn.serializeObject = function() { 
    
    if(this[0].tagName == "form" ) { 
        var arr = this.serializeArray(); 
        if(arr){ 
        	var obj = {};
        	jQuery.each(arr, function() {
        		if( !this.value && (this.name == "pageNum" || this.name == "amount") ){
        			 
        		}else{
        			obj[this.name] = this.value;
        		}
        		
    		}); 
        }
        
        return obj;
    }
    
    return this;
}




