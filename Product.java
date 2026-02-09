class Product {
    public int multiply(int x, int y) { // Method 1
        int prod = x * y;
        return prod;
    }

    public int multiply(int x, int y, int z) { // Method 2 with a different number of arguments
        int prod = x * y * z;
        return prod;
    }

    public static void main(String args[]) {
        Product ob = new Product();
        System.out.println("Product of two values: " + ob.multiply(10, 20));
        System.out.println("Product of three values: " + ob.multiply(10, 20, 30));
    }
}
	