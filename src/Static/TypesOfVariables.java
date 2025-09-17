package Static;

public class TypesOfVariables {


    //int a;
    //int b = 20;

    // both are declared at inside the class outside any method

    int age = 10;                            // instance
    static double salary = 200000;          // static

    void show(){
        int local;                         // inside method

    }
}



// 1] Local Variable    : stack memory        ( method call     + local varible)
// 2] Instance Variable : Heap Memory         ( object          + instance variable)
// 3] Static Varaiable  : Memroy area         ( Class medadata  + static variable)