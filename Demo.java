class Demo {
    private Demo() {
        System.out.println("Private Constructor Called");
    }
    void createObject(){
        System.out.println("hii");
    }

    public static void main(String[] args) {

        Demo d1 = new Demo();
        d1.createObject();
    }
}