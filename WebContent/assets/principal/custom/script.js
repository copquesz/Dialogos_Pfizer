(function () {
    
    var a1 = document.getElementById('a1'); 
    var a2 = document.getElementById('a2'); 
    var a3 = document.getElementById('a3'); 
    var a4 = document.getElementById('a4'); 
    var a5 = document.getElementById('a5'); 
    var a6 = document.getElementById('a6');
    var a7 = document.getElementById('a7'); 
    window.addEventListener('scroll', function () {
        if (window.scrollY > 0){ 
            a1.classList.add('text-custom'); 
            a2.classList.add('text-custom'); 
            a3.classList.add('text-custom'); 
            a4.classList.add('text-custom'); 
            a5.classList.add('text-custom'); 
            a6.classList.add('text-custom'); 
            a7.classList.add('text-custom'); 
        }
        else{
         a1.classList.remove('text-custom');
         a2.classList.remove('text-custom');
         a3.classList.remove('text-custom');
         a4.classList.remove('text-custom');
         a5.classList.remove('text-custom');
         a6.classList.remove('text-custom');
         a7.classList.remove('text-custom');

        }
    });
})();