/**
 * 
 */
 
$(function() {
    //superMenu
    var menuBtn = document.querySelector('.menu-btn');
	var nav = document.querySelector('nav');
	var lineOne = document.querySelector('nav .menu-btn .line--1');
	var lineTwo = document.querySelector('nav .menu-btn .line--2');
	var lineThree = document.querySelector('nav .menu-btn .line--3');
	var link = document.querySelector('nav .nav-links');
	menuBtn.addEventListener('click', () => {
	    nav.classList.toggle('nav-open');
	    lineOne.classList.toggle('line-cross');
	    lineTwo.classList.toggle('line-fade-out');
	    lineThree.classList.toggle('line-cross');
	    link.classList.toggle('fade-in');
	});

    // subMenu
    $('.menu>a').click(function() {
        var hide = $(this).next('ul');
        if (hide.is(":visible")){
            hide.slideUp(500);
        } else {
            hide.slideDown(500);
        }
    });
});