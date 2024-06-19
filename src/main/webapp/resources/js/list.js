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
            let productListTable = document.getElementById("productList");
            let tbody = productListTable.querySelector("tbody");
            tbody.innerHTML= "";
            products.forEach(function (product){
               let tr = document.createElement("tr");
               tr.innerHTML="<td>" + product.product_number + "</td>"+
                   "<td>" + product.product_name + "</td>"+
                   "<td>" + product.inventory + "</td>"+
                   "<td>" + product.price + "</td>"+
                   "<td>" + product.manufacturer + "</td>"
                tbody.appendChild(tr);
            });
        })
        .catch(function (error){
            console.log("error", error);
        });
}