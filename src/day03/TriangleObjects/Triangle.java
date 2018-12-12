public class Triangle {
    int a;  //vlastnosti
    int b;
    int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) { //konstruktor
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int perimeter(){ //metoda
        if (isPossibleToCreate()){
            return a + b + c;
        } else {
            return 0;
        }
    }

    public boolean isPossibleToCreate(){ // metoda
        if (a+b > c && b+c > a && c+a > b){
            return true;
        } else {
            return false;
        }

        //return (a+b > c && b+c > a && c+a > b); // da sa aj takto
    }

}
