public class PersonBuilder {

    protected  String name;
    protected String surname;
    protected int age;
    protected String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder setAge (int age){
            this.age = age;
            return this;
        }

        public PersonBuilder setAddress (String address){
            this.address = address;
            return this;
        }

        public String getName () {
            return name;
        }

        public String getSurname () {
            return surname;
        }

        public int getAge () {
            return age;
        }

        public String getAddress () {
            return address;
        }

        public Person build () {
            if (name == null || surname == null)
                throw new IllegalStateException("Не введены обязательные данные");
            if(age > 120 || age < 0)
                throw new IllegalArgumentException("Введен некорректный возраст");
            return new Person(name, surname, age, address);
        }

}
