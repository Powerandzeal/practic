package Animals;

import java.time.LocalDate;

public abstract class Pet {
    private String name;
    private int birthYear;
    private String address;

    private String numPhone;

    public Pet(String name) {
        this(name,0);
    }

    public Pet(String name, int age) {
        setName(name);

        if (age >= 0) {
            this.birthYear = age;
        } else {
            this.birthYear = Math.abs(age);

        }
    }

    public void talk() {
        System.out.println("Im talking "+getName());
    }
    public abstract void eat();

    public String getName() {return name;}

    public final void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }
    }

    public int getAge() {return LocalDate.now().getYear() - birthYear;}



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(String numPhone) {
        this.numPhone = numPhone;
    }


}
