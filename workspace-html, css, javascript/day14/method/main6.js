const str = 'sangok1993@naver.com';
console.log(str.match(/.+(?=@)/))

const pi=Math.PI;
const s1 = pi.toFixed(2);

console.log(s1);

//배열

const cars = ["Saab","Volvo","BMW"];
const numbers = [1,2,3];
console.log(numbers);
console.log(cars);

const array1= [5, 130, 12, 8]

console.log(array1.find(a=>a>8));

const arrSu = cars.forEach((car,i)=>{
    return `${car} - ${i}`;
})

console.log(arrSu);

const arrSu2 = cars.map((car,i)=>`${car} - ${i}`)

console.log(arrSu2);

// let a =new Date().getTime();
// function start(){
//     console.log(a);
//     const timeout=setTimeout(() => {
//             console.log(a);
//             console.log('sdfsd');
//         }, 1000);
// }

let startTime, stopTime

let studyTime = ()=>stopTime-startTime ;

const start=()=>{
    let st = document.getElementById("page")

    setTimeout(()=>{
        startTime = new Date().getTime()
        st.innerHTML = startTime.toString();
    }, 500)
}
//console.log(startTime)
function stop(){
    let sp = document.getElementById("page")
    stopTime = new Date().getTime();
    

    //sp.innerHTML = Number(studyTime.toString()) + "<br>"
    console.log(studyTime());

    
    /* setTimeout(function(){
        stopTime = new Date();
        sp.innerHTML = stopTime.toString();
    }, 500) */
}
