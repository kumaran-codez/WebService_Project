/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import Jama.Matrix;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author kumaranramanujam
 */
@WebService(serviceName = "MatrixoperationsWS")
public class MatrixoperationsWS {

    /**
     * This is a sample web service operation
     */
      @WebMethod(operationName = "add")
    public String add(@WebParam(name = "a") String a, @WebParam(name = "b") String b) {
        Matrix x = str2Mat(a);
        Matrix y = str2Mat(b);
        Matrix z = x.plus(y);
        return mat2Str(z);
    }
       @WebMethod(operationName = "subtract")
    public String subtract(@WebParam(name = "a") String a, @WebParam(name = "b") String b) {
        Matrix x = str2Mat(a);
        Matrix y = str2Mat(b);
        Matrix z = x.minus(y);
        return mat2Str(z);
    }
       @WebMethod(operationName = "multiply")
    public String multiply(@WebParam(name = "a") String a, @WebParam(name = "b") String b) {
        Matrix x = str2Mat(a);
        Matrix y = str2Mat(b);
        Matrix z = x.times(y);
        return mat2Str(z);
    }
       @WebMethod(operationName = "divideL")
    public String divideL(@WebParam(name = "a") String a, @WebParam(name = "b") String b) {
        Matrix x = str2Mat(a);
        Matrix y = str2Mat(b);
        Matrix z = x.arrayLeftDivide(y);
        return mat2Str(z);
    } 
        @WebMethod(operationName = "divideR")
    public String divideR(@WebParam(name = "a") String a, @WebParam(name = "b") String b) {
        Matrix x = str2Mat(a);
        Matrix y = str2Mat(b);
        Matrix z = x.arrayRightDivide(y);
        return mat2Str(z);
    } 
      
          private Matrix str2Mat(String s) {
        final int DIMENSION = 4; // 4x4 Matrix as per requirement...
        String [] sArray = s.split(","); // String input is comman delimited...
        System.out.println(s);
        System.out.println(sArray[15]);
        double [][] dbl2DArray = new double[DIMENSION][DIMENSION];
        int i = 0; // index for split token of of original string...
        for (int row = 0; row < DIMENSION; row++) {
            for (int col = 0; col < DIMENSION; col++) {
                dbl2DArray[row][col] = (double)Double.parseDouble(sArray[i++]);
            }
        }   
        return new Matrix(dbl2DArray);
    }
    
    private String mat2Str(Matrix m) {
        final int DIMENSION = 4; // 4x4 Matrix as per requirement...
        double [][] dbl2DArray = m.getArrayCopy(); // push internal element data into 2D array...
        StringBuilder sb = new StringBuilder();     
        for (int row = 0; row < DIMENSION; row++) {
            for (int col = 0; col < DIMENSION; col++) {
               if (col == (DIMENSION - 1) && row == (DIMENSION - 1)) {
                    sb.append(dbl2DArray[row][col]);
                } else {
                     sb.append(dbl2DArray[row][col]).append(",");
                 }
            }
        }   
        return sb.toString();
    }
    
}
