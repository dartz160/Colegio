$(document).ready(function(){

	$("#banner").css({"height":$(window).height()+"px"})

	var flag =false;
	var srcoll;

	$(window).scroll(function(){
		scroll= $(window).scrollTop();

		if(scroll >50){
			if(!flag){
			$("#logo").css({"margin-top":"-5px","width":"50px","height":"50px"})
			
			$("header").css({"background-color":"#2C0101"})
			flag =true;
			}
		}else{
			if(flag){
			$("#logo").css({"margin-top":"100px","width":"200px","height":"200px"})
			
			$("header").css({"background-color":"transparent"})
			flag =false;}
			}
			
	})

});