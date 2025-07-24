public class Leaf implements Composite{

    private String name;


    public Leaf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void openFile() {

    }

    @Override
    public void createNewFile() {

    }

    @Override
    public void removeFile() {

    }
}
