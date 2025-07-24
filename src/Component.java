import java.util.List;

public class Component implements Composite{

    private String name;

    private List<Object> objetsGroup;

    public Component(String name, List<Object> objetsGroup) {
        this.name = name;
        this.objetsGroup = objetsGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getObjetsGroup() {
        return objetsGroup;
    }

    public void setObjetsGroup(List<Object> objetsGroup) {
        this.objetsGroup = objetsGroup;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", objetsGroup=" + objetsGroup +
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
