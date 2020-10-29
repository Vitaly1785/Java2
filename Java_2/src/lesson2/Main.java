package lesson2;



public class Main {
    public static void main(String[] args) {

        String[][] arr = new String[4][4];
        arr[0][0] = "4";
        arr[0][1] = "5";
        arr[0][2] = "1";
        arr[0][3] = "4";
        arr[1][0] = "7";
        arr[1][1] = "8";
        arr[1][2] = "5";
        arr[1][3] = "1";
        arr[2][0] = "3";
        arr[2][1] = "8";
        arr[2][2] = "9";
        arr[2][3] = "10";
        arr[3][0] = "0";
        arr[3][1] = "4";
        arr[3][2] = "6";
        arr[3][3] = "3";

        summArr(arr);

    }
    public static void summArr(String[][] arr) throws MyArraySizeException, MyArrayDataException{
        if(arr.length != 4 || arr[1].length != 4){
            System.out.println("Массив должен быть 4 * 4");
            throw new MyArraySizeException();
        }
            int number;
        int sum=0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    try {
                        number = Integer.parseInt(arr[i][j]);
                        sum+=number;
                    } catch (NumberFormatException e){
                        System.out.println("в "+(i)+" ряду, в "+(j)+" ячейке");
                        throw new MyArrayDataException(e.getMessage());
                    }
                }
            }
                        System.out.println(sum);
        }

}
