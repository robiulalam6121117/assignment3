/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstimplement;

import java.util.Set;

/**
 *
 * @author Hp
 */
public class Bstimplement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Movie root=null;
        Movie flag=null;
        MovieBST add=new MovieBST();
        root=add.insert(root,1, "Toy Story", 1995);
        flag=root;
        root=add.insert(root,2, "Jumanji", 1995);
        root=add.insert(root,3, "Grumpier Old Men", 1995);
        root=add.insert(root, 4,"Waiting to Exhale", 1995);
        root=add.insert(root, 5,"Heat", 1995);
        root=add.insert(root, 6,"Tom and Huck", 1995);
        root=add.insert(root, 7,"Sabrina", 1995);
        add.subSet(flag,"H","J");
        
    }
    
}
