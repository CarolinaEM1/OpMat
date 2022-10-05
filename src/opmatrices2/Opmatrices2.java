/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opmatrices2;

/**
 *
 * @author Carolina EM
 */
public class Opmatrices2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         matrices2 mg=new matrices2(); // Se crea objeto

         int [][] mat1=null; // Se declara arreglo pero aun no se crea
         int [][] mat2=null; // Se declara arreglo pero aun no se crea

         mat1=mg.LlenarMatriz();
         System.out.println("matriz 1:\n"+mg.imprimirMatriz(mat1));
 //      JOptionPane.showMessageDialog(null,mg.sumatris(mat1));
 
         mat2=mg.LlenarMatriz();
         System.out.println("matriz 2:\n"+mg.imprimirMatriz(mat2));

         int [][] matr=new int [mat1.length][mat2[0].length];
         mg.multiplicaMatrices(mat1, mat2, matr);
         System.out.println("Multiplicación\n"+mg.imprimirMatriz(matr));


         int [][] mat3=new int[mat1.length][mat1[0].length]; // se crea mat3
         mg.sumaMatrices(mat1, mat2, mat3); // se invoca al método para sumar
  //     JOptionPane.showMessageDialog(null,mg.imprimirMatriz(mat3));
         System.out.println("Suma de las Matriz 1 + Matriz 2\n"+mg.imprimirMatriz(mat3));

         mg.sumaMatrices(mat2, mat1, mat3); // se invoca al método para sumar
   //     JOptionPane.showMessageDialog(null,mg.imprimirMatriz(mat3));
         System.out.println("Suma de las Matriz 2 + Matriz 1\n"+mg.imprimirMatriz(mat3));

         mg.restaMatrices(mat1, mat2, mat3); // se invoca 1étodo para mat1 – mat2
 //       JOptionPane.showMessageDialog(null,mg.imprimirMatriz(mat3));
        System.out.println("Resta matriz 1 - Matriz 2\n"+mg.imprimirMatriz(mat3));

        mg.restaMatrices(mat2, mat1, mat3); // se invoca 1étodo para mat2 – mat1
 //       JOptionPane.showMessageDialog(null,mg.imprimirMatriz(mat3));
        System.out.println("Resta matriz 2 - Matriz 1\n"+mg.imprimirMatriz(mat3));
        
        System.exit(0); 
    }
        
  }




    
    

