class Sum1 {
    // Method 1: Two parameters
    public int sum(int x, int y) {
        return x + y;
    }

    // Method 2: Three parameters
    public int sum(int x, int y, int z) {
        return x + y + z;
    }

    public static void main(String args[]) {
        Sum1 s = new Sum1();

        // Calling method with two parameters
        System.out.println("Sum of two values: " + s.sum(10, 20));

        // Calling method with three parameters
        System.out.println("Sum of three values: " + s.sum(10, 20, 30));
    }
}
