package exercise;

import java.util.Objects;

public class Book {
    private static String type = "NOT_ALIVE";
    private String name;
    private Author author;
    private int year;

    /**
    * @return Book name
    */
    public String getName() {
        return name;
    }

    /**
    * @return Name of book author
    */
    public Author getAuthor() {
        return author;
    }

    /**
    * @return Year of book
    */
    public int getYear() {
        return year;
    }

    /**
    * Set book name.
    * @param bookName
    */
    public void setName(String bookName) {
        this.name = bookName;
    }

    /**
    * Set author of the book.
    * @param bookAuthor
    */
    public void setAuthor(Author bookAuthor) {
        this.author = bookAuthor;
    }

    /**
    * Set year of the book.
    * @param bookYear
    */
    public void setYear(int bookYear) {
        this.year = bookYear;
    }

    /**
    * Print info about book.
    */
    public void printInfo() {
        System.out.println("Book " + getName() + " was written by " + getAuthor() + " in " + getYear());
    }

    public static void printInfo(Book book) {
        System.out.println("Book " + book.getName() + " was written by " + book.getAuthor() + " in " + book.getYear());
    }

    /**
    * @return String representation of book
    */
    @Override
    public String toString() {
        return "Book{"
                + "name='" + name + '\''
                + ", author=" + author
                + ", year=" + year
                + '}';
    }

    /**
    * @return If current book equals another book
    */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return getYear() == book.getYear()
            && getName().equals(book.getName())
            && getAuthor().equals(book.getAuthor());
    }

    /**
    * @return hash code
    */
    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }
}
