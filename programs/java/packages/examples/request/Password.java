package exercise.request;

import java.util.Objects;

public class Password {
    private String password;
    private String confirmation;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Password)) {
            return false;
        }
        Password password1 = (Password) o;
        return getPassword().equals(password1.getPassword())
            && getConfirmation().equals(password1.getConfirmation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPassword(), getConfirmation());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Password{");
        sb.append("password='").append(password).append('\'');
        sb.append(", confirmation='").append(confirmation).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
