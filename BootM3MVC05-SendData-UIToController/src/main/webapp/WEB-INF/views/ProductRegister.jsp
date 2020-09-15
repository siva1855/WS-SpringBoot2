<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<body>
	<h3>WELCOME TO PRODUCT REGISTER PAGE!!</h3>
	<form action="save" method="POST">
		<pre>
   Product ID    : <input type="text" name="productId" />
   Product Name  : <input type="text" name="productName" />
   Product Cost  : <input type="text" name="productCost" />
   Product Model :
                    <input type="radio" name="productModel" value="High"> High
                    <input type="radio" name="productModel" value="Mid"> Mid
                    <input type="radio" name="productModel" value="Low"> Low
   Product Description:
                    <textarea name="productDescription"></textarea>

   Product Color :  <select name="productColor">
                       <option>RED</option>
                       <option>GREEN</option>
                       <option>BLUE</option>
                   </select>
   Product Grade :  <input type="checkbox" name="productGrade" value="A"> A
                    <input type="checkbox" name="productGrade" value="B"> B
                    <input type="checkbox" name="productGrade" value="C"> C
                    <input type="checkbox" name="productGrade" value="D"> D
   product Brand : 
                   <select name="productBrand" multiple="multiple">
                       <option>REDMI</option>
                       <option>OPPO</option>
                       <option>VIVO</option>
                       <option>REALMI</option>
                   </select>
     <input type="submit" value="Add Product" />
        </pre>
	</form>
</body>
</html>