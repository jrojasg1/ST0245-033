public static boolean has22(int array[]){
        boolean result = false;
        int cont = 0;
        if(array.length == 0){
            return result;
        }else{
            for(int pos= 0;pos<=array.length-1;pos++){
                if( pos+1 < array.length-1 && array[pos]== 2  && array[pos+1] == 2){
                    cont += 1;
                }else{
                    if(pos+1 > array.length-1 && pos != 0){
                        if( array[pos]== 2  && array[pos-1] == 2){
                          cont += 1;
                        }
                    }else{
                    cont += 0;
                    }
                }
            }   
        }
        if(cont > 0){
             result = true;
        };
        return result;
    }