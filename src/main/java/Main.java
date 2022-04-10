public class Main {
    public static void main(String[] args) {
        Person dad = new PersonBuilder()
                .setName("Игорь")
                .setSurname("Литвинов")
                .setAge(25)
                .setAddress("Рязань")
                .build();
        System.out.println(dad);
        Person son = dad.newChildBuilder()
                .setName("Ванюша")
                .setAge(7)
                .build();
        System.out.println(son.hasAge());
        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            new PersonBuilder().setName("Иван").setSurname("Иванов").setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}
