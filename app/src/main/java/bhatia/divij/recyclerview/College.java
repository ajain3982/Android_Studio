package bhatia.divij.recyclerview;

/**
 * Created by divij on 05-09-2017.
 */

public class College {
    public String name,subject;

    public College(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
