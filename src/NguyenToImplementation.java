
import java.util.ArrayList;
import java.rmi.*;
import java.rmi.server.*;

public class NguyenToImplementation extends UnicastRemoteObject implements INguyenTo{
    public NguyenToImplementation() throws RemoteException{    
    }
     @Override
    public boolean kiemTraNT(int n) throws RemoteException{
        if(n<2)
            return false;
        else{
            if(n==2||n==3)
                return true;
            else{
                for(int i=2; i<= Math.sqrt(n);i++){
                    if(n%i==0){
                        return false;
                    }
                }
            }
            return true;
        }
    }
    @Override
    public ArrayList<Integer> ketQua(int n) throws RemoteException{
        ArrayList<Integer> arrList =new ArrayList<>();
        for(int i=0;i<n;i++){
            if(kiemTraNT(i)==true){
            arrList.add(i);
                }
                }
      return arrList; 
        }
}

