//Full Name: Seth Alexander Channing
//Banner ID: B00956611
import java.util.*;
public class MatrixMult{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        long startTime, endTime, executionTime;
        int matrixLength= keyboard.nextInt();
        double matrixValue= keyboard.nextDouble();
        double[][] m1=new double[matrixLength][matrixLength];//both matrices should be the same
        double[][] m2=new double[matrixLength][matrixLength];
            for(int i=0;i<matrixLength;i++){//populate the matrices
                for(int j=0;j<matrixLength;j++){
                    m1[i][j]=matrixValue;
                    m2[i][j]=matrixValue;
                }
            }//printing method for the test
            startTime = System.currentTimeMillis();
            multiplyMatrix(m1, m2);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Size: " + matrixLength + " Time:" + executionTime + " ms");
        }
    public static double[][] multiplyMatrix(double[][] m1, double[][] m2){
        double[][] m3 =new double[m1.length][m1.length];
        for(int i = 0; i <m1.length;i++) {
            for(int j = 0; j <m1.length;j++) {
                for(int k=0;k<m1.length;k++){
                    m3[i][j] = m1[i][j]*m2[j][i];
                }
            }
        }
        return m3;//we never use this but we need to return it anyway so we don't get an error
    }
}