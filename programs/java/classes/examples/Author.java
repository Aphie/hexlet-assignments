package exercise;

import java.util.Date;
import java.util.Objects;

public class Author {
    private static String type = "ALIVE";
    private String name;
    private Date birthDate;

    /**
    * @return Author name
    */
    public String getName() {
        return name;
    }

    /**
    * Set author name.
    * @param authorName
    */
    public void setName(String authorName) {
        this.name = authorName;
    }

    /**
    * @return author birthday.
    */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
    * Set author birthday.
    * @param authorBirthDate
    */
    public void setBirthDate(Date authorBirthDate) {
        this.birthDate = birthDate;
    }

    /**
    * @return Author name
    */
    public String toString() {
        return name;
    }

    /**
    * @return If current author equals another author
    */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Author)) {
            return false;
        }
        Author author = (Author) o;
        return getName().equals(author.getName())
            && getBirthDate().equals(author.getBirthDate());
    }

    /**
    * @return hash code
    */
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBirthDate());
    }
}
