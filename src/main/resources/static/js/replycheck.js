/**
 * 
 */
 
function CheckRereplyform(tempIndex) {
	console.log('Checkreplyform' + tempIndex); 
	
	var inputElement = document.getElementById("contents" + tempIndex);
	if( inputElement.value == "" ) { 
		inputElement.focus(); 
		alert("댓글을 입력해 주십시오."); 
		return false; 
		
	}
	
}
function CheckRereplyform(tempIndex1) {
	console.log('Checkreplyform' + tempIndex1); 
	
	var inputElement = document.getElementById("contents" + tempIndex1);
	if( inputElement.value == "" ) { 
		inputElement.focus(); 
		alert("댓글을 입력해 주십시오."); 
		return false; 
		
	}
	
}


 function Checkreplyform() {
	console.log('Checkreplyform');
	if( replyform.contents.value == "" ) { 
		replyform.contents.focus(); 
		alert("댓글을 입력해 주십시오."); 
		return false; 
	}
}
		
