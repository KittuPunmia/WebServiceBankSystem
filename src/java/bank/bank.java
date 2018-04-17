/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author user
 */
@WebService(serviceName = "bank")
@Stateless()
public class bank {
private static int amval[]=new int[7];
private static int am[][]={{1000,0,0,0,0},{2000,0,0,0,0},{5000,0,0,0,0},{6000,0,0,0,0},{7000,0,0,0,0},{9000,0,0,0,0},{10000,0,0,0,0}};
private static int UserTransaction[]=new int[7];
private static int accno[]={101,102,103,104,105,106,107};
private static String []acctype={"S","C","S","C","S","C","S"};

int currentamount;
int cur;
int Useriteration=0;	
int lp1=0,lp2=0,lp3=0,lp4=0,lp5=0,lp6=0,lp7=0;

    /**
     * This is a sample web service operation
     */
    
    /**
     * Web service operation
     * @param Useriteration
     * @return 
     */
    @WebMethod(operationName = "accamountshow")
    public int accamountshow(@WebParam(name = "Useriteration") int Useriteration) {
        //TODO write your implementation code here:
        int val;
        switch (Useriteration) {
            case 0:val=am[Useriteration][lp1];
            break;
            case 1:val=am[Useriteration][lp2];
            break;
           case 2:val=am[Useriteration][lp3];
            break;
           case 3:val=am[Useriteration][lp4];
            break;
           case 4:val=am[Useriteration][lp5];
            break;
           case 5:val=am[Useriteration][lp6];
            break;
           case 6:val=am[Useriteration][lp7];
            break;
          
            default:
                throw new AssertionError();
        }
	return val;
	
    }

    /**
     * Web service operation
     * @param withdrawamount
     * @param Useriteration
     * @return 
     */
    @WebMethod(operationName = "withdraw")
    public int withdraw(@WebParam(name = "withdrawamount") int withdrawamount, @WebParam(name = "Useriteration") int Useriteration) {
        //TODO write your implementation code here:
        int val;
        switch (Useriteration) {
            case 0:cur=am[Useriteration][lp1];
            am[Useriteration][++lp1]=cur-withdrawamount;
            val= am[Useriteration][lp1];
                
             break;
       case 1: cur=am[Useriteration][lp2];
            am[Useriteration][++lp2]=cur-withdrawamount;
            val=am[Useriteration][lp2];
                
             break;
       case 2: cur=am[Useriteration][lp3];
            am[Useriteration][++lp3]=cur-withdrawamount;
            val=am[Useriteration][lp3];
                
             break;
       case 3: cur=am[Useriteration][lp4];
            am[Useriteration][++lp4]=cur-withdrawamount;
            val=am[Useriteration][lp4];
                
             break;
       case 4: cur=am[Useriteration][lp5];
            am[Useriteration][++lp5]=cur-withdrawamount;
            val=am[Useriteration][lp5];
                
             break;
       case 5: cur=am[Useriteration][lp6];
            am[Useriteration][++lp6]=cur-withdrawamount;
            val=am[Useriteration][lp6];
                
             break;
       case 6: cur=am[Useriteration][lp7];
            am[Useriteration][++lp7]=cur-withdrawamount;
            val=am[Useriteration][lp7];
                
             break;
       
            
            default:
                throw new AssertionError();
        }
        
return val; }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deposit")
    public int deposit(@WebParam(name = "depositamount") int depositamount, @WebParam(name = "Useriteration") int Useriteration) {
        //TODO write your implementation code here:
         int val;
        switch (Useriteration) {
            case 0:cur=am[Useriteration][lp1];
            am[Useriteration][++lp1]=cur+depositamount;
            val= am[Useriteration][lp1];
                
             break;
       case 1: cur=am[Useriteration][lp2];
            am[Useriteration][++lp2]=cur+depositamount;
            val=am[Useriteration][lp2];
                
             break;
       case 2: cur=am[Useriteration][lp3];
            am[Useriteration][++lp3]=cur+depositamount;
            val=am[Useriteration][lp3];
                
             break;
       case 3: cur=am[Useriteration][lp4];
            am[Useriteration][++lp4]=cur+depositamount;
            val=am[Useriteration][lp4];
                
             break;
       case 4: cur=am[Useriteration][lp5];
            am[Useriteration][++lp5]=cur+depositamount;
            val=am[Useriteration][lp5];
                
             break;
       case 5: cur=am[Useriteration][lp6];
            am[Useriteration][++lp6]=cur+depositamount;
            val=am[Useriteration][lp6];
                
                
             break;
       case 6: cur=am[Useriteration][lp7];
            am[Useriteration][++lp7]=cur+depositamount;
            val=am[Useriteration][lp7];
                
             break;
       
            
            default:
                throw new AssertionError();
        }
        
return val;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "transaction")
    public String transaction(@WebParam(name = "Useriteration") int Useriteration) {
        //TODO write your implementation code here:
        String val="";
         switch (Useriteration) {
            case 0:
            for(int i=0;i<=lp1;i++)
            {

             val+=am[Useriteration][i]+"\n";
           
            }
            break;
            case 1:
                for(int i=0;i<=lp2;i++)
            {
             val+=am[Useriteration][i]+"\n";
           
            }
            break;
            
           case 2:    for(int i=0;i<=lp3;i++)
            {
             val+=am[Useriteration][i]+"\n";
           
            }
             break;
           case 3:    for(int i=0;i<=lp4;i++)
            {
             val+=am[Useriteration][i]+"\n";
           
            }
             break;
           case 4:   for(int i=0;i<=lp5;i++)
            {
             val+=am[Useriteration][i]+"\n";
           
            }
             break;
           case 5:    for(int i=0;i<=lp6;i++)
            {
             val+=am[Useriteration][i]+"\n";
           
            }
            break;
           case 6:    for(int i=0;i<=lp7;i++)
            {
             val+=am[Useriteration][i]+"\n";
           
            }
            break;
          
            default:
                throw new AssertionError();
        }
          return val;
   
    }
    
    
}
