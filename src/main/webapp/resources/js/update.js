function goUpdate(product_number){
    location.href="/REST/update/" + product_number;
}

function goSubmit(product_number){
    let product_name = document.getElementById("product_name").value;
    let inventory = parseInt(document.getElementById("inventory").value);
    let price = parseFloat(document.getElementById("price").value);

    let formData = {
        product_number : product_number,
        product_name : product_name,
        inventory : inventory,
        price : price
    };

    fetch("http://localhost:8081/REST/api/products/" + product_number,{
        method: "PUT",
        headers:{
            "Content-Type": "application/json"
        },
        body : JSON.stringify(formData)
    })
        .then(function (response){
            if(!response.ok){
                throw new Error("Network response was not ok");
            }
            location.href="/REST/list";
        })
        .catch(function (error){
            console.log("error",error);
        });
}