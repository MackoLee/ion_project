//구구단
const gu = document.getElementById("gugudan");

let tr=document.createElement('tr');
for(let i=2;i<6;i++){
    const td=document.createElement('td');
    td.innerHTML=i + '단';
    tr.appendChild(td)
}
gu.appendChild(tr);

for(let n=1;n<10;n++){
    tr=document.createElement('tr');
    for(let i=2;i<6;i++){
        const td=document.createElement('td');
        td.innerHTML=`${i} * ${n} = ${i*n}`;
        tr.appendChild(td)
    }
    gu.appendChild(tr);
}
tr=document.createElement('tr');
for(let i=6;i<10;i++){
    const td=document.createElement('td');
    td.innerHTML=i + '단';
    tr.appendChild(td)
}
gu.appendChild(tr);

for(let n=1;n<10;n++){
    tr=document.createElement('tr');
    for(let i=6;i<10;i++){
        const td=document.createElement('td');
        td.innerHTML=`${i} * ${n} = ${i*n}`;
        tr.appendChild(td)
    }
    gu.appendChild(tr);
}

function input(){
    let num = 1*prompt("숫자를 입력해 주세요.")+55;
    if(num%2==1) num+=22;//들어온게 짝수라면, 55가 더해져서 홀수가됨.
    console.log(num);
    const e=document.getElementById('result');
    console.log(e)
    e.innerHTML="결과 : " + num;
};