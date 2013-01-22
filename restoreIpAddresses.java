public class Solution {
    public ArrayList<String> restoreIpAddresses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> addresses = new ArrayList<String>();
        
        findIP(s,"",addresses, 0);
        
        return addresses;
    }
    
    
    public void findIP(String s, String ip, ArrayList<String> addresses, int part)
    {
        if(s.length() == 0) { 
            if(part == 4)
            {
                addresses.add(ip);
            }    
        }
        else
        {

            if(s.length() >= 3)
            {
                if(part == 0)
                {
                    if(isValidIP(s.substring(0,3))) { findIP(s.substring(3), ip + s.substring(0,3), addresses, part+1); }
                }
                else
                {
                    if(isValidIP(s.substring(0,3))) { findIP(s.substring(3), ip + "." + s.substring(0,3), addresses, part+1); }
                }
            }
            
            if(s.length() >= 2)
            {
                if(part == 0)
                {
                    if(isValidIP(s.substring(0,2))) { findIP(s.substring(2), ip + s.substring(0,2), addresses, part+1); }
                }
                else
                {
                    if(isValidIP(s.substring(0,2))) { findIP(s.substring(2), ip + "." + s.substring(0,2), addresses, part+1); }
                }
            }
            
            
                if(part == 0)
                {
                    if(isValidIP(s.substring(0,1))) { findIP(s.substring(1), ip + s.substring(0,1), addresses, part+1); }
                }
                else
                {
                    if(isValidIP(s.substring(0,1))) { findIP(s.substring(1), ip + "." + s.substring(0,1), addresses, part+1); }
                }
        }
    }
    
    
    public boolean isValidIP(String ip)
    {
        int toCheck = Integer.parseInt(ip);
        
        return (toCheck >= 0 && toCheck <= 255);
    }
}
