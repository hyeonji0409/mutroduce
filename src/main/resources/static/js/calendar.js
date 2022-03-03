/*
document.addEventListener('DOMContentLoaded', function () {
    // var calendarEl = document.getElementById('calendar');
    var calendarEl = $('#calendar')[0];

    var calendar = new FullCalendar.Calendar(calendarEl, {
        expandRows: true,
        headerToolbar: {
            left: "prev title next",
            right: 'dayGridMonth, listWeek'
        },
        initialView: 'dayGridMonth',
        timeZone: 'UTC',
        fixedWeekCount: false, // 해당 월의 주 만큼만 보여주기
        navLinks: false, // 날짜 누르면 해당 날짜의 일정 보여주게
        navLinkDayClick: function (date, jsEvent) {
            console.log("day", date.toISOString());
            console.log('coords', jsEvent.pageX, jsEvent.pageY)
        },
        dayMaxEvents: true, // 일정이 많을 경우 + more로 표기됨
        locale: 'ko',
        selectMirror: true,
        // 이벤트명 : function(){} : 각 날짜에 대한 이벤트를 통해 처리할 내용
        select: function(arg){
            console.log(arg);

            var title = prompt("입력할 일정: ");
            // title 값 있을 때, 화면에 calendar.addEvent() json 형식의 일정 추가
            if(title) {
                calendar.addEvent({
                    title: title,
                    start: arg.start,
                    end: arg.end,
                    allDay: arg.allDay
                })
            }
            calendar.unselect()
        },
        eventClick: function (arg) {
            // 있는 일정 클릭 시,
            console.log("#등록된 일정 클릭#");
            console.log(arg.event);
        },
        events: [
            {
                title: '지킬앤하이드 12차',
                start: '2022-02-14T14:00',
                url: 'https://tickets.interpark.com/goods/21007693'
            },
            {
                title: '하데스타운',
                start: '2022-02-14T17:00',
                url: 'https://tickets.interpark.com/goods/21007693'
            },
            {
                title: '데스노트',
                start: '2022-02-17T15:00',
                url: 'https://tickets.interpark.com/goods/21007693'
            },
            {
                title: '데스노트',
                start: '2022-02-18T15:00',
                url: 'https://tickets.interpark.com/goods/21007693'
            },
            {
                title: '젠틀맨스가이드',
                start: '2022-02-22',
                url: 'https://tickets.interpark.com/goods/21007693'
            },
            {
                title: '젠틀맨스가이드',
                start: '2022-02-25',
                url: 'https://tickets.interpark.com/goods/21007693'
            },

        ]
    });
    calendar.render();
});*/

$(function(){
    var request = $.ajax({
        url: "/ticketPlan",
        method: "GET",
        dataType: "json"
    });

    request.done(function(data){
        console.log(data);

        var calendarEl = document.getElementById('calendar');

        var calendar = new FullCalendar.Calendar(calendarEl, {
            expandRows: true,
            headerToolbar: {
                left: "prev title next",
                right: 'today, dayGridMonth, listWeek'
            },
            initialView: 'dayGridMonth',
            timeZone: 'UTC',
            fixedWeekCount: false, // 해당 월의 주 만큼만 보여주기
            navLinks: false, // 날짜 누르면 해당 날짜의 일정 보여주게
            navLinkDayClick: function (date, jsEvent) {
                console.log("day", date.toISOString());
                console.log('coords', jsEvent.pageX, jsEvent.pageY)
            },
            dayMaxEvents: true, // 일정이 많을 경우 + more로 표기됨
            locale: 'ko',
            selectMirror: true,
            // 이벤트명 : function(){} : 각 날짜에 대한 이벤트를 통해 처리할 내용
            select: function(arg){
                console.log(arg);

                var title = prompt("입력할 일정: ");
                // title 값 있을 때, 화면에 calendar.addEvent() json 형식의 일정 추가
                if(title) {
                    calendar.addEvent({
                        title: title,
                        start: arg.start,
                        end: arg.end,
                        allDay: arg.allDay
                    })
                }
                calendar.unselect()
            },
            eventClick: function (arg) {
                // 있는 일정 클릭 시,
                console.log("#등록된 일정 클릭#");
                console.log(arg.event);
            },
            events: data
        });

        calendar.render();
    });

    request.fail(function(jqXHR, textStatus){
        alert("Request failed" + textStatus);
    });
});