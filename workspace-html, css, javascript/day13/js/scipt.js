let isShow = true;
let checked = false;

if(isShow){
    console.log('Show!!');
}
else{
    console.log('Hide!');
}
if(checked){
    console.log('Checked');
}
else{
    console.log('noneChecked');
}

const BOXE1= document.querySelector('.box');
// 이벤트에다가 상황을 넣는 경우
BOXE1.addEventListener('click', function(){
    alert('눌렀네요.');
});

const BoxEls=document.querySelectorAll('.box');
console.log(BoxEls);

BoxEls.forEach((el,index)=>{
    el.classList.add(`order-${index + 1}`);
});