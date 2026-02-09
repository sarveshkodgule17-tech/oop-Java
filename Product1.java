class Product1 {
    // Method 1: Three integer parameters
    public int prod(int a, int b, int c) {
        int prod1 = a * b * c;
        return prod1;
    }

    // Method 2: Three double parameters
    public double prod(double a, double b, double c) {
        double prod1 = a * b * c;
        return prod1;
    }

    public static void main(String args[]) {
        Product1 p = new Product1();

        // Call the integer method
        System.out.println("Product of three integer values: " + p.prod(1, 2, 3));

        // Call the double method
        System.out.println("Product of three double values: " + p.prod(10.5, 11.5, 19.5));
    }
}
