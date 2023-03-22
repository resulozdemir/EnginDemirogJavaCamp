package polymorphism;

public class CustomerMenager {
    private BaseLogger baseLogger;

    public CustomerMenager(BaseLogger baseLogger){
        this.baseLogger = baseLogger;
    }

    public void add(){
        System.out.println("Müşteri eklendi");
        this.baseLogger.log("Log mesajı");
    }
}
