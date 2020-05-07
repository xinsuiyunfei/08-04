import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonServiceBean {
    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    PersonDao personDao;

    public  static void main(String[]args){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("application.xml");
        PersonServiceBean personServiceBean = (PersonServiceBean) applicationContext.getBean("personServiceBean");
        personServiceBean.personDao.save();
    }
}
