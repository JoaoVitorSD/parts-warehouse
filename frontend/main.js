function submitForm(){
    fetch("http://localhost:8080/part/insert", {method:"POST",
        headers: { 'content-type': 'application/json' },
    body: new Part().getBody()} )
}

var button = document.getElementById("part-submit-button");
button.addEventListener("click", submitForm);