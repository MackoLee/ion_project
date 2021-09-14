
//jQuery() === $()
//$(document).ready(aa); 
//위와 같이 그냥 함수를 jquery에 덮어도 똑같은 결과가 나옴.
// $(function aa(){//간혹가다가 실행되지 않을 때도 있다.
//     alert("hello");
// });
//$('div > p').css("border","3px dotted red");
$('header p').css("border","3px dotted red");

$(".ui-widget").click(_=>{$("#name").hide()});

$('ul > li:first').fadeOut("slow");
