/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
 */
package studentinfosystem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Sanjeev kumar
 */
public class Validation {
    public static boolean valid(String email){
        boolean status=false;
        String p="^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        Pattern pt=Pattern.compile(p);
        Matcher matcher=pt.matcher(email);
       if(matcher.matches())
       {
           status=true;
       }
       else{
           status=false;
       }
       return status;
    }
}
