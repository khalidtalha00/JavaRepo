package CWHbasics;

public class NO19MultiDimensionalArrays {
    public static void main(String[] args) {
        // a multidimensional array is an array of arrays

        String [][] cars = new String[3][3];
        cars[0][0]="Maruti";
        cars[0][1]="Toyota";
        cars[0][2]="Suzuki";

        cars[1][0]="Chevrolet";
        cars[1][1]="Nisan";
        cars[1][2]="Mercedes";

        cars[2][0]="BMW";
        cars[2][1]="Tesla";
        cars[2][2]="Mustang";

        // second way to initialise an array
//        String [][] cars ={{"Suzuki","Toyota","Maruti"},
//                        {"Chevrolet","Nisan","Mercedes"},
//                        {"BMW","Tesla","Mustang"}};

        for (int i=0;i<cars.length;i++){
            for (int j=0;j<cars[i].length;j++){
                System.out.println(cars[i][j]);
            }
        }

    }
}
