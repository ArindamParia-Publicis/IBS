import java.util.ArrayList;
import java.util.HashMap;

public class RBI {
    private HashMap<String, ArrayList<Customer>> aadhaarToBankMap;
    public RBI(){
        aadhaarToBankMap=new HashMap<>();
    }

    public HashMap<String, ArrayList<Customer>> getAadhaarToBankMap() {
        return aadhaarToBankMap;
    }

    public void linkAccWithAadhaar(String aadhaar,Customer customer) {
        ArrayList<Customer> temp=aadhaarToBankMap.getOrDefault(aadhaar,new ArrayList<>());
        temp.add(customer);
        aadhaarToBankMap.put(aadhaar,temp);
    }

}
