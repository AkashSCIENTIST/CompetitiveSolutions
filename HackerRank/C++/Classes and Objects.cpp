

class Student {
  private:
    int scores[5];
    int sum;
  public:
    Student() : sum(0) {}
    int calculateTotalScore() {return sum;}
    void input() {
        for(int i=0; i<5; i++) {
            cin >> scores[i];
            sum+=scores[i];
        }
    }
};

