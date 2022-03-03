/**
 * 
 */
let tabList = document.getElementsByClassName('nav-item');
var contents = document.querySelectorAll('.tab-content');
console.log('>>>>>>>>>>', tabList, contents);

let activeCont = ''; // 현재 활성화 된 컨텐츠 (기본:#tab1 활성화)

	for ( var tmp in tabList){
	console.log("쿼리셀렉터 확인", tmp, tabList[tmp]);
}




/*for(var tmp in tabList){
  tabList[tmp].querySelector(".nav-link").addEventListener('click', function(e){
    e.preventDefault();
    for(var j = 0; j < tabList.length; j++){
      // 나머지 버튼 클래스 제거
      tabList[j].classList.remove('nav-item');

      // 나머지 컨텐츠 display:none 처리
      contents[j].style.display = 'none';
    }

    // 버튼 관련 이벤트
    this.parentNode.classList.add('nav-item');

    // 버튼 클릭시 컨텐츠 전환
    activeCont = this.getAttribute('href');
    document.querySelector(activeCont).style.display = 'block';
  });
}*/

