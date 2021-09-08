// 비교연산자(comparison operator)

const a= 1;
const b= 3;

console.log(a===b);

const isEqual = (x,y)=>{
    return x===y;
};

console.log(isEqual(1,1));
console.log(isEqual('ab','ab'));
console.log('ab'=='ab');

console.log(Math.floor(2.4))
console.log(Math.ceil)

const ulEl = document.querySelector('ul');

for(let i=0;i<7;i+=1){
    const li = document.createElement('li');
    li.textContent = `list-${i+1}`
    if(i%2)
    li.addEventListener('click', ()=>{
        console.log(li.textContent);

    })
    ulEl.appendChild(li);
}

let name = prompt('name ? ', 0);
alert(name)
