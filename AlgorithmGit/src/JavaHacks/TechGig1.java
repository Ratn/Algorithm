package JavaHacks;
import java.io.*;
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ratn
 */
class Edge {
    public String customer;
    public Integer like;
}
public class TechGig1 {
    public static String matching  (String input) throws IOException
    {
        List <String> CustomerList = new ArrayList<>();
        HashSet <String> ProductList = new HashSet<>();
        Map <String,List< Edge > >graph = new HashMap<>();
        String customer = "";
        for( int i=0; i<input.length(); i++) 
        {
            if ( input.charAt(i) == '(') 
            {
                System.out.println("Customer : " + customer);
                CustomerList.add(customer);
                customer = "";
                ++i; //C1(P2-5,P4-3)C2(P1-4,P2-6)C3(P1-7,P3-5,P4-6)C4(P4-10,P5-5)C5(P4-9)
                while(i < input.length() && input.charAt(i) != ')' ) 
                {
                    String prod = "";
                    while(i < input.length() && input.charAt(i) !='-') 
                    {
                        if(input.charAt(i)==',') i++;
                        prod+=input.charAt(i);
                        i++;
                    }
                    System.out.println("Product : " + prod);
                    ProductList.add(prod);
                    String likes= "";
                    i++;
                    while( i < input.length() ) 
                    {
                        if ( input.charAt(i) == ',' || input.charAt(i) == ')' ) {
                            break;
                        }
                        likes+=input.charAt(i);
                        i++;
                    }
                    //i++;
                    
                    int customerLikes = Integer.parseInt(likes.toString());
                    System.out.println("Likes : " + customerLikes);
                }    
            }
            else 
            {
                customer +=input.charAt(i);
            }
        }
        for( int i=0; i<CustomerList.size(); i++)
            System.out.println(CustomerList.get(i));
        
        return "";
    }
    public static void main(String[] args) throws IOException {
        String pattern = "C1(P2-5,P4-3)C2(P1-4,P2-6)C3(P1-7,P3-5,P4-6)C4(P4-10,P5-5)C5(P4-9)";
        System.out.println(matching(pattern));
         
    }
}
