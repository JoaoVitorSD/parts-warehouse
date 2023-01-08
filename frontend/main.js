async function submitForm(){
    const req =await fetch("http://localhost:8080/part/insert", {method:"POST", 
        headers: { 'content-type': 'application/json' },
    body: new Part().getBody()})
    if(req.status === 201){
        alert("Success")
    }else{
        alert("Error");
    }
}

var button = document.getElementById("part-submit-button");
button.addEventListener("click", submitForm);