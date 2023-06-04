package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductMenager{
    private ProductDao productDao;  /*Sadece interfaceye bağımlı olsun diye bu şekilde yaptık
    aşağıdaki constructora ne gönderirsek o ProductDao çalışacak de diğer classlara
    bağımlılıkları olmayacak*/
    private Logger[] loggers;

    public ProductMenager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {

        //iş kuralları
        if(product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");  //yeni hata fırlat
            //hata fırlattıgı zaman uygulama durur
        }

        //ProductDao productDao = new HibernateProductDao();
        //YANLIS KULLANIM CLASSA BAGIMLILIGI VAR
        productDao.add(product);

        for(Logger logger : loggers){  //[database,file,mail]
            logger.log(product.getName());
        }
    }

}
