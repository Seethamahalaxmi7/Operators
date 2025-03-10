class Counter {
    private int value;

    // Constructor
    public Counter(int value) {
        this.value = value;
    }

    // Prefix Increment (++x)
    public Counter increment() {
        ++value;
        return this; // Returning 'this' to allow method chaining
    }

    // Postfix Increment (x++)
    public Counter incrementPost() {
        Counter temp = new Counter(this.value);
        this.value++;
        return temp;
    }

    // Prefix Decrement (--x)
    public Counter decrement() {
        --value;
        return this;
    }

    // Postfix Decrement (x--)
    public Counter decrementPost() {
        Counter temp = new Counter(this.value);
        this.value--;
        return temp;
    }

    // Display method
    public void show() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        Counter c = new Counter(5);

        System.out.print("Initial Value: ");
        c.show();

        c.increment();  // Prefix increment (++c)
        System.out.print("After Prefix Increment (++c): ");
        c.show();

        Counter temp = c.incrementPost();  // Postfix increment (c++)
        System.out.print("After Postfix Increment (c++), previous value: ");
        temp.show();
        System.out.print("Current Value: ");
        c.show();

        c.decrement();  // Prefix decrement (--c)
        System.out.print("After Prefix Decrement (--c): ");
        c.show();

        temp = c.decrementPost();  // Postfix decrement (c--)
        System.out.print("After Postfix Decrement (c--), previous value: ");
        temp.show();
        System.out.print("Current Value: ");
        c.show();
    }
}
