package Observer;

/**
 *
 * @author hanif
 */
public class Main {
    
    public static void main(String[] args) {
        
        SubjectConcrete subject = new SubjectConcrete();

        subject.Add(new User(subject, "Hani"));
        subject.Add(new User(subject, "Allya"));

        subject.SetSubjectStatus("Anda mendapat 1 pesan baru");
        subject.Notify();
    }
}








