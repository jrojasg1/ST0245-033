public  boolean canBalance(int[] array){
	  int suma =0;
    int suma2=0;
	  if(array.length == 0){
	  return true;
	  }else{
	    for(int i=0;i<= array.length-1;i++){
	      suma += array[i];
	      for(int j=i+1;j <= array.length-1;j++ ){
	        suma2 +=  array[j];
	      }
	      if(suma == suma2){
	          return true;
	        }else{
	          suma2 = 0;
	        }
	    }
	  }
	  return false;
	}