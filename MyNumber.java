class MyNumber {
    private int value;

    public MyNumber(int value) {
        this.value = value;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; 
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; 
        }
        MyNumber other = (MyNumber) obj;
        return this.value == other.value; 
    }

    
    @Override
    public int hashCode() {
        return Integer.hashCode(value);
    }

    public boolean notEquals(MyNumber other) {
        return !this.equals(other);
    }

    // Display method
    public void show() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        MyNumber num1 = new MyNumber(5);
        MyNumber num2 = new MyNumber(5);
        MyNumber num3 = new MyNumber(10);

        System.out.println("num1 == num2: " + num1.equals(num2)); 
        System.out.println("num1 != num3: " + num1.notEquals(num3)); 
                System.out.println("num2 != num3: " + num2.notEquals(num3)); 
        System.out.println("num1 == num3: " + num1.equals(num3)); 
    }
}
