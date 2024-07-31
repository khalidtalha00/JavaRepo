public class ThisKeyWord {
    static class Dog {
        private String name;

        public String getname() {
           return this.name;
        }

        public void setname(String name) {
            this.name = name;

        }
    }

    public static void main(String[] args) {

        Dog mydog =new Dog();
        mydog.setname("Lucifer");
        System.out.println(mydog.getname());

    }
}
