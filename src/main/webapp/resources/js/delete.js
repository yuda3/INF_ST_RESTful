function goDel(product_number){
    let deleteUrl = "http://localhost:8081/REST/api/products/" + product_number;
    fetch(deleteUrl, {
        method : "DELETE"
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