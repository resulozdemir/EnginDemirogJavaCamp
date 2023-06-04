package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="brands")  //veritabanında hangi tabloya karsılık gelecegini yazıyoruz
@Data  //getterları, setterları ve bos consturctoru otomatık olusturur
@AllArgsConstructor  //dolu constructoru olusturur
@Entity  //sen bir veritabanı varlıgısın senin getterlerin setterların var ayrıca tablo olarak buna karsılık geliyorsun demek
@Getter //bu sekilde yazarsan sadece getterları olusturur
@NoArgsConstructor //parametresiz constuctor olusturur

public class Brand {
    @Id  //veritabanında primary key oldugunu gosterir
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //veritabanındaki id kısmını bir bir otomatik olarak arttır
    @Column(name="id")   //veritabanındaki is isimli kolona karşılık geliyor
    private int id;
    @Column(name="name")  //veritabanındaki name isimli kolona karşılık geliyor
    private String name;
}
