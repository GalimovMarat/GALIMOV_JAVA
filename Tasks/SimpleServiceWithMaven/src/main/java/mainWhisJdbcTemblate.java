import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repositories.UserRepository;
import utils.UserFromConsoleRetriever;

public class mainWhisJdbcTemblate {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        UserRepository userRepository = context.getBean(UserRepository.class);
        UserFromConsoleRetriever retriever = context.getBean(UserFromConsoleRetriever.class);

        userRepository.save(retriever.retrieveUser());
    }
}
