/* wether_location.js */

window.onload = function (){
    const apiKey = "d7e9764b7307ef0c9cb8957298ca4b17";
    let apiUrl = `https:/api.openweathermap.org/data/2.5/weather?appid=${apiKey}&lang=kr`;

    const getLocation = async () => {
        return new Promise((resolve, reject) => {
            navigator.geolocation.getCurrentPosition(resolve, reject);
        });
    };

    const requestWeather = async () => {
        try {
            const {
                coords: {latitude, longitude},
            } = await getLocation();
            apiUrl += `&lat=${latitude}&lon=${longitude}`;
        } catch (error) {
            apiUrl += "&q=Seoul";
        }

        // API 호출
        const res = await fetch(apiUrl);
        // JSON 파싱
        const json = await res.json();

        const{
            weather: [{main:weather}],
        } = json;
        console.log(`API 호출 결과 : $(weather)`);
        return weather;
    };

    const init = async () => {
        let weather = sessionStorage.getItem("weather");
        if(weather == null){
            // API 호출
            weather = await requestWeather();
            // SessionStorage에 저장
            sessionStorage.setItem("weather", weather);
        }

        `select * from weathernumber where weather =?`

        // sky is clear, few clouds, scattered clouds, broken clouds, overcast clouds, shower rain, light rain, moderate rain, Thunderstorm, snow, mist
        if(weather === "Rain"){
            console.log("Rain");
        } else if(weather === "Snow"){
            console.log("Snow")
        }else {
            console.log(weather);
        }

        $.ajax({
            url: 'index2.jsp', // 날씨 값 뿌려줄 페이지
            method: 'post',
            data: {
                weather: 'weather' // dbGet 페이지로 js의 weather값 보냄
            },
            success: function(res){
                console.log($.trim(res));
            }
        })
    };
    init();

}