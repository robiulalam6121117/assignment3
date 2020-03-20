/*
 */
package bstimplement;

/**
 *
 * @Robiul ALam
 spring 2020
 CISC 3130
 */
public class MovieBST {
    private Movie first;
    private Movie node=null;
    
    public Movie createNewNode(int id,String title,int releaseyear){
        Movie m=new Movie();
        m.left=null;
        m.right=null;
        m.id=id;
        m.releaseYear=releaseyear;
        m.title=title;
        node=m;
        return m;
    }
    public Movie insert(Movie nod,int id,String title,int releaseyear){
        if(nod==null){
            return createNewNode(id,title,releaseyear);
        }
        else if(title.compareTo(nod.title)<nod.title.compareTo(title))
        {
            nod.left=insert(nod.left,id,title,releaseyear); 
        }
        else if(title.compareTo(nod.title)>nod.title.compareTo(title))
        {
         nod.right=insert(nod.right,id,title,releaseyear);   
        }
        
        return nod;
    }
  public void subSet(Movie flg,String start, String end){
    
    // Selects movie titles that fall alphabetically between start and end.
    first=flg;
    int len=start.length();
    String arr[] = new String[len*(len+1)/2]; 
      
      System.out.println(first.title);
      System.out.println(first.right.title);
      System.out.println(first.left.title);
      
      first=first.right;
      
      System.out.println(first.title);
      System.out.println(first.left.title);
      System.out.println(first.title.compareTo(start));
      System.out.println(first.title.compareTo(end));
        if(first.title.compareTo(start)==0 && first.title.compareTo(end)==0){
            System.out.println("element found" +first.title);
        }
        else if(first.title.compareTo(start)<0 && first.title.compareTo(end)<0){
            System.out.println("element found" +first.title);
        }
        else if(first.title.compareTo(start)>0 && first.title.compareTo(end)>0){
            System.out.println("element found" +first.title);
        }
        else if(first==null || first.left==null|first.right==null){
            System.out.println("no element found");
        }
  }
    
