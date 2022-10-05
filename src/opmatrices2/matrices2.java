
package opmatrices2;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina EM
 */
public class matrices2 {
    public int [][] LlenarMatriz()
    {
        int r,c;
        
        r=Integer.parseInt(JOptionPane.showInputDialog("Teclea número de renglones"));
        c=Integer.parseInt(JOptionPane.showInputDialog("Teclea número de columnas"));
        int [][] matriz=new int [r][c];
        for(int i=0; i<matriz.length; i++)  // i<r  RENNGLONES
        {
            for(int k=0; k<matriz[i].length; k++)   // j<c   COLUMNAS
            {
                matriz[i][k]= Integer.parseInt(JOptionPane.showInputDialog("Teclea el elemento ["+ i+"] [" + k+"]"));
            }
        }
        return matriz;
    }
    
    public String imprimirMatriz(int[][] mat)
    {
        String res ="Matriz\n";
        for(int i=0;i<mat.length;i++)   // mat.length NUMERO DE RENGLOMES 
        {
            for(int k=0;k<mat[i].length;k++)    //mat[i].length NUMERO DE COLUMNAS
            {
                res=res+mat[i][k]+"   \t";
            }
            res=res+"\n";
        }
        return res;
    }
    
    public void sumaMatrices(int[][] mat1,int[][] mat2,int[][] matSuma)
    {
        if(!(mat1.length==mat2.length && mat1[0].length==mat2[0].length) )
            JOptionPane.showMessageDialog(null,"Las matrices no se pueden sumar\nSon de diferente Orden");
        else
        {
             for(int i=0;i<mat1.length;i++)
             {
                 for(int k=0;k<mat1[i].length;k++)
                 {
                     matSuma[i][k]=mat1[i][k]+mat2[i][k];
                 }
             }
        }
    }
    
    public void restaMatrices(int[][] mat1,int[][] mat2,int[][] matResta)
    {
        if(!(mat1.length==mat2.length && mat1[0].length==mat2[0].length) )
            JOptionPane.showMessageDialog(null,"Las matrices no se pueden restar\nSon de diferente Orden");
        else
        {
             for(int i=0;i<mat1.length;i++)
             {
                 for(int k=0;k<mat1[i].length;k++)
                 {
                     matResta[i][k]=mat1[i][k]-mat2[i][k];
                 }
             }
        }
    }

    void multiplicaMatrices(int [][]mat1,int [][]mat2,int [][]mat3)
    {
       if(mat1[0].length==mat2.length)
       {
           for(int i=0;i<mat1.length;i++)  // 4
           {
               for(int k=0;k<mat2[0].length;k++)  // 2
               {
                  mat3[i][k]=0;
                  for(int l=0;l<mat1[0].length;l++)  //5
                  {         // l<mat2.length   //5
                      mat3[i][k]= mat3[i][k]+mat1[i][l]*mat2[l][k];
                  }
               }
           }
      }
      else
           System.out.println("No se puede realizar la multiplicación...el orden de las matrices no es adecuado");
   }
}


