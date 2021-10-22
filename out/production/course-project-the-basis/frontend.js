function darkMode() {
    const element = document.body;
    element.classList.toggle("dark-mode");
    if (document.getElementById("darkmode_button").innerText === 'Toggle dark mode'){
        document.getElementById("darkmode_button").innerText = 'Toggle light mode';
    }
    else{
        document.getElementById("darkmode_button").innerText = 'Toggle dark mode';
    }
}
function calculate(){
}
