package Observer;

import java.util.*;

class SubjectConcrete implements Subject{
    
    private List<Observer> listObserver = new ArrayList<Observer>(); 
    private String SubjectStatus;
    
    public void SetSubjectStatus(String status) {
        this.SubjectStatus = status;
    }

    public String GetSubjectStatus() {
        return this.SubjectStatus;
    }

    @Override
    public void Add(Observer observer) {
        listObserver.add(observer);
    }

    @Override
    public void Remove(Observer observer) {
        listObserver.remove(observer);
    }

    @Override
    public void Notify() {
        for (Observer list : listObserver) {
            list.DoUpdate();
        }
    }
}