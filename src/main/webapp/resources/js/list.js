function restProductList(){
    fetch("http://localhost:8081/REST/api/products")
        .then(function (response){
            console.log(response)
            if(!response.ok){
                throw new Error("Network response was not ok");
            }
            return response.json();
        })
        .then(function (products){
            console.log(products);
        })
        .catch(function (error){
            console.log("error", error);
        });
}