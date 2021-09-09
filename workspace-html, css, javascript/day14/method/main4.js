// 타이머 함수

// 1000 1초
// const timer = setTimeout(_ => {
//     console.log('sangok');
// }, 1000);
// const h1El = document.querySelector('h1');
// h1El.onclick=_=>clearTimeout(timer);

// //콜백함수(Callback) : 함수의 인수로 사용되는 함수.
// const timeout=(call)=>{
//     setTimeout(() => {
//         console.log('sdfsd')
//         call();
//     }, 1000);
// }

// timeout(()=>{
//     console.log('Done')
// })

const timer={
    name:"dada",
    timeout:setInterval(()=>{
        console.log("aa");
    }
    ,1000),
}
clearInterval(timer.timeout);

class Vehicle{
    constructor(name,wheel){

    }
}
class Bicycle extends Vehicle{
    constructor(name,wheel){
        super(name,wheel);
    }
}