/**
 * chatbot.js
 */
 $(function(){
	// 웰컴 메시지를 받기 위해서 message 입력받기 전에
	// 빈 값으로 서버에 전송하고 웰컴 메시지를 받기 위해
	// $.ajax()를 별도의 함수로 분리해서 호출
	callAjax(); //매시지 입력하지 않고 호출해서 빈값 전송 -> open event -> 웰컴 메시지 출력
	
	$('#chatForm').on('submit', function(event){
		event.preventDefault();
		
		// 메시지 입력하지 않고 [전송] 버튼 누른 경우 (웰컴 메시지 출력되지 않도록)
		if ($('#message').val() == ""){
			return false;
		}		
		
		/* chatBox에 보낸 메시지 추가 */
		if($('#message').val() != ""){
			$('#chatBox').append('<div class="msgBox send"><div id="send_section"><span id="in_me"><span>' + 
												$('#message').val() + '</span></span></div></div><br>');
		}
		
		callAjax(); // 입력된 값 전송
		
		/* 입력란 비우기*/
		$('#message').val('');
	});	// submit 끝
	
	// $.ajax()를 별도의 함수로 분리
	function callAjax(){
		$.ajax({
			url:"chatbotCall",
			type:"post",
			data:{message: $('#message').val()},		
			success:function(results){
				/* chatBox에 받은 메시지 추가 */
				$('#chatBox').append('<div class="msgBox receive"><span id="in"><span id="bot_profile">M</span><span id="bot_name">Mutroduce 챗봇</span><p><span id="result">' + 
														   results +'</span></span></div><br><br>');
				// 스크롤해서 올리기										   
				$("#chatBox").scrollTop($("#chatBox").prop("scrollHeight"));			
			},
			error:function(){
				alert("오류가 발생했습니다.") 
			}
		});
	}
});

$(document).ready(function() {
    $("#openPop").click(function() {
        $("#popUp").fadeIn();
        $("#modal").fadeIn();
    });

    $("#btnClose").click(function(){
        $("#popUp").fadeOut();
        $("#modal").fadeOut();
    });
});



