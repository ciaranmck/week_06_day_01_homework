public class Person {

  private String name;
  private Book[] book;
  private Library library;

  public Person(String name) {
    this.name = name;
    this.book = new Book[1];
    this.library = new Library(name);
  }

  public String getName() {
    return this.name;
  }

  public void withdrawBook() {
   book = this.book
   library = this.library;

  }

  public int bookCount() {
    int numberOfBooks = 0;

    for (Book book : this.book) {
      if (book != null) {
        numberOfBooks++;
      }
    }
    return numberOfBooks;
  }

  // public void loan(Book book) {
  //   int index = bookCount();
  //   this.loan[index] = book;
  // }

}

