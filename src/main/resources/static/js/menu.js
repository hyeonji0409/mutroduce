$(function () {
    $('#topMenuItem>li').mouseover(function () {
        $(this).children(".sub").stop().slideDown();
    });
    $('#topMenuItem>li').mouseleave(function () {
        $(this).children(".sub").stop().slideUp();
    });

    // var currentPosition= parseInt($("#chatBtn").css("top"));

    /*$(window).scroll(function(){
        var position = $(window).scrollTop();
        $('#chatBtn').stop().animate({"top":position+currentPosition+"px"},1000);
    });*/
})