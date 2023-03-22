package overriding;

public class OgrenciKrediMenager extends BaseKrediMenager{
    @Override
    public double hesapla(double tutar){
         return tutar * 1.10;
     }
}
