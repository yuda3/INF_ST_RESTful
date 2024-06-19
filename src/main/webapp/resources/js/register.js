function goRegister(){
    let product_name = document.getElementById('product_name').value;
    let inventory = parseInt(document.getElementById('inventory').value);
    let price = parseInt(document.getElementById('price').value);
    let manufacturer = document.getElementById('manufacturer').value;

    //JavaScript Object
    let formData = {
        "product_name" : product_name,
        "inventory" : inventory,
        "price" : price,
        "manufacturer" : manufacturer
    };

    fetch("http://localhost:8081/REST/api/products", {
        method:"POST",
        headers: {
            "Content-Type":"application/json"
        },
        body:JSON.stringify(formData)
    })
        .then(function (response){
            if(!response.ok){
                throw new Error("Network response was not ok");
            }
            location.href="/REST/list";
        })
        .catch(function (error){
            console.log("error", error);
        });

}