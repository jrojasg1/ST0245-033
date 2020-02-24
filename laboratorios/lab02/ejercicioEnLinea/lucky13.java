public static boolean lucky13(int[] array) {
  int cont = 0;
        if(array.length == 0){
            return true;
        }else{
            for(int pos= 0;pos<=array.length-1;pos++){
                if(array[pos]== 1  || array[pos] ==3 ){
                  cont += 1; 
                }else{
                    cont +=0;
                }
            }   
        }
        if(cont > 0){
          return false;
        }else{
          return true;
        }
        
}