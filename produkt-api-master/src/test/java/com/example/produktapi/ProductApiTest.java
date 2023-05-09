package com.example.produktapi;


import com.example.produktapi.model.Product;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductApiTest {


   // Product iproduct = new Product("product1", 32.00, "category1", "descriåtopm", "imagePath");
    Product product= new Product();


        @Test
        public void compareTitle(){
            product.setTitle("abcd");
            Assert.assertEquals("abcd",product.getTitle());
        }
        @Test
        public void testGetID(){
            product.setId(101);
            Assert.assertEquals(Integer.valueOf(101),product.getId());
        }
        @Test
        public void testGetPrice(){
            product.setPrice(200.00);
            Assert.assertEquals(Double.valueOf(200.00),product.getPrice());
        }
        @Test
        public void testGetCategory(){
            product.setCategory("clothes");
            Assert.assertEquals("clothes",product.getCategory());
        }
        @Test
        public void testGetImage(){
            product.setImage("https://fakestoreapi.com/img/51Y5NI-I5jL._AC_UX679_.jpg");
            Assert.assertEquals("https://fakestoreapi.com/img/51Y5NI-I5jL._AC_UX679_.jpg",product.getImage());
        }
        @Test
        public void testGetDescription(){
            product.setDescription("sldjdsfvndlkvnfdlvjfjl");
            Assert.assertEquals("sldjdsfvndlkvnfdlvjfjl",product.getDescription());
        }
        @Test
        public void getAllProducts(){
            List<Product> products = new ArrayList<>();
            products.add(new Product("Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",109.95,"Fin väska me plats för dator","men's clothing","https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg"));
            products.add(new Product("Mens Casual Premium Slim Fit T-Shirts",22.3,"Vilken härlig t-shirt, slim fit o casual i ett!","men''s clothing","https://fakestoreapi.com/img/71-3HjGNDUL._AC_SY879._SX._UX._SY._UY_.jpg"));

        }

    /*
Här kommer ett förslag på enhetstester för ProductService:



getAllProducts():
- Ska returnera minst en produkt.
- Ska returnerna exakt 20 produkter



getAllCategories():
- Ska returnera minst en kategori
- Ska returnera exakt 4 kategorier



getProductsByCategory():
- "jewlery" ska returnera 4 produkter
- "electronics" ska returnera 6 produkter
- "invalid category" ska returnera 0 produkter
- "" ska returnera 0 produkter
- [null] ska generera ett exception



getProductById():
- 1 ska returnera "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops"
- 0 ska returnera "Produkt med id 0 hittades inte"
- 100 ska returnera "Produkt med id 100 hittades inte"
- 2147483647 ska returnera "Produkt med id 2147483647 hittades inte"
- 2147483648 ska generera ett exception



addProduct():
- [null] ska generera ett exception
- product.title = "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops" ska returnera "En produkt med titeln: Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops finns redan"
- product.title = "This is a new product" ska returnera en ny produkt, med product.id = 21



updateProduct():
- product.title = "Fjallraven" och id = 1 ska returnera produkt med product.title = "Fjallraven"
- product.title = "Invalid id" och id = -1 ska generera EntityNotFoundException
- product.title = "Invalid id" och id = 2147483648 ska generera ett exception



deleteProduct():
- id = 21 ska ta bort produkten (getAllProducts() ska returnera 20)
- id = -1 ska generera EntityNotFoundException
- id = 2147483648 ska generera ett exception

    @Test
    void validateGetProductId() {
        System.out.println(product.getTitle());
    }




























     */

}

