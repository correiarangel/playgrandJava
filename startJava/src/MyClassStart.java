
public class MyClassStart {
    private String name;
    private String lastName;
    
    public MyClassStart(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
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

    public void showNameComplit() {
        String  n = name.concat(" ").concat(lastName);
        System.out.println("Name Complet:"+n);
    }
}


