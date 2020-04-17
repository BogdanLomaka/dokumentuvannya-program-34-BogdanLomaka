package domain;
/**
 * публічний клас ""Artist"" який наслідє клас ""Employee""
 * @author "admin"
 */ 

public class Artist extends Employee {
   /**
    * конструктор об'єкта класу ""Artist""
    * @param skiils - навик
    * @param name - ім'я
    * @param jobTitle - професія
    * @param level - рівень
    * @param dept - відділ
    */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    /**
     * конструктор об'єкта класу ""Artist""
     * @param skiils - навик роботи
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    /**
     * конструктор об'єкта класу ""Artist""
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    /**
     * метод toString() 
     * @return string
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
    /**
     * метод getSkills() повертає параметр навички
     * @return s - параметр ""skiils""
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * метод setSkills() привласнює значення для параметра ""skiils""
     * @param skills 
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    /**
     * метод getSkillsLSist()
     * @return skiils
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
