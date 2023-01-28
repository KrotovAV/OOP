package fifth_lesson.Project;

public interface Actions <T> {
    public T addComp(T t1, T t2);
    public T subtractComp(T t1, T t2);
    public T multiplyComp(T t1, T t2);
    public T divideComp(T t1, T t2);

    public void print();
}
