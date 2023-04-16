public class MyJava {
    protected String firstName;
    protected String lastName;

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public int sumValues(int[] nums) {
        int result = 0;
        for (int x : nums) {
            result += x;
        }
        return result;
    }

}