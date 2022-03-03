/*location_map.js*/

window.onload = function() {
    $('.mapImage').click(function(e){
        var id = e.target.getAttribute('id');
        if((id !== '')&&(id != null)){
            alert(id); // 선택한 구역의 아이디 값 받아옴
        }
    })


}