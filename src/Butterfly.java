import static java.lang.System.out;

//Создать двухмерный квадратный массив, и заполнить его "бабочкой",

public class Butterfly {


        public static void main(String[] args) {

            char arr[][]=new char[5][5];

            for (int i=0;i<arr.length/2+1;i++){
                for ( int j=0;j<arr[i].length;j++){
                    if ((j<i) || (j>=(arr[i].length-i)))
                        arr[i][j]=' ';
                    else
                        arr[i][j]='*';
                }
            }

            for (int i=arr.length-1; i>=arr.length/2+1; i--){
                for (int j=0; j<arr[i].length; j++){
                    if ((j<(arr[i].length-1-i)) || (j>i))
                        arr[i][j]=' ';
                    else
                        arr[i][j]='*';}
            }

            for (int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    out.print(arr[i][j]);
                }
                out.println(" ");
            }
        }


    }

