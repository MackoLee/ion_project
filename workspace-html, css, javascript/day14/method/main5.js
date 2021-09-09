// new ClassName(1,2,{

// });

// const ClassName = (first, last)=>{
//     firstName : first,
//     lastName : last,
//     getFullName : function(){return this.firstName+this.lastName},
// }

// console.log(ClassName.getFullName());

// const name

// function user(first, last){
//     this.firstName=first;
//     this.lastName=last;
// }

// const yuna = new user('sangok','lee');
// console.log(yuna);

function user(first, last){
    this.firstName=first;
    this.lastName=last;
    user.prototype.getFullName = function(){return this.firstName+this.lastName};
}

const name =new user("asss","bsss");
console.log(name.getFullName());

const timer = time