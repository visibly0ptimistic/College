/*
    Victor Ejiasi

    CSCI 2302-001

    Java version:  18

    Purpose: Represents a tool used by Spider-Man to shoot webs.

    Input: hard coded the values are declared in the code

    Output: to the console

    Other associated files:  SpiderMan.java and ejiasiv_InheritanceAndPolymorphismProgram.java

    Sample Run: Outputs the state of the WebShooter when action() method is called.
*/

public class WebShooter {
    private String name;
    private int webCapacity;

    public WebShooter(String name, int webCapacity) {
        this.name = name;
        this.webCapacity = webCapacity;
    }

    public void action() {
        if (this.webCapacity > 0) {
            System.out.println(this.name + " fires a web!");
            this.webCapacity--;
        } else {
            System.out.println(this.name + " is out of web!");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWebCapacity(int webCapacity) {
        this.webCapacity = webCapacity;
    }

    public String getName() {
        return this.name;
    }

    public int getWebCapacity() {
        return this.webCapacity;
    }

    @Override
    public String toString() {
        return "WebShooter [name=" + this.name + ", webCapacity=" + this.webCapacity + "]";
    }
}
