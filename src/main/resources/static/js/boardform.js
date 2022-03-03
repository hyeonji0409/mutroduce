/**
 * 
 */
function Checkform() { 
	if( boardform.title.value == "" ) { 
		boardform.title.focus(); 
		alert("제목을 입력해 주십시오."); 
		return false; 
		
	} 
	
	if( boardform.contents.value == "" ) { 
		boardform.contents.focus(); 
		alert("내용을 입력해 주십시오."); 
		return false; 
		
	} 
	

	
}


