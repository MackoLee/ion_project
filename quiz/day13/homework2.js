const blank=document.querySelector('.blank');

let ul = document.createElement('ul');
for(let i=0;i<10;i++){
    let li = document.createElement('li');
    ul.appendChild(li);
}
blank.appendChild(ul);

const buttons=document.getElementById('buttons');

const str = ['지우기','가로줄', '세로줄','왼대각선','우대각선'];
// 새선 그리기 설정
const canvas=document.getElementById('mycanvas');
const pen=canvas.getContext('2d');
//함수 설정.
const funcs = [
    ()=>{
        pen.clearRect(0,0,400,300);
    },
    ()=>{
        pen.beginPath();
        pen.moveTo(0,150);
        pen.lineTo(400,150);
        pen.stroke();
    },
    ()=>{
        pen.beginPath();
        pen.moveTo(200,0);
        pen.lineTo(200,300);
        pen.stroke();
    },
    ()=>{
        pen.beginPath();
        pen.moveTo(0,0);
        pen.lineTo(400,300);
        pen.stroke();
    },
    ()=>{
        pen.beginPath();
        pen.moveTo(0,300);
        pen.lineTo(400,0);
        pen.stroke();
    },
]
for(let i=0;i<5;i++){
    const button = document.createElement('button');
    button.innerHTML=str[i];
    button.onclick=funcs[i];
    buttons.appendChild(button);
}

const getDouble=()=>{
    let a = prompt("숫자를 입력해주세요");
    let doublea= doubleFunc(a);
    document.getElementById('double_result').innerHTML=doublea;
}

const doubleFunc = (a)=>{
    return a*2;
}