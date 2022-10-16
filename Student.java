public class Student {
    private String name;
    private Long tokken;
    
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getTokken() {
        return tokken;
    }
    public void setTokken(Long tokken) {
        this.tokken = tokken;
    }
}
