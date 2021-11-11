public class SiteManager implements Cloneable{
    public String name;
    public String lastName;
    public int age;
    public Experience experience;

    @Override
    public Object clone () throws CloneNotSupportedException {
        return super.clone();
    }

    public SiteManager(String name, String lastName, int age, Experience experience) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "SiteManager{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }
}
