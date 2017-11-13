import com.bazyl.preparing.model.Contact;
import com.bazyl.preparing.model.ContactBook;
import com.bazyl.preparing.model.NicknameAlreadyExistException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NicknameAddingTest {

  Contact contact1;
  Contact contact2;
  Contact contact3;
  ContactBook contactBook;

  @Before
  public void init() {
    contact1 = new Contact();
    contact2 = new Contact();
    contact3 = new Contact();
    contactBook = new ContactBook();

    contact1.setNickname("nick1");
    contact2.setNickname("nick2");
    contact3.setNickname("nick1");
  }

  @Test
  public void addSuccessfullyContactsTest() {
    try {
      contactBook.addContact(contact1);
      contactBook.addContact(contact2);
    } catch (NicknameAlreadyExistException e) {
      //must not get here
    }
  }

  @After
  public void addUnsuccessfullyContactsTest() {
    try {
      contactBook.addContact(contact3);
    } catch (NicknameAlreadyExistException e) {
      e.printStackTrace();
      System.out.println(e.toString());
    }
  }

}
