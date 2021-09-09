function Emp(id, name){
    this.id=id;
    this.name=name;
    this.output=()=>{
        console.log("Employ"+id +": "+name);
    }
}
const emp1 = new Emp(1,"이상옥");
const emp2 = new Emp(2,"이윤건");
emp1.output();
emp2.output();