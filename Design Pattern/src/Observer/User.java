package Observer;

class User implements Observer{
    
    private String name;
    private SubjectConcrete subject;
    
    public User(SubjectConcrete subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String GetName() {
        return this.name;
    }

    public void SetSubject(SubjectConcrete subject) {
        this.subject = subject;
    }

    public SubjectConcrete GetSubject() {
        return this.subject;
    }

    @Override
    public void DoUpdate() {
        System.out.println(this.name + " mendapat notifikasi Baru '" + this.subject.GetSubjectStatus() + "'");
    }
}