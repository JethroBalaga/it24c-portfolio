
package encapsulation;


public class Area {
    
  
    int length;
        int width;
        
        Area (int length,int width){
            this.length = length;
            this.width = width;
                    
    }
    
        public void getArea(){
            int area = length+width;
            System.out.println("Area:"+area);
        }
}
