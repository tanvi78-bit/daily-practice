class copyconstructor{
    int id;
    String name;
    copyconstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    copyconstructor(copyconstructor s) {
        this.id = s.id;
        this.name = s.name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        copyconstructor s1 = new copyconstructor(101, "Tanvi");

        copyconstructor s2 = new copyconstructor(s1);

        s1.display();
        s2.display();
    }
}