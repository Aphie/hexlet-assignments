package exercise.stack;

public class Stack {
    private Character[] arr;
    private int size;

    public Stack() {
        this.arr = new Character[20];
        this.size = 0;
    }

    public void put(Character s) {
        this.arr[this.size] = s;
        this.size++;
    }

    public Character pop() {
        return this.arr[this.size - 1];
    }

    public void delete() {
        this.arr[this.size - 1] = null;
        this.size--;
    }

    public int getSize() {
        return size;
    }
}
