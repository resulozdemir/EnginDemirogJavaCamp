package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product){
        //sadece database erişim kodları buraya yazılır.
        System.out.println("Jdbc ile veritabanına eklendi");
    }
}
