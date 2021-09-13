
const searchEl = document.querySelector('.search');
const searchInputEl = document.querySelector('input');


searchEl.onclick= _=>{
    searchInputEl.focus()
}
searchInputEl.addEventListener('focusin',e=>{
    const search = document.querySelector('.material-icons-outlined')
    console.log(search)
    search.hidden=true;
});