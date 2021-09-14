$('#platform').click(
    _=>{
        $('#mainPage').load('ICE01.html');
        console.log('clicked!');
    }
);
$('#campaign').click(
    _=>{
        $('#mainPage').load('ICE02.html');
        console.log('clicked!');
    }
)
$('#sport').click(
    _=>{
        $('#mainPage').load('Sports-ICT.html');
        console.log('clicked!');
    }
)
$('#energy').click(
    _=>{
        $('#mainPage').load('Energy-ICT.html');
        console.log('clicked!');
    }
)
$('#ids').click(
    _=>{
        $('#mainPage').load('ids.html');
        console.log('clicked!');
    }
)
$('#ics').click(
    _=>{
        $('#mainPage').load('ics.html');
        console.log('clicked!');
    }
)
$('#sign').click(
    _=>{
        $('#mainPage').load('index.html');
        console.log('clicked!');
    }
)
$('#tel').click(
    _=>{
        $('#mainPage').load('index2.html');
        console.log('clicked!');
    }
)















$('.nav-item:first').hover(
    _=>{
        $('#navbarDropdownMenuLink1').addClass('show');
        $('#navbarDropdownMenuLink1').attr('aria-expanded','true');
        $('.Nav-dropdown-menu').addClass('show');
    },
    _=>{
        $('#navbarDropdownMenuLink1').removeClass('show');
        $('#navbarDropdownMenuLink1').attr('aria-expanded','false');
        $('.Nav-dropdown-menu').removeClass('show');
    }
);
$('.nav-item:nth(2)').hover(
    _=>{
        $('#navbarDropdownMenuLink').addClass('show');
        $('#navbarDropdownMenuLink').attr('aria-expanded','true');
        $('.nav-item:nth(2) > ul').addClass('show');
    },
    _=>{
        $('#navbarDropdownMenuLink').removeClass('show');
        $('#navbarDropdownMenuLink').attr('aria-expanded','false');
        $('.nav-item:nth(2) > ul').removeClass('show');
    }
);