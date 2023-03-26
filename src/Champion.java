public class Champion {

    private final String name;
    private final String gender;
    private final String role;
    private final String resource;
    private final String rangeType;


    public Champion(String name, String gender, String role, String resource, String rangeType) {
        this.name = name;
        this.gender = gender;
        this.role = role;
        this.resource = resource;
        this.rangeType = rangeType;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getRole() {
        return role;
    }

    public String getResource() {
        return resource;
    }

    public String getRangeType() {
        return rangeType;
    }

    @Override
    public String toString() {
        return "--- Champion ---\n" +
                "Name: " + name + '\n' +
                "Gender: " + gender + '\n' +
                "Role: " + role + '\n' +
                "Resource: " + resource + '\n' +
                "Range Type: " + rangeType;
    }
}
