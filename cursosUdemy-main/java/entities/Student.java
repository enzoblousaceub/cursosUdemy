package entities;

public class Student {
    public String name;
    public double t1;
    public double t2;
    public double t3;

    public double finalGrade(){
        return this.t1 + this. t2 + this. t3;
    }
    public double missinPoints(){
        if (finalGrade()>=60) {
            return 0;
        }
        else
        return 60 - finalGrade();

    }
}

