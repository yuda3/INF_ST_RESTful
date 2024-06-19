function restProductDetails(product_number){

    fetch("http://localhost:8081/REST/api/products/"+product_number)
        .then(response => response.json())
        .then(function (product){
            let productDetails = document.getElementById("productDetails");
            productDetails.innerHTML="";
            let tmpHtml = "<table class='table table-bordered'>";
            tmpHtml += "<tr>";
            tmpHtml += "<td>Product Number</td>";
            tmpHtml += "<td>"+ product.product_number+"</td>";
            tmpHtml += "</tr>";
            tmpHtml += "<tr>";
            tmpHtml += "<td>Product Name</td>";
            tmpHtml += "<td>"+ product.product_name + "</td>";
            tmpHtml += "</tr>";
            tmpHtml += "<tr>";
            tmpHtml += "<td>Product Inventory</td>";
            tmpHtml += "<td>" + product.inventory + "</td>";
            tmpHtml += "</tr>";
            tmpHtml += "<tr>";
            tmpHtml += "<td>Product Price</td>";
            tmpHtml += "<td>"+ product.price+"</td>";
            tmpHtml += "</tr>";
            tmpHtml += "<tr>";
            tmpHtml += "<td>Product Manufacturer</td>";
            tmpHtml += "<td>"+ product.manufacturer+"</td>";
            tmpHtml += "</tr>";
            tmpHtml +="</table>";

            productDetails.innerHTML=tmpHtml;

        })
        .catch(function (error){
            console.log("error", error);
        });

}

