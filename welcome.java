class welcome {
    public static void main(String[] args) {
        swap(2, 3);
    }

    public static void swap(int a, int b) {
        System.out.println("before swapping " + a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("after swapping " + a + " " + b);
    }
}