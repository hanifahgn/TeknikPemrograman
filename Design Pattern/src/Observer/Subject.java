package Observer;

interface Subject {
    
    public void Add(Observer observer);
    public void Remove(Observer observer);
    public void Notify();
}