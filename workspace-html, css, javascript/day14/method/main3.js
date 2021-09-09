const scope = ()=>{
    if(true){
        const a = 123;
        console.log(a);
    }
}
scope();

const hap=(x,y)=>{
    console.log(eval(x+"+"+y));
}
console.log(hap);

const sum=()=>{
    console.log();
}

const doubleFn =(x,y)=> x*2;
console.log(doubleFn(3,2));
sum(1);

(function dqqu(){return 2;})();