/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ffos_classes;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Himanshu Makkar
 */
public class Order {
   public int id;
   public ArrayList<String> items=new ArrayList<>();
   public ArrayList<Integer> quantity=new ArrayList<>();
   public String status;
   public int price;
   public Date date;
   public String customer;
    public String order_type;
}
