public class Library {

  private String name;
  private Book[] stock;

  public Library(String name) {
    this.name = name;
    this.stock = new Book[10];
  }

  public int bookCount() {
    int numberOfBooks = 0;

    for (Book book : this.stock) {
      if (book != null) {
        numberOfBooks++;
      }
    }
    return numberOfBooks;
  }

  public void add(Book book) {
    int index = bookCount();
    this.stock[index] = book;
  }

  public boolean isLibraryFull() {
    return bookCount() == this.stock.length;
  }
}