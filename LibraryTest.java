import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
  Library library;
  Book book;
  Person person;

  @Before
  public void before() {
    library = new Library("Edinburgh Library");
    book = new Book();
    person = new Person("Ciaran");
  }

  @Test
  public void libraryIsEmpty() {
    assertEquals(0, library.bookCount());
  }

  @Test
  public void addBooksToLibrary() {
    library.add(book);
    assertEquals(1, library.bookCount());
  }

  @Test
  public void checkLibraryIsFull() {
    for (int i = 0; i < 10; i++) {
      library.add(book);
    }
    assertEquals(true, library.isLibraryFull());
  }

  @Test
  public void hasName() {
    assertEquals("Ciaran", person.getName());
  }

  // @Test
  // public void loanBooktoPerson() {
  //   person.loan(book);
  //   assertEquals(1, person.bookCount());
  // }

  @Test
  public void withdrawBook() {
    for (int i = 0; i <= 1; i++) {
      person.withdrawBook();
    }
    assertEquals(1, person.bookCount());
  }







}