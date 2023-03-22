package polymorphism;

public class Main {
    public static void main(String[] args) {
       /* BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(), new DatabaseLogger()};

        for(BaseLogger logger : loggers){
            logger.Log("Log mesajı");
        }
*/
        CustomerMenager customerMenager = new CustomerMenager(new DatabaseLogger());
        customerMenager.add();

    }

}
