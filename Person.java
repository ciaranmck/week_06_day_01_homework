public class Person {

  private String name;
  private Book[] loan;

  public Person(String name) {
    this.name = name;
    this.loan = new Book[1];
  }

  public String getName() {
    return this.name;
  }

  public int bookCount() {
    int numberOfBooks = 0;

    for (Book book : this.loan) {
      if (book != null) {
        numberOfBooks++;
      }
    }
    return numberOfBooks;
  }

  public void loan(Book book) {
    int index = bookCount();
    this.loan[index] = book;
  }

}

